public class Main {

    public static void main(String[] args) {

        char a[] = {'d','x','a','r','p','j','i'};
        int i;

        System.out.println("Исходный массив: ");
        for (i=0; i<a.length;i++) {
            System.out.print(a[i]+"\t");
        }

        System.out.println();

        Quicksort.qSort(a);

        System.out.println("Отсортированный массив: ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
}
