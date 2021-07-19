import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test138_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal = new GregorianCalendar();

		// 주요 변수 선언
		int y, m;	//--연, 월
		int w;		//--요일
		int i;		//--루프변수

		do
		{
			System.out.print("연도 입력: ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("월 입력: ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// 사용자로부터 입력받은 데이터 연(y), 월(m)을 이용하여 달력 날짜 세팅
		cal.set(y, m-1, 1);
		// 월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		// 입력값에서 1을 뺀 값으로 월을 설정해야 한다.
		// 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다.

		// 세팅된 달력의 요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);

		// ※ Calendar 클래스의 『getActualMaximum()』 메소드
		// 확인(테스트)
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.YEAR));			//--292278994
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.MONTH)+1);		//--12
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.DATE));			//--28, 29, 30, 31
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.DAY_OF_WEEK));	//--7
		
		// 결과 출력
		System.out.println();
		System.out.println("\t[ "+y+"년 "+m+"월 ]\n");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");

		// 날짜 그리기 시작하는 지점
		for (i=1; i<w; i++)
			System.out.print("    ");	//--공백 4칸

		// 날짜 그리기
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d",i);

			w++;	//--반복문을 수행하며 날짜가 증가할 때마다 요일도 함께 증가

			if (w%7==1)	//--증가한 요일이 일요일이 될 때마다 개행 후 출력
				System.out.println();
		}
		if (w%7!=1)
			System.out.println();

		System.out.println();
		System.out.println("============================");
	}
}