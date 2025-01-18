class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int[] original = new int[n];

        boolean result = check(original,derived,0);
        if(result == true) return true;

        result = check(original,derived,1);
        if(result == true) return true;

        return false;

    }

    public boolean check(int []or,int []der, int a){
        or[0] = a;

        for(int i=1;i<or.length;i++)
        {
            or[i] = or[i-1] ^ der[i-1]; 
        }

        if((or[or.length-1] ^ or[0]) == der[or.length-1]) return true;

        return false;
    }
}