import java.util.*;
public class Text {
	public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("c");
        set.add("A");
        set.add("a"); 
        set.add("C");
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("c");
        list.add("A");
        list.add("a"); 
        list.add("C");
        System.out.println(set);
       System.out.println(list);
	}
}