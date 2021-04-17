package git.learn;

public class Testing {

	public static void main(String[] args) {
		String test = "changeme";

		char[] ch = test.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (i % 2 != 0) {

				System.out.println(Character.toUpperCase(ch[i]));
			} else {
				System.out.println(ch[i]);
			}

		}

	}

	}
 
