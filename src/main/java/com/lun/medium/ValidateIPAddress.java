package com.lun.medium;

public class ValidateIPAddress {
	
	public static final String from0To255Regex = "(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])";
	public static final String IPv4Regex = String.format("(%s\\.){3}%s", from0To255Regex, from0To255Regex);
	public static final String from0ToFfffRegex = "([0-9A-Fa-f]{1,4})";
	public static final String IPv6Regex = String.format("(%s:){7}%s", from0ToFfffRegex, from0ToFfffRegex);

	// 用正则表达式
	public String validIPAddress(String IP) {
		if (IP.matches(IPv4Regex)) {
			return "IPv4";
		}

		if (IP.matches(IPv6Regex)) {
			return "IPv6";
		}

		return "Neither";
	}

	private boolean isIpV4(String ip) {
		if (ip == null || ip.isEmpty()) {
			return false;
		}
		String[] splits = ip.split("\\.", -1);
		if (splits.length != 4)
			return false;
		for (int i = 0; i < 4; i++) {
			try {
				int val = Integer.parseInt(splits[i], 10);
				if (val < 0 || val > (1 << 8) - 1)
					return false;
			} catch (Exception e) {
				return false;
			}
			if (splits[i].charAt(0) == '-' || splits[i].charAt(0) == '+')
				return false;
			if (splits[i].charAt(0) == '0' && splits[i].length() > 1)
				return false;
		}
		return true;
	}

	private boolean isIpV6(String ip) {
		if (ip == null || ip.isEmpty()) {
			return false;
		}
		String[] splits = ip.split(":", -1);
		if (splits.length != 8)
			return false;
		for (int i = 0; i < 8; i++) {
			try {
				int val = Integer.parseInt(splits[i], 16);
				if (val < 0 || val > (1 << 16) - 1)
					return false;
			} catch (Exception e) {
				return false;
			}
			if (splits[i].charAt(0) == '-' || splits[i].charAt(0) == '+')
				return false;
			if (splits[i].length() > 4)
				return false;
		}
		return true;
	}

	public String validIPAddress2(String IP) {
		if (isIpV4(IP)) {
			return "IPv4";
		} else if (isIpV6(IP)) {
			return "IPv6";
		} else {
			return "Neither";
		}
	}
	
}
