package hasttable;
import java.util.Arrays;

public class Main {

    public static void main(String [] args) {

        HashTable myHashTable = new HashTable();
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = myHashTable.subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = myHashTable.subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = myHashTable.subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = myHashTable.subarraySum(nums4, target4);
        System.out.println("[]");

    }
}
