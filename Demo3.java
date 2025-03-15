class Demo3{
	public static void main(String [] args){
		int i = 0;
		
		// i = 0;
		// i<10   || 0<10 TRUE
		// i = 0 (++=1);
		// i<10   || 0<10 TRUE
		// i = 0 (++=1);
		// i<10   || 0<10 TRUE
		// i = 0 (++=1);
		// i<10   || 0<10 TRUE
		// i = 0 (++=1);
		// i = 1 in memory;
		// i = 0 0 0 0 0 ....infinite =================output
		// i = 1 in memory but always process with 0
		
		while(i<10){
			i = i++;
			System.out.println("i ="+i);
		}
	
	}
}