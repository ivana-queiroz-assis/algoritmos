package br.com.ivana.estudo.estrutura.dados.algoritmos.problems;

import java.util.HashMap;
import java.util.Map;


//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class TwoSum {
	//Time complexity : O(n^2)O(n
	//2
	// ). For each element, we try to find its complement by looping through the rest of array which takes O(n)O(n) time. Therefore, the time complexity is O(n^2)O(n
	//2
	// ).
	//Space complexity : O(1)O(1).
	public int[] twoSum(int[] nums, int target) {
		int[] indices= new int[2];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				if(nums[i]+nums[j] == target){
					indices[0] = i;
					indices[1]=j;
					return indices;
				}
			}
		}
		return indices;
	}
	//Time complexity : O(n)O(n). We traverse the list containing nn elements exactly twice. Since the hash table reduces the look up time to O(1)O(1), the time complexity is O(n)O(n).
	//
	//Space complexity : O(n)O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly nn elements.
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
//Time complexity : O(n)O(n). We traverse the list containing nn elements only once. Each look up in the table costs only O(1)O(1) time.
//
//Space complexity : O(n)O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nn elements
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
