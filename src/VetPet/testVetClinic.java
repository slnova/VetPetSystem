package VetPet;

import static org.junit.Assert.*;


import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import VetPet.Animals.Animal;
import VetPet.Animals.Dog;


public class testVetClinic extends TestCase{

	@Before
	public void setUp() throws Exception
	{





	}

	@After
	public void tearDown() throws Exception 
	{




	}

	@Test
	public void testAddDog() 
	{

		VetClinic vetclinic = new VetClinic("testClinic");

		assertTrue(vetclinic.addDog("123456","Duke", "Great Dane", "Big" ));


	}


	public void testAddDogMultiple() 
	{	
		VetClinic vetclinic = new VetClinic("testClinic");

		vetclinic.addDog("123456","Duke", "Great Dane", "Big" );
		vetclinic.addDog("123455","Spike", "Boxer", "Energetic");

		assertEquals(2, vetclinic.AnimalList.size());	

	}


	@Test
	public void testAddCat() 
	{
		VetClinic vetclinic = new VetClinic("testClinic");

		assertTrue(vetclinic.addCat("123458","Shadow", "Kitten", "Mouse" ));

	}

	public void testAddCatMultiple() 
	{	
		VetClinic vetclinic = new VetClinic("testClinic");

		vetclinic.addCat("123457","Shadow", "Kitten", "Mouse");
		vetclinic.addCat("123459","Dusty", "Fat Cat", "Ball");

		assertEquals(2, vetclinic.AnimalList.size());	

	}
	
	public void testAddMultipleTypes() //size 
	{	
		VetClinic vetclinic = new VetClinic("testClinic");

		vetclinic.addCat("123460","Shadow", "Kitten", "Mouse"  );
		vetclinic.addDog("123461","Duke", "Great Dane", "Big" );

		assertEquals(2, vetclinic.AnimalList.size());	

	}
	

	@Test
	public void testIDLengthFail() 
	{
		VetClinic vetclinic = new VetClinic("testClinic");

		assertFalse(vetclinic.addCat("1234567","Shadow", "Kitten", "Ball"));

	}

	
	@Test
	public void testIDLengthCheck() 
	{
		VetClinic vetclinic = new VetClinic("testClinic");

		assertFalse(vetclinic.addCat("1234567","Shadow", "Kitten", "Ball"));

	}
	
	
	@Test
	public void testValidIDPass ()
	{
		VetClinic vetclinic = new VetClinic("testClinic");
		assertTrue(vetclinic.validID("123456"));
		
		
	}
	
	@Test
	public void testValidIDFailTooShort ()
	{
		VetClinic vetclinic = new VetClinic("testClinic");
		assertFalse(vetclinic.validID("12345"));
		
		
	}
	
	@Test
	public void testValidIDFailTooLong ()
	{
		VetClinic vetclinic = new VetClinic("testClinic");
		assertFalse(vetclinic.validID("1234567"));
		
		
	}
	
		
	@Test
	public void testValidIDFailEmptyID ()
	{
		VetClinic vetclinic = new VetClinic("testClinic");
		assertFalse(vetclinic.validID(""));
		
		
	}
	
	@Test
	public void testValidIDFail4InvalidCharacters ()
	{
		VetClinic vetclinic = new VetClinic("testClinic");
		assertFalse(vetclinic.validID("a12345"));
		
		
	}
	
	
	
	@Test
	public void testListAllAnimalsEmpty()
	{
		VetClinic vetclinic = new VetClinic("testClinic");
		assertEquals("Animal: Cats\n" + "\nAnimal: Dogs\n", vetclinic.listAll_animals());
	
	
	}
	
	@Test
	public void testListAllAnimalsOneAnimal()
	{
		VetClinic vetclinic = new VetClinic("testClinic");

		vetclinic.addCat("123456","Shadow", "Kitten", "Ball"  );
		
		
		assertEquals("Animal: Cats\n" + "\t ID: "+ "123456" + " Name: " + "Kitten"+ " Type: " + "Shadow"   +" Toy: " + "Ball" +"\n"+ "\nAnimal: Dogs\n",
				vetclinic.listAll_animals());
	
	
	}
	
	@Test
	public void testListAllAnimalsTwoAnimals()
	{
		VetClinic vetclinic = new VetClinic("testClinic");

		vetclinic.addCat("123456","Shadow", "Kitten", "ball"  );
		vetclinic.addDog("123455","Duke", "Great Dane", "Big" );
		
		
		assertEquals("Animal: Cats\n" + "\t ID: "+ "123456" + " Name: " + "Kitten"+ " Type: " + "Shadow"   +" Toy: " + "ball" +"\n"+ 
		"\nAnimal: Dogs\n" + "\t ID: "+ "123455" +" Name: " + "Great Dane" + " Type: " + "Duke"  +" K9_family: " + "Big" +"\n",
				vetclinic.listAll_animals());
	
	
	}


}
