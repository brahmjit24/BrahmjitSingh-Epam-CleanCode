package epam.CleanCode.SimpleInterestAndCompoundInterest;

import java.io.*;

public abstract class Interest{
	double principle;
	static double rate;
	double timePeriod;
	static PrintStream myout;
	public Interest()
	{
		Interest.myout= new PrintStream(new FileOutputStream(FileDescriptor.out));
	}
	static void setRate(double rate)
	{
		Interest.rate=rate;
	}
	void setData(double principle,double rate,double timePeriod){}
	void displayResult(){}
}