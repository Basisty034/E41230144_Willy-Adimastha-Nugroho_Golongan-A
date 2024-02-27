package Acara_15_16;

import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args){
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        sequentialSearch(exampleVariableOne, target);   
    }
     
    public static void sequentialSearch(int[] parameterOne, int parameterTwo){
        int index = -1;
        for (int i = 0; i < parameterOne.length; i++){
            if (parameterOne[i] == parameterTwo){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Your Target integer does not exist in the array");
        }else{
            System.out.println("Your Target integer is in index " + index + " of the array");
        }
    }
    
}
