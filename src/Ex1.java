public class Ex1 {
    public static int number2Int(String num) {
        int ans = -1;
        // add your code here

        ////////////////////
        return ans;
    }

    // this function checks if the Input by the user is by the correct standards of (<number><b><base>)
    public static boolean isNumber(String Input) {
        boolean ans = true;
        // here we check if the Input is either null or empty
        if (Input == null || Input.isEmpty()) {
            return false;
        }
        // here we check if the input itself isn't just b since that's my inedx
        if (Input.equals("b")){
            return false;
        }
        int indexB = Input.indexOf('b');

        if (indexB == -1) {
            // take the number as base 10 since there is no b in on user input
            String numberPart = Input;

            //this loop goes through the number part and checks if the char
            //at place i is a digit or not if not continue to the next char
            for (int i = 0; i < numberPart.length(); i++){
                if (!Character.isDigit(numberPart.charAt(i))){
                    return false;
                }
            }
            // the number passed the test and is a valid decimal num
            return true;
        } else {
            // checks the string to make sure the first and last chars are not b
            if (indexB == 0 || indexB == Input.length() -1 ){
                return false;
            }
            // now we split the String into number part and base part
            String numberPart = Input.substring(0,indexB);
            String basePart = Input.substring(indexB,+ 1);

            // here we validate the number part that it contain only digits or A-G
            for (int i = 0; i < numberPart.length(); i++){
                char ch = numberPart.charAt(i);
                if (!Character.isDigit(ch) && (ch < 'A' || ch > 'G')){
                    return false;
                }
            }
            // here we validate the base part under the same conditions
            // since the base has only one char we can just check it directly instead of using a loop
            char baseChar = basePart.charAt(0);
            if (!(baseChar >= '2' && baseChar <= '9') && !(baseChar >= 'A' && baseChar <= 'G')) {
                return false;
            }

            return ans; // if all the checks passed the input is valid

        }

    }

    public static String int2Number(int num, int base) {
        String ans = "";
        // add your code here

        ////////////////////
        return ans;
    }

    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        // add your code here

        ////////////////////
        return ans;
    }

    public static int maxIndex(String[] arr) {
        int ans = 0;
        // add your code here

        ////////////////////
        return ans;
    }
}
