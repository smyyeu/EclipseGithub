package hWork3;

public class Student  extends User  {
	

	int level;

	public Student(int id, String name, String lastName, String lesson, int level) {
		super(id, name, lastName, lesson);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
