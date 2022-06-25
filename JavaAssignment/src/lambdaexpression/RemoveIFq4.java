package lambdaexpression;
import java.util.*;
import java.util.function.Predicate;
public class RemoveIFq4 {
public static void main(String[] args) {
	ArrayList<String> name=new ArrayList<>(Arrays.asList("sharyu","sneha","riya","vetra","radhika"));
	Predicate<String> filter = str->(str.length()%2!=0);
	System.out.println("Orignal ArrayList "+name);
	boolean value=name.removeIf(filter);
	System.out.println("Returned value "+value);
	System.out.println("ArrayList after removeIf() "+name);
}
}
