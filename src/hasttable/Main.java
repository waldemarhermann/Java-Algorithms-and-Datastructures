package hasttable;
import java.util.List;

public class Main {

    public static void main(String [] args) {
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        HashTable myHashTable = new HashTable();
        List duplicates = myHashTable.findDuplicates(nums);
        System.out.println(duplicates);
    }
}
