import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        int[] array1= {1, 2, 1, 1};
        int[] array2= {2,1};
        System.out.println(containsTheSameElements(array1, array2));
        
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
        int max = array[0];
        int secondMax = 0;
        for (int i=0; i< array.length; i++){
            if (array[i] > max){
                max= array[i];
            }
        }
        for (int i=0; i< array.length; i++) {
            if (array[i]>= secondMax && array[i] !=max) {
                secondMax = array[i];
        }
        
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean find= false;

        if (array1.length >= array2.length) {
        for(int i= 0; i< array1.length; i++){
             find = false;
            for (int j= 0; j<array2.length; j++){
            if (array1[i] == array2[j]){
                find=true;
                break;
                }
            }
        }
         if (!find){
            return false;
        }
        }
        if (array2.length > array1.length){
            for(int i= 0; i< array2.length; i++){
             find = false;
            for (int j= 0; j<array1.length; j++){
            if (array1[i] == array2[j]){
                find=true;
                break;
                }
            }
        }
         if (!find){
            return  false;
        }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean goingDown= true;
        boolean goingUp= true;
        for (int i=0; i  < array.length-1; i++){
            if (array[i] < array[i+1]){
                return goingUp;
            }
            else if (array[i] > array[i+1]){
                return goingDown;
            }
        }
            return goingDown || goingUp;
            }
}



