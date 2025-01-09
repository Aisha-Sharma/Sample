public class DefectiveJUnit {
    public static void main(String[] args) {
        Integer[] expected = {1, 2, null, 4};
        Integer[] actual = {1, 2, 3, 4};
        
        boolean arraysAreEqual = compareArrays(expected, actual);
        
        if (arraysAreEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public static boolean compareArrays(Integer[] expected, Integer[] actual) {
        if (expected == null || actual == null) {
            return expected == actual;  
        }

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != null && !expected[i].equals(actual[i])) {
                return false;  
            }
        }

        return true;
    }
}

