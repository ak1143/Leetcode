class Solution {
    public String findLatestTime(String s) {
       char[] time = s.toCharArray();
        
        if(time[0] == '?') {
             if(time[1] == '?')
             {
                 time[0]='1';
             }else{
                 if(time[1]-'1'>0)
                 {
                     time[0]='0';
                 }else{
                     time[0]='1';
                 }
             }
        }
        
        if(time[1] == '?') {
            if(time[0]=='1')
            {
                time[1]='1';
            }else{
                time[1]='9';
            }
        }
        
        if(time[3] == '?') {
            time[3] = '5';
        }
        
        if(time[4] == '?') {
            time[4] = '9';
        }
        
        return new String(time);
    }
}