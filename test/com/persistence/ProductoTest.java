/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ohernandez
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPkIdProducto method, of class Producto.
     */
    @Test
    public void testGetPkIdProducto() {
        System.out.println("getPkIdProducto");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getPkIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPkIdProducto method, of class Producto.
     */
    @Test
    public void testSetPkIdProducto() {
        System.out.println("setPkIdProducto");
        Integer pkIdProducto = null;
        Producto instance = new Producto();
        instance.setPkIdProducto(pkIdProducto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreProducto method, of class Producto.
     */
    @Test
    public void testGetNombreProducto() {
        System.out.println("getNombreProducto");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombreProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreProducto method, of class Producto.
     */
    @Test
    public void testSetNombreProducto() {
        System.out.println("setNombreProducto");
        String nombreProducto = "";
        Producto instance = new Producto();
        instance.setNombreProducto(nombreProducto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Producto.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Producto.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Producto instance = new Producto();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFkIdTipo method, of class Producto.
     */
    @Test
    public void testGetFkIdTipo() {
        System.out.println("getFkIdTipo");
        Producto instance = new Producto();
        TipoProducto expResult = null;
        TipoProducto result = instance.getFkIdTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFkIdTipo method, of class Producto.
     */
    @Test
    public void testSetFkIdTipo() {
        System.out.println("setFkIdTipo");
        TipoProducto fkIdTipo = null;
        Producto instance = new Producto();
        instance.setFkIdTipo(fkIdTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Producto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Producto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Producto instance = new Producto();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Producto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
