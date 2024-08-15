package hasttable;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] args) {

        HashTable myHashTable = new HashTable();
        System.out.println(myHashTable.hasUniqueChars("abcdefg")); // should return true
        System.out.println(myHashTable.hasUniqueChars("hello")); // should return false
        System.out.println(myHashTable.hasUniqueChars("")); // should return true
        System.out.println(myHashTable.hasUniqueChars("0123456789")); // should return true
        System.out.println(myHashTable.hasUniqueChars("abacadaeaf")); // should return false
    }
}
