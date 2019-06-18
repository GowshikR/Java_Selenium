package SelJava;

import java.util.*;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Table;

public class Hash {

	public static void main(String[] args) {
		HashMap <Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(101,"Gowshik");
		map2.put(102,"Rajkumar");
		map2.put(103,"Hari");
		map2.put(104,"Sethu");
		System.out.println(map2.get(101));
		split();
		hashmapex();
		entryset();
		itertion();		
	}
	public static void split()
	{
	String s1= "This this is java  is method for for split";
	String[] sep = s1.split(" ");	
	HashMap<String,Integer> map1 = new HashMap<String,Integer>();		
	for(int i=0; i<sep.length-1;i++){
		if(map1.containsKey(sep[i])){
			int count = map1.get(sep[i]);
			map1.put(sep[i],count+1);			
		}		
		else{
			map1.put(sep[i],1);
		}		
	}
	System.out.println(map1);
}
	public static void hashmapex()
	{
		HashMap<String,Integer> maps = new HashMap<String,Integer>();
		HashMap<Integer,String> mapping = new HashMap<Integer,String>();
		System.out.println("Is empty"+maps.isEmpty());
		maps.put("Ganesh",1468);
		maps.put("Sethu",1555);
		System.out.println("Is empty?"+maps.isEmpty());
		System.out.println("Size of the Map "+maps.size());
		System.out.println(maps);
		mapping.put(1469,"Gowshik");
		mapping.put(1444, "Pagal");
		mapping.putIfAbsent(1545, "Dhoni");
		mapping.putIfAbsent(1469, "Gowshik");
		System.out.println(mapping);
		System.out.println("Size of the map"+mapping.size());
		String name ="Ganesh";
		if(maps.containsKey(name))
		{
			Integer empno = maps.get(name);
			System.out.println(name+" employee number is "+empno);
		}
		maps.put("Ganesh",1469);
		System.out.println(maps);
		maps.remove("Ganesh");
		maps.remove("Ganesh", 1469);
		System.out.println("New Mapping:"+maps);
	}
	public static void entryset()
	//Obtaining the entrySet, keySet, and values from a HashMap
	{
		HashMap<String,String> mapsets = new HashMap<String,String>();
		mapsets.put("Virat", "India");
		mapsets.put("Finch","Australia");
		mapsets.put("Sarfraz","Pakistan");
		System.out.println(mapsets);
		// HashMap's entry set
		Set<Map.Entry<String,String>> setmap = mapsets.entrySet();
		System.out.println(setmap);
		// HashMap's key set
		Set<String> s1 = mapsets.keySet();
		System.out.println(s1);
		// HashMap's values
		Collection<String> s2= mapsets.values();
		System.out.println(s2);
	}
	public static void itertion()
	{
		HashMap<String,Double> sal = new HashMap<String,Double>();
		sal.put("Vijay",3500.00);
		sal.put("Ajith", 4000.00);
		sal.put("Rajini", 5000.00);
		sal.forEach((Actor,salary)->{System.out.println(Actor+" ==> "+salary);});	
		System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");
		for(Entry<String, Double> entry: sal.entrySet()) 
		{System.out.println(entry.getKey()+" ==> "+entry.getValue());}
		for(Map.Entry<String, Double> entry: sal.entrySet())
		{
			System.out.println(entry.getKey()+" -==> "+entry.getValue());
		}
	}	
	public static void reverse()
	{
		String s1 ="KIHSWOG";
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		s2= s2.reverse();
		System.out.println(s2);
	}
	public static void foreach()
	{
		int arr[]= {10,12,13};
		for(int varname:arr)
		{
			System.out.println(varname);
		}		
	}	
}
