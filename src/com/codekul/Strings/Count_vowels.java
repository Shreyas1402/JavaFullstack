package com.codekul.Strings;

public class Count_vowels {
    public static void main(String[] args) {
        String s= "hello my name is shreyas";
        char ch[]=s.toCharArray();
        int vow=0;
        int cons=0;
        int spec=0;

        for(int i=0;i<s.length();i++){
            if(ch[i]>='a'&&ch[i]<'z'){

                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                    vow++;
                }
                else{
                    cons++;
                }

            }
            else{
                spec++;
            }
        }
        System.out.println(vow);
        System.out.println(cons);
        System.out.println(spec);

    }
}
