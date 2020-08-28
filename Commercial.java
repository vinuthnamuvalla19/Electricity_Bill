package com.wipro.eb.entity;

public class Commercial extends Connection
{
	public Commercial(int currentReading, int previousReading, float[] slabs)
	{
	    super(currentReading, previousReading, slabs);
	 }
	  public float computeBill()
	  {
		  float currentBill=(float) 0.0;
		  int bill=currentReading-previousReading;
		  if(bill<=50)
			  currentBill+=bill*slabs[0];
		  else if(bill>50 && bill<=100)
		  {
			  currentBill+=50*(slabs[0]);
			  bill-=50;
			  currentBill+=bill*(slabs[1]);
		  }
		  else if(bill>100)
		  {
			  currentBill+=50*(slabs[0]);
			  bill-=50;
			  currentBill+=50*(slabs[1]);
			  bill-=50;
			  currentBill+=bill*(slabs[2]);
	      
		  }
		  if(currentBill>=10000)
			  currentBill+=currentBill*0.09;
		  else if(currentBill>=5000)
			  currentBill+=currentBill*0.06;
		  else if(currentBill<5000)
			  currentBill+=currentBill*0.02;
		  return currentBill;
	  }

}
