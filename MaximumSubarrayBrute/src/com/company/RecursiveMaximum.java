package com.company;

public class RecursiveMaximum {

    public int[] maximum(int [] A, int low, int high){
        if(low == high){
            int [] array = {low, high, A[low]};
            return array;
        }
        else{
            int mid = (int) Math.floor((low + high)/2);

            int [] lower = maximum(A, low, mid);
            int [] upper = maximum(A, mid+1, high);
            int [] middle = maxCrossingSubArray(A, low, mid, high);

            if(lower[2] >= upper[2] && lower[2] >= middle[2])
                return lower;
            else if(upper[2] >= lower[2] && upper[2] >= middle[2])
                return upper;
            else
                return middle;
        }

    }

    private int [] maxCrossingSubArray(int [] A, int low, int mid, int high){
        int leftsum = -100000000;
        int sum  = 0;
        int maxleft = 0;
        for (int i = mid; i>=low; i--){
            sum += A[i];
            if(sum > leftsum){
                leftsum = sum;
                maxleft = i;
            }
        }
        int rightsum = -100000000;
        sum  = 0;
        int maxright = 0;
        for (int i = mid + 1; i<=high; i++){
            sum += A[i];
            if(sum > rightsum){
                rightsum = sum;
                maxright = i;
            }
        }

        int[] res = {maxleft, maxright, rightsum + leftsum};
        //System.out.println(res[2]);
        return res;
    }
 }
