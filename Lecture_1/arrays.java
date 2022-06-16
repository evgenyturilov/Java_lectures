public class arrays {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        System.out.println(arr.length);     // Функционал работы с массивом вызываем через arr.

        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.println(arr[3]);
        arr[4] = 13;
        System.out.println(arr[4]);

        int[] array[] = new int[3][5];
        for (int[] line : array) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}
