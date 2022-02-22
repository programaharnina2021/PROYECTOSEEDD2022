package withNonStaticMethids;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EveryTestNeedsAValue08TestOrdenamiento {

	int valor=9;
	static String cosa;
	
	@BeforeAll
	static void Before() {
		System.out.println("en el beforeAll ");
		cosa=new String("nada");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("en el beforeEach "+this.valor);
	}

	@Test
	void test1() {
		this.valor++;
		System.out.println("en el test1 "+this.valor);
	}

	@Test
	void test2() {
		this.valor++;
		System.out.println("en el test2 "+this.valor);
	}

	@Test
	void test3() {
		System.out.println("en el test3");
	}

	@Test
	void test4() {
		System.out.println("en el test4");
	}

	@Test
	void test5() {
		System.out.println("en el test5");
	}

	@AfterEach
	void afterEach() {
		System.out.println("despues de cada prueba");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("despues de todas las pruebas");
		
	}
}
