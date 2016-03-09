package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */
		do
		{
			int sum = 0;
			while(inputNumber>0){
				sum += inputNumber;
				inputNumber -= 2;
			}
			System.out.println("결과 값 : " + sum);
			System.out.println();
			System.out.print( "숫자를 입력하세요: " );
			inputNumber = scanner.nextInt();
		}while(true);
	}

}
