// static  -> 
/*
static :
create an attribute that can be used by all objects
		- common to all objects
		- Class Variables

create a method which can be called without creating an object
create a static block(initialization block) :
		1.Inititalization blocks -- Constuctors, static blocks,non-static blocks 

final keyword :






*/
public class ClassesAndObjectsExamples22{


	public static void main(String[] args) {
    Person hitesh=new Person();
    hitesh.setName("hitesh");
    Pen reynolds=new Pen(); // A pen that can write 100 characters
    Paper ocb=new Paper();
    hitesh.write("Jai Mata Di",ocb,reynolds);
    System.out.println(ocb.getContent());
    
	}		
}