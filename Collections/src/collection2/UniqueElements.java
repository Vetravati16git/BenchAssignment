package collection2;
import java.util.HashSet;
public class UniqueElements {
public static void main(String[] args) {
	HashSet<Integer> h=new HashSet<Integer>();
	h.add(89);
	h.add(56);
	h.add(93);
	h.add(54);
	h.add(12);
	h.add(54);
	h.add(89);
	h.add(33);
	for(int i:h) {
		System.out.println(i);
	}
}
}
                         