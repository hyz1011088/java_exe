public class OverClass<T>{     //定义泛型类
	private T over;            //定义泛型成员变量
	public T getOver(){        //设置getXXX()方法
		return over;
	}
	public void setOver(T over){   //设置setXXX()方法
		this.over=over;
	}
	public static void main(String[] args){
		OverClass<Boolean> over1=new OverClass<Boolean>();  //实例化
		OverClass<Float> over2=new OverClass<Float>();
		over1.setOver(true);
		over2.setOver(12.3f);
		Boolean b=over1.getOver();
		Float f=over2.getOver();
		System.out.println(b);
		System.out.println(f);
	}
}
