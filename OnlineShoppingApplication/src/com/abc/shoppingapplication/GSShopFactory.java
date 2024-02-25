package com.abc.shoppingapplication;

import com.abc.shoppingframework.NormalAcc;
import com.abc.shoppingframework.PrimeAcc;
import com.abc.shoppingframework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int accNO, String accNm, float charges, boolean isPrime) {
		PrimeAcc primeacc=new GSPrimeAcc(accNO, accNm, charges, isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNO, String accNm, float charges, float deliveryCharges) {
		 NormalAcc normalacc=new GSNormalAcc(accNO, accNm, deliveryCharges, deliveryCharges);
		return normalacc;
	}


}
