import java.util.Comparator;
import java.util.TreeMap;

public class Arbore {
	
	 public static void main(String[] args) {
	        Comparator<Integer> comparator = new Comparator<Integer>() {
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return o2.compareTo(o1);
	            }
	        };

	        TreeMap<Integer, String> tree = new TreeMap(comparator);

	        // Inserting keys
	        tree.put(3, "Three");
	        tree.put(4, "Four");
	        tree.put(6, "Six");
	        tree.put(2, "Two");
	        tree.put(14, "Fourteen");
	        tree.put(9, "Nine");
	        tree.put(5, "Five");

	        // Traversing the tree
	        for (Integer key : tree.keySet()) {
	            System.out.println(key + ": " + tree.get(key));
	        }
	    }
}
