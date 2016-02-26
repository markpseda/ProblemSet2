package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_isEven() {
		int even = 6;
		int odd = 7;
		MyInteger instanceEven = new MyInteger(even);
		MyInteger instanceOdd = new MyInteger(odd);
		assertTrue("6 should be even, isEven() fails", instanceEven.isEven());
		assertFalse("7 should NOT be even, isEven() fails", instanceOdd.isEven());
		//passing in integer
		assertTrue("6 should be even, isEven(int value) fails", MyInteger.isEven(even));
		assertFalse("7 should NOT be even, isEven(int value) fails", MyInteger.isEven(odd));
		//passing in instance of MyInteger
		assertTrue("6 should be even, isEven(MyInteger instance) fails", MyInteger.isEven(instanceEven));
		assertFalse("7 should NOT be even, isEven(MyInteger instance) fails", MyInteger.isEven(instanceOdd));
	}
	
	@Test
	public void test_isOdd(){
		int even = 6;
		int odd = 7;
		MyInteger instanceOdd = new MyInteger(odd);
		MyInteger instanceEven = new MyInteger(even);
		assertTrue("7 should be odd, isOdd() fails", instanceOdd.isOdd());
		assertFalse("6 should NOT be odd", instanceEven.isOdd());
		//passing in integer
		assertTrue("7 should be odd, isOdd(int value) fails", MyInteger.isOdd(odd));
		assertFalse("6 should NOT be odd, isOdd(int value) fails", MyInteger.isOdd(even));
		//passing in instance of MyInteger
		assertTrue("7 should be odd, isOdd(MyInteger instance) fails", MyInteger.isOdd(instanceOdd));
		assertFalse("6 should NOT be odd isOdd(MyInteger instance) fails", MyInteger.isOdd(instanceEven));
	}
	
	@Test
	public void test_isPrime(){
		int prime = 29;
		int notPrime = 50;
		MyInteger instancePrime = new MyInteger(prime);
		MyInteger instanceNotPrime = new MyInteger(notPrime);
		assertTrue("29 should be prime, isPrime() fails", instancePrime.isPrime());
		assertFalse("50 should NOT be prime, isPrime() fails", instanceNotPrime.isPrime());
		//passing in integer
		assertTrue("29 should be prime, isPrime(int value) fails", MyInteger.isPrime(prime));
		assertFalse("50 should NOT be prime, isPrime(int value) fails", MyInteger.isPrime(notPrime));
		//passing in instance of MyInteger
		assertTrue("29 should be prime, isPrime(MyInteger instance) fails", MyInteger.isPrime(instancePrime));
		assertFalse("50 should NOT be prime, isPrime(MyInteger instance) fails", MyInteger.isPrime(instanceNotPrime));
		
	}
	
	@Test
	public void test_equals(){
		int thirty = 30;
		int notThirty = 40;
		MyInteger instanceThirty = new MyInteger(thirty);
		MyInteger instanceAlsoThirty = new MyInteger(thirty);
		MyInteger instanceNotThirty = new MyInteger(notThirty);
		
		assertTrue("An instance of MyInteger with iValue 30 should equal 30, equals(int value) fails",
				instanceThirty.equals(thirty));
		assertFalse("An instance of MyInteger with iValue 30 should NOT equal 40, equals(int value) fails",
				instanceThirty.equals(notThirty));
		//passing in another instance of MyInteger
		assertTrue("Two instances of MyInteger with iValue 30 should be equal, equals(MyInteger instance) fails",
				instanceThirty.equals(instanceAlsoThirty));
		assertFalse("Two instances of MyInteger with different iValues should NOT be equal, equals(MyInteger instance) fails",
				instanceThirty.equals(instanceNotThirty));
	}

}
