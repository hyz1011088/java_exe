package main;

public class ATypeName {
		public static void main(String[] args) {
			class ATypename {
				int i;
				double d;
				boolean b;
				void show() {
					System.out.println(i);
					System.out.println(d);
					System.out.println(b);	
				}
			}	
			ATypename a = new ATypename();
			a.i = 3;
			a.d = 2.71828;
			a.b = false;		
			a.show();
		}

}
