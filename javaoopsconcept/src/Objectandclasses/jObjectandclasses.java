package Objectandclasses;

public class jObjectandclasses {

	String name;
	String age;
	int id;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public jObjectandclasses(String name, String age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return name +"  "+  age + "  "+ id ;
	}
	
	
	
	
}
