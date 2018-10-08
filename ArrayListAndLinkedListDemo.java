package collection.demos.list;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListDemo {

	public static void main(String[] args) {
		ArrayListAndLinkedListDemo obj = new ArrayListAndLinkedListDemo();

		List<String> arrayList = new ArrayList<>();

		Instant arrayListStart = Instant.now();

		obj.addNames(arrayList, 100000);
		obj.deleteNames(arrayList, 5000);
		obj.addNames(arrayList, 15000);

		Instant arrayListEnd = Instant.now();
		System.out.println("Arraylist performnce " + Duration.between(arrayListStart, arrayListEnd));

		List<String> linkedList = new LinkedList<>();

		Instant linkedListStart = Instant.now();

		obj.addNames(linkedList, 100000);
		obj.deleteNames(linkedList, 5000);
		obj.addNames(linkedList, 15000);

		Instant linkedListEnd = Instant.now();
		System.out.println("LinkedList performnce " + Duration.between(linkedListStart, linkedListEnd));

	}

	private void addNames(List<String> names, int count) {
		for (int i = 0; i < count; i++) {
			names.add(i + "name");
		}
	}

	private void deleteNames(List<String> names, int count) {
		for (int i = 0; i < count; i++) {
			names.remove(i);
		}
	}

}
