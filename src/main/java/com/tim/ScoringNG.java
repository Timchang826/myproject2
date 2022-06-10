package com.tim;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Matt", "Rayyy", "Kevin", "Evaaa"};
        int[] englishs = {90, 80, 70, 60};
        int[] maths = {97, 88, 77, 65};
        for (int i = 0; i < 4; i++) {
            if(i != 2){
                System.out.println(names[i]+"\t"+englishs[i]+"\t"+maths[i]+"\t"+(englishs[i]+maths[i])/2);
            }

        }
    }
}
