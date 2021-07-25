package learn.com.comparatorAndComaparable;


class Student implements Comparable<Student>{
	 private int rollNum;
	 private int age;
	 private String name;
	
	 Student(){
		 
	 }
	 
	Student(int rollNum, int age, String name){
		this.rollNum = rollNum;
		this.age = age;
		this.name = name;
	}

	
	
	public int getRollNum() {
		return rollNum;
	}



	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(rollNum==st.rollNum)
			return 0;
		else if (rollNum>st.rollNum) {
			return 1;
		}
		else 
			return -1;
		
	}
	
}
