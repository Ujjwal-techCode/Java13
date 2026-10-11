package org.practice;
public class TextBlockDemo {
	public static void main(String[] args) {
		//Simple print of text block
		String address = """
				Punjab National Bank
				Gola Road, Danapur,
				Patna-801503
				""";
		System.out.println(address);
		
		//comparison of text blocks using equals and == operator
		String address1 = """
				Punjab National Bank
				""";
		System.out.println(address1);
		
		String address2 = "Punjab National Bank";
		System.out.println(address2);
		
		System.out.println(address1.equals(address2));
		System.out.println(address1==address2);
		
		//concatenation operation of Text blocks
		String str1 = "Punjab ";
		String str2 = """
				National""";
		String str3 = " Bank";
		String str4 = str1+str2+str3;
		System.out.println(str4);
		String str5 = str1.concat(str2).concat(str3);
		System.out.println(str5);
		System.out.println(str4.equals(str5));
		System.out.println(str4==str5);
		
		//Text block passed as a parameter
		String str6 = getAddress(str5);
		System.out.println(str6);
		
		//text block for HTML or JSON
		String html = """
				<html>
					<body>
						<p>Hello World.</p>
					</body>
				</html>
				""";
		System.out.println(html);
		
		//indent method on Text Blocks
		System.out.println(html.indent(10));
		System.out.println(html.indent(-10));
		
		//inclusion of "" & '' in text blocks
		String str = """
				'Punjab National Bank'
				"Gola Road, Danapur,"
				"Patna-801503" """;
		System.out.println(str);
	}
	
	public static String getAddress(String str) {
		return """
				Full Address
	   =======================================
				"""+str+"""
				Gola Road, Danapur,
				Patna-801503""";
	}
}