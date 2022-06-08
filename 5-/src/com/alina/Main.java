package com.alina;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int N = 20;
        int[] arr = new int[20];
        Random rand = new Random();
        for(int i = 0; i < N-1;i++){
            arr[i] = rand.nextInt(30);
            System.out.println(arr[i]);
        }
        arr[N-1] = 9999;
        boolean flag = arr[0] % 2 == 0?true:false;
        for(int i = 1; i<N;i++) {
            if (arr[i] != 0) {
                if (arr[i] % 2 == 0 && flag) {
                    System.out.println(i - 1 + " " + i);
                    break;
                } else if (arr[i] % 2 != 0) {
                    flag = false;
                } else if (arr[i] % 2 == 0) {
                    flag = true;
                }
            }
        }
    }
}
