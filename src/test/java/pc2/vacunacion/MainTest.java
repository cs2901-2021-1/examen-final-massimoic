package pc2.vacunacion;


import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

class MainTest {

    VacInterface vacinterface = VacInterface.getInstance();
    Logger logger = Logger.getLogger(MainTest.class.getName());

    @Test
    public void loginSucessTest(){
        Login login = new Login();
        Usuario usuario1 = new Usuario("prueba");

        String name = "prueba";

        Assert.assertTrue(login.login(name));
    }

    @Test
    public void loginFailTest(){
        Login login = new Login();
        Usuario usuario1 = new Usuario("prueba");

        String name = "pruebafallida";

        Assert.assertFalse(login.login(name));
    }

}