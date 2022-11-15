package fill.jma;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String testStrin = "lol kek 4ebyrek 12345";
        char chArray[] = testStrin.toCharArray();
        int count = 0;
        System.out.println(Arrays.toString(chArray));
        for (int i = 0; i < testStrin.length(); i++) {
            if (Character.isDigit(chArray[i])) {
                System.out.print(Character.isDigit(chArray[i]));
                System.out.println(chArray[i]);
                count++;
            }
        }
        System.out.println(count + " kollichestvo cifor");
    }
}
