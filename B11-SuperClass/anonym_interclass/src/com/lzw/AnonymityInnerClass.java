<<<<<<< HEAD
package com.lzw;

public class AnonymityInnerClass {
}
class OuterClass4{

	public OutInterface doit(final String s){
		return new OutInterface(){
			private int i=0;
			public int getValue(){
				System.out.println(s);
				return i;
				
			}
			public void f(){
				System.out.println("f()");
			}
		};
	}

}
interface OutInterface { // ����һ���ӿ�
=======
package com.lzw;

public class AnonymityInnerClass {
}
class OuterClass4{

	public OutInterface doit(final String s){
		return new OutInterface(){
			private int i=0;
			public int getValue(){
				System.out.println(s);
				return i;
				
			}
			public void f(){
				System.out.println("f()");
			}
		};
	}

}
interface OutInterface { // ����һ���ӿ�
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
}