

/*
You are given an API bool isBadVersion(version) which returns whether version is bad. 
Implement a function to find the first bad version. 
You should minimize the number of calls to the API. */

//https://leetcode.com/problems/first-bad-version/ 

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
       int low = 1, high = n;
        
        while (low < high) {
            
    	int med = low + (high -  low)/2;
            
    	if (isBadVersion(med)) {
            
    		high = med;
    	} else {
    		low = med + 1;
    	}
    }
        return low;
    }
}