package popups;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al  = new ArrayList<String>();
		al.add("manish");
		al.add("harshit");
		al.add("naimaisha");
		al.add(null);
		al.add("pooja");
		al.add("harshit");
		al.add("ashu");
		System.out.println(al.size());
		System.out.println(al);
		al.add(0, "rasika");
		System.out.println(al.size());
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>(al);
		System.out.println(al1.size());
		System.out.println(al1);
		//al1.addAll(al);
		//System.out.println(al1);
		al1.add(2, "nishant");
		System.out.println(al1);
	}

}
