package com.lun.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountOfSmallerNumbersAfterSelf {

	
	private int[] count ;
	/**
	 * 
	 * <p>The basic idea is to do merge sort to nums[]. To record the result, we need to keep the index of each number in the original array. So instead of sort the number in nums, we sort the indexes of each number.<br>
	 * Example: nums = [5,2,6,1],  indexes = [0,1,2,3]<br>
	 *After sort:             indexes = [3,1,0,2]</p>
	 *<p>While doing the merge part, say that we are merging left[] and right[], left[] and right[] are already sorted.</p>
	 *<p>We keep a <strong>rightcount</strong> to record how many numbers from right[] we have added and keep an array <strong>count[]</strong> to record the result.</p>
	 *<p>When we move a number from right[] into the new sorted array, we increase rightcount by 1.</p>
	 *<p>When we move a number from left[] into the new sorted array, we increase count[ index of the number ] by <strong>rightcount</strong>.</p>
	 * 
	 * 该算法有点绕，因要原数组的索引排序，参考二叉树版本进行理解
	 * 
	 * @param nums
	 * @return
	 */
	public List<Integer> countSmaller4(int[] nums) {
	    List<Integer> res = new ArrayList<Integer>();     

	    count = new int[nums.length];
	    
	    int[] indexes = new int[nums.length];
	    
	    for(int i = 0; i < nums.length; i++){
	    	indexes[i] = i;
	    }
	    
	    mergesort(nums, indexes, 0, nums.length - 1);
	
	    for(int i = 0; i < count.length; i++){
	    	res.add(count[i]);
	    }
	    return res;
	}
	
	private void mergesort(int[] nums, int[] indexes, int start, int end){
		if(end <= start){
			return;
		}
		int mid = (start + end) / 2;
		mergesort(nums, indexes, start, mid);
		mergesort(nums, indexes, mid + 1, end);
		
		merge(nums, indexes, start, end);
	}
	/**
	 * 
	 * <p>This solution is really awesome! Here is my understanding for real meaning behind the variable rightcount . This variable denotes <strong>the number of elements in the right sorted part that are smaller than the next element from the left sorted part. </strong>Why are they smaller than the next element from the left sorted part? Because they come before (the next element from the left sorted part) in the merged array. That how this sentence follows : <strong>When we move a number from left[] into the new sorted array, we increase count[ index of the number ] by rightcount.</strong></p>
	 * 
	 * <p>Or another version: We keep the rightcount for the next number, because this next number could come from the left sorted array, and when this is the case, we know previously there were rightcount number of elements that are smaller than it.</p>
	 * 
	 * <p>Put more simply, it's a count of the number of elements to the right of each element that get moved to the left of that element when sorting.</p>
	 * 
	 * 排升序
	 * 
	 * @param nums
	 * @param indexes
	 * @param start
	 * @param end
	 */
	private void merge(int[] nums, int[] indexes, int start, int end){
		int mid = (start + end) / 2;
		int left_index = start;
		int right_index = mid+1;
		int rightcount = 0;    	
		int[] new_indexes = new int[end - start + 1];

		int sort_index = 0;
		while(left_index <= mid && right_index <= end){
			if(nums[indexes[left_index]] > nums[indexes[right_index]]  ){
				
				//
				new_indexes[sort_index] = indexes[right_index];

				rightcount++;
				right_index++;
			}else{
				
				new_indexes[sort_index] = indexes[left_index];
				count[indexes[left_index]] += rightcount;
				left_index++;
			}
			sort_index++;
		}
		
		while(left_index <= mid){
			new_indexes[sort_index] = indexes[left_index];
			count[indexes[left_index]] += rightcount;
			
			left_index++;
			sort_index++;
		}

		while(right_index <= end){
			new_indexes[sort_index] = indexes[right_index];
			
			right_index++;
			sort_index++;
		}
		
		for(int i = start; i <= end; i++){
			indexes[i] = new_indexes[i - start];
		}
	}	
	
	/*countSmaller部分运行轨迹
	输入：nums = [1, 9, 7, 8, 5]

	List res = []
	count = [0, 0, 0, 0, 0], count.length = nums.length = 5
	indexes = [0, 0, 0, 0, 0], indexes.length = nums.length = 5
	
	一次循环赋值后
	indexes = [0, 1, 2, 3, 4]
	
	mergesort(nums = [1, 9, 7, 8, 5], indexes = [0, 1, 2, 3, 4], 0, nums.length - 1 = 4)
		
		if检测 0 <= 4 为 false
		mid = (0 + 4) / 2 = 2
		mergesort(nums, indexes, 0, 2)
			if检测 0 <= 2 为 false
			mid = (0 + 2) / 2 = 1
			mergesort(nums, indexes, 0, 1)
				
					if检测 0 <= 1 为 false
					mid = (0 + 1) / 2 = 0
					mergesort(nums, indexes, 0, 0)
						if检测 0 <= 0 为 true, return
					mergesort(nums, indexes, 1, 1)
						if检测 1 <= 1 为 true, return
				
				merge(nums, indexes, 0, 1)
				
			mergesort(nums, indexes, 2, 2)
				if检测 2 <= 2 为 true, return
			merge(nums, indexes, 0, 2)
			
		mergesort(nums, indexes, 3, 4)
			
				if检测 3 <= 4 为 false
				mid = (3 + 4) / 2 = 3
				mergesort(nums, indexes, 3, 3)
					if检测 3 <= 3 为 true, return
				mergesort(nums, indexes, 4, 4)
					if检测 4 <= 4 为 true, return
		
			merge(nums, indexes, 3, 4)
	
		merge(nums, indexes, 0, 4)
	
	继上
	merge(nums, indexes, 0, 1)
	
		mid = (start = 0 + end = 1) / 2 = 0
		left_index = start = 0;
		right_index = mid+1 = 1;
		
		int rightcount = 0;    	
		int[] new_indexes = new int[(end = 1 - start = 0 + 1) = 2] = [0 , 0];
	
		int sort_index = 0;
		
		第一回循环 检测 ((left_index =0) <= (mid = 0) && (right_index = 1 <= end = 1)) 为 true
			if检测 
				indexes = [0, 1, 2, 3, 4]
				nums = [1, 9, 7, 8, 5]
				
				indexes[right_index = 1] = 1
				indexes[left_index = 0] = 0
				
				nums[1] = 9 < nums[0] = 1 为 false, zhuangtai
			
			else
					
				new_indexes[sort_index = 0] = indexes[left_index = 0] = 0
				count[indexes[left_index = 0] = 1] = (count[indexes[left_index = 0] = 1] = 0) + 0 = 0
				left_index++, left_index = 1
				
			sort_index++, sort_index = 1
					
		检测 ((left_index =1) <= (mid = 0) && (right_index = 1 <= end = 1)) 为 false, 跳出 第一回循环
		
		第二回循环 (left_index =1) <= (mid = 0) 为 false 跳出 第二回循环
		
		第三回循环 (right_index = 1 <= end = 1) 为 true
			
			new_indexes[sort_index = 1] = indexes[right_index = 1] = 1
			
			right_index++, right_index = 2
			sort_index++,sort_index = 2
	
		检测 (right_index = 2 <= end = 1) 为 false 跳出 第三回循环
		
		第四回循环 后
			nums = [1, 9, 7, 8, 5]
			count = [0, 1, 0, 0, 0]
			
			new_indexes = [0, 1]
			indexes = [0, 1, 2, 3, 4]
			
			
	merge(nums, indexes, 0, 2)
		nums = [1, 9, 7, 8, 5]
		count = [0, 1, 0, 0, 0]
	
		new_indexes = [0, 2, 1]
		indexes = [0, 2, 1, 3, 4]
			
	merge(nums, indexes, 3, 4)
		nums = [1, 9, 7, 8, 5]
		count = [0, 1, 0, 1, 0]
	
		new_indexes = [4, 3]
		indexes = [0, 2, 1, 4, 3]
	
	merge(nums, indexes, 0, 4)
		nums = [1, 9, 7, 8, 5]
		count = [0, 3, 1, 1, 0]
	
		new_indexes = [0, 4, 2, 3, 1]
		indexes = [0, 4, 2, 3, 1]
	
	count 转换成 List res
	输出：res = [0, 3, 1, 1, 0]

	*/
//////////////////////////////////////////////////////////////////////////////////////////	
	

	class TreeNode {
		TreeNode left; 
		TreeNode right;
		int val;
		int count = 1;//理解 左子树结点 (包括自身)为 小于等于<= 本node.value 出现的频数
		public TreeNode(int val) {
			this.val = val;
		}
	}
	
	public List<Integer> countSmaller(int[] nums) {
		List<Integer> res = new ArrayList<>();
		if(nums == null || nums.length == 0) return res;
		TreeNode root = new TreeNode(nums[nums.length - 1]);
		res.add(0);
		
		for(int i = nums.length - 2; i >= 0; i--) {
			int count = insertNode(root, nums[i]);
			res.add(count);
		}
		
		Collections.reverse(res);
		return res;
	}

	public int insertNode(TreeNode p, int val) {
		int thisCount = 0;//作用：记录 插入树中 小于 该新结点value 有几个结点了
		while(true) {
			if(val <= p.val) {
				p.count++;
				if(p.left == null) {
					p.left = new TreeNode(val); break;
				} else {
					p = p.left;
				}
			} else {
				thisCount += p.count;
				if(p.right == null) {
					p.right = new TreeNode(val); break;
				} else {
					p = p.right;
				}
			}
		}
		return thisCount;
	}
	/*二叉树版的countSmaller运行轨迹

	输入：nums = [1, 9, 7, 8, 5]
	
	TreeNode.count 理解	左子树结点 (包括自身)为 小于等于<= 本node.value 出现的频数
	
	root = (value = 5, count = 1)
	res = [0]
	
	循环部分
		thisCount 作用：记录 插入树中 小于 该新结点value 有几个结点了
	
		i = nums.length - 2 = 3
		value = nums[3] = 8
		
		thisCount = (thisCount = 0) + (root.count = 1) = 1
		
		树图
		root -> (value = 5, count = 1)
					\
				(value = 8,count = 1)
				
		res = [0 , *1]
		i--
		
	---
	
		i = 2
		value = nums[2] = 7
		thisCount = (thisCount = 0) + (root.count = 1) = 1
		root.right.count++, = 2
		
		树图
		root -> (value = 5, count = 1)
					\
				(value = 8,count = 2*)(count = 2 原因 左子树和自身中<= 8 有 7, 8)
					/
			(value = 7,count = 1)
		
		res = [0, 1, *1]
		i--
		
	---
	
		i = 1
		value = nums[1] = 7
		thisCount = (thisCount = 0) + (root.count = 1) = 1
		thisCount = (thisCount = 1) + (p.count = 2) = 3
		
		树图
		root -> (value = 5, count = 1)
					\
				(value = 8,count = 2)
					/			\
		(value = 7,count = 1)	(value = 9,count = 1)
		
		res = [0, 1, 1, 3*]
		i--
		
	---
		i = 0
		value = nums[0] = 1
		thisCount = 0
		root.count++, = 2
		
		树图
			root -> (value = 5, count = 2*)(count = 2 原因 左子树和自身中<= 5 有 1, 5)
						/			\
			(value = 1,count = 1)	(value = 8,count = 2)
									/			\
						(value = 7,count = 1)	(value = 9,count = 1)
		
		res = [0, 1, 1, 3, 0]
		i--,=-1结束循环
		
	反转reverse(res) = [0, 3, 1, 1, 0]
	
	输出：[0, 3, 1, 1, 0]

	*/
	
//////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 * 暴力算法
	 * 
	 * @param nums
	 * @return
	 */
	public List<Integer> countSmaller2(int[] nums) {
		List<Integer> result = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return result;
		}

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
			result.add(count);
		}

		return result;
	}

	/**
	 * 
	 * 辛辛苦苦地写出的，居然比暴力算法还慢,test8跑了14秒( T_T)
	 * 
	 * @param nums
	 * @return
	 */
	public List<Integer> countSmaller3(int[] nums) {

		LinkedList<Integer> result = new LinkedList<Integer>();
		if (nums == null || nums.length == 0) {
			return result;
		}

		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int i = nums.length - 1; i >= 0; i--) {

			Map.Entry<Integer, Integer> entry = map.floorEntry(nums[i]);

			Integer value = entry == null ? 0 : entry.getValue();
			result.addFirst(value);

			map.put(nums[i], value + 1);

			// 曾经出现相同 例：1,0,1,3,1,1 的 1,0,0,2,0,0
			if (entry != null && entry.getKey() == nums[i]) {

				Map.Entry<Integer, Integer> lowerEntry = map.lowerEntry(nums[i]);
				if (lowerEntry != null) {
					result.set(0, lowerEntry.getValue());
				} else {
					for (int j = i + 1, k = 1; j < nums.length; j++, k++) {
						if (nums[i] == nums[j]) {
							result.set(0, result.get(k));
							break;
						}
					}
				}
			}

			// 出现新元素，小于map中部分的元素 ，例出现 5 map里7,8, 4, 其中7,8各自频率+1
			if (map.higherKey(nums[i]) != null) {
				Map<Integer, Integer> tmap = map.tailMap(nums[i], false);

				for (Map.Entry<Integer, Integer> en : tmap.entrySet()) {
					map.put(en.getKey(), en.getValue() + 1);
				}
			}
		}
		return result;
	}

}
