//Remove Element

package Arrays;
import java.util.*;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        removeElement(arr, val);
    }

    private static void removeElement(int[] arr, int val) {
        Arrays.sort(arr);
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arrList.add(arr[i]);
            }
        }
        System.out.println(arrList.size());
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}