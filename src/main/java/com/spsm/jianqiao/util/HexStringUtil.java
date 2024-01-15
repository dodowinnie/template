package com.spsm.jianqiao.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class HexStringUtil {

	private static final char[] HEX_CHAR_TABLE = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
			'E', 'F' };
	private static final Map<Character, Byte> MAP = new HashMap<Character, Byte>();

	static {
		for (int i = 0; i < HEX_CHAR_TABLE.length; i++) {
			char c = HEX_CHAR_TABLE[i];
			MAP.put(c, (byte) i);
		}
	}

	public static String toHexString(byte[] array) {
		StringBuilder sb = new StringBuilder();
		for (byte b : array) {
			sb.append(HEX_CHAR_TABLE[(b & 0xf0) >> 4]);
			sb.append(HEX_CHAR_TABLE[b & 0x0f]);
		}
		return sb.toString();
	}

	public static byte[] toByteArray(String hexString) {
		byte[] result = new byte[hexString.length() / 2];
		for (int i = 0; i < hexString.length() / 2; i++) {
			char hi = hexString.charAt(i * 2);
			char lo = hexString.charAt(i * 2 + 1);
			result[i] = (byte) ((MAP.get(hi) << 4) + MAP.get(lo));
		}
		return result;
	}

	public static String makeChecksum(String data) {
		if (data == null || data.equals("")) {
			return "";
		}
		int total = 0;
		int len = data.length();
		int num = 0;
		while (num < len) {
			String s = data.substring(num, num + 2);
			total += Integer.parseInt(s, 16);
			num = num + 2;
		}

		// 用256求余最大是255，即16进制的FF
		int mod = total % 256;
		String hex = Integer.toHexString(mod);
		len = hex.length();
		// 如果不够校验位的长度，补0,这里用的是两位校验
		if (len < 2) {
			hex = "0" + hex;
		}
		return hex;
	}

	/**
	 * unit32转int
	 * 
	 * @param buf
	 * @return
	 */
	public static long bytes2int(byte[] buf) {
		long anUnsignedInt = 0;
		int firstByte = 0;
		int sceondByte = 0;
		int thirdByte = 0;
		int fourthByte = 0;
		int index = 0;
		firstByte = (0x000000FF & ((int) buf[index + 3]));
		sceondByte = (0x000000FF & ((int) buf[index + 2]));
		thirdByte = (0x000000FF & ((int) buf[index + 1]));
		fourthByte = (0x000000FF & ((int) buf[index]));
		anUnsignedInt = ((long) (firstByte << 24 | sceondByte << 16 | thirdByte << 8 | fourthByte)) & 0xFFFFFFFFL;
		return anUnsignedInt;
	}

	/**
	 * 小端转大端，以字节为单位 6400==》0064
	 * 
	 * @param littleEndian
	 * @return
	 */
	public static String littleToBig(String littleEndian) {
		StringBuilder bigEndianBuilder = new StringBuilder();
		if (littleEndian.length() % 2 != 0) {
			return bigEndianBuilder.toString();
		}
		for (int i = 0; i < littleEndian.length(); i += 2) {
			String data = littleEndian.substring(i, i + 2);
			bigEndianBuilder.insert(0, data);
		}
		return bigEndianBuilder.toString();

	}

	/**
	 * 大端转小端，补足8位
	 * 
	 * @param littleEndian
	 * @param byteCount 位数
	 * @return
	 */
	public static String convertLittle(String bigEndian, int byteCount) {
		if (bigEndian.length() < byteCount * 2) {
			int rest = byteCount * 2 - bigEndian.length();
			StringBuffer sb = new StringBuffer(bigEndian);
			for (int i = 0; i < rest; i++) {
				sb.insert(0, 0);
			}
			bigEndian = sb.toString();
		}
		StringBuilder littleEndianBuilder = new StringBuilder();
		if (bigEndian.length() % 2 != 0) {
			return littleEndianBuilder.toString();
		}
		for (int i = 0; i < bigEndian.length(); i += 2) {
			String data = bigEndian.substring(i, i + 2);
			littleEndianBuilder.insert(0, data);
		}
		return littleEndianBuilder.toString();

	}

	public static short sumCheck(byte[] b) {
		int sum = 0;
		for (byte value : b) {
			sum = sum + (value & 0xff);
		}
		return (short) (sum & 0xffff);
	}

	public static void main(String[] args) {
//		Long time = 1665995934l;
//		String hex = Long.toHexString(time);
//		System.out.println(hex);
//		String str = HexStringUtil.littleToBig(hex);
//		System.out.println(str);
		Integer num = 1050;
		String hex = Long.toHexString(num);
		System.out.println(hex);
		if (hex.length() % 2 != 0) {
			hex = "0" + hex;
		}
		String str = HexStringUtil.littleToBig(hex);
		System.out.println(str);

	}

}
