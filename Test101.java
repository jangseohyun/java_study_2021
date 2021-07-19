/*==================================
++++++주민등록번호 유효성 검사++++++
====================================
◎ Test101.java
==================================*/

/*
○ 주민번호 검증 공식
   
   1. 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

      123456-1234567 (주민번호)
      ****** ******
      234567 892345  (각 자리에 곱해질 수)

   2. 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

      예) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
	      * * * * * *   * * * * * *
		  2 3 4 5 6 7   8 9 2 3 4 5
		------------------------------
         14+15+0+30+35 8+72+12+6+4+15  = 217
	
   3. 더해진 결과물을 11로 나누어 『나머지』를 구한다.
   
      예) 나머지 8

   4. 11에서 나머지를 뺀 결과값을 구한다.
	  이때 결과가 10이나 11일 경우 해당 값을 10으로 나눈 나머지를 얻어낸다.

      예) 11 - 8 = 3

   5. 4에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지 비교한다.
*/

// 실행 예시

// 주민번호 입력(xxxxxx-xxxxxxx): 750615-1862133
// >> 정확한 주민번호
// 계속하려면 아무 키나 누르십시오 . . .

// 주민번호 입력(xxxxxx-xxxxxxx): 123456-1234567
// >> 잘못된 주민번호
// 계속하려면 아무 키나 누르십시오 . . .

// 주민번호 입력(xxxxxx-xxxxxxx): 123456-12345
// >> 입력 오류
// 계속하려면 아무 키나 누르십시오 . . .

// ※ 문자열.length() : 문자열의 길이 반환
//    문자열.substring() : 문자열 추출


import java.util.Scanner;


public class Test101
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx): ");
		String form = sc.next();

		if (form.length() != 14)
		{
			System.out.println(">> 입력 오류");
			return;
		}

		int[] num = new int[14];
		int[] su = {2,3,4,5,6,7,0,8,9,2,3,4,5};

		for (int i=0; i<14; i++)
		{
			if (i == 6)		//--"-"는 건너뛰고 입력받음
				continue;
			num[i] = Integer.parseInt(form.substring(i,i+1));
		}
		
		// 1. 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
		// 2. 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
		int sum = 0;
		
		for (int i=0; i<13; i++)
			sum += num[i] * su[i];

		/*
		for (int i=0; i<13; i++)
		{
			if (i < 6)					// 7 5 0 6 1 5 (num[i])
				sum += num[i] * (2+i);	// 0 1 2 3 4 5 (i)
			else if (i == 6)			// -
				continue;				// 6
			else if (i < 9)				// 1 8
				sum += num[i] * (1+i);	// 7 8
			else						// 6  2  1  3
				sum += num[i] * (i-7);	// 9 10 11 12
		}
		*/
		
		// 3. 더해진 결과물을 11로 나누어 『나머지』를 구한다.
		// 4. 11에서 나머지를 뺀 결과값을 구한다.
		int last = 11 - (sum % 11);
		
	    //    이때 결과가 10이나 11일 경우 해당 값을 10으로 나눈 나머지를 얻어낸다.
		if (last >= 10)
			last %= 10;

		// 5. 4에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지 비교한다.
		if (num[13] == last)
			System.out.println(">> 정확한 주민번호");
		else
			System.out.println(">> 잘못된 주민번호");
	}
}

/*
[강사님 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test101_T 
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받은 주민번호
		String str;

		// 주민번호를 대상으로 곱해지는 수 배열 구성
		//                       -
		int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};

		// 곱셈 연산 후 누적합
		int tot = 0;

		// 사용자에게 안내 메세지 출력 및 주민번호 입력받기
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx): ");
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> 입력 오류");
			return;		//--메소드 종료 → 프로그램 종료
		}

		for (int i=0; i<13; i++)
		{
			if (i == 6)			//--str.substring(6,7) = "-"
				continue;		//--계속해라... 단, 뒷부분 무시하고
			tot += chk[i] * Integer.parseInt(str.substring(i,i+1));		//--뒷부분
		}		


		//-----여기까지 1, 2 완료
		//-----규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은 변수 tot에 저장 


		int su = 11 - (tot % 11);
		
		// su에 대한 연산이 두 자리로 나올 경우 주민번호 마지막 자릿수와 비교할 수 없는 상황
		// 조건문은 굳이 필요 없음
		su %= 10;


		//-----여기까지 3, 4 완료
		//-----최종 연산 결과는 변수 su에 저장


		// 최종 결과 출력
		if (su == Integer.parseInt(str.substring(13)))	//--어차피 끝자리이기 때문에 (13,14)라고 하지 않아도 됨
			System.out.println(">> 정확한 주민번호");
		else
			System.out.println(">> 잘못된 주민번호");
	}
}
*/


/*
[실행 결과]
주민번호 입력(xxxxxx-xxxxxxx): 123
>> 입력 오류
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력(xxxxxx-xxxxxxx): 123456-1234567
>> 잘못된 주민번호
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력(xxxxxx-xxxxxxx): 750615-1862133
>> 정확한 주민번호
계속하려면 아무 키나 누르십시오 . . .
*/