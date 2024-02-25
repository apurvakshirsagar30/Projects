package com.abc.shoppingapplication;

import com.abc.shoppingframework.NormalAcc;

public class GSNormalAcc extends NormalAcc  {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		
	}
	
	public void bookProduct(float deliveryCharges)
	{
		
		System.out.println("You have to pay Delivery Charges = "+deliveryCharges);
		System.out.println("Your Total Bill is "+(getCharges()+deliveryCharges));
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
