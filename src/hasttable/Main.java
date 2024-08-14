package hasttable;
import java.util.Arrays;

public class Main {

    public static void main(String [] args) {

        HashTable myHashTable = new HashTable();
        System.out.println("1st set:");
        System.out.println(myHashTable.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(myHashTable.groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(myHashTable.groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

    }
}
