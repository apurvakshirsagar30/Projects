package com.abc.shoppingframework;

public abstract class ShopFactory {

	public abstract PrimeAcc getNewPrimeAcc(int accNO, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int accNO, String accNm, float charges,float deliveryCharges);
	
}
