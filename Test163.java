/*==============================
+++++++�÷���(Collection)+++++++
================================
�� Test163.java
==============================*/

// Set �� HashSet, TreeSet
// - ����(�ǹ�) ����
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
�� TreeSet<E> Ŭ����

   -java.util.TreeSet<E> Ŭ������
    Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ���ĵȴ�.
   -SortedSet�� implement�� ����
*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Comparator;


// VO: Value Object
// DTO: Data Transfer Object
// DAO: Data Access Object


class GradeVO	//--GradeDTO
{
	// �ֿ� �Ӽ� ����
	private String hak;
	private String name;
	private int kor, eng, mat;

	// getter ����
	public String getHak()
	{
		return hak;
	}

	public String getName()
	{
		return name;
	}

	public int getKor()
	{
		return kor;
	}

	public int getEng()
	{
		return eng;
	}

	public int getMat()
	{
		return mat;
	}
	
	// setter ����
	void setHak(String hak)
	{
		this.hak = hak;
	}

	void setName(String name)
	{
		this.name = name;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	void setEng(int eng)
	{
		this.mat = mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}

	// ������(����� ���� ������ �� 5���� �Ű������� ���� ������)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// ������(����� ���� ������ �� �Ű����� ���� �⺻ ������
	// �̰� ������ �ν��Ͻ��� �������� �� ���� �߻�
	GradeVO()
	{
	}

	// �߰� �޼ҵ� ���� �� 
	int getTotal()
	{
		return kor + eng + mat;
	}
}

class Com<T> implements Comparator<T>
{
	@Override public int compare(T o1, T o2)
	{
		GradeVO set = (GradeVO)o1;
		GradeVO set2 = (GradeVO)o2;
		
		// �̸� ����(��������)
		return set.getName().compareTo(set2.getName());
	}
}


public class Test163
{
	public static void main(String[] args)
	{
		// TreeSet  �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// set�̶�� TreeSet �ڷᱸ���� ��� �߰� �� add()
		set.add("¯���¸�����");
		set.add("�Ʊ���� �Ѹ�");
		set.add("�Ƶ�����");
		set.add("���������緹��");
		set.add("��Ž���ڳ�");
		set.add("�ɽ�");
		set.add("���ϸ���");
		set.add("����ö��999");
		set.add("�̷��ҳ��ڳ�");

		// Iterator�� Ȱ���Ͽ� set��� ��ü ���
		Iterator<String> it = set.iterator();

		while (it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		
		// ������ �ڷᱸ���� ��� �߰�
		// 2103 �谡�� 90 80 70
		// 2014 �弭�� 80 70 60
		// 2105 �ڳ��� 100 100 100
		// 2016 �̻��� 12 23 34
		// 2107 �輭�� 50 50 50
		
		// ��� �߰��� �ڷᱸ�� ��ü ���
		TreeSet<GradeVO> set2= new TreeSet<GradeVO>(new Com<GradeVO>());
		set2.add(new GradeVO("2103","�谡��",90,80,70));
		set2.add(new GradeVO("2104","�弭��",80,70,60));
		set2.add(new GradeVO("2105","�ڳ���",100,100,100));
		set2.add(new GradeVO("2106","�̻���",12,23,34));
		set2.add(new GradeVO("2107","�輭��",50,50,50));

		for (GradeVO vo : set2)
			System.out.printf("%s %s %d %d %d %d\n",vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),vo.getTotal());
	}
}

/*
[����� Ǯ��]

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// �й� ����(��������)
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

		// ���� ����(��������)
		return s1.getTotal() - s2.getTotal();
	}
}

// main�޼ҵ�--------------------------

// TreeSet �ڷᱸ�� �ν��Ͻ� ����
Treeset<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

// ������ �ڷᱸ���� ��� �߰�
// GradeVO vo1 = new GradeVO("2103","�谡��",90,80,70);
// set2.add(vo1);
set2.add(new GradeVO("2103","�谡��",90,80,70));
set2.add(new GradeVO("2104","�弭��",80,70,60));
set2.add(new GradeVO("2105","�ڳ���",100,100,100));
set2.add(new GradeVO("2106","�̻���",12,23,34));
set2.add(new GradeVO("2107","�輭��",50,50,50));

// ��� �߰��� �ڷᱸ�� ��ü ���
Iterator<GradeVO> it2 = set2.iterator();

while (it2.hasNext())
{
	GradeVO vo = it2.next();
	System.out.printf("%7s %7s %4d %4d %4d", vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat());
}
*/