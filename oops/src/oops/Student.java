package oops;

public class Student {
	  private String name;
	    private int rollNumber;
	    private int marks;
	    
	    public Student(String name, int rollNumber, int marks){
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }
	    
	    public float calculatePercentage(){
	        return ((float)marks/100)*100;
	    }
	    
	    public String getName(){
	        return name;
	    }
	    
	    public int getRollNumber(){
	        return rollNumber;
	    }
	    
	    public int getMarks(){
	        return marks;
	    }
	    
	    public static void main(String args[]){
	        Student student1 = new Student("priya",101,100);
	        Student student2 = new Student("Gowthami",102,90);
	        Student student3 = new Student("Sravani",103,80);
	        Student student4 = new Student("Sailu",104,70);
	        Student student5 = new Student("Lasya",105,60);
	        
	        System.out.println("Name\tRoll Number\tMarks\tPercentage");
	        System.out.println(student1.getName()+"\t"+student1.getRollNumber()+"\t\t"+student1.getMarks()+"\t"+student1.calculatePercentage()+"%");
	        System.out.println(student2.getName()+"\t"+student2.getRollNumber()+"\t\t"+student2.getMarks()+"\t"+student2.calculatePercentage()+"%");
	        System.out.println(student3.getName()+"\t"+student3.getRollNumber()+"\t\t"+student3.getMarks()+"\t"+student3.calculatePercentage()+"%");
	        System.out.println(student4.getName()+"\t"+student4.getRollNumber()+"\t\t"+student4.getMarks()+"\t"+student4.calculatePercentage()+"%");
	        System.out.println(student5.getName()+"\t"+student5.getRollNumber()+"\t\t"+student5.getMarks()+"\t"+student5.calculatePercentage()+"%");
	    }
	}


