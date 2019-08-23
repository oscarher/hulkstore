/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persistence;

import com.persistence.util.PaginationHelper;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
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
public class ProductoControllerTest {
    
    public ProductoControllerTest() {
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
     * Test of getSelected method, of class ProductoController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        ProductoController instance = new ProductoController();
        Producto expResult = null;
        Producto result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class ProductoController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        ProductoController instance = new ProductoController();
        PaginationHelper expResult = null;
        PaginationHelper result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareList method, of class ProductoController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.prepareList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareView method, of class ProductoController.
     */
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.prepareView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class ProductoController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ProductoController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareEdit method, of class ProductoController.
     */
    @Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.prepareEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ProductoController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ProductoController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.destroy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyAndView method, of class ProductoController.
     */
    @Test
    public void testDestroyAndView() {
        System.out.println("destroyAndView");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.destroyAndView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class ProductoController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        ProductoController instance = new ProductoController();
        DataModel expResult = null;
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class ProductoController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class ProductoController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class ProductoController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        ProductoController instance = new ProductoController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class ProductoController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        ProductoController instance = new ProductoController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class ProductoController.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        Integer id = null;
        ProductoController instance = new ProductoController();
        Producto expResult = null;
        Producto result = instance.getProducto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
