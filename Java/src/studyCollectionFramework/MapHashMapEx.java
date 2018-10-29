package studyCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapHashMapEx {
	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "CollectionFramework");
		map.put(2, "Map");
		map.put(3, "HashMap");
		map.put(4, "Put");
		map.put(4, "Github");
		System.out.println(map.get(4));//Github - 나중에 쓴 Value를 가져온다.
		
		int mapSize = map.size();
		System.out.println("Size : " + mapSize);
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		Iterator<Entry<Integer,String>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer,String> entry = entryIterator.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		System.out.println();
		
		Map<Student,Integer> gradeMap = new HashMap<Student,Integer>();
		gradeMap.put(new Student("강후",100), 1);
		gradeMap.put(new Student("김인범",95), 2);
		gradeMap.put(new Student("강혁",90), 3);
		gradeMap.put(new Student("이정우",85), 4);
		
		Set<Entry<Student, Integer>> entryGradeMap = gradeMap.entrySet();
		Iterator<Entry<Student, Integer>> entryIteratorGrade = entryGradeMap.iterator();
		System.out.println("Name\tScore\tRank");
		while(entryIteratorGrade.hasNext()) {
			Entry<Student, Integer> entry = entryIteratorGrade.next();
			Student key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key.name + "\t" + key.score + "\t" + value);
		}
		
	}//end of main
}//end of class

class Student {

	String name;
	int score;
	
	public Student() {
	}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}