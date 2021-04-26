package util;

import java.util.Random;

/**
 * 
 * @author ���漱
 *
 * @memo 3�ڸ� ���� ����
 * 
 */
public class GenerateNumber {
	
	public int idx = 0;
	public int[] rtnNumber = null;
	public String tmpNumber = "";
	
	public int[] generateNumber (int numberLength) {
		rtnNumber = new int[numberLength];
		
		Random random = new Random();
		while(tmpNumber.length() != numberLength) {
			checkNumber(random.nextInt(9) + 1);
		}
		
		return rtnNumber;
	}
	
	public void checkNumber(int randomNumber) {
		if(!tmpNumber.contains(String.valueOf(randomNumber))) {
			tmpNumber += "" + randomNumber;
			rtnNumber[idx] = randomNumber;
			idx++;
		}
	}
	
}