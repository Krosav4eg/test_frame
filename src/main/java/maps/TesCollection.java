package maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TesCollection {


    public static void main(String[] args) {
        int[] array = {1, 2, 33, 4, 5, 6, 7};

//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Петя");
//        map.put(3, "Ваня");
//        map.put(4, "Серёжа");
//        map.put(0, "Петя");
//        map.put(2, "Коля");
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.containsKey(0));
//        System.out.println(map.get(1));
//        for (Map.Entry<Integer, String> entry : map.entrySet())
//        {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
//        System.out.println("----------------------------------");
//        System.out.println("----------------------------------");
//
//
//        for (Integer integer:map.keySet()){
//            System.out.println(integer.toString());
//        System.out.println(map.toString());
//                    }
//
//
//        Map<String, String> map1 = new HashMap<>();
//        map1.put("1",new Brands("Sumsung").toString());
//        map1.put("2",new Brands("LG").toString());
//        map1.put("3",new Brands("Xiaomi").toString());
//
//            System.out.println(map1.keySet() + "/" + map1.values());
//
//        System.out.println(Arrays.asList(map1));
//        System.out.println(Collections.singletonList(map));
        System.out.println(getSum(array));
    }


    static int getSum(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма чисел в массиве равна "+sum);
        return sum;
    }



}
