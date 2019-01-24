package Logic;

import TSeqList.TSeqList;

public class Solution {
    private String string;
    TSeqList list;

    public Solution(String string) {
        this.string = string;
        list = new TSeqList(string.length());
    }

    public String determinate(){
        int count = 0;
        char temp;
        String result = "No success.";
        if(string.length()%2 != 0){
            count = -1;
        }else{
            for(int i=0; i<string.length();i++){
                if(string.charAt(i) == '(') {
                    boolean flag = true;
                    for (int j = 0; i + 2 * j + 1 < string.length(); j++) {
                        if (string.charAt(i + 2 * j + 1) == ')') {
                            if(flag) {
                                count++;
                                System.out.println(count);
                                flag = false;
                            }
                        }
                    }
                }
                if(string.charAt(i) == '[') {
                    boolean flag = true;
                    for (int j = 0; i + 2 * j +1 < string.length(); j++) {
                        if (string.charAt(i + 2 * j + 1) == ']') {
                            if(flag) {
                                count++;
                                System.out.println(count);
                                flag = false;
                            }
                        }
                    }
                }
                if(string.charAt(i) == '{') {
                    boolean flag = true;
                    for (int j = 0; i + 2 * j + 1 < string.length(); j++) {
                        if (string.charAt(i + 2 * j + 1) == '}') {
                            if(flag) {
                                count++;
                                System.out.println(count);
                                flag = false;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        if(count  == string.length()/2){
            result = "The porposition  is true";
        }

        return result;
    }
}
