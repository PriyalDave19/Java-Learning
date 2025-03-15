class Demo1{
public static void main(String args[]){

int a = 10;

// a = a++ / a++; 
// a = 10 (++=11) / 11(++12);
 //a = 12 in memory;
 // a = 10/11; ----> output - 0
 // a = 0; output
a= a++ / a++;
System.out.println("a="+a);

}
}