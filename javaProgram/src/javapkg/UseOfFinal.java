package javapkg;

public class UseOfFinal {
	
	final int speed=90;
	
	void run(){
		
		int speed=100;
		
		//System.out.println("speedlimit = " + speed);
	}

	public static void main(String[] args) {
		
		UseOfFinal obj=new UseOfFinal();
		obj.run();
		

	}

}
