public class CombiPermu {

	private static int factorielle(int n) {
		int facto = 1;
		for (int i = 1; i <= n; i++) {
			facto *= i;
		}
		return facto;
	}

	public static void main(String[] args) {
		int n = 10;
		int k = 6;

		System.out.println(factorielle(n));

		int permutations = factorielle(n)/factorielle(n-k);
		int combinaisons = factorielle(n)/(factorielle(k)*factorielle(n-k));

		System.out.println("Permutations: " +permutations);
		System.out.println("Combinaisons: " +combinaisons);
	}
}
