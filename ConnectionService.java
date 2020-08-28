package com.wipro.eb.service;
import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
public class ConnectionService 
{
	boolean flag=false;
	  public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException
	  {
	    if(currentReading<previousReading ||currentReading<0 ||previousReading<0)
	    {
	      flag=false;
	      throw new InvalidReadingException();
	    }
	    else if(!(type.equals("Domestic") || type.equals("Commercial")))
	    {
	      flag=false;
	      throw new InvalidConnectionException();
	    }
	    else
	    {
	      flag=true;
	    }
	    return flag;
	      
	  }
	  public float calculateBillAmt(int currentReading, int previousReading, String type)throws InvalidReadingException, InvalidConnectionException {
	    float slabs[]=new float[3];
	      float computedbillamount=0;
	      if(!validate(currentReading, previousReading, type))
	        return -1;
	      else if(!validate(currentReading, previousReading, type))
	        return -2;
	      else {
	        if(type.equals("Domestic")) {
	          slabs[0]=2.3f;
	          slabs[1]=4.2f;
	          slabs[2]=5.5f;
	          Domestic d = new Domestic(currentReading, previousReading, slabs);
	           computedbillamount = d.computeBill();
	        }
	        else {
	          slabs[0]=5.2f;
	          slabs[1]=6.8f;
	          slabs[2]=8.3f;
	          Commercial c = new Commercial(currentReading, previousReading, slabs);
	           computedbillamount = c.computeBill();
	          }
	        }
	      return computedbillamount;
	  }
	  public String generateBill(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException {
	      if(calculateBillAmt(currentReading, previousReading, type)==-1)
	        return "Incorrect Reading";
	      else if(calculateBillAmt(currentReading, previousReading, type) == -2)
	        return "Invalid ConnectionType";
	      else
	        return "Amount to be paid:"+calculateBillAmt(currentReading, previousReading, type);
	    }

}
