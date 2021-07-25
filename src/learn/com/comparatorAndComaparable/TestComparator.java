package learn.com.comparatorAndComaparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	
	public static void main(String[] args) {
		ArrayList <Student> al = new ArrayList<>();
		NameComparator st = new NameComparator();
		AgeComparator st1 = new AgeComparator();
		RollNumComaparator st2 = new RollNumComaparator();
		
		al.add(new Student(107, 28, "avinash"));
		al.add(new Student(102, 27, "vinay"));
		al.add(new Student(117, 24, "tannu"));
		al.add(new Student(105, 26, "bunnu"));
		
		Collections.sort(al, st1);
		
		for(Student bl : al) {
			System.out.println(bl.getRollNum()+" "+bl.getName()+" "+bl.getAge());
		}
		System.out.println();
		
		Collections.sort(al, st);
		
		for(Student b2: al) {
			System.out.println(b2.getRollNum()+" "+b2.getName()+" "+b2.getAge());
		}
		
		System.out.println();
		
		Collections.sort(al, st2);
		
		for(Student bl : al) {
			System.out.println(bl.getRollNum()+" "+bl.getName()+" "+bl.getAge());
		}
	}
}
