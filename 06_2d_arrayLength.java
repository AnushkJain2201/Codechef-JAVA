class A{
    public static void main(String[] args) {
        int [][]x = new 
        
        int[][]{{1,2,3,4} , {5,6,7} , {8,9,10,11,12,13}};
        // For Total Length
        // int count =0;
        // for(int y[] :x){
        //     for(int z:y){
        //         count++;
        //     }
        // }
        // System.out.println(count);


        
        // For Individual Length
        int cou = 0;
        int []count = new int[x.length];
        for(int i = 0 ; i < x.length ; i++){
            for(int j = 0 ; j < x[i].length ; j++){
                cou++;
            }
            
            count[i] = cou;
            cou = 0;
        }
        for(int k = 0 ; k < count.length ; k++){
            System.out.println(count[k]);
        }
    }
}
