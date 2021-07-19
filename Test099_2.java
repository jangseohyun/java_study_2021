/*=======================
+++++++배열(Array)+++++++
-배열의 복사
=========================
◎ Test099.java
=======================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// 실행 예시
// 첫 번째 배열 요소를 입력하세요(공백 구분): 2 3 7 10 11
// 두 번째 배열 요소를 입력하세요(공백 구분): 3 6 10 14
// 2 3 7 10 11 6 1
// 계속하려면 아무 키나 누르십시오 . . .

// 2 3 7 10 11 (3) 6 (10) 14


public class Test099
{
	int[] a = {2, 3, 7, 10, 11};
	int[] b = {3, 6, 10, 14};
	
	int num = 0;		//--겹치는 값의 개수를 세기 위한 변수
	
	int[] copy()
	{
		int[] temp = new int[a.length+b.length];

		// temp = {2, 3, 7, 10, 11}
		for (int i=0; i<a.length; i++)
			temp[i] = a[i];

		// temp = {2, 3, 7, 10, 11, 0, 6, 0, 14}
		for (int i=0; i<b.length; i++)
		{
			boolean flag = false;		// for문을 돌릴 때마다 flag를 false로 초기화

			for (int j=0; j<a.length; j++)
			{
				if (temp[j] == b[i])	// for문을 j번(a.length만큼) 돌리면서 temp[j](a[j])와 b[i]를 비교함
				{
					num++;				//--겹치는 경우만큼 num 1씩 증가
					flag = true;		//--겹칠 경우 flag를 true로 변경
					break;				//--이때는 temp에 b값을 복사하지 않음
				}
			}
			if (flag)						
				continue;				//--true면 건너뛰고(복사(X) 다음번 반복 실행

			temp[i+a.length] = b[i];	//--break되지 않은 경우(값이 같지 않은 경우) temp의 i+a.length번째 위치에 b[i]를 담음
		}

		return temp;
	}
	
	// temp = {2, 3, 7, 10, 11, 6, 0, 14, 0}
	void print(int[] temp)
	{
		for (int i=0; i<temp.length; i++)	
		{
			if (i<temp.length-1)
				if (temp[i] == 0)				//--중간에 오는 temp[i]가 0인 경우 temp[i+1]과 자리를 바꿈
				{
					temp[i] = temp[i]^temp[i+1];
					temp[i+1] = temp[i+1]^temp[i];
					temp[i] = temp[i]^temp[i+1];
				}
		}

		for (int i=0; i<temp.length-num; i++)	//--temp.length에서 겹치는 값이 존재하는 만큼(num) 빼고 출력함
			System.out.printf("%d ", temp[i]);

		System.out.println();
	}

	public static void main(String[] args)
	{
		// 임의의 두 배열
		// int[] a = {2, 3, 7, 10, 11};
		// int[] b = {3, 6, 10, 14};
		
		Test099 ob = new Test099();

		int[] temp = ob.copy();
		ob.print(temp);
	}
}

/*
2 3 7 10 11 6 0
계속하려면 아무 키나 누르십시오 . . .
*/