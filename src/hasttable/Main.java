package hasttable;
import java.util.Arrays;

public class Main {

    public static void main(String [] args) {

        HashTable myHashTable = new HashTable();
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(myHashTable.twoSum(new int[]{}, 0)));

    }
}
