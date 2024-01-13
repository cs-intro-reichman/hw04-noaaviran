import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       
    }

    public static String capVowelsLowRest (String str) {
        String result= "";

        for (int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            
            if(isVowel(current)){
            result= result + upperCase(current);
            } else {
            result= result + lowerCase(current);
            }
        }
        return result;
    }

    private static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    private static char lowerCase(char ch) {
        if ((ch >= 'A') && (ch <= 'Z')) {
            int newChar = ch - 'A' + 'a';
            return (char) newChar;
        } else {
            return ch;
    }
}
    private static char upperCase(char ch) {
        if ((ch >= 'a') && (ch <= 'z')) {
            int newChar = ch - 'a' + 'A';
            return (char) newChar;
        } else {
            return ch;
        }
    }

    public static String camelCase (String string) {
        
        String newst="";
        boolean capitalletter= false;

        for (int i=0; i<string.length(); i++) {
            char currentchar= string.charAt(i);
        if(currentchar == ' '){
            capitalletter= true;
        } else {
            if (capitalletter) {
                newst = newst + upperCase(currentchar);
                capitalletter = false;
            } else {
                newst = newst + lowerCase(currentchar);
            }
        }
    }
    return newst;
}

public static int[] allIndexOf(String string, char chr) {
    int[] indexes = new int[string.length()];
    int currentIndex = 0;

    for (int index = string.indexOf(chr); index != -1; index = string.indexOf(chr, index + 1)) {
        indexes[currentIndex++] = index;
    }

    int[] result = new int[currentIndex];

    for (int i = 0; i < currentIndex; i++) {
        result[i] = indexes[i];
    }

    return result;
}
}
