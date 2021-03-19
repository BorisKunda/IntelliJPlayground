package code_problems_j;

public class Main {

    public static void main(String[] args) {

        String txt = "ABC";

        char[] charactersFromStringArr = txt.toCharArray();

        for (int i = 0; i < charactersFromStringArr.length; i++) {

            char charTemp = charactersFromStringArr[i];
            int intFromChar = Character.valueOf(charTemp);
            String stringFromChar = String.valueOf(charTemp);

            if (intFromChar != 32) {//check if empty space
                print(stringFromChar);
            } else {
                print("Fail");
            }

        }


    }

    public static String[] stringToArray(String s) {


        return null;//new String[]{n..}

    }


    /**
     * DON'T REMOVE !!!!
     **/

    static void print(String someString) {
        System.out.println(someString);
    }


}

//String#split().