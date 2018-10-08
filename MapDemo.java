
package collection.demos.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		MapDemo obj=new MapDemo();
		
		Student s1=new Student(1, "Kiran", "kiran@gmail.com", "BNC123");
		Student s2=new Student(2, "Arun", "Arun@gmail.com", "AAC123");
		Student s3=new Student(3, "Murgendra", "Murgendra@gmail.com", "BCDC123");
		Student s4=new Student(4, "Guru", "Guru@gmail.com", "ABNC123");
		Student s5=new Student(5, "Narasimha", "Narasimha@gmail.com", "QBNC123");
		
		List<Student> stdList=new ArrayList<>();
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		stdList.add(s5);
		
		Map<Student, Integer> hashMap=new HashMap<>();
		obj.addStudents(hashMap, stdList);
		System.out.println("HashMap demo ********************************");
		obj.displayStudents(hashMap);
		
		Map<Student, Integer> linkedHashMap=new LinkedHashMap<>();
		obj.addStudents(linkedHashMap, stdList);
		System.out.println("linkedHashMap demo ******************************");
		obj.displayStudents(linkedHashMap);
		
		//sorting based on names
		Comparator<Student> nameComparator=(std1,std2)->std1.getName().compareTo(std2.getName());
		
		Map<Student, Integer> treeMap=new TreeMap<>(nameComparator);
		obj.addStudents(treeMap, stdList);
		System.out.println("TreeMap demo ******************************");
		obj.displayStudents(treeMap);
		

	}
	private void addStudents(Map<Student, Integer> stds,List<Student> stdList) {
		
		for(int i=0;i<stdList.size();i++) {
			stds.put(stdList.get(i),i);
		}
	}
	private void displayStudents(Map<Student, Integer> stds) {
		stds.forEach((k,v)->{
			System.out.println(k);
		});
	}
}
/**
 * HashMap demo ********************************
Student [id=1, name=Kiran, email=kiran@gmail.com, adharNo=BNC123]
Student [id=3, name=Murgendra, email=Murgendra@gmail.com, adharNo=BCDC123]
Student [id=4, name=Guru, email=Guru@gmail.com, adharNo=ABNC123]
Student [id=2, name=Arun, email=Arun@gmail.com, adharNo=AAC123]
Student [id=5, name=Narasimha, email=Narasimha@gmail.com, adharNo=QBNC123]
linkedHashMap demo ******************************
Student [id=1, name=Kiran, email=kiran@gmail.com, adharNo=BNC123]
Student [id=2, name=Arun, email=Arun@gmail.com, adharNo=AAC123]
Student [id=3, name=Murgendra, email=Murgendra@gmail.com, adharNo=BCDC123]
Student [id=4, name=Guru, email=Guru@gmail.com, adharNo=ABNC123]
Student [id=5, name=Narasimha, email=Narasimha@gmail.com, adharNo=QBNC123]
TreeMap demo ******************************
Student [id=2, name=Arun, email=Arun@gmail.com, adharNo=AAC123]
Student [id=4, name=Guru, email=Guru@gmail.com, adharNo=ABNC123]
Student [id=1, name=Kiran, email=kiran@gmail.com, adharNo=BNC123]
Student [id=3, name=Murgendra, email=Murgendra@gmail.com, adharNo=BCDC123]
Student [id=5, name=Narasimha, email=Narasimha@gmail.com, adharNo=QBNC123]

*/
