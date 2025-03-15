class Demo4{
	public static void main(String [] args){
	 
	short a = 20;
	
	//a = a+40;
	
	//System.out.println("a = "+a);
	
	
	// OUTOUT::::
	
	/* Demo4.java:6: error: incompatible types: possible lossy conversion from int to short
        a = a+40;
             ^
        1 error
	*/
	
	
	/* ERROR occur due to short is of (16 bit = 2 bytes) and Arithmetic Operators Works on (32 bits = 4bytes)  */
	
	a = (short)(a+40);          // explicit type casting ......short cast to int
	System.out.println("a = "+a);
	}
}