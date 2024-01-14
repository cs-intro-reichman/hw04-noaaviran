import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
       
        
    }
    
    public static int findMissingInt (int [] array) {
        int[] newArray = new int[array.length + 1];
        int missing = 9999;
        for (int i=0; i<newArray.length; i++){
            newArray[i] = i;  
        } 
        
        for (int j=0; j< newArray.length; j++){
            boolean didFind = false;
            for(int i= 0; i<array.length; i++){
            if (array[i] == newArray[j]){
                didFind = true;
            }
            }
            if(!didFind){
                missing = newArray[j];
                break;
                }
    
        }
        
       return missing;
    }

    public static int secondMaxValue(int [] array) {
        int counter =0;
        int max = array[0];
        int secondMax = array[0];

        for (int i=1; i< array.length; i++){
            if (array[i] > max){
                max= array[i];
                counter= i;
            } 
            array[counter]=0;
        }  for (int i=0; i< array.length; i++){
            if (array[i] > secondMax) {
                secondMax= array[i];
            }
        }
    return secondMax;
    
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean find=false;
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
    
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
    
            if (!found) {
                return false;
            }
        }
    
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean goingDown= true;
        boolean goingUp= true;
        for (int i=0; i  < array.length-1; i++){
            if (array[i] < array[i+1]){
                goingDown= false;
            }
            else if (array[i] > array[i+1]){
                goingUp= false;
            }
            if (!goingDown && !goingUp){
                return false;
            }
        }
            return goingDown || goingUp;
            }
}



