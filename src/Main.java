import java.util.HashMap;
import java.util.Map;

public class Main {
    static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
            " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        int value = 0;
        char y = 0;

        for (int i = 0; i < TEXT.length(); i++) {
            if (Character.isLetter(TEXT.charAt(i))) {
                if (!map.containsKey(TEXT.charAt(i))) {
                    map.put(TEXT.charAt(i), 1);
                } else {
                    value = map.get(TEXT.charAt(i)) + 1;
                    map.put(TEXT.charAt(i), value);
                }
            }
        }
        Main.max(map);
        Main.min(map);
    }

    public static void max(Map<Character, Integer> map) {
        char y = 0;
        int max = -1;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (max < kv.getValue()) {
                max = kv.getValue();
                y = kv.getKey();
            }
        }
        System.out.println("Максимальное значение: " + y + ", равное " + max);
    }

    public static void min(Map<Character, Integer> map) {
        int min = Integer.MAX_VALUE;
        char y = 0;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (min > kv.getValue()) {
                min = kv.getValue();
                y = kv.getKey();
            }
        }
        System.out.println("Минимальное значение: " + y + ", равное " + min);
    }
}