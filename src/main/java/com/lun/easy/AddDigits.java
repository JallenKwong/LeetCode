package com.lun.easy;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {
	public List<Integer> apart(int t1) {
		// int[] a = new int[32];//分别 存位数
		List<Integer> a = new ArrayList<>();
		int t2 = -1;
		for (int i = 0;; i++) {
			t2 = i == 0 ? t1 : (t2 - a.get(i - 1)) / 10;
			if (t2 == 0) {
				break;
			}
			a.add(t2 % 10);
			// System.out.print(a.get(i) + " ");
		}
		return a;
	}

	//通常法结合apart()使用
	public int addUp(List<Integer> fromList) {
		int s = 0;
		for (int i : fromList) {
			s += i;
		}
		while (s / 10 != 0) {
			s = addUp(apart(s));
		}
		return s;
	}

	//数学法
    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
    
    //最精简法
    public int addDigits2(int num) {
    	return (num - 1) % 9 + 1;
    }
	
}
