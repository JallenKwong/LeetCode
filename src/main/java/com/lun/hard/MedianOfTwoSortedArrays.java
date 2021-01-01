package com.lun.hard;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] A, int[] B) {
		if (A.length > B.length) {
			int[] temp = A;
			A = B;
			B = temp;
		}

		if (B.length == 0)
			throw new IllegalArgumentException();

		int aLength = A.length, bLength = B.length;
		int aCutMin = 0, aCutMax = aLength, //
				halfLen = (aLength + bLength + 1) / 2;

		while (aCutMin <= aCutMax) {
			int aCut = (aCutMin + aCutMax) / 2;
			int bCut = halfLen - aCut;

			if (aCut < aLength && B[bCut - 1] > A[aCut]) {
				// aCut is too small, must increase it
				aCutMin = aCut + 1;
			} else if (aCut > 0 && A[aCut - 1] > B[bCut]) {
				// aCut is too big, must decrease it
				aCutMax = aCut - 1;
			} else {
				// aCut is perfect
				int maxOfLeft = 0, minOfRight = 0;

				if (aCut == 0) {
					maxOfLeft = B[bCut - 1];
				} else if (bCut == 0) {
					maxOfLeft = A[aCut - 1];
				} else {
					maxOfLeft = Math.max(A[aCut - 1], B[bCut - 1]);
				}

				if ((aLength + bLength) % 2 == 1)
					return maxOfLeft;

				if (aCut == aLength) {
					minOfRight = B[bCut];
				} else if (bCut == bLength) {
					minOfRight = A[aCut];
				} else {
					minOfRight = Math.min(A[aCut], B[bCut]);
				}

				return (maxOfLeft + minOfRight) / 2.0;
			}
		}

		return -1;// this never return
	}
}
