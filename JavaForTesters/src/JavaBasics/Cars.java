package JavaBasics;

public class Cars {

	private String name;
	private String color;
	private int year;
	
	public Cars()
	{
		System.out.println("constructors with no arguments");
	}
	public Cars(String name, String color) {
		this.color = color;
		this.name = name;
		System.out.println("Color is "+this.color+" and name is "+this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
