
import java.util.*;

class Main {
    public static void main(String args[]) {

        int[] t = { 4, 5, 6 };
        int[] t2 = { 2, 3, 6 };
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            if (t[i] < t2[i]) {

                list.add(t[i]);
                list.add(t2[i]);
            } else if (t2[i] < t[i]) {
                list.add(t2[i]);
                list.add(t[i]);
            } else {
                list.add(t[i]);
                list.add(t2[i]);
            }
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
