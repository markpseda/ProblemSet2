package base;

public class MyInteger {
	
	private int iValue; //integer data field iValue
	
	public MyInteger(int iValue){ //basic constructor
		this.iValue = iValue;
	}
	
	public int getiValue(){	//returns iValue of instance
		return this.iValue;
	}
	
	public boolean isEven(){ //returns whether iValue is even
		if((this.getiValue()%2)==0)
			return(true);
		else
			return(false);
	}
	
	public boolean isOdd(){ //returns whether iValue is odd
		if((this.getiValue()%2)==0)
			return(false);
		else
			return(true);
	}
	
	public boolean isPrime(){ //returns whether an integer is prime
		for(int i=2; i<this.getiValue(); i++) {
			if(this.getiValue() % i ==0)
				return false;
		}
			return true;
	}
	
	public static boolean isEven(int value){//returns whether a integer is even
		if((value%2)==0)
			return(true);
		else
			return(false);
	}
	
	public static boolean isOdd(int value){ //returns whether a integer is odd
		if((value%2)==0)
			return(false);
		else
			return(true);
	}
	
	public static boolean isPrime(int value){ //returns whether an integer is prime
		for(int i=2; i<value; i++) {
			if(value % i == 0)
				return false;
		}
			return true;
	}
	
	public static boolean isEven(MyInteger value){//returns whether the iValue of an instance of MyInteger is even
		if((value.getiValue()%2)==0)
			return(true);
		else
			return(false);
	}
	
	public static boolean isOdd(MyInteger value){//returns whether the iValue of an instance of MyInteger is odd
		if((value.getiValue()%2)==0)
			return(false);
		else
			return(true);
	}
	
	public static boolean isPrime(MyInteger value){ //returns whether an integer is prime
		for(int i=2; i<value.getiValue(); i++) {
			if(value.getiValue() % i ==0)
				return false;
		}
			return true;
	}
	
	public boolean equals(int value){//returns whether iValue is equal to some integer
		if(this.getiValue() == value)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger value){//returns whether two instances of MyInteger have the same iValue
		if(this.getiValue() == value.getiValue())
			return true;
		else
			return false;
	}
	
}
