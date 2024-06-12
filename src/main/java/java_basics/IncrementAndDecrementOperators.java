package java_basics;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		//++ and --
		//post increment 
		
		int a = 1; 
		int b = a++; 
		
		System.out.println(a); //2
		System.out.println(b); //1
        
		int p = -98;
		int q = p++;
		System.out.println(p); //-97
		System.out.println(q); //-98
		
		//pre increment
		int u = 1; //2
		int y = ++u; //2
		System.out.println(u);
		System.out.println(y);
		
		int x = -99;
		int z = ++x;
		System.out.println(x); //-98
		System.out.println(z); //-98
		
		int pop = 2;
		System.out.println(pop++); //2
		System.out.println(pop); //3
		
		int loop = 2;
		System.out.println(++loop); //3
		System.out.println(loop); //3
		
		int amount = 10;
		int finalAmount = amount++; 
		System.out.println(finalAmount); //10
		
		//post decrement 
		int tt = 2;
		int pp = tt--;
		System.out.println(tt); //1
		System.out.println(pp); //2
		
		int rest = -99;
		int b1 = rest--;
		System.out.println(rest); //-100
		System.out.println(b1); //-99
		
		//predecrement
		
		int b3 = 2;
		int b4 = --b3;
		System.out.println(b3); //1
		System.out.println(b4); //1
		
		int a1 = -99;
		int a2 = --a1;
		System.out.println(a1); //-100
		System.out.println(a2); //-100
		
		int na = 1;
		int test = na++ + na++ + na++ + na++;
		System.out.println(na);
		System.out.println(test);
	}

}
