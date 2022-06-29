package stringMethods;

public class Substring1 {
	public static void main(String[] args) {
		String name="Shastik";
		System.out.println(name.substring(0,4));
		System.out.println(name.substring(4,name.length()));
	}

}

//if the end value is 4,substring value will always print  upto the previous indexNumber(here its 0123 which displays shas).So give the next index value.