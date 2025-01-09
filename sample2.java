public class Ex5 {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = 1000;

        // if (num1 == num2) {
        //     System.out.println("num1 and num2 are equal using '==' operator.");
        // } else {
        //     System.out.println("num1 and num2 are not equal using '==' operator.");
        // }

        String text = "hello";
        String anotherText = new String("hello");

        if (text == anotherText) {
            System.out.println("text and anotherText are the same using '==' operator.");
        } else {
            System.out.println("text and anotherText are not the same using '==' operator.");
        }
    }
}
