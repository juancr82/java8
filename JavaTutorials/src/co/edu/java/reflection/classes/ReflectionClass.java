package co.edu.java.reflection.classes;

public class ReflectionClass {
	
	public enum C{ A, B };
	
	@SuppressWarnings("unused")
	private enum E{ A, B };
	
	public String attribute;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

}
