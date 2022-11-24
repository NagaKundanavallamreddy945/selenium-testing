package alert;

public class Polymorphism {
	public void add() {
		System.out.println("null parameters");
		
	}
	public void add(int a,int b){
		int c=a+b;
		System.out.println(c);
		
		
		
	}
	public void add(double c,double d) {
		double e=c+d;
		System.out.println(e);
		
	}
	public void add(String a1,String a2) {
		System.out.println(a1+a2);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p1=new Polymorphism();
		p1.add(2,3);
		p1.add(22.1,43.6);
		p1.add("kun","dana");
		
		}

}
