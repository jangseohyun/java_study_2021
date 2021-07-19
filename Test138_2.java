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

		// �ֿ� ���� ����
		int y, m;	//--��, ��
		int w;		//--����
		int i;		//--��������

		do
		{
			System.out.print("���� �Է�: ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�: ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// ����ڷκ��� �Է¹��� ������ ��(y), ��(m)�� �̿��Ͽ� �޷� ��¥ ����
		cal.set(y, m-1, 1);
		// �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		// �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		// �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.

		// ���õ� �޷��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		// �� Calendar Ŭ������ ��getActualMaximum()�� �޼ҵ�
		// Ȯ��(�׽�Ʈ)
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.YEAR));			//--292278994
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.MONTH)+1);		//--12
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.DATE));			//--28, 29, 30, 31
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.DAY_OF_WEEK));	//--7
		
		// ��� ���
		System.out.println();
		System.out.println("\t[ "+y+"�� "+m+"�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");

		// ��¥ �׸��� �����ϴ� ����
		for (i=1; i<w; i++)
			System.out.print("    ");	//--���� 4ĭ

		// ��¥ �׸���
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d",i);

			w++;	//--�ݺ����� �����ϸ� ��¥�� ������ ������ ���ϵ� �Բ� ����

			if (w%7==1)	//--������ ������ �Ͽ����� �� ������ ���� �� ���
				System.out.println();
		}
		if (w%7!=1)
			System.out.println();

		System.out.println();
		System.out.println("============================");
	}
}