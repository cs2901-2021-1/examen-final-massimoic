package pc2.vacunacion;


import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTest {

    VacInterface vacinterface = VacInterface.getInstance();
    Logger logger = Logger.getLogger(MainTest.class.getName());

    @Test
    public void loginSucessTest(){
        Login login = new Login();
        Usuario usuario1 = new Usuario("prueba");
        login.addUsuario(usuario1);

        String name = "prueba";

        Assert.assertTrue(login.login(name));
    }

    @Test
    public void loginFailTest(){
        Login login = new Login();
        Usuario usuario1 = new Usuario("prueba");
        login.addUsuario(usuario1);

        String name = "pruebafallida";

        Assert.assertFalse(login.login(name));
    }

    @Test
    public void usuarioCreateCentroTest(){
        Login login = new Login();
        Usuario usuario1 = new Usuario("prueba");
        login.addUsuario(usuario1);

        usuario1.createCentro(1);
        Assert.assertEquals(1, vacinterface.getCentroList().size());
    }

    @Test
    public void avanceTest(){
        vacinterface.setAvance(5000000);
        Assert.assertEquals(21, vacinterface.getAvance());
    }

    @Test
    public void coberturaTest(){
        vacinterface.setCobertura(3000000);
        Assert.assertEquals(13, vacinterface.getCobertura());
    }

    @Test
    public void centroParcialTest(){
        Login login = new Login();
        Usuario usuario1 = new Usuario("prueba");
        login.addUsuario(usuario1);
        usuario1.createCentro(1);
        vacinterface.getCentroList().get(0).vacunaParcial();
        vacinterface.getCentroList().get(0).vacunaCompleta();

        Assert.assertEquals(0, vacinterface.getVacParcial());
        Assert.assertEquals(1, vacinterface.getVacCompleta());
    }

    @Test
    public void addTests(){
        vacinterface.addAvance();
        vacinterface.addCobertura();
        Assert.assertNotEquals(0,vacinterface.getAvance());
    }

    @Test
    public void deleteCentroTest2(){
        Login login = new Login();
        Usuario usuario1 = new Usuario("prueba");
        login.addUsuario(usuario1);
        Assert.assertEquals(1,vacinterface.getCentros());
    }


}