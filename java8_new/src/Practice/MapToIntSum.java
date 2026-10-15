package Practice;

import java.util.stream.Stream;

public class MapToIntSum {

	public static void main(String[] args) {

        int sum = Stream.of(10, 20)
                        .mapToInt(Integer::intValue)
                        .sum();

        System.out.println(sum);
    }

}
