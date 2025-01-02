public class Leetcode_242 {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];

        for(int i=0;i<s.length();i++){
            array[s.charAt(i) - 'a'] = array[s.charAt(i) - 'a']+1;
        }

        for(int i=0;i<t.length();i++){
            array[t.charAt(i) - 'a'] = array[t.charAt(i) - 'a']-1;
        }

        for(int i=0;i<array.length;i++){
            if(array[i] != 0){
                return false;
            }
        }
        return true;
    }

}
