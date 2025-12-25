class Solution {

    boolean allZero(int []arr){
        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list = new ArrayList<>();

        int []arr = new int[26];

        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            arr[ch-'a']++;
        }

        int i=0;
        int j=0;
        int n = s.length();

        while(j<n){
            arr[s.charAt(j)-'a']--;
            if(j-i+1 == p.length()){
                if(allZero(arr)){
                    list.add(i);
                }
                arr[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return list;
    }
}