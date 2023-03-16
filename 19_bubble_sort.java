class A{
    public static void main(String[] args) {
        int []arr = {11,32,22, 54,443,564,432,22,2,43};
        int temp = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - 1 ; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        
    }

}