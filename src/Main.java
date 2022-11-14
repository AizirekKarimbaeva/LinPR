
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = {random.nextInt( 2)};
        Arrays.sort(array);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(random.nextInt( 2));
        Collections.sort(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(random.nextInt( 2));
        Collections.sort(linkedList);
       
        System.out.println(met(array));
        System.out.println(met(arrayList));
        System.out.println(met(linkedList));
    }
    public static String met(int[] array) {
    return Arrays.toString(array);
    }
    public static ArrayList<Integer> met(ArrayList<Integer> arrayList){
        return arrayList;
    }
    public static LinkedList<Integer> met(LinkedList<Integer>linkedList){
      return linkedList;
    }
}
