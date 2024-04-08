class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<sandwiches.length;i++)
        {
            for(int j=0;j<students.length;j++)
            {
                if(map.getOrDefault(j,0)!=1)
                {
                    if(sandwiches[i]==students[j] )
                    {
                        map.put(j,1);
                        break;
                    }
                }
            }
            if(map.size()!=i+1)
            {
                return students.length-map.size();
            }
        }
        return 0;
    }
}