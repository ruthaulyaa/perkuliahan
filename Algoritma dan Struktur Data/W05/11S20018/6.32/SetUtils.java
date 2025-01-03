import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class SetUtils{
	// Multiset Implementation in Java
	public static void main(String[] args){
		Multiset<String> multiset = new Multiset();
		multiset.add("Sachin");
		multiset.add("Ab Deviliers", 2);
		multiset.addAll("India", "USA");
		multiset.addAll(Arrays.asList("Pakistan", "UK", "Indonesia", "Paris"));
		System.out.println(multiset);
		multiset.remove("Ab Deviliers");
		multiset.remove("UK", 2);
		System.out.println(multiset);
		multiset.setCount("Tokyo", 2);
		multiset.setCount("France", 3);
		multiset.setCount("Belgium", 4);
		multiset.setCount("USA", 0);
		System.out.println(multiset);
	}
}