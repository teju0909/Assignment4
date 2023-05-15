
public class UniqCharacters {
	
		boolean uniqueCharacters(String str)
		{
			// If at any time we encounter 2 same
			// characters, return false
			for (int i = 0; i < str.length(); i++)
				for (int j = i + 1; j < str.length(); j++)
					if (str.charAt(i) == str.charAt(j))
						return false;

			// If no duplicate characters encountered,
			// return true
			return true;
		}

		public static void main(String args[])
		{
			UniqCharacters obj = new UniqCharacters();
			String input = "nikl";

			if (obj.uniqueCharacters(input))
				System.out.println("The String " + input + " has all unique characters");
			else
				System.out.println("The String " + input + " has duplicate characters");
		}
	

}
