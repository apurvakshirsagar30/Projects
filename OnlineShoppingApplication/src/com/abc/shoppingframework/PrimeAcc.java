package com.abc.shoppingframework;

public abstract class PrimeAcc extends ShopAcc{

	private boolean isPrime;
	private static final float deliveryCharges = 0.0f;
	
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
		
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Your Total Bill is = "+charges);
	}

	@Override
	public String toString() {
		
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}

}
