package com.lun.easy;

public class MergeSortedArray {

	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		for (int o = m-- + n-- - 1; m >= 0 || n >= 0; o--) {
			if (m < 0) {
				nums1[o] = nums2[n--];
			} else if (n < 0) {
				nums1[o] = nums1[m--];
			} else if (nums1[m] > nums2[n]) {
				nums1[o] = nums1[m--];
			} else {// if(nums1[m] <= nums2[n]) {
				nums1[o] = nums2[n--];
			}
		}

	}

	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		for (int o = m-- + n-- - 1; m >= 0 && n >= 0; o--)
			nums1[o] = (m < 0 || nums1[m] < nums2[n]) ? nums2[n--] : nums1[m--];
	}

}
