/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.cafeteria.cdp.*;
import br.edu.ifes.cafeteria.util.FabricaCafeNormal;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DIEGOGM
 */
public class FabricaCafeNormalTest {
    
    public FabricaCafeNormal FabricaCN;
    public  ArrayList<Ingrediente> ingredientes;
    
    public FabricaCafeNormalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        FabricaCN = new FabricaCafeNormal();
        ingredientes = new ArrayList<Ingrediente>();

    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void criarIngredientesTest(){
        ingredientes.add(new CafeSoluvel(50));
        ingredientes.add(new Açucar(2));
        ingredientes.add(new Leite(100));
        Assert.assertNotNull( FabricaCN.criarIngredientes());
    }
    
       @Test
    public void criarCafeTest(){

        Assert.assertNotNull( FabricaCN.criarCafe());
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
