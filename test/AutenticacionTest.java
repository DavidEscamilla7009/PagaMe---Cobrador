import pagame.autenticacion.Autenticacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class AutenticacionTest {
    public static void main(String[] args) {
        Autenticacion auth = new Autenticacion();
        
        // registrar usuarios
        auth.registrar("Juan", "secreta", "deudor");
        auth.registrar("LL", "12345", "cobrador");
        
        // probar con Juan
        System.out.println("Juan.verificar(): EXPECTED (true)" + 
                auth.verificacion("Juan", "secreta"));
        
        System.out.println("Juan.verificar(): EXPECTED (false)" + 
                auth.verificacion("Juan", "x"));
    }
}
