package baseball;

import java.util.Scanner;

public class BaseballPlay extends Baseball {

	public String USER_NUMBER = "";
	public boolean gameExit = false;
	
	public boolean numberCheck = false;
	
	@Override
	public void start() {
		
	}

	@Override
	public void play() {
		Scanner sc = new Scanner(System.in);
		
	}

	@Override
	public boolean end() {
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int statue = sc.nextInt();
		
		if(statue == 1) {
			gameExit = true;
		}

		return gameExit;
	}

}
