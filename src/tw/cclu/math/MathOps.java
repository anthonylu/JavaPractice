package tw.cclu.math;

public class MathOps {
	// exponentiation by squaring
	public static long pow(long base, long exp) {
		long result = 1;
		if (base == 1) return result;
		while (exp > 0) {
			if ((exp & 1) == 1) result *= base;
			base *= base;
			exp >>= 1;
		}
		return result;
	}
}
