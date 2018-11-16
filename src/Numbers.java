import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Numbers {
    public static void main(String[] args) {

        int[] tab = {5,5,5,8,3,3,3,10,2,1,2};

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : tab) {
            Integer count = map.get(i);
            map.put(i, count != null ? count + 1 : 0);
        }

        Integer mostRepeatedNumbers = Collections.max(map.entrySet(),
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }).getKey();


        System.out.println("Najczęsciej powtarzalna liczba to: " + mostRepeatedNumbers);
    }
}
