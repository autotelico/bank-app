import java.util.Stack;

public class StringReverser {
    public static String reverseString(String text) {
        String[] array = text.split("");
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            String oppositeChar = array[array.length - 1 - i];
            array[i] = oppositeChar;
            array[array.length - 1 - i] = temp;
        }
        return String.join("", array);
    }

    public static String reverseWithStringBuilder(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] textArray = text.split("");
        for (int i = textArray.length - 1; i >= 0; i--) {
            stringBuilder.append(textArray[i]);
        }
        return stringBuilder.substring(0);
    }

    public static void main(String[] args) {
        System.out.println(StringReverser.reverseString("dracula"));
        System.out.println(StringReverser.reverseWithStringBuilder("banana"));
    }
}
