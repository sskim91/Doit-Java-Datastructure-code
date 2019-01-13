package com.sskim.chap03;

import java.util.Scanner;

public class SeqSearchFor {
    //요소수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
    static int seqSearch(int[] a, int n, int key) {

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("요소수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();

        int idx = seqSearch(x, num, ky);    //배열 x에서 키 값이 ky 인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
