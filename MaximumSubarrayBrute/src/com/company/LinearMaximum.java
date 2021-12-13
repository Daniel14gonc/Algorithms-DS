package com.company;

public class LinearMaximum {


    public int[] maximum(int [] A){
        int min = 0;
        int max = 0;
        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i<A.length;i++){
            sum+= A[i];
            if(sum > maxsum){
                maxsum = sum;
                max = i;
            }
            else if(sum<0){
                sum = 0;
                min = i + 1;
            }
        }

        return new int[]{min, max, maxsum};

    }
}
