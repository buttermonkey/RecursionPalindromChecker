public class PalindromChecker {
	public static void main(String[] args) {
		String[] testData = new String[]{
			"Otto",
			"Rentner",
			"Reliefpfeiler",
			"Rotor",
			"O Genie, der Herr ehre dein Ego!",
			"Trug Tim eine so helle Hose nie mit Gurt?",
			"Erika feuert nur untreue Fakire.",
		};

		for (String data : testData) {
			System.out.println("'" + data + "' is " + (check(data) ? "" : "NOT ") + "a palindrom.");
		}
	}
	public static boolean check(String palindrom) {
		while (palindrom.length() > 0 && !Character.isAlphabetic(palindrom.charAt(0))) {
			palindrom = palindrom.substring(1);
		}
		while (palindrom.length() > 0 && !Character.isAlphabetic(palindrom.charAt(palindrom.length() - 1))) {
			palindrom = palindrom.substring(0, palindrom.length() - 1);
		}

		if (palindrom.length() < 2)
			return true;
		if (Character.toUpperCase(palindrom.charAt(0)) != Character.toUpperCase(palindrom.charAt(palindrom.length() - 1)))
			return false;
		return check(palindrom.substring(1, palindrom.length() - 1));
	}
}
