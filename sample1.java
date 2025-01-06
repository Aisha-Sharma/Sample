public class TwistedJava {
    public static void main(String[] args) {
        int number = 13;
        System.out.println("Original: " + number);
        System.out.println("Reversed Bits: " + twistedReverseBits(number));
    }

    public static int twistedReverseBits(int n) {
        StringBuilder bitString = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            bitString.append((n & (1 << i)) != 0 ? "1" : "0");
        }
        String reversed = twist(bitString.toString(), 0);
        return parseBinary(reversed);
    }

    private static String twist(String s, int depth) {
        if (s.length() <= 1) return s;
        int mid = s.length() / 2;
        return twist(s.substring(mid), depth + 1) + s.charAt(mid - 1) + twist(s.substring(0, mid), depth + 1);
    }

    private static int parseBinary(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result += (binary.charAt(binary.length() - 1 - i) - '0') << i;
        }
        return result;
    }
}

