package com.coderscampus.arraylist;

public class CustomListApplication  {

	public static void main(String[] args) {
		
		CustomList<Integer> customListTest = new CustomArrayList<>();
		
		for(int j = 0; j < 40; j++) {
			customListTest.add(j);
		}
		//Checking for Correct Size return
		System.out.println(customListTest.getSize());
		System.out.println();
		
		//Checking for getting value by index.  Index 38 == 38, index 13 == 13
		System.out.println(customListTest.get(38));
		System.out.println(customListTest.get(13));
		System.out.println();
		
		
		for(int i = 0; i < customListTest.getSize(); i ++) {
		System.out.println(customListTest.get(i));
		
		}
		
		

	}

}
