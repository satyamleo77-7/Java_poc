package predicate;

import java.util.function.Predicate;

public class predicate_example {
public static void main(String[] args) {
	Predicate<Integer> greaterThanTen = i -> i>10;
	System.out.println(greaterThanTen.test(9));
	
	Predicate<Integer> lessThanTwenty= i-> i<20;
	System.out.println(lessThanTwenty.and(greaterThanTen).negate().test(21));
}
}
