package com.lun.easy;

class VersionControl{
	
	public static int badVersion;
	
	public boolean isBadVersion(int version) {
		return version >= badVersion;
	}
		
}

public class FirstBadVersion extends VersionControl{

	public int firstBadVersion(int n) {
		int left = 1, right = n;
		
		while(left < right) {
			int mid = left + (right - left) / 2;
			
			if(isBadVersion(mid)) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		
        return right;
    }
}
