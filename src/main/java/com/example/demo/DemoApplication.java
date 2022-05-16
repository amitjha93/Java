package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.*")
public class DemoApplication {
	public static String getNumbers(int[] arr,int max) {
		String s="";
		for(int i=0;i<arr.length-2;i++) {
			
			for(int j=i+1;j<arr.length-1;j++) {
				
				for(int k=j+1;k<arr.length;k++) {
					
					if(arr[i]+arr[j]+arr[k]==max) {
						
						s=arr[i]+","+arr[j]+","+arr[k];
						
						break;
					}
				}
			}
		}
		return s;
	}
    public static int[][] getSumOfMatrix(int[][] arr,int[][] arr1) {
    	int[][] arr2=new int[arr.length][arr[0].length];
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr1.length;j++) {
    			arr2[i][j]=arr[i][j]+arr1[i][j];
    		}
    	}
    	return arr2;
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Map<Integer, String> map=new ConcurrentHashMap<>();
		
		/*
		 * Map<Integer, String> map=new HashMap<>(); map.put(1, "Hello");
		 * Collections.synchronizedMap(map); System.out.println(map.get(1)); map.put(2,
		 * "Hi"); System.out.println(map.get(2));
		 */
		
		
		/*
		 * int[][] arr= {{1,5},{8,9}}; int[][] arr1= {{2,4},{1,3}}; int[][]
		 * arr2=getSumOfMatrix(arr, arr1);
		 * 
		 * for(int i=0;i<arr2.length;i++) { for(int j=0;j<arr2[0].length;j++) {
		 * System.out.print(arr2[i][j]+" "); } System.out.println(); }
		 */
		
		
		
		  List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
		  Optional<Integer> list1=list.stream().max(Comparator.comparing(n->n));
		  System.out.println(list1.get());
		  Map<Integer, String> map1=new HashMap<Integer, String>();
		  map1.put(1, "Abc");
		   Set<Integer> it=map1.keySet();
		   
		   for(Integer i:it) {
			   System.out.println(map1.get(i));
			   map1.put(2, "aaa");
		   }
		  for(Integer i:list) {
			System.out.println(i);
			list.add(23);
		  }
		 		
		
		/*
		 * Singleton singleton=Singleton.getInstance(); Singleton
		 * singleton1=Singleton.getInstance();
		 * 
		 * System.out.println(singleton.hashCode()+"\n"+singleton1.hashCode());
		 */
		
		/*
		 * Emplyee e=new Emplyee("Amit", 29); Emplyee e1=null; try {
		 * e1=(Emplyee)e.clone(); e1.setName("Rahul");
		 * 
		 * } catch (CloneNotSupportedException e2) { // TODO Auto-generated catch block
		 * e2.printStackTrace(); }
		 * System.out.println(e.getName()+" "+e.getAge()+"\n"+e1.getName()+" "+e1.getAge
		 * ());
		 */
		/*
		 * String str1=new String("Hello"); String str2="Hello";
		 * System.out.println(str1.hashCode()+" "+str2.hashCode()); List<Integer>
		 * list=new ArrayList<>(); list.add(1); list.add(7); list.add(3);
		 * list.stream().map(n->n).forEach(System.out::println); Integer
		 * i=list.stream().mapToInt(n->n).max().orElseThrow(NoSuchElementException::new)
		 * ; System.out.println(i);
		 */
	}
	
	/*
	 * public static int getTotalMoves(List<Integer> arr1,List<Integer> arr2 ) { int
	 * count=0; for(Integer[] int2:arr2) { String str=String.valueOf(int2); String
	 * str=String.valueOf(int2); for(int i=0;i<str.length();i++) { int
	 * num=Integer.valueOf(str.charAt(i));
	 * 
	 * } } }
	 */

}
/*
 * class Emplyee implements Cloneable{ private String name; private int age;
 * 
 * 
 * public Emplyee(String name, int age) { super(); this.name = name; this.age =
 * age; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public int getAge() { return age; }
 * 
 * public void setAge(int age) { this.age = age; }
 * 
 * @Override protected Object clone() throws CloneNotSupportedException { return
 * super.clone(); }
 * 
 * } class Singleton{ private static Singleton singleton=null; private
 * Singleton() {
 * 
 * } public static Singleton getInstance() { if(singleton==null) { singleton=new
 * Singleton(); } return singleton; } }
 */
