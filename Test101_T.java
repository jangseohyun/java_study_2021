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
