package QSP;

public class practice {
	
	static String removeWhiteSpaces(String input){
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for(char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		
		return output.toString();
	}

		public static void main(String args[]) {
			String n = "  lava nya  ";
			n = n.strip();
			System.out.println(removeWhiteSpaces(n));
		}
	}
