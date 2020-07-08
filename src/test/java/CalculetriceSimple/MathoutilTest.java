package CalculetriceSimple;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)

@Nested
@DisplayName("des opération")
class MathoutilTest {
	
    Mathoutil mathoutil;
	@BeforeEach
	void ini () {
	mathoutil =new Mathoutil();
	}
	
	@AfterEach
	void nettoyage() {
		
		System.out.println("nettoyer..........");
	}
    @EnabledOnJre(JRE.JAVA_8)
	@Test
	@DisplayName("le test d'addition")
	void testadiition() {
		
		int expected = 4 ; 
		int actuel = mathoutil.addition(2, 2);
		assertEquals(expected, actuel,"c'est l'opération d'addition");
			
	}
	@EnabledOnOs(OS.LINUX)
	@Test
	@DisplayName("le test de cercle ")
	void testCercle() {
		
		assertEquals(314.1592653589793,mathoutil.Cercle(10) ,"compter la surface de cercle ");
		
		
	}
	//@Disabled
	
	@Test
	@DisplayName("le test de division")
	@Tag("math")
	void testdivision() {
		boolean assume = true;
		assumeTrue( assume);
				
		assertThrows(ArithmeticException.class, ()-> mathoutil.division(1, 0));
	}
	
	@RepeatedTest(5)
	@DisplayName("le test de multiplication ")
	@Tag("math")
	void testmulti() {
		assertAll(()->assertEquals(4,mathoutil.multi(2, 2)),
		          ()->assertEquals(-7,mathoutil.multi(-1, 7)),
		          ()->assertEquals(0,mathoutil.multi(0, 6))
		          );
		
	}	
	
	
	
	
	
	
		
		
	}
	
		
	


