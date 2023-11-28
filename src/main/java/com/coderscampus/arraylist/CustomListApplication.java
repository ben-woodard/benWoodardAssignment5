package com.coderscampus.arraylist;

public class CustomListApplication  {

	public static void main(String[] args) {
		
		CustomList<Integer> customListTest = new CustomArrayList<>();
		
		for(int j = 0; j < 20; j++) {
			customListTest.add(j+1);
		}
		
		
		for(int i = 0; i < customListTest.getSize(); i ++) {
		System.out.println(customListTest.get(i));
		
		}
		
		

	}

}
