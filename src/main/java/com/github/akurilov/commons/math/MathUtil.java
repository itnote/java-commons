package com.github.akurilov.commons.math;

public interface MathUtil {

	/**
	 * Greatest common divisor
	 */
	static int gcd(final int x, final int y) {
		int z = 0;
		if(x > y) {
			for(int i = y; i > 0; i --) {
				if(x % i == 0 && y % i == 0) {
					z = i;
					break;
				}
			}
		} else if(x < y) {
			for(int i = x; i > 0; i --) {
				if(x % i == 0 && y % i == 0) {
					z = i;
					break;
				}
			}
		} else {
			z = x;
		}
		return z;
	}

	/**
	 * XOrShift algorithm. For details see: http://xorshift.di.unimi.it/murmurhash3.c
	 */
	int A = 21, B = 35, C = 4;
	static long xorShift(long word) {
		word ^= (word << A);
		word ^= (word >>> B);
		word ^= (word << C);
		return word;
	}

}
