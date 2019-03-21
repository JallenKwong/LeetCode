package com.lun.other.ipv6;

import java.util.Arrays;

public class SaveIPv6 {

	/**
	* 将 IPv6 地址转为 long 数组，只支持冒分十六进制表示法
	 */
	public static long[] ip2Longs(String ipString) {
	   if (ipString == null || ipString.isEmpty()) {
	        throw new IllegalArgumentException("ipString cannot be null.");
	    }
	    String[] ipSlices = ipString.split(":");
	    if (ipSlices.length != 8) {
	        throw new IllegalArgumentException(ipString + " is not an ipv6 address.");
	    }
	    long[] ipv6 = new long[2];
	    for (int i = 0; i < 8; i++) {
	        String slice = ipSlices[i];
	        // 以 16 进制解析
	        long num = Long.parseLong(slice, 16);
	        // 每组 16 位
	        long right = num << (16 * i);
	        // 每个 long 保存四组，i >> 2 = i / 4
	        ipv6[i >> 2] |= right;
	    }
	    return ipv6;
	}
	
	/**
	 * 将 long 数组转为冒分十六进制表示法的 IPv6 地址
	 */
	public static String longs2Ip(long[] numbers) {
	    if (numbers == null || numbers.length != 2) {
	        throw new IllegalArgumentException(Arrays.toString(numbers) + " is not an IPv6 address.");
	    }
	    StringBuilder sb = new StringBuilder(32);
	    for (long numSlice : numbers) {
	        // 每个 long 保存四组
	        for (int j = 0; j < 4; j++) {
	            // 取最后 16 位
	            long current = numSlice & 0xFFFF;
	            sb.append(Long.toString(current, 16)).append(":");
	            // 右移 16 位，即去除掉已经处理过的 16 位
	            numSlice >>= 16;
	        }
	    }
	    // 去掉最后的 :
	    return sb.substring(0, sb.length() - 1);
	}
	
	/**
	 * 小试牛刀。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	    String[] ips4Test = new String[]{"FFFF:FFFF:7654:FEDA:1245:BA98:3210:4562",
	            "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF", "7654:0:FFFF:7654:562:222:7622:0", "0:0:0:0:0:0:0:0"};
	    for (String testCase : ips4Test) {
	        test(testCase);
	    }
	}

	private static void test(String testCase) {
	    long[] ipv6 = ip2Longs(testCase);
	    String ipString = longs2Ip(ipv6);
	    boolean eq = testCase.equalsIgnoreCase(ipString);
	    System.out.println("本次测试 ipv6 地址: " + testCase + ", 转为 long 数组: " + Arrays.toString(ipv6)
	            + ", 再转回 ipv6 字符串: " + ipString + ", 是否与原字符串相等: " + eq);
	    if (!eq) {
	        throw new IllegalStateException("本次测试未通过！testCase: " + testCase);
	    }
	}
	
}

/* result:
本次测试 ipv6 地址: FFFF:FFFF:7654:FEDA:1245:BA98:3210:4562, 转为 long 数组: [-82623535708635137, 4999613583766065733], 再转回 ipv6 字符串: ffff:ffff:7654:feda:1245:ba98:3210:4562, 是否与原字符串相等: true
本次测试 ipv6 地址: FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF, 转为 long 数组: [-1, -1], 再转回 ipv6 字符串: ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff, 是否与原字符串相等: true
本次测试 ipv6 地址: 7654:0:FFFF:7654:562:222:7622:0, 转为 long 数组: [8526721465200965204, 129888436749666], 再转回 ipv6 字符串: 7654:0:ffff:7654:562:222:7622:0, 是否与原字符串相等: true
本次测试 ipv6 地址: 0:0:0:0:0:0:0:0, 转为 long 数组: [0, 0], 再转回 ipv6 字符串: 0:0:0:0:0:0:0:0, 是否与原字符串相等: true
*/
