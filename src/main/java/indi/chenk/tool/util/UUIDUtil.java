package indi.chenk.tool.util;

import java.util.UUID;

public class UUIDUtil {

	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
			"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z" };

	public static String getShortUUID() {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);
			shortBuffer.append(chars[x % 0x3E]);
		}
		return shortBuffer.toString().toUpperCase();
	}
	
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	public static String getUUID19() {
		UUID uuid = UUID.randomUUID();  
	    StringBuilder sb = new StringBuilder();  
	    sb.append(digits(uuid.getMostSignificantBits() >> 32, 8));  
	    sb.append(digits(uuid.getMostSignificantBits() >> 16, 4));  
	    sb.append(digits(uuid.getMostSignificantBits(), 4));  
	    sb.append(digits(uuid.getLeastSignificantBits() >> 48, 4));  
	    sb.append(digits(uuid.getLeastSignificantBits(), 12));  
	    return sb.toString();  
	}
	
	private static String digits(long val, int digits) {  
	    long hi = 1L << (digits * 4);  
	    return Numbers.toString(hi | (val & (hi - 1)), Numbers.MAX_RADIX)  
	            .substring(1);  
	}  
	
	public static void main(String[] args) {
		System.out.println(getUUID());
		System.out.println(getShortUUID().length());
	}
}
