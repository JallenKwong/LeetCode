package com.lun.swordtowardoffer;


public class GetSumHarshly {
    
	public static int sum(int n) {
        int sum = n;
        // 递归终止条件，借助&&的短路，对于 A && B
        // A=true，执行B
        // A=false，不执行B
        // 所以如果 n=0 时，则不会再进行递归调用
        boolean isContinue = (n > 0) && (sum += sum(--n)) > 0;
        return sum;
    }
	//https://blog.csdn.net/zl18310999566/article/details/80258329
}
