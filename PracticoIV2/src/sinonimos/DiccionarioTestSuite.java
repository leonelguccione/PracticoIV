package sinonimos;
/**
 * Si observamos la clase diccionarioPR1Test.java, vemos que en algunas pruebas debemos repetir 
 * el mismo codigo de inicializacion, para evitar esto y reducir el codigo a escribir, Junit
 * nos provee de las anotaciones @Before, @After @BeforeClass y @AfterClass, los metodos asociados 
 * a ellas se ejecutan antes del metodo (@Before), despues del metodo @After, antes de instanciar 
 * la clase (@BeforeClass) y al terminar la existencia de la instancia (@AfterClass). El conjunto de 
 * metodos asociados a estas anotaciones se los denomina Fixture.
 * Como actuan para todo el caso de prueba, si necesitamos dos inicializaciones distintas debemos
 * dividir el caso de prueba en tantos como inicializaciones diferentes tengamos, en nuestro caso 2 
 * diccionarioPR2Test1 (diccionario lleno, donde opera el fixture) y diccionarioPR2Test2 (dicionario
 * vacio, sin inicializacion)
 * Adicionalmente utilizamos esta clase TestSuite para agrupar y ejecutar como si fuera un solo 
 * TestCase a todos los casos de prueba de la clase diccionario.
 * 
 * Nota: aunque seguimos la linea de llamar setup() y teardown() a las funciones asociadas a las 
 * anotaciones @before y @after, es importante destacar que las mismas se refieren a los metodos 
 * inmediatos siguientes a la anotacion independientemente del nombre que lleven.
 * 
 * */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ diccionarioPR2Test2.class, diccionarioPR2Test1.class })
public class DiccionarioTestSuite {
}
