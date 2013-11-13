/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Edu
 */
public class CalculadoraStringTest {
    
    private clases.CalculadoraString calculadora;
    
    public CalculadoraStringTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        calculadora= new clases.CalculadoraString();
    }
    
    @After
    public void tearDown() {
    }

    //Item 1
    @Test
    public void testCadenaVacia() 
    {    
        assertEquals(0, calculadora.add(""));
    }
    @Test
    public void testUnElemento() 
    {    
        assertEquals(9, calculadora.add("9"));
    }
    @Test
    public void testSumaDos() 
    {    
        assertEquals(15, calculadora.add("7,8"));
    }
    //Item 2
    @Test
    public void testSerieNumeros()
    {
        assertEquals(30, calculadora.add("3,5,12,7,2,1"));
    }
    //Item 3
    @Test
    public void testSaltoLinea()
    {
        assertEquals(6, calculadora.add ("1\n2,3"));
    }
    //Item 5
    @Test
    public void testNegativos()
    {
        assertEquals("Mensaje", "-2", "-2");
    }
    //Item 6
    @Test
    public void testMasMil()
    {
        assertEquals(2, calculadora.add("2,1000"));
    }
}
