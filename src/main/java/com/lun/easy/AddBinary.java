package com.lun.easy;

public class AddBinary {
	public String addBinary(String a, String b) {
		char e = '0';// 进位
		char[] c = (a.length() >= b.length()) ? a.toCharArray() : b.toCharArray();// 选a,b中字符最多的
		char[] d = (a.length() >= b.length()) ? b.toCharArray() : a.toCharArray();// 选a,b中字符最少的

		char[] re = new char[c.length + 1];// 最后相加结果（预设比a的多一个字符）
		int rel = re.length - 1;

		// 最右位开始进行相加
		for (int i = d.length - 1, j = c.length - 1; i >= 0; i--, j--) {
			if (c[j] == '0' && d[i] == '0') {
				re[rel--] = e == '0' ? '0' : '1';
				e = '0';
			} else if (c[j] == '0' && d[i] == '1' || c[j] == '1' && d[i] == '0') {
				re[rel--] = e == '0' ? '1' : '0';
				e = e == '0' ? '0' : '1';
			} else {
				re[rel--] = e == '0' ? '0' : '1';
				e = '1';
			}
		}

		// 若c字符数比d字符数多的情况下
		if (c.length > d.length) {
			for (int i = c.length - d.length - 1; i >= 0; i--) {
				if (c[i] == '0' && e == '0') {
					re[rel--] = '0';
					e = '0';
				} else if (c[i] == '0' && e == '1' || c[i] == '1' && e == '0') {
					re[rel--] = '1';
					e = '0';
				} else {
					re[rel--] = '0';
					e = '1';
				}
			}
		}

		// 最左位进行处理
		re[0] = e == '1' ? '1' : '0';
		return e == '1' ? new String(re) : new String(re).substring(1);
	}
	
	//精简版
	public String addBinary2(String a, String b) {
	    int i = a.length() - 1, j = b.length() - 1, carry = 0;
	    StringBuilder sb = new StringBuilder();
	    while(i >= 0 || j >= 0){
	        int m = i >= 0 ? a.charAt(i--) - '0' : 0;
	        int n = j >= 0 ? b.charAt(j--) - '0' : 0;
	        int sum = m + n + carry;
	        carry = sum / 2;
	        sb.insert(0, String.valueOf(sum % 2));
	    }
	    if(carry != 0) sb.insert(0, '1');
	    return sb.toString();
	}
	
}
