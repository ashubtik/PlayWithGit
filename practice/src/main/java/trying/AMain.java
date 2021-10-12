package trying;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class AMain {
    public static void main(String[] args) {
        List<Integer> intsList = new ArrayList<>();
        intsList.add(43);
        intsList.add(211);
        intsList.add(12);
        intsList.add(9);
        intsList.add(3426);
        intsList.add(998);
        intsList.add(90);
        intsList.add(32);
        intsList.add(649);
        intsList.add(9);
        intsList.add(43);

        System.out.println(intsList.stream().distinct().sorted().collect(Collectors.toList()));
    }
}
