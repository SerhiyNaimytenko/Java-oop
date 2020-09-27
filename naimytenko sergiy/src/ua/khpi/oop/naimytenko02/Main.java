package ua.khpi.oop.naimytenko02;

public class Main {
	public static void main(String[] args) {
		 
		double rand_num;
		int x;
		for(int i=0;i<10;i++)
		{
			rand_num = Math.random()*10;
			x =  (int)rand_num;
			task(x);
			System.out.println("_____________________");
		}

      }
	
	public static void task(int x)
	{ 
		System.out.println("Your number is "+x ) ;
        for ( int i=2; i < x; i++) {
                if ( x % i == 0) {
                        System.out.println("This number is not simple!!!");
                        return;
                }      
        }
        System.out.println("Very well! It's simple!"); 
        return;
	}
	
	
	
}


