package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList <Integer> arr=new ArrayList<>();
//		int a=100;
//		arr.add(128);
//		arr.add(128);
//		arr.add(1000);
//		System.out.println(arr.get(0)==arr.get(1));
		
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		
//		for(int i=0;i<arr.size();i++) {
//			arr.remove(i);
//		}
//		System.out.println(arr);
//		
//		
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		
//		List sub=arr.subList(1, 3);
//		
//		arr.add(4);
//		System.out.println(sub);
//		System.out.println(arr);
		
		List arr1= Arrays.asList(1,2,3);
		
		arr1.add(4);
		System.out.println(arr1);
		
	
		
		
			}
}

// Task Of The Day 09-04-2026
// 
// Bank Account System (Encapsulation + ArrayList)
// 
// Create a class BankAccount:
// accountNumber
// holderName
// balance (private)
// 
//  Tasks:
//	  
// Store multiple accounts in ArrayList<BankAccount>
// Deposit money
// Withdraw money (check balance)
// Display all accounts
// Find account by account number
// 
// (Important)
//
// Encapsulation (private + public)
// Validation (no negative withdrawal)
