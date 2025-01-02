public class Leetcode28 {

    //TODO
    public static void main(String[] args) {

        System.out.println(strStr("mississippi","issip"));
    }


    public static int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        if(needle.length() > haystack.length()){
            return -1;
        }
        while(i < haystack.length()){
            if(j == needle.length()){
                return i - needle.length();
            }
            else if(needle.charAt(j) == haystack.charAt(i)){
                System.out.println("needle " + needle.charAt(j));
                System.out.println("haystack " + haystack.charAt(i));
                i++;
                j++;
            }else if(needle.charAt(j) != haystack.charAt(i)){
                j=0;
                i++;
            }
        }
        if(j == needle.length()){
            return i - needle.length();
        }
        else if(i == j){
            return 0;
        }
        return -1;
    }
}


