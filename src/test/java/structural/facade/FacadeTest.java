package structural.facade;

import static org.junit.Assert.*;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void facadeTest(){
        ReallyComplexToUseLibrary lib = new ReallyComplexToUseLibrary();

        Facade facade = new Facade();

        facade.printIt(lib);    // Just one call instead of 3 needed in the library !!
    }
}