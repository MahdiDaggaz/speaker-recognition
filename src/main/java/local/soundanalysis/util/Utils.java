package local.soundanalysis.util;

import java.util.List;

/**
 * 
 * @author Nayanda Haberty - nayanda1@outlook.com
 *
 */
public class Utils {

	private Utils() {
	}

	/**
	 * 
	 * @param list
	 * @param reads
	 * @param length
	 * @return
	 */
	public static byte[] getByteArrayFromList(List<byte[]> list, List<Integer> reads, int length) {
		byte[] bytes = new byte[length];
		int pointer = 0;
		for (int i = 0; i < list.size(); i++) {
			byte[] data = list.get(i);
			for (int j = 0; j < reads.get(i); j++) {
				bytes[pointer] = data[j];
				pointer++;
			}
		}
		return bytes;
	}

	/**
	 * 
	 * @param list
	 * @param length
	 * @return
	 */
	public static double[] getArrayFromList(List<double[]> list, int length) {
		double[] doubles = new double[length];
		int pointer = 0;
		for (int i = 0; i < list.size(); i++) {
			double[] data = list.get(i);
			for (int j = 0; j < data.length; j++) {
				doubles[pointer] = data[j];
				pointer++;
			}
		}
		return doubles;
	}
}
