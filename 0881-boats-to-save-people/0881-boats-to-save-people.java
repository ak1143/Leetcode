class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;

        int count =0;

        while(i<j){
            if(people[i]+people[j]<=limit){
                count+=1;
                i++;
            }j--;
        }

        return count+(people.length-(count*2));
    }
}