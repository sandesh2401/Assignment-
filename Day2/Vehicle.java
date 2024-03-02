class Vehicle {
	int price;
	String color;
	String model;

     Vehicle(int p, String col, String mod) {
		price = p;
		color = col;
		model = mod;
	
}	

   void display() {
  	System.out.println("Price : "+ price);
	System.out.println("Color : "+ color);
	System.out.println("Model : "+ model);

}	
	
	public static void main(String args[]) {
	Vehicle veh = new Vehicle(500000, "Black", "Tata");
	veh.display();

}
}