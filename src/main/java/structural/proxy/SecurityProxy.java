package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    private Object obj;

    public SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        try {
            if(method.getName().startsWith("send") && args[0].toString().equals("hack")){
                System.out.println("You tried to hack the class, but there is a proxy in the middle");
                return null;
            }
            result = method.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }
}
