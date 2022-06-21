package collection1;
import java.io.ObjectInputStream.GetField;
import java.util.TreeMap;

public class Details {
public static void main(String[] args) {
	TreeMap<Long,Contact> t=new TreeMap<>();
	Contact c1=new Contact(9834784323L,"Vetra", "vetra@gmail.com");
	Contact c2=new Contact(1298675432L,"Riya", "riya@gmail.com");
	Contact c3=new Contact(9977865743L,"Sharyu","sharyu@gmail.com");
	t.put(1L, c1);
	t.put(2L,c2);
	t.put(3L,c3);
	for(long l:t.keySet()) {
		System.out.print(l+" ");
	}
	System.out.println();
	System.out.println(t.get(1L));
	System.out.println(t.get(2L));
	System.out.println(t.get(3L));
	System.out.println(t);
}
}
