import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test101_T 
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է¹��� �ֹι�ȣ
		String str;

		// �ֹι�ȣ�� ������� �������� �� �迭 ����
		//                       -
		int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};

		// ���� ���� �� ������
		int tot = 0;

		// ����ڿ��� �ȳ� �޼��� ��� �� �ֹι�ȣ �Է¹ޱ�
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx): ");
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����");
			return;		//--�޼ҵ� ���� �� ���α׷� ����
		}

		for (int i=0; i<13; i++)
		{
			if (i == 6)			//--str.substring(6,7) = "-"
				continue;		//--����ض�... ��, �޺κ� �����ϰ�
			tot += chk[i] * Integer.parseInt(str.substring(i,i+1));		//--�޺κ�
		}		


		//-----������� 1, 2 �Ϸ�
		//-----��Ģ�� �°� ���� ������ ������ ����� ��� ���� ���� ���� tot�� ���� 


		int su = 11 - (tot % 11);
		
		// su�� ���� ������ �� �ڸ��� ���� ��� �ֹι�ȣ ������ �ڸ����� ���� �� ���� ��Ȳ
		// ���ǹ��� ���� �ʿ� ����
		su %= 10;


		//-----������� 3, 4 �Ϸ�
		//-----���� ���� ����� ���� su�� ����


		// ���� ��� ���
		if (su == Integer.parseInt(str.substring(13)))	//--������ ���ڸ��̱� ������ (13,14)��� ���� �ʾƵ� ��
			System.out.println(">> ��Ȯ�� �ֹι�ȣ");
		else
			System.out.println(">> �߸��� �ֹι�ȣ");
	}
}
