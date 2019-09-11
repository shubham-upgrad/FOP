// Passing and returning objects to methods
class Student{
	private int rollno;
	private String name;

	Student(int r,String n){
		this.rollno=r;
		this.name=n;
	}
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	public void setName(String nm){
		this.name=nm;
	}
	public int getRollno(){
		return this.rollno;

	}
	public String getName(){
		return this.name;
	}
	public String toString(){
		return rollno + " - " + name;
	}
}

public class FunctionsExamples2{
	public static void printHello(){
		System.out.println("Hello");
	}

	public static void showName(Student s){
		System.out.println(s.getName());
	}
	public static void showRollno(Student s){
		System.out.println(s.getRollno());
		
	}

	public static void swap(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	public static void studentSwap(Student a,Student b){
		Student temp;
		temp=a;
		a=b;
		b=temp;
	}
	public static void studentDeepSwap(Student a,Student b){
		Student tempa;
		tempa=a;
		a.setRollno(b.getRollno());
		a.setName(b.getName());
		b.setRollno(tempa.getRollno());
		b.setName(tempa.getName());
	}
	public static void changeName(Student s){
		s.setName("Hitu");
	}
	public static void main(String[] args) {
		Student s1=new Student(1,"Shubham");
		Student s2=s1;
		// showName(s1);
		// showRollno(s1);
		int x=10,y=20;
		// System.out.println("Before swap x = "+x);
		// System.out.println("Before swap y = "+y);
		swap(x,y); // Won't actually swap the variables x and y
		// it is because a and b are COPIES of values of x and y respectively
		// So swap is just modifying the COPIES and not the ORIGINALS
		// System.out.println("After swap x = "+x);
		// System.out.println("After swap y = "+y);

		Student st1=new Student(1,"Hitesh");
		Student st2=new Student(2,"Akash");
		System.out.println("Before deep swap student st1 = "+st1);
		System.out.println("Before deep swap student st2 = "+st2);
		studentDeepSwap(st1,st2);
		System.out.println("After deep swap student st1 = "+st1);
		System.out.println("After deep swap student st2 = "+st2);
		// System.out.println("Before changeName student st1 = "+st1);
		changeName(st1);
		// System.out.println("After changeName student st1 = "+st1);
	}
}



