package com.lun.medium;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		StringBuilder[] sbs = new StringBuilder[numRows];
		boolean upDownflag = true;
		int sbsPointer = 0;
		int halfCycle = numRows - 1;

		for (int i = 0; i < s.length(); i++) {
			if (sbs[sbsPointer] == null)
				sbs[sbsPointer] = new StringBuilder();

			sbs[sbsPointer].append(s.charAt(i));

			if (halfCycle != 0) {
				if (upDownflag && sbsPointer + 1 > halfCycle) 
					upDownflag = false;
				if (!upDownflag && sbsPointer - 1 < 0)
					upDownflag = true;
				sbsPointer = upDownflag ? sbsPointer + 1 : sbsPointer - 1;
			}
		}

		for (int i = 1; i < numRows; i++) {
			if (sbs[i] == null)
				break;
			sbs[0].append(sbs[i]);
		}

		return sbs[0].toString();
	}
}
