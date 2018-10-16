package daysix.Exceptions;

public class FindDuplicateString {

	public static void main(String[] args) {

		String s = "This is another example block that shows how the nested try block "
				+ "works. You can see that there are two try-catch block inside main try block's body.";

		String fit = "lala kuku lala kuku lala kuku";

		FindDuplicateString obj = new FindDuplicateString();

		obj.FindString(s);

		obj.FindString(fit);

	}

	public void FindString(String s) {

		s.toLowerCase();

		s.replaceAll("[^a-zA-Z0-9]", " ");

		String[] newWord = s.split(" ");

		int count = 1;

		for (int i = 0; i < newWord.length - 1; i++) {

			for (int j = i; j < newWord.length; j++) {

				if ((newWord[i].equals(newWord[j])) && (i != j)) {

					count++;

				}

			}

			if (count > 1) {
				System.out.println("The word " + newWord[i] + " appears " + count + " times");
				count = 1;
			}

		}

	}
}
