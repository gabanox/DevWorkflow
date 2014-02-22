package devworkflow;

import org.junit.Test;

import junit.framework.TestCase;

public class TestBienvenido extends TestCase {

	@Test
	public void testTitle(){
		String pageTitle = "Bienvenido a Cursos OnLine";
		Bienvenido bienvenido = new Bienvenido(pageTitle);
			assertEquals("Bienvenido a Cursos OnLine", bienvenido.getPageTitle() ); 
	}
}
