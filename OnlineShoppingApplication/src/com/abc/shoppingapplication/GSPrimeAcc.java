package com.abc.shoppingapplication;

import com.abc.shoppingframework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	private static final float charges=0.0f;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}

	public void bookProduct(float charges)
	{
		
		System.out.println("It is your Prime Account you dont have to pay delivery charges.");
		System.out.println("Your Total Bill is = "+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
