class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        if(bills[0]!=5) return false;
        if(bills[1]==20) return false;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            if(bills[i]==10){
                if(five == 0) return false;
                five--;
                ten++;
            }
            if(bills[i]==20){
                if(five==0) return false;
                if(ten==0 && five<=2) return false;
                if(ten>0){
                    five--;
                    ten--;
                }else{
                    five-=3;
                }
            }
        }
        return true;
    }
}