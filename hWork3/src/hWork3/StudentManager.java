package hWork3;

public class StudentManager extends UserManager {
	
	public void addToList(Student student) {
		
		System.out.println( student.getName()+ "leveli listeye eklendi");
		
	};
	
	public void addToList(User user) {
		System.out.println(user.getName()+ " listeye eklendi");
		
	};

}
