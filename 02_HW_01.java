class A{
    public static void main(String[] args) {
        int [][]x = {{1,2,3,4,5} , {6,7,8} , {9,10,11,12}};
        int [][]y;
        for(int i = 0 ; i < x.length ; i++){
            y = new int[x.length][x[i].length];
            for(int j = 0 ; j <x[i].length ; j++){

                y[i][j] = x[i][j];
            }
            for(int k = 0 ; k < y[i].length ; k++){
                System.out.print(y[i][k] + " ");
            }
            System.out.println();
        }
        
    }
}