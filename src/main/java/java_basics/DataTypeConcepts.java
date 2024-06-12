package java_basics;

public class DataTypeConcepts {

	public static void main(String[] args) {

		// data types
		// 1.primitive data types: it takes the space in the memory -- without object
		// boolean type : true/false
		// Numeric type :
		// a. character type : char
		// b. Integral Value:
		// b.1: Integer: byte,short, int, long
		// b.2: Floating point: float, double
           //1.byte:
		   //size : 1 byte = 8 bits
		  byte b =10;
		  b =30;
		  byte c = 20;
		  byte g = 10;
		  byte h = -90;
		  System.out.println(c);
		  
		  //2.short
		  //size : 2 bytes = 2*8 = 16bits
		  //range = -32768 to 32768
		  
		  short s = 234;
		  short s1 = 1;
		  
		  //3.int
		  //size : 4 byte = 4*8 = 32bits
		  //range : -2147483648 to 2147483647
		  int i = 2300;
		  int j = 909998;
		  int k = 0;
		  
		  //4.long 
		  //size : 8 bytes = 8*8 = 64 bits
		  //range : 2^63 to 2^63-1
		  long l = 20932903234034l; //for large no's we have to give l/L
		  long distance = 2323232323232323292L;
		  
		  //BigInteger
		  
		  //5.float
		  //size : 4 bytes = 8*4 = 32bits
		  float f1 = 123.45f;
		  float f2 = (float)1245.234523;
		  float f3 = 100; //it considered as 100.00
		  
		  //6.double 
		  //size : 8 bytes = 8*8 = 64 bits
		  //range : it can take upto 15 digits
		  double d = 12.3333;
		  double d1 = 1.1;
		  
		  //7.char
		  //size : 2 bytes = 2*8 = 16 bits
		  // range - 0-9,a-z,A-Z
		  char c1 = 'a';
		  char c2 = '2';
		  char c3 = '$';
		  char c4 = 'A';
		  
		  //8.boolean: 
		  //size : approximately 1 byte
		  boolean flage = true;
		  boolean test = false;
		  
		// 2.Non primitive data types: with object Array,String,Interface,Classes --
		// oops
	}

}
