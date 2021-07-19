/*==============================
+++++++컬렉션(Collection)+++++++
================================
◎ Test163.java
==============================*/

// Set → HashSet, TreeSet
// - 순서(의미) 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스

   -java.util.TreeSet<E> 클래스는
    Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬된다.
   -SortedSet을 implement한 상태
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
	// 주요 속성 구성
	private String hak;
	private String name;
	private int kor, eng, mat;

	// getter 구성
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
	
	// setter 구성
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

	// 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 생성자(사용자 정의 생성자 → 매개변수 없는 기본 생성자
	// 이게 없으면 인스턴스만 생성했을 때 오류 발생
	GradeVO()
	{
	}

	// 추가 메소드 정의 → 
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
		
		// 이름 기준(오름차순)
		return set.getName().compareTo(set2.getName());
	}
}


public class Test163
{
	public static void main(String[] args)
	{
		// TreeSet  자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// set이라는 TreeSet 자료구조에 요소 추가 → add()
		set.add("짱구는못말려");
		set.add("아기공룡 둘리");
		set.add("아따맘마");
		set.add("꼬마마법사레미");
		set.add("명탐정코난");
		set.add("심슨");
		set.add("포켓몬스터");
		set.add("은하철도999");
		set.add("미래소년코난");

		// Iterator를 활용하여 set요소 전체 출력
		Iterator<String> it = set.iterator();

		while (it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();

		// TreeSet 자료구조 인스턴스 생성
		
		// 생성된 자료구조에 요소 추가
		// 2103 김가영 90 80 70
		// 2014 장서현 80 70 60
		// 2105 박나현 100 100 100
		// 2016 이새롬 12 23 34
		// 2107 김서현 50 50 50
		
		// 요소 추가된 자료구조 전체 출력
		TreeSet<GradeVO> set2= new TreeSet<GradeVO>(new Com<GradeVO>());
		set2.add(new GradeVO("2103","김가영",90,80,70));
		set2.add(new GradeVO("2104","장서현",80,70,60));
		set2.add(new GradeVO("2105","박나현",100,100,100));
		set2.add(new GradeVO("2106","이새롬",12,23,34));
		set2.add(new GradeVO("2107","김서현",50,50,50));

		for (GradeVO vo : set2)
			System.out.printf("%s %s %d %d %d %d\n",vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),vo.getTotal());
	}
}

/*
[강사님 풀이]

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준(오름차순)
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

		// 총점 기준(오름차순)
		return s1.getTotal() - s2.getTotal();
	}
}

// main메소드--------------------------

// TreeSet 자료구조 인스턴스 생성
Treeset<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

// 생성된 자료구조에 요소 추가
// GradeVO vo1 = new GradeVO("2103","김가영",90,80,70);
// set2.add(vo1);
set2.add(new GradeVO("2103","김가영",90,80,70));
set2.add(new GradeVO("2104","장서현",80,70,60));
set2.add(new GradeVO("2105","박나현",100,100,100));
set2.add(new GradeVO("2106","이새롬",12,23,34));
set2.add(new GradeVO("2107","김서현",50,50,50));

// 요소 추가된 자료구조 전체 출력
Iterator<GradeVO> it2 = set2.iterator();

while (it2.hasNext())
{
	GradeVO vo = it2.next();
	System.out.printf("%7s %7s %4d %4d %4d", vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat());
}
*/