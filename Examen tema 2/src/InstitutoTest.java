import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InstitutoTest {
	
	String[]jefe= {"Luis","Pepe", "José"};
	Instituto ejemplo=new Instituto("Ávila",40,true,"José Luis",jefe);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetLocalidad() {
		
		assertEquals("Ávila",ejemplo.getLocalidad());
		
	}

	@Test
	void testSetLocalidad() {
		String[]jefe= {"Luis","Pepe", "José"};
		Instituto ejemplo1=new Instituto("Ávila",40,true,"José Luis",jefe);
		ejemplo1.setLocalidad("Burgos");
		assertEquals("Burgos", ejemplo1.getLocalidad());
	
	}

	@Test
	void testGetClases() {
		
		assertEquals(40, ejemplo.getClases());
	}

	@Test
	void testSetClases() {
		String[]jefe= {"Luis","Pepe", "José"};
		Instituto ejemplo1=new Instituto("Ávila",40,true,"José Luis",jefe);
		ejemplo1.setClases(63);
		assertEquals(63, ejemplo1.getClases());
	}

	@Test
	void testIsPublico() {
		assertEquals(true, ejemplo.isPublico());
	}

	@Test
	void testSetPublico() {
		String[]jefe= {"Luis","Pepe", "José"};
		Instituto ejemplo1=new Instituto("Ávila",40,true,"José Luis",jefe);
		ejemplo1.setPublico(false);
		assertEquals(false, ejemplo1.isPublico());
	}

	@Test
	void testGetDirector() {
		
		assertEquals("José Luis", ejemplo.getDirector());
	}

	@Test
	void testSetDirector() {
		String[]jefe= {"Luis","Pepe", "José"};
		Instituto ejemplo1=new Instituto("Ávila",40,true,"José Luis",jefe);
		ejemplo1.setDirector("Pepe Luis");
		assertEquals("Pepe Luis", ejemplo1.getDirector());
	}

	@Test
	void testGetJefe() {
		
		assertEquals(jefe, ejemplo.getJefe());
	}

	@Test
	void testSetJefe() {
		String[]jefe= {"Luis","Pepe", "José"};
		Instituto ejemplo1=new Instituto("Ávila",40,true,"José Luis",jefe);
		String[]jefe2= {"Laura, Ana, Sofía"};
		ejemplo1.setJefe(jefe2);
		assertEquals(jefe2, ejemplo1.getJefe());
	}

	@Test
	void testToString() {
		assertEquals("Ávila, 40 clases,true, Director: José Luis.", ejemplo.toString());
		
	}

}
