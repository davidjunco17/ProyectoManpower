/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.test;

import com.sun.corba.se.impl.activation.ServerMain;

import edu.cecar.controladores.ControladorEmpleado;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1102833310
 */
public class TestControladorEmpleado {
    
    @Test
    public void testConexionBaseDatos(){
        try {
            
            ControladorEmpleado ControladorEmpleado = new ControladorEmpleado();
            
            System.out.println("Conexion Exitosa");
            
        } catch (Exception ex) {
            
            fail("Error de Conexión");
            Logger.getLogger(TestControladorEmpleado.class.getName()).log(Level.SEVERE,null,ex);
                   
        }
            
        
    }
    

}
