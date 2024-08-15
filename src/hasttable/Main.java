package hasttable;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] args) {

        HashTable myHashTable = new HashTable();
        List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,5,4,6,8,2,3);
        List<Integer> newList = myHashTable.removeDuplicates(myList);
        System.out.println(newList);
    }
}
