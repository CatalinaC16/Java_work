import java.util.ArrayList;
import java.util.Iterator;

public class Lista {

		ArrayList<String> lists = new ArrayList<String>();
		Lista(){
			lists.add("give");
			lists.add("me");
			lists.add("more");
			parcurg();
		}
		
		void parcurg() {
			
			Iterator<String> it = lists.iterator();
			
		while (it.hasNext()) {
			 //String s = it.next(); 
			 //System.out.println(s);
			
				System.out.println(it.next());
			
			 //it.remove();
			
			
			}
		
		for (String s: lists) {
			 System.out.println(s);
			}

		
		for (int i=0; i < lists.size(); i++) {
			 System.out.println(lists.get(i));
			}
		}
}
