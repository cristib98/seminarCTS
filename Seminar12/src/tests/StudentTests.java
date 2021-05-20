package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Ionica";
		Student student = new Student(nume);

		assertEquals(nume, student.getNume()); // primul e numele expected, al doilea e numele efectiv al obiectului
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertEquals("Student", student.getNume());

	}

	@Test
	public void testAreRestante() {
		Student student = new Student();
		int nota1 = 3;
		int nota2 = 8;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertTrue("Studentul cu restanta este marcat ca neavand restanta.", student.areRestante());

	}

	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		int nota1 = 10;
		int nota2 = 8;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertFalse("Studentul cu restanta este marcat ca avand restanta.", student.areRestante());

	}
	
	@Test
	public void testAdaugareNota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());

	}
	
	@Test
	public void testNotaCorecta() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testCalculeazaMedia() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		assertEquals(5.5, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0, student.calculeazaMedie(), 0.01);
		
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		
		assertEquals(nota, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testAdaugaNotaIncorecta() {
		
		Student student = new Student();
		int nota = 14;
		//1
		try {
			//2
			student.adaugaNota(nota);
			//3
			fail("nu trebuia sa ajunga aici. Metoda trebuia sa arunce o exceptie");
		}
		catch (IllegalArgumentException err) {
		//4	
		}
		//5
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorectaJU4() {
		Student student = new Student();
		int nota = 14;
		student.adaugaNota(nota);
		
		
	}
	

}
