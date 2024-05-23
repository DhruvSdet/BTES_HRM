package Array_List;
import java.util.*;
public class Reverse_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();   
		// adding elements to the ArrayList   
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes-Benz");   
		list.add("Audi");   
		list.add("Rolls-Royce");  
		list.add("BMW");  
		// printing the unsorted ArrayList   
		System.out.println("Before Sorting: "+ list);   
		// Sorting ArrayList in ascending Order   
		Collections.sort(list);   
		// printing the sorted ArrayList   
		System.out.println("After Sorting: "+ list);
		Collections.reverse(list);   
		// printing the sorted ArrayList   
		System.out.println("Reverse Sorting: "+ list); 
		}   
		}  