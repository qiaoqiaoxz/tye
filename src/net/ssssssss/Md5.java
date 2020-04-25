package net.ssssssss;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
	public static String get(long number) {
		String s = number+"";
        try {
            MessageDigest m;
            m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
        }
		return "";
	}
}
