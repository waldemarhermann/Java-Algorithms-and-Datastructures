package hasttable;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.testLongestConsecutiveSequence("Consecutive Integers", new int[] {1, 2, 3, 4, 5}, 5);
        myHashTable.testLongestConsecutiveSequence("No Sequence", new int[] {1, 3, 5, 7, 9}, 1);
        myHashTable.testLongestConsecutiveSequence("Duplicates", new int[] {1, 2, 2, 3, 4}, 4);
        myHashTable.testLongestConsecutiveSequence("Negative Numbers", new int[] {1, 0, -1, -2, -3}, 5);
        myHashTable.testLongestConsecutiveSequence("Empty Array", new int[] {}, 0);
        myHashTable.testLongestConsecutiveSequence("Multiple Sequences", new int[] {1, 2, 3, 10, 11, 12, 13}, 4);
        myHashTable.testLongestConsecutiveSequence("Unordered Elements", new int[] {5, 1, 3, 4, 2}, 5);
        myHashTable.testLongestConsecutiveSequence("Single Element", new int[] {1}, 1);
        myHashTable.testLongestConsecutiveSequence("All Identical Elements", new int[] {2, 2, 2, 2, 2}, 1);




    }
}
