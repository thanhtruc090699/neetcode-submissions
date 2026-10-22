class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> list = new HashMap<Character, Integer>();
        int n = s.length();
        int m = t.length();
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            list.put(s.charAt(i), list.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<n;i++){
            char c = t.charAt(i);
            if(list.containsKey(c) && list.get(c) > 0){
                list.put(c, list.get(c) - 1);
            } else return false;
        }

        return true;

    }
}
