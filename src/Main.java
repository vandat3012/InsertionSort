
public class Main {
    public static void main(String[] args) {
        int list[] = {1,2,3,63,2,1,9,8,7,5,6,74,2,3,-55};
        insertionSort(list);
        for (int e : list) {
            System.out.print(e + "\t");
        }

    }
    public static void insertionSort (int list[]) {
        int pos,x;
        for (int i = 1; i < list.length ; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos -1]) {
                list[pos] = list[pos -1];
                pos--;
            }
            list[pos] = x;
        }
    }
}