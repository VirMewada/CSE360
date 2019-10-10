//Name of the author - Virbhadra Mewada 
//class ID - 1213379438
//assignment number - 2
//
//Description - Uses JavaDoc

package cse360assign2;


import static org.junit.Assert.*;

import org.junit.Test;

public class CSE360Assignm2 {
	
	
	@Test
	public void addingMachineTest1() {
		
		//add method
		
		AddingMachine test = new AddingMachine();
		
		test.add(3);
		
		assertEquals(3,test.getTotal());
	}
	
	@Test
	public void addingMachineTest2() {
		
		//subtract method 
		 
		AddingMachine test = new AddingMachine();
		
		test.subtract(3);
		
		assertEquals(-3,test.getTotal());
	}
	
	@Test
	public void addingMachineTest3() {
		//subtract method and add method
		AddingMachine test = new AddingMachine();
		
		test.add(4);
		
		test.subtract(3);
		
		assertEquals(1,test.getTotal());
	}
	@Test
	public void addingMachineTest4() {
		//subtract method and add method and toString
		
		AddingMachine test = new AddingMachine();
		
		test.add(7);
		
		test.subtract(3);
		
		
		test.add(6);
		
		assertEquals("0 + 7 - 3 + 6",test.toString ());
	}
	@Test
	public void addingMachineTest5() {
		//subtract method and add method and clear
		AddingMachine test = new AddingMachine();
	
		test.add(8);
		test.add(7);
		test.subtract(6);
		test.clear();
		assertEquals(0,test.getTotal());
	}
	@Test
	public void addingMachineTest6() {
		//subtract method and add method and clear
		AddingMachine test = new AddingMachine();
		
		test.add(8);
		test.add(7);
		test.subtract(6);
		test.clear();
		assertEquals("0",test.toString());
	}
	

}
