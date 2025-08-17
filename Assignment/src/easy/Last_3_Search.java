package easy;

import java.util.ArrayDeque;

public class Last_3_Search {
	private static final int CAPACITY = 3;
	private ArrayDeque<String> search = new ArrayDeque<>();

	public void addSearch(String term) {
		if (search.size() == CAPACITY) {
			search.removeFirst();
		}
		search.addLast(term);
	}

	public void printSearches() {
		System.out.println("Last 3 Searches:");
		for (String term : search) {
			System.out.println(term);
		}
	}

	public static void main(String[] args) {
		Last_3_Search res = new Last_3_Search();
		res.addSearch("VIJ");
		res.addSearch("GNT");
		res.addSearch("HYD");
		res.addSearch("RJY");
		res.printSearches();
	}
}
