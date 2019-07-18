package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        System.out.println(isGanjilGenap(0));
//        System.out.println(bilanganPrima(15));
//        System.out.println(showGanjils(15));
//        System.out.println(showPrimas(15));
        System.out.println(joinString("123", "00000"));

    }

    public static String joinString(String a, String b){
        char[] pertama = a.toCharArray();
        char[] kedua = b.toCharArray();
        String persatuan = "";
        int lengtUtama = pertama.length;

        if (pertama.length < kedua.length){
            lengtUtama = kedua.length;
        }
        for (int i=0; i<lengtUtama; i++){
            if (i >= pertama.length){
                persatuan = persatuan + kedua[i];
            } else if (i >= kedua.length){
                persatuan = persatuan + pertama[i];
            } else {
                persatuan = persatuan + pertama[i] + kedua[i];
            }
        }
        return persatuan;
    }

    public static ArrayList<Integer> showPrimas (int angkae){
        ArrayList<Integer> b = new ArrayList();
        for (int urut = 1; urut <= angkae; urut++){
            for (int pembagi = 1; pembagi <= urut; pembagi++){
                if (urut %pembagi== 0){
                    if (urut == pembagi){
                        b.add(urut);
                    } else if (pembagi != 1 && pembagi != urut){
                        break;
                    }
                }
            }
        }
        return b;
    }

    public static ArrayList<Integer> showGanjils (int angkaw) {
        ArrayList<Integer> a = new ArrayList();
        for (int urutan = 1; urutan <= angkaw; urutan++){
            if (urutan %2 != 0){
                a.add(urutan);
            }
        }
        return a;
    }

    public static String isGanjilGenap (int angka) {
        if (angka %2 == 0){
            return "genap";
        } else {
            return "ganjil";
        }
    }

    public static String bilanganPrima (int angkaq) {
        if (angkaq <= 3) return "prima";
        String result = "";
        for (int pembagi = 1; pembagi < angkaq; pembagi++) {
            if (angkaq %pembagi == 0) {
                if (angkaq == pembagi) {
                    result = "prima";
                    break;
                } else {
                    result = "bukan prima";
                    break;
                }
            }
        }
        return result;
    }


}