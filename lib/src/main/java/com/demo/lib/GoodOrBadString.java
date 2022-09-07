package com.demo.lib;

import java.util.HashSet;

public class GoodOrBadString {
    /*Explanation: The String doesn't contain more
    than 3 consonants or more than 5 vowels together.
    So, it's a GOOD string.*/
    public static void main(String[] arg){
        String s = "c?zaicq";
        int i=isGoodOrBad(s);
        if(i==0){
            System.out.println("BAD");
        }else{
            System.out.println("GOOD");
        }
        System.out.println("string v:"+i);
    }
    static int isGoodOrBad(String s) {
        HashSet<Character> hashSet=new HashSet<>();
        hashSet.add('a') ;
        hashSet.add('e') ;
        hashSet.add('i') ;
        hashSet.add('o') ;
        hashSet.add('u') ;
        int vow=0;
        int conso=0;
        if(hashSet.contains(s.charAt(0))){
            //if first character is vowel
            vow++;
        }else if(s.charAt(0)!='?'){
            //if first character is not vowel and ? then it definitely consonant
            conso++;
        }else{
            //this block means first character is ? that means it can be either vowel or consonant.
            vow++;
            conso++;
        }
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hashSet.contains(ch)){
                vow++;
            }else if(ch!='?'){
                conso++;
            }else{
                vow++;
                conso++;
            }
        }
        if(vow>5||conso>3)return 0;
        return 1;
    }
}
