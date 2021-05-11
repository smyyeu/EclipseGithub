package hWork3;

public class User {
	
	private int id;
	private String name;
	private String lastName;
	private String lesson;
	
	
	public User(int id, String name, String lastName, String lesson) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.lesson = lesson;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getLesson() {
		return lesson;
	}


	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	

}
