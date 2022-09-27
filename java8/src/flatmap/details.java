package flatmap;

import java.util.List;

public class details {

	String name;
	int id;
	List<String> item;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getItem() {
		return item;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}

	public details(String name, int id, List<String> item) {
		super();
		this.name = name;
		this.id = id;
		this.item = item;
	}

	public details() {

	}

	@Override
	public String toString() {
		return  name +  id + item ;
	}

}
