package hasttable;
import java.util.List;

public class Main {

    public static void main(String [] args) {

        HashTable myHashTable = new HashTable();

        System.out.println(myHashTable.firstNonRepeatingChar("leetcode"));
        System.out.println(myHashTable.firstNonRepeatingChar("hello"));
        System.out.println(myHashTable.firstNonRepeatingChar("aabbcc"));
    }
}
