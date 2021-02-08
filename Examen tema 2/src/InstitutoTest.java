import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InstitutoTest {
	
	String[]jefe= {"Luis","Pepe", "Jos�"};
	Instituto ejemplo=new Instituto("�vila",40,true,"Jos� Luis",jefe);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetLocalidad() {
		
		assertEquals("�vila",ejemplo.getLocalidad());
		assertNotEquals("Salamanca", ejemplo.getLocalidad());
		
	}

	@Test
	void testSetLocalidad() {
		String[]jefe= {"Luis","Pepe", "Jos�"};
		Instituto ejemplo1=new Instituto("�vila",40,true,"Jos� Luis",jefe);
		ejemplo1.setLocalidad("Burgos");
		assertEquals("Burgos", ejemplo1.getLocalidad());
		assertNotEquals("Le�n", ejemplo1.getLocalidad());
	}

	@Test
	void testGetClases() {
		
		assertEquals(40, ejemplo.getClases());
		assertNotEquals(50, ejemplo.getClases());
	}

	@Test
	void testSetClases() {
		String[]jefe= {"Luis","Pepe", "Jos�"};
		Instituto ejemplo1=new Instituto("�vila",40,true,"Jos� Luis",jefe);
		ejemplo1.setClases(63);
		assertEquals(63, ejemplo1.getClases());
		assertNotEquals(80, ejemplo1.getClases());
	}

	@Test
	void testIsPublico() {
		assertEquals(true, ejemplo.isPublico());
		assertNotEquals(false, ejemplo.isPublico());
	}

	@Test
	void testSetPublico() {
		String[]jefe= {"Luis","Pepe", "Jos�"};
		Instituto ejemplo1=new Instituto("�vila",40,true,"Jos� Luis",jefe);
		ejemplo1.setPublico(false);
		assertEquals(false, ejemplo1.isPublico());
		assertNotEquals(true, ejemplo1.isPublico());
	}

	@Test
	void testGetDirector() {
		
		assertEquals("Jos� Luis", ejemplo.getDirector());
		assertNotEquals("Luis Jos�", ejemplo.getDirector());
	}

	@Test
	void testSetDirector() {
		String[]jefe= {"Luis","Pepe", "Jos�"};
		Instituto ejemplo1=new Instituto("�vila",40,true,"Jos� Luis",jefe);
		ejemplo1.setDirector("Pepe Luis");
		assertEquals("Pepe Luis", ejemplo1.getDirector());
		assertNotEquals("Jose Luis", ejemplo1.getLocalidad());
	}

	@Test
	void testGetJefe() {
		String[]jefe2= {"Laura, Ana, Sof�a"};
		assertEquals(jefe, ejemplo.getJefe());
		assertNotEquals(jefe2, ejemplo.getJefe());
	}

	@Test
	void testSetJefe() {
		String[]jefe= {"Luis","Pepe", "Jos�"};
		Instituto ejemplo1=new Instituto("�vila",40,true,"Jos� Luis",jefe);
		String[]jefe2= {"Laura, Ana, Sof�a"};
		ejemplo1.setJefe(jefe2);
		assertEquals(jefe2, ejemplo1.getJefe());
		assertNotEquals(jefe, ejemplo1.getJefe());
	}

	@Test
	void testToString() {
		assertEquals("�vila, 40 clases,true, Director: Jos� Luis.", ejemplo.toString());
		assertNotEquals("�vila,  40 clases,true, Director: Jos� Luis", ejemplo.toString());
		
		
	}

}
