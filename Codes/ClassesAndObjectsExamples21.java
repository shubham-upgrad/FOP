/*
Scenario :
"A person writes "Jai Mata Di" on a paper with a pen"
Person ----> Person class
Pen ----> Pen class
Content ---> String
Paper ----> Paper Class
*/
class Pen{
	int inkLeft; // The number of characters that can be written with this pen
    public static Pen(){
    	inkLeft=100;
    }	
	public int getInkLeft(){
		return inkLeft;
	}
	public void write(Paper p,String content){
			for(int i=0;i<inkLeft && i<content.length();i++){
				if(p.addChar(content.charAt(i))==-1){
					break;
				} // Adding characters to the Paper
			}
	}

}
class Paper{
	private String color;
	private int size; // You can only write size characters on th paper
	private String content;    
    public String getColor(){
    	return color;
    }
    public void setColor(String color){
    	this.color=color;
    }
    public String getContent(){
    	return content;
    }
    public Paper(){
    		color="White";
    		size=5;
    		content="";
    }
    public int addChar(char i){
    	if(content.length()>=size){
    		System.out.println("\nPaper is full cannot write more characters");
    		return -1;
    	}			
    	content+=i;
    	return 1;
    }
}

class Person{
	private String name;
	
	// DO YOU NEEEEEEEEEED A CONSTUCTOR??????
	Person(){
		this.name="Tony Stark";
	}
	// You need something to make name available ouside the class
	public String getName(){
			return this.name;
	}
	// You need something to set name since it cannot be set directly
	public void setName(String name){
			this.name=name;
	}
	public void write(String content,Paper paper,Pen pen){
		// Write content on paper with a pen
		pen.write(paper,content); // Here pen is writing by itself
	}
    


}

public class ClassesAndObjectsExamples21{
	

	public static void main(String[] args) {
    Person hitesh=new Person();
    Person nancy=new Person();
    hitesh.setName("hitesh");
    Pen reynolds=new Pen(); // A pen that can write 100 characters
    Paper ocb=new Paper();
    hitesh.write("Jai Mata Di",ocb,reynolds);
    System.out.println(ocb.getContent());
    
	}		
}