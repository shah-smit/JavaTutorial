package com.tutorial.algorithmns;

public class BM {
    public static void main(String[] abc) {
        System.out.println("Testing BM");
//        test("abc", "a", 0);
//        test("abc", "b", 1);
        test("abc", "c", 2);
//        test("abc", "d", -1);
//        test("catdog", "tdo", 2);
//        test("ratatat", "at", 1);
//        test("foo", "", 0);
//        test("", "bar", -1);
    }

    public static void test(String text, String word, int exp) {
        char[] textC = text.toCharArray();
        char[] wordC = word.toCharArray();
        int result = bm(textC, wordC);
        if(result == exp)
            System.out.println("PASSED");
        else {
            System.out.println("FAILED");
            System.out.println("\ttext: " + text);
            System.out.println("\tword: " + word);
            System.out.println("\texp: " + exp + ", res: " + result);
        }

    }

    public static int[] makeD1(char[] pat) {
        int[] table = new int[255];
        for(int i=0; i<255; i++)
            table[i] = pat.length;
        for(int i=0; i<pat.length-1; i++)
            table[pat[i]] = pat.length-1-i;
        return table;
    }

    public static boolean isPrefix(char[] word, int pos) {
        int suffixlen = word.length - pos;
        for(int i=0; i<suffixlen; i++)
            if(word[i] != word[pos+i])
                return false;
        return true;
    }

    public static int suffix_length(char[] word, int pos) {
        int i;
        for(i=0; ((word[pos-i] == word[word.length-1-i]) &&
                  (i < pos)); i++)
            {}
        return i;
    }

    public static int[] makeD2(char[] pat) {
        int[] delta2 = new int[pat.length];
        int p;
        int last_prefix_index = pat.length - 1;
        for(p = pat.length-1; p>=0; p--) {
            if(isPrefix(pat, p+1))
                last_prefix_index = p+1;
            delta2[p] = last_prefix_index + (pat.length-1-p);
        }
        for(p=0; p<pat.length-1; p++) {
            int slen = suffix_length(pat, p);
            if(pat[p-slen] != pat[pat.length-1-slen])
                delta2[pat.length-1-slen] = pat.length-1-p+slen;
        }
        return delta2;
    }

    public static int bm(char[] string, char[] pat) {
        int[] d1 = makeD1(pat);
        for(int i: d1){
        	System.out.print(i+" ");
        }
        int[] d2 = makeD2(pat);
        System.out.println();
        for(int i: d2){
        	System.out.print(i+" ");
        }
        int i = pat.length-1;
        while(i < string.length) {
            int j = pat.length-1;
            while(j>=0 && (string[i] == pat[j])) {
                i--;
                j--;
            }
            if(j < 0)
                return (i+1);
            i += Math.max(d1[string[i]], d2[j]);
        }
        return -1;
    }
}
