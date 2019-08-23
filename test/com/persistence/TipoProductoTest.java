/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persistence;

import java.util.List;
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
public class TipoProductoTest {
    
    public TipoProductoTest() {
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
     * Test of getPkIdTipo method, of class TipoProducto.
     */
    @Test
    public void testGetPkIdTipo() {
        System.out.println("getPkIdTipo");
        TipoProducto instance = new TipoProducto();
        Integer expResult = null;
        Integer result = instance.getPkIdTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPkIdTipo method, of class TipoProducto.
     */
    @Test
    public void testSetPkIdTipo() {
        System.out.println("setPkIdTipo");
        Integer pkIdTipo = null;
        TipoProducto instance = new TipoProducto();
        instance.setPkIdTipo(pkIdTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class TipoProducto.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        TipoProducto instance = new TipoProducto();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class TipoProducto.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        TipoProducto instance = new TipoProducto();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductoList method, of class TipoProducto.
     */
    @Test
    public void testGetProductoList() {
        System.out.println("getProductoList");
        TipoProducto instance = new TipoProducto();
        List<Producto> expResult = null;
        List<Producto> result = instance.getProductoList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductoList method, of class TipoProducto.
     */
    @Test
    public void testSetProductoList() {
        System.out.println("setProductoList");
        List<Producto> productoList = null;
        TipoProducto instance = new TipoProducto();
        instance.setProductoList(productoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class TipoProducto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        TipoProducto instance = new TipoProducto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class TipoProducto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        TipoProducto instance = new TipoProducto();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TipoProducto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TipoProducto instance = new TipoProducto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
