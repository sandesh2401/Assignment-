class Box {
	float height, width, breadth;

	Box(float h, float w, float b) {
		height = h;
		width = w;
		breadth = b;
		
}

	float getVolume() {
	 return height * width * breadth;
}
	float getArea() {
	return 2 * (height * width + width * breadth + breadth * height);
}
	public static void main(String args[]) {
	
	Box box = new Box(3, 4, 5);
	Box box1 = new Box(2, 4, 6);
	
	System.out.println("volume of box "+box.getVolume());
	System.out.println("area of box "+box.getArea());
	System.out.println("volume of box "+box1.getVolume());
	System.out.println("area of box "+box1.getArea());
}
}

