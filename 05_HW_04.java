class A{
    public static void main(String[] args) {
        int [][]x = {{1,2,3,4,5} , {6,7,8} , {9,10,11,12}};
        int [][]y;
        for(int i = x.length - 1, l = 0; i >=0 && l < x.length ; i-- , l++){
            y = new int[x.length][x[i].length];
            for(int j = x[i].length - 1 , m = 0 ;  j >=0 && m <x[i].length ; j-- , m++){

                y[l][m] = x[i][j];
            }
            for(int k = 0 ; k < y[l].length ; k++){
                System.out.print(y[l][k] + " ");
            }
            System.out.println();
        }
        
    }
}