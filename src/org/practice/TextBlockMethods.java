package org.practice;

public class TextBlockMethods {

	public static void main(String[] args) {
		System.out.println("====First Method in String class for Text Blocks====");
		String str = """
				Emp Details :
				==========================
				empName : %s
				empId : %d
				empSalary : %f
				empAddress : %s
				""";

		System.out.println(str.formatted("Ram", 2294, 10000.0f, "Hyd"));
		System.out.println(str.formatted("Shyam", 2295, 20000.0f, "BAN"));
		System.out.println(str.formatted("Radha", 2296, 30000.0f, "GUR"));
		
		System.out.println("====Second Method in String class for Text Blocks====");
		String data1 = "\t\tPunjab National Bank\t\t";
		String data2 = "\tPatna-801503\t";
		System.out.println(data1.concat(data2));
		System.out.println(data1.stripIndent());
		System.out.println(data2.stripIndent());
		System.out.println(data1.stripIndent().concat(data2.stripIndent()));
		
		System.out.println("====Third Method in String class for Text Blocks====");
		String data3 = "State\nBank\\tOf\nIndia";
		System.out.println(data3);
		System.out.println(data3.translateEscapes());
	}
}