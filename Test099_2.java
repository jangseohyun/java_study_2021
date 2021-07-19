/*=======================
+++++++�迭(Array)+++++++
-�迭�� ����
=========================
�� Test099.java
=======================*/

// �� �ǽ� ����
// ������ �迭(a, b)�� ����ִ� ���ڵ��� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �ߺ��� ���ŵ� ������ �������� ����� �� �ֵ��� �Ѵ�.
// ����, �迭 ���� ������ ������� ó���� �� �ֵ��� �Ѵ�.

// ex) ������ �� �迭
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// ���� ����
// ù ��° �迭 ��Ҹ� �Է��ϼ���(���� ����): 2 3 7 10 11
// �� ��° �迭 ��Ҹ� �Է��ϼ���(���� ����): 3 6 10 14
// 2 3 7 10 11 6 1
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// 2 3 7 10 11 (3) 6 (10) 14


public class Test099
{
	int[] a = {2, 3, 7, 10, 11};
	int[] b = {3, 6, 10, 14};
	
	int num = 0;		//--��ġ�� ���� ������ ���� ���� ����
	
	int[] copy()
	{
		int[] temp = new int[a.length+b.length];

		// temp = {2, 3, 7, 10, 11}
		for (int i=0; i<a.length; i++)
			temp[i] = a[i];

		// temp = {2, 3, 7, 10, 11, 0, 6, 0, 14}
		for (int i=0; i<b.length; i++)
		{
			boolean flag = false;		// for���� ���� ������ flag�� false�� �ʱ�ȭ

			for (int j=0; j<a.length; j++)
			{
				if (temp[j] == b[i])	// for���� j��(a.length��ŭ) �����鼭 temp[j](a[j])�� b[i]�� ����
				{
					num++;				//--��ġ�� ��츸ŭ num 1�� ����
					flag = true;		//--��ĥ ��� flag�� true�� ����
					break;				//--�̶��� temp�� b���� �������� ����
				}
			}
			if (flag)						
				continue;				//--true�� �ǳʶٰ�(����(X) ������ �ݺ� ����

			temp[i+a.length] = b[i];	//--break���� ���� ���(���� ���� ���� ���) temp�� i+a.length��° ��ġ�� b[i]�� ����
		}

		return temp;
	}
	
	// temp = {2, 3, 7, 10, 11, 6, 0, 14, 0}
	void print(int[] temp)
	{
		for (int i=0; i<temp.length; i++)	
		{
			if (i<temp.length-1)
				if (temp[i] == 0)				//--�߰��� ���� temp[i]�� 0�� ��� temp[i+1]�� �ڸ��� �ٲ�
				{
					temp[i] = temp[i]^temp[i+1];
					temp[i+1] = temp[i+1]^temp[i];
					temp[i] = temp[i]^temp[i+1];
				}
		}

		for (int i=0; i<temp.length-num; i++)	//--temp.length���� ��ġ�� ���� �����ϴ� ��ŭ(num) ���� �����
			System.out.printf("%d ", temp[i]);

		System.out.println();
	}

	public static void main(String[] args)
	{
		// ������ �� �迭
		// int[] a = {2, 3, 7, 10, 11};
		// int[] b = {3, 6, 10, 14};
		
		Test099 ob = new Test099();

		int[] temp = ob.copy();
		ob.print(temp);
	}
}

/*
2 3 7 10 11 6 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/