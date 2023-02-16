package com.araysSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		int[] arr= {11,55,66,0,45};
		Arrays.sort(arr);
		System.out.println("Sorting int array");
		System.out.println(Arrays.toString(arr));
		
		String[] fruits= {"mango","apple","bananna","orange"};
		Arrays.sort(fruits);
		System.out.println("sorting string array");
		System.out.println(Arrays.toString(fruits));
		
		System.out.println("sorting list   ;--");
		List food=new ArrayList();
		food.add("whiterice");
		food.add("sweet");
		food.add("chicken");
		food.add("lemoanrice");
		food.add("curd");
		Collections.sort(food);
		for(Object s: food) {
			System.out.println(s);
			
		}
	}

}
