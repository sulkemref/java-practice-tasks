package day22_wrapperClasses;

public class InsertTask {
    
    public static int[] insert(int[] arr, int index, int element){
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                result[i] = element;
                result[i + 1] = arr[i];
            } else {
                if(result[i] !=0 ){
                    result[i + 1] = arr[i];
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }


    public static double[] insert(double[] arr, int index, double element){
        double[] result = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                result[i] = element;
                result[i + 1] = arr[i];
            } else {
                if(result[i] !=0 ){
                    result[i + 1] = arr[i];
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }


    public static char[] insert(char[] arr, int index, char element){
        char[] result = new char[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                result[i] = element;
                result[i + 1] = arr[i];
            } else {
                if(result[i] !=0 ){
                    result[i + 1] = arr[i];
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }



    public static String[] insert(String[] arr, int index, String element){
        String[] result = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                result[i] = element;
                result[i + 1] = arr[i];
            } else {
                if(result[i] != null ){
                    result[i + 1] = arr[i];
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }
    
    
    
    
}

/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */