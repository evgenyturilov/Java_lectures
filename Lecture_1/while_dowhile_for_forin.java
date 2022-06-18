/**
 * while_dowhile_for_forin
 */
public class while_dowhile_for_forin {

    public static void main(String[] args) {
        int valueOne = 321;
        int valueTwo = 321;
        int countOne = 0;
        int countTwo = 0;

        while (valueOne != 0) {
            valueOne /= 10;
            countOne++;
        }
        System.out.println(countOne);

        do {
            valueTwo /= 10;
            countTwo++;
        } while (valueTwo != 0);
        System.out.println(countTwo);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue; // Здесь при помощи оператора continue пропускаем четные значения пр переборе.
                          // Его желательно не использовать!!!
            System.out.printf("%d ", i);
        }

        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 77 };
        for (int item : arr) { // цикл for in он же foreach
            System.out.println(item);
        }
    }
}