class SingletonClass{
	private static int x;
	private static SingletonClass created;
	private int y;
	private SingletonClass(){
		y=12;
	}
	public static SingletonClass getInstance(){
		if(x<1){
			created=new SingletonClass();
			x=1;
			return created;

		}
		else{
			return created;
		}
	}
	public void display(){
		System.out.println(y);
	}
	public void setY(int i){
		y=i;
	}

}




public class Rough{
	public static void main(String[] args) {
		SingletonClass s=SingletonClass.getInstance();
		s.display();
		s.setY(15);
		s.display();
		SingletonClass s2=SingletonClass.getInstance();
		s2.display();
	}


}