package com.exe1;

public class CalculateEggUnit {
	EggUnit eunit=new EggUnit();
	int numOfEggs,gross,dozen,rem;
 public CalculateEggUnit(int numOfEggs)
 {
	 this.numOfEggs=numOfEggs;
 }
 public void getCalculate()
 {
	 gross=numOfEggs/144;
	 numOfEggs=numOfEggs%144;
	 dozen=numOfEggs/12;
	 numOfEggs=numOfEggs%12;
 }
 public void setCalculate()
 {
	
	 eunit.setGross(gross);
		eunit.setDozen(dozen);
		eunit.setRemaining(numOfEggs);
	
 }
 public void display()
 {
	 if(dozen>0&&numOfEggs>0)
	 System.out.println("Result with units is: "+eunit.getGross()+" gross "+ eunit.getDozen()+" dozen "+eunit.getRemaining());
	 else if(dozen>0)
		 System.out.println("Result with units is: "+eunit.getGross()+" gross "+ eunit.getDozen()+" dozen ");
	 else
		 System.out.println("Result with units is: "+eunit.getGross()+" gross ");
 }
 
}
