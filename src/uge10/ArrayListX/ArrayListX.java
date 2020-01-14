package uge10.ArrayListX;

import java.util.ArrayList;

public class ArrayListX {

	public static void append(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		//TODO
		//list1.add(list2);
		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
/*		int x;
		if (list1.size()<list2.size()){
			x = list2.size();
		} else
			x = list1.size();*/

		int x = 0;
		for (int i = 0; i < list1.size()+list2.size(); i++) {
			if (i<list1.size()) {
				res.add(list1.get(x));
			}
			if (i<list2.size()) {
				res.add(list2.get(x));
			}
			x++;

		}

		return res;	
	}
	
	public static void printList(ArrayList<Integer> list, String name) {
		System.out.println("------------------------\n"+name+":\n");
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}	
}
