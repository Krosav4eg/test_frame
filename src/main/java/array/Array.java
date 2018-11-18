package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < num.length; i++
        ) {

            System.out.print(num[i]);
            System.out.println(" ");
        }
        System.out.println("////////////////////////////////");
        int[] mass = {5, 7, 3, 8, 4, 988, 22, 2, 3};
        Arrays.sort(mass);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        String month = "Март"
                ;
        int z= Integer.parseInt(month);
        if (month == "Март") {

                switch (month) {
                    case "вар":
                        System.out.println("Январь");
                        break;
                    case "":
                        System.out.println("Февраль");
                        break;
                    case "Март":
                        System.out.println("Март");
                        break;
                    default:
                        System.out.println("Такого месяца нет!");
                }
        }
    }
}

