package com.lun.easy;

class GuessGame {
	public static int pick;

	public int guess(int num) {
		return pick == num ? 0 : pick < num ? -1 : 1;
	}
}

public class GuessNumberHigherOrLower extends GuessGame {

	public int guessNumber(int n) {
		int left = 1, right = n;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int guess = guess(mid);

			if (guess < 0)
				right = mid - 1;
			else if (guess > 0)
				left = mid + 1;
			else
				return mid;
		}

		return -1;
	}
}
