package learn.com.comparatorAndComaparable;

import java.util.Comparator;

public class RollNumComaparator implements Comparator <Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRollNum()==o2.getRollNum()) {
			return 0;
		}
		else if (o1.getRollNum()>o2.getRollNum()) {
			return 1;
		}
		else
		return -1;
		
	}

}
