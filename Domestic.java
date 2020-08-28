package com.wipro.eb.entity;

public class Domestic extends Connection
{
	public Domestic(int currentReading, int previousReading, float[] slabs) {
	    super(currentReading, previousReading, slabs);
	    // TODO Auto-generated constructor stub
	  }

	  @Override
	  public float computeBill() {
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
	    return currentBill;
	  }

}
