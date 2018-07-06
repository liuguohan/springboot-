package demo1;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
//		System.out.println(new TestMain().twoSum(new int[]{2,3,5}, 5));
		System.out.println(new TestMain().lengthOfLongestSubstring("vjj"));
	}
	
	public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
        	for(int j=i+1; j<nums.length; j++ ){
        		if(nums[i] + nums[j] == target) {
        			return new int[]{nums[i] , nums[j]};
        		}
        	}
        }
        return null;
        
    }
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		int x = l1.val;
		
		
        return null;
    }
	
	
	
    public int lengthOfLongestSubstring(String s) {
    	
    	int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
	
	
}
