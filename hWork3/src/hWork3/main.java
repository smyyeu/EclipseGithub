package hWork3;

public class main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"sümeyye","ütnü","java",3);
		Student student2 = new Student(2,"ahsen","durak","c#",1);
		
		//Student[] students(student1,student2)
		
		StudentManager studentManager=new StudentManager();
		
		studentManager.addToList(student1);
		studentManager.addToList(student2);
		studentManager.addToList(student2);
		
		UserManager userManager= new UserManager();
		userManager.addToList1(student2);
		userManager.addToList(student1);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
