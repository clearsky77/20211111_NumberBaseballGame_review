package codes;

import java.util.Random;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		1. 문제 출제
		
		int[] cpuNumbers = new int[3];
		
		for(int i=0; i<cpuNumbers.length; i++) {
			while(true) {
				// 랜덤 숫자 추출
				int randomNum = (int)(Math.random()*9+1);
				// 중복인지 확인
				boolean isDuplOK = true;
				for(int cpuNum : cpuNumbers) {
					if(cpuNum == randomNum) {
						isDuplOK = false;
					}
				}
				
				if(isDuplOK) {
					cpuNumbers[i] = randomNum;
					break;
				}
			}
		}
		
		// 출제한 문제 값 출력
		System.out.println("문제 숫자");
		for(int cpuNum : cpuNumbers) {
			System.out.print(cpuNum+" ");
		}		
		System.out.println("");
		
		System.out.println("-------------------------------");
		
		
		
//		2. 숫자 입력 받기
		
		Scanner myScanner = new Scanner(System.in);
		
		// 맞힐 때 까지 반복한다. (입력 받고 -> 확인 -> 틀리면 다시 받기)
		while(true) {
			
			// 1) 숫자 입력 받기
			System.out.print("정답 입력 (3자리 정수) : ");
			int inputNum = myScanner.nextInt();
			
			// 2) 배열 형태로 나누기
			int[]  userNumbers = new int[3];
			userNumbers[0] = inputNum / 100; // 100의 자리
			userNumbers[1] = inputNum / 10 % 10; // 10의 자리
			userNumbers[2] = inputNum % 10; // 1의 자리 
						
			// 3) S(스트라이크)와 B(볼) 분별하기
			
			
			// 4) 결과 안내
			
		}
		
		
		
		
		
		
		
		
		
//		3. 정답인지 판별
		
		
//		4. 결과 출력
		
		
	}

}
