package util;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author ���漱
 *
 * @memo ����� Number check
 * 
 */
public class CheckNumber {
	
	public int idx = 0;
	public int[] rtnNumber = null;
	public String tmpNumber = "";
	
	public boolean checkNumber(String tempNumber) {
		
		if(!stringCheck(tempNumber))return false;
		if(!lengthCheck(tempNumber))return false;
		if(!duplicateCheck(tempNumber))return false;
		return true;
	}
	
	/**
	 * 
	 * @author ���漱
	 *
	 * @memo ����� Number ���� check
	 * 
	 */
	public boolean stringCheck(String tempNumber) {
		boolean rslt = true;
		String regex = "[0-9]+";
		
		if(!tempNumber.matches(regex)) {
			System.out.println("���ڸ� �Է����ּ���.");
			rslt = false;
		}
		
		return rslt;
	}
	
	/**
	 * 
	 * @author ���漱
	 *
	 * @memo ����� Number ���� check
	 * 
	 */
	public boolean lengthCheck(String tempNumber) {
		boolean rslt = true;
		
		if(tempNumber.length() != 3) {
			System.out.println("3�ڸ��� �Է����ּ���.");
			rslt = false;
		}
		
		return rslt;
	}
	
	/**
	 * 
	 * @author ���漱
	 *
	 * @memo ����� Number �ߺ� check
	 * 
	 */
	public boolean duplicateCheck(String tempNumber) {
		boolean rslt = true;
		
		Set duplSet = new HashSet();
		for(char chr : tempNumber.toCharArray()) {
			duplSet.add(chr);
		}
		
		if(duplSet.size() != 3) {
			System.out.println("�ߺ��� ���ڴ� �Է��� �� �����ϴ�.");
			rslt = false;
		}
		
		return rslt;
	}
	
}