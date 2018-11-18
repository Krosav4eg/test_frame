package selenium.test;

public class TestExample {
//3. Метод вычесления типа аргумента и вывод в консоль

    public void getMultiple() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            } else System.out.println("Incorrect number");
        }
    }

    public static void main(String[] args) {
        TestExample testExample = new TestExample();
        testExample.getMultiple();
    }
}


