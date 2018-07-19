package structural.facade;

public class Facade {
    //Simplifies the use of ReallyComplexToUseLibrary

    public void printIt(ReallyComplexToUseLibrary reallyComplexToUseLibrary){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(reallyComplexToUseLibrary.doSome())
                     .append(reallyComplexToUseLibrary.nachos())
                     .append(reallyComplexToUseLibrary.please());

        System.out.print(stringBuilder.toString());
    }
}
