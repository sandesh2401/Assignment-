 class Room {
	float height;
	float width;
	float breadth;
	
float volume() {
	return height * width * breadth;
}
	
  public static void main(String[] args) {
	Room obj = new Room();
	obj.height = 4.0f;
	obj.width = 5.0f;
	obj.breadth = 6.0f;

	System.out.println("Volume of the Room : " + obj.volume());
   
  }
}