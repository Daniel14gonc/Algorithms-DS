package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
	    int min = 0;
	    int max = 0;
	    int maxsum = -1000000000;
	    for(int i = 0; i<array.length; i++){
	        int sum = 0;
	        for(int j = i; j<array.length; j++){
	        	sum += array[j];
	            if(sum > maxsum){
	                maxsum = sum;
	                min = i;
	                max = j;
                }
            }
        }
		System.out.println("----------Brute force---------------");
	    System.out.println("Minimum index: " + min);
        System.out.println("Maximum index: " + max);
        System.out.println("Sum: " + maxsum);
		System.out.println("\n----------Divide an conquer---------------");
		RecursiveMaximum rec = new RecursiveMaximum();
		int [] res = rec.maximum(array, 0, array.length-1);
		System.out.println("Minimum index: " + res[0]);
		System.out.println("Maximum index: " + res[1]);
		System.out.println("Sum: " + res[2]);
    }
}
