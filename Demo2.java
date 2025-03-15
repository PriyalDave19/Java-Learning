class Demo2{
public static void main(String []args){
	int a = 10 ;
	
	//a = a / a++;
	// a = 10 / 10(++11);
	// a = 11 in memory;
	// a = 1; ======output
	a = a / a++;
	
	System.out.println("a = "+a);
}
}