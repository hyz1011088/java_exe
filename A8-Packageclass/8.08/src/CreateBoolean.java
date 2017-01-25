/*
 *通过字符型变量创建boolean值，再将其转化为字符串输出，观察输出后的字符串与创建boolean对象时给定的参数是否相同
*/
public class CreateBoolean {
	public static void main(String args[]) {
		Boolean b = new Boolean("ok");
		String str = b.toString();
		System.out.println("ok:" + str);
		b = new Boolean("true");
		str = b.toString();
		System.out.println("true:" + str);
	}
}
