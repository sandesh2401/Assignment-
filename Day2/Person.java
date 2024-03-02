class Person {
	int age;
	float height;
	float weight;

	Person(int a) {
	  	age = a;
}

	Person(int a, float h) {
	  	age = a;
		height = h;
}

	Person(int a, float h, float w) {
	  	age = a;
		height = h;
		weight = w;
}

	
	void display() {
	System.out.println("Age is : "+ age);
	System.out.println("Height is : "+ height);
	System.out.println("Weight is : "+ weight);
	
}
	public static void main(String args[]) {
	Person p1 = new Person(52);
	Person p2 = new Person(40, 5.8f);
	Person p3 = new Person(22, 6.0f,64.2f);

	p1.display();
	System.out.println("==============================================");
	p2.display();
	System.out.println("==============================================");
	p3.display();

	

}
}