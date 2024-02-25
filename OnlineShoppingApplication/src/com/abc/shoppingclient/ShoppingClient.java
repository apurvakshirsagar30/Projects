package com.abc.shoppingclient;

import com.abc.shoppingapplication.GSNormalAcc;
import com.abc.shoppingapplication.GSPrimeAcc;
import com.abc.shoppingapplication.GSShopFactory;
import com.abc.shoppingframework.NormalAcc;
import com.abc.shoppingframework.PrimeAcc;
import com.abc.shoppingframework.ShopFactory;

import java.util.Scanner;
public class ShoppingClient {
    static int accNo;
    static String accNm;
    static float charges;
    static boolean isPrime;
    static float deliveryCharges;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopFactory sf=new GSShopFactory();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your details ...... ");
		
		System.out.print("Account Number: ");
		accNo=s.nextInt();
		System.out.print("Account Username: ");
		accNm=s.next();
		System.out.print("Item Charges: ");
		charges=s.nextFloat();
		System.out.print("Account is Prime ?: ");
		isPrime=s.nextBoolean();
		
		
		if(isPrime==true)
		{
			PrimeAcc pa=new GSPrimeAcc(accNo,accNm,charges, isPrime);
			pa.bookProduct(pa.getCharges());
			pa.toString();
			
		}
		else
		{
			System.out.print("Enter Delivery Charges : ");//true or false
			deliveryCharges=s.nextFloat();
			NormalAcc na=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
			na.bookProduct(na.getDeliveryCharges());
			na.toString();
		}
	}

}
