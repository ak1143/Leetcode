class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list=new ArrayList<>();
        
       for(int i=1;i<=numRows;i++){
        list.add(generaterow(i));
       } return list;
    }
    
    public static List<Integer> generaterow(int row){
        
        List<Integer> list=new ArrayList<>();
        
        long ans=1;
        list.add(1);
        
        for(int col=1;col<row;col++){
            
            ans=ans*(row-col);
            ans=ans/(col);
            list.add((int)ans);
        }
        return list;
    } 
    
}
