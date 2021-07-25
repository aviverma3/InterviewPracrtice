package learn.com;

import java.util.*;  
import java.io.*;  

public class Test_Sorting_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Student> al = new ArrayList<>(); 
		//	Student st = new Student();
			al.add(new Student(101, 25, "Tannu"));
			al.add(new Student(102, 28, "Avinash"));
			al.add(new Student(103, 24, "Ramesh"));
			al.add(new Student(104, 30, "Vinay"));
			
			Collections.sort(al);
			for(Student bl:al) {
				System.out.println(bl.getRollNum()+" "+bl.getName()+" "+bl.getAge()); 
			}
			
	}


}
