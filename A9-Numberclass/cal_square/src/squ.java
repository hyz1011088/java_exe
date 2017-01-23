
public class squ{

	int a;
	int b;
	public squ(int num1,int num2){
		this.a=num1;
		this.b=num2;
	}
	public int cal(){
		return a*b;
	}

	public void main(String[] args){
		squ s=new squ(2, 4);
		System.out.println(s.cal());
	}

}
