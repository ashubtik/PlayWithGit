package trying;

import java.util.*;
import java.util.stream.Collectors;

public class AMain {
    public static void main(String[] args) {
        List<Integer> intsList = new ArrayList<>();
        intsList.add(43);
        intsList.add(211);
        intsList.add(12);
        intsList.add(9);
        intsList.add(998);
        intsList.add(90);
        intsList.add(32);
        intsList.add(649);
        intsList.add(9);
        intsList.add(43);

        int sum = intsList.stream().mapToInt(Integer::intValue).sum();
        int max = intsList.stream().mapToInt(Integer::intValue).max().getAsInt();
        double average = intsList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(intsList.stream().sorted().collect(Collectors.toList()));
        System.out.println(sum);
        System.out.println(max);
        System.out.println(average);
    }
}
