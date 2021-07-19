/*=============================
++++++++++�迭(array)++++++++++
-�迭�� ����� �ʱ�ȭ
-�迭�� �⺻���� Ȱ��
===============================
�� Test082.java
=============================*/

// �� �ǽ� ����
// ��char�� �ڷ����� �迭�� ����� ���ĺ� �빮�ڸ� ä���
// ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// A B C D E F G ... W X Y Z
// ����Ϸ��� �ƹ� Ű��...


public class Test082
{
	public static void main(String[] args)
	{
		char arr[];
		arr = new char[26];

		for (int i=0, j=65; i<arr.length; i++, j++)
			arr[i] = (char)j;

		for (int k=0; k<arr.length; k++)
			System.out.print(arr[k]+" ");

		System.out.println();
	}
}

/*
[����� Ǯ��]
public class Test082
{
	public static void main(String[] args)
	{
		// �� ���� ���ĺ� �빮�� �迭 ����
		// ��� ��
		char[] arr1;
		arr1 = new char[26];

		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		arr1[3] = 'D';
		arr1[4] = 'E';
		arr1[5] = 'F';
		arr1[6] = 'G';
		arr1[7] = 'H';
		arr1[8] = 'I';
		arr1[9] = 'J';
		arr1[10] = 'K';
		arr1[11] = 'L';
		arr1[12] = 'M';
		arr1[13] = 'N';
		arr1[14] = 'O';
		arr1[15] = 'P';
		arr1[16] = 'Q';
		arr1[17] = 'R';
		arr1[18] = 'S';
		arr1[19] = 'T';
		arr1[20] = 'U';
		arr1[21] = 'V';
		arr1[22] = 'W';
		arr1[23] = 'X';
		arr1[24] = 'Y';
		arr1[25] = 'Z';
	

		// ��� ��
		char[] arr2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

		// ��� �� �ƽ�Ű �ڵ�
		char[] arr3 = new char[26];

		for(int i=0, ch=65; i<arr3.length; i++, ch++) //--26ȸ��, for���� ���� ���� �� �� �� ����
		{
			arr3[i] = (char)ch;						  //--char �� �ϸ� �ڵ� �� ��ȯ ��Ģ ����
			// arr3[0] = (char)65
			// arr3[1] = (char)66
			//    :
			// arr3[25] = (char)90;
		}

		// �� �迭 ��� ��ü ���
		for(int i = 0; i<arr3.length;i++)
		{
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
	}
}
*/


/*
[���� ���]
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/