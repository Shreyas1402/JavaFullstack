package com.codekul.Strings;

public class First_word_Capital {
    public static void main(String[] args) {
        String s = "hello my name is shreyas";
        char ch[] = s.toCharArray();
        ch[0] = (char) (ch[0] - 32);
        for (int i = 1; i < s.length(); i++) {
            if (ch[i] == ' ') {
                ch[i + 1] = (char) (ch[i + 1] - 32);
            }
        }
        System.out.println(s);

        for(int i=0;i<s.length();i++) {
            System.out.print(ch[i]);
        }
    }
}
