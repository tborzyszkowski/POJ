package _01Klasy;

// Obliczanie wartosci sredniej z tablicy elementow
class Average {
	public static void main(String[] args) {
		double[] nums = { 10.1, 11.2, 12.3, 13.4, 14.5, -5.5 };
		double result = 0;

		for (int i = 0; i < nums.length; i++)
			result = result + nums[i];

		// nums = new double[3];
		System.out.println("Wartosc srednia = " + result / nums.length);
	}
}
