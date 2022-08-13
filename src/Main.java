public class Main {
    public static void main(String[] args) {
        //task 1 5:33
        int[] digits = new int[]{1, 2, 3};
        float[] floats = {1.57f, 7.654f, 9.986f};
        char[] name = {'И', 'г', 'о', 'р', 'ь'};
        // 5:43

        // task 2 5:51
        for (int i = 0; i < digits.length - 1; i++) {
            System.out.print(digits[i] + ", ");
        }
        System.out.println(digits[digits.length - 1]);

        for (int i = 0; i < floats.length - 1; i++) {
            System.out.print(floats[i] + ", ");
        }
        System.out.println(floats[floats.length - 1]);

        for (int i = 0; i < name.length - 1; i++) {
            System.out.print(name[i] + ", ");
        }
        System.out.println(name[name.length - 1]);
        // 6:21

        // task 3
        System.out.println("");
        for (int i = digits.length - 1; i > 0; i--) {
            System.out.print(digits[i] + ", ");
        }
        System.out.println(digits[0]);

        for (int i = floats.length - 1; i > 0; i--) {
            System.out.print(floats[i] + ", ");
        }
        System.out.println(floats[0]);

        for (int i = name.length - 1; i > 0; i--) {
            System.out.print(name[i] + ", ");
        }
        System.out.println(name[0]);

        // 6:41

        // task 4
        System.out.println();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 != 0) {
                System.out.print(digits[i] + 1);
            } else {
                System.out.print(digits[i]);
            }
        }
    }
}