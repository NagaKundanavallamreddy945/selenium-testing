package alert;

public class Overrriding {
	public void details(int a1,int a2) {
		int c=a1+a2;
		System.out.println(c);
		
	}
	class riding2 extends Overrriding{
		public void details(int a1,int a2) {
			int d=a1+a2;
			System.out.println(d);
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overrriding o=new Overrriding();
		o.details(10,20);

	}

}
