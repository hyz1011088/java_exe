<<<<<<< HEAD
package com.lzw;

public class UseCase2 {
	public void doSomething(){
		System.out.println("父类.doSomething()");
	}
	public void doAnything(){
		System.out.println("父类.doAnything()");
	}
	public static void main(String args[]){
		UseCase2 u=new sub();
		u.doSomething();
		u.doAnything();
	}
}
class sub extends UseCase2{
	public void doAnything(){
		System.out.println("子类.doAnything()");
	}
}
=======
package com.lzw;

public class UseCase2 {
	public void doSomething(){
		System.out.println("父类.doSomething()");
	}
	public void doAnything(){
		System.out.println("父类.doAnything()");
	}
	public static void main(String args[]){
		UseCase2 u=new sub();
		u.doSomething();
		u.doAnything();
	}
}
class sub extends UseCase2{
	public void doAnything(){
		System.out.println("子类.doAnything()");
	}
}
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
