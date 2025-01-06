public class LeetCode205_IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bab"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] array1 = new int[127];
        int[] array2 = new int[127];

        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(array1[s.charAt(i)] != array2[t.charAt(i)]){
                return false;
            }
            array1[s.charAt(i)] = i+1;
            array2[t.charAt(i)] = i+1;


        }
        return true;
    }

    public static boolean isIsomorphic2(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for(int i=0; i< s.length(); i++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }

        return true;
    }
}
