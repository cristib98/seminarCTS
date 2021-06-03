package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStub {

	Grupa grupa;
	
	@Test
	public void testGetPromovabilitate() {
		grupa = new Grupa(1076);
		IStudent student1 = new StudentStub();
		IStudent student2 = new StudentStub();
		IStudent student3 = new StudentStub();
		grupa.adaugaStudent(student1);
		grupa.adaugaStudent(student2);
		grupa.adaugaStudent(student3);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
