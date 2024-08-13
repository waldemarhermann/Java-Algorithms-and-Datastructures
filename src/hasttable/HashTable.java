package hasttable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiCode = keyChars[i];
            hash = (hash + asciiCode * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        Node newNode = new Node(key, value);
        int index = hash(key);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            if (temp.key.equals(newNode.key)) {
                temp.value += newNode.value;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
                if (temp.key.equals(newNode.key)) {
                    temp.value += newNode.value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (Node node : dataMap) {
            Node temp = node;
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int num : nums) {
            myHashMap.put(num, myHashMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> duplicates = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : myHashMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    public Character firstNonRepeatingChar(String string) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        char[] c = string.toCharArray();

        for (char ch : c) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() < 2) {
                return entry.getKey();
            }
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(num, i);
        }
        return new int[]{};
    }
}
