package level0.YoutubeQ;

import java.util.Arrays;

public class DeleteEleFrArray {

    //two ways are there
         // first we can delete and shift the elements

          // second we can delete and create a new array and store the elements in the new array


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int eleToRemove = 5;

        int[] output = remove(arr,eleToRemove);
        System.out.println(Arrays.toString(output));

    }

    public static int [] remove(int[] arr, int element){

        int[] output = new int[arr.length-1];
         int index = 0;//because if i use same (i) then it will create error in elements sor for the
        //new arrays indexes using diff variable
        for(int i = 0; i<arr.length; i++){

            if(arr[i]!=element){
                output[index] = arr[i];
                index++;
            }
        }
        return output;
    }
}
