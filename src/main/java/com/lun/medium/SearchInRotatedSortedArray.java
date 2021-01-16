package com.lun.medium;

public class SearchInRotatedSortedArray {

	// 方法一：
	public int search1(int[] nums, int target) {
		// 找出原第一元素
		int startIndex = searchStartIndex(nums);

		if (nums[0] <= target && startIndex - 1 >= 0 && target <= nums[startIndex - 1]) {
			return binarySearch(nums, 0, startIndex - 1, target);
		}

		if (nums[startIndex] <= target && target <= nums[nums.length - 1]) {
			return binarySearch(nums, startIndex, nums.length - 1, target);
		}
		return -1;
	}

	private int binarySearch(int[] nums, int left, int right, int target) {
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (target < nums[mid]) {
				right = mid - 1;
			} else if (target > nums[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// 找出原第一元素
	private int searchStartIndex(int[] nums) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (0 <= mid - 1 && nums[mid - 1] > nums[mid])
				return mid;

			if (mid + 1 <= nums.length - 1 && nums[mid] > nums[mid + 1])
				return mid + 1;

			if (nums[0] < nums[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return 0;
	}

	// 方法二：
	public int search2(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}

		/* . */
		int left = 0, right = nums.length - 1;
		// when we use the condition "left <= right", we do not need to determine if
		// nums[left] == target
		// in outside of loop, because the jumping condition is left > right, we will
		// have the determination
		// condition if(target == nums[mid]) inside of loop
		while (left <= right) {
			// left bias
			int mid = left + (right - left) / 2;
			if (target == nums[mid]) {
				return mid;
			}
			// if left part is continuously monotonically increasing, or the pivot point is
			// on the right part
			if (nums[left] <= nums[mid]) {
				// must use "<=" at here since we need to make sure target is in the left part,
				// then safely drop the right part
				if (nums[left] <= target && target < nums[mid]) {
					right = mid - 1;
				} else {
					// right bias
					left = mid + 1;
				}
			} // if right part is continuously monotonically increasing, or the pivot point is
				// on the left part
			else {
				// must use "<=" at here since we need to make sure target is in the right part,
				// then safely drop the left part
				if (nums[mid] < target && target <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}

	// 方法三：
	public int search3(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int midNum = nums[mid];
			// If nums[mid] and target are "on the same side" of nums[0], we just take
			// nums[mid].
			boolean midNumAndTargetOnTheSameSide = (nums[mid] > nums[0]) == (target > nums[0]);

			if (!midNumAndTargetOnTheSameSide) {
				midNum = target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}

			if (midNum < target)
				left = mid + 1;
			else if (midNum > target)
				right = mid - 1;
			else
				return mid;
		}
		return -1;
	}

	// 方法四；
	public int search4(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		// find the index of the smallest value using binary search.
		// Loop will terminate since mid < right, and left or right will shrink by at
		// least 1.
		// Proof by contradiction that mid < right: if mid==right, then left==right and
		// loop would
		// have been terminated.
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > nums[right])
				left = mid + 1;
			else
				right = mid;
		}
		// left==right is the index of the smallest value and also the number of places
		// rotated.
		int rot = left;
		left = 0;
		right = nums.length - 1;
		// The usual binary search and accounting for rotation.
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int rotMid = (mid + rot) % nums.length;
			if (nums[rotMid] == target)
				return rotMid;
			if (nums[rotMid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

}
