	package decorator.pattern;
	
	public class Main {
		public static void main(String args[]) {
			Name miguel = new ConcreteName();
			
			miguel = new SurName1(miguel);
			System.out.println(miguel.printName());
			
			miguel = new SurName2(miguel);
			System.out.println(miguel.printName());
			
			miguel = new SurName3(miguel);
			System.out.println(miguel.printName());
			
		}
	}
