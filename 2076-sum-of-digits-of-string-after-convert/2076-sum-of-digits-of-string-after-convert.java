class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            str.append(s.charAt(i)-'a'+1);
        }
        String string = str.toString();
        System.out.print(string +" ");

        int sum = 0;

        while(k>0)
        {
            sum = 0;
            for(int i=0;i<string.length();i++)
            {
                sum+= string.charAt(i) - '0';
            }
            System.out.print(sum+ " ");
            string = String.valueOf(sum);
            k--;
        }
        return sum;
    }
}