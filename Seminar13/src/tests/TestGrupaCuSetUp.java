package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.Student;
import tests.categorii.TesteGetPromovabilitate;

public class TestGrupaCuSetUp {

	Grupa grupa;

	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1076);
		for (int i = 0; i < 35; i++) {
			Student student = new Student("Stud");
			student.adaugaNota(5);
			student.adaugaNota(7);
			student.adaugaNota(10);
			student.adaugaNota(10);
			student.adaugaNota(10);
			student.adaugaNota(10);
			student.adaugaNota(10);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout = 500)
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}

}
