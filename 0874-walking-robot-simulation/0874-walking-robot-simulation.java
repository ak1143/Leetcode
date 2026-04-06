class Solution {
    public int robotSim(int[] commands, int[][] o) {
        
        Set<String> set = new HashSet<>();

        for(int[]obs : o){
            set.add(obs[0]+","+obs[1]);
        }

        int []dir ={0,1};

        int x=0;
        int y=0;
        int maxD =0;

        for(int i=0;i<commands.length;i++){

            if(commands[i]==-2){ //  90 deg left - dir = { - second , first }
            
                int temp = dir[0];
                dir[0] = -dir[1];
                dir[1] = temp; 

            }else if(commands[i]==-1) { // 90 deg right - dir = { second , - first }

                int temp = dir[0];
                dir[0] = dir[1];
                dir[1] = -temp;

            }else{

                for(int step =0; step < commands[i]; step++){

                    int newX = x + dir[0];
                    int newY = y +dir[1];

                    String val = newX + "," + newY;

                    if(set.contains(val)) break;

                    x = newX;
                    y = newY;

                    maxD = Math.max(maxD , newX * newX + newY * newY);
                }
            }
        }

        return maxD;

    }
}