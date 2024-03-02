class Student {
	
	String name;
	int marks1, marks2, marks3;
	float total, average;
	

	void initialValues(String N, int m1, int m2, int m3){
		name = N;
		marks1 = m1;
		marks2 = m2;
		marks3 = m3;
}

	float totalAverage() {
		total = marks1 + marks2 + marks3;
		average = total/3;
		return average;
}

	void display() {
		System.out.println("Names of Student : "+ name);
		System.out.println("Total marks : "+ total);
		System.out.println("Total average : "+ average);
}

		
	public static void main(String args[]) {
	
		Student stud = new Student();
		
	stud.initialValues("Sandesh", 85, 88, 90);
	stud.totalAverage();
	stud.display();

	

}


}
