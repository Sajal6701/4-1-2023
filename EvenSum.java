class EvenSum{
    public static void main(String[] args){
        int arr[]={12,33,45,33,64,32};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
            sum = sum+arr[i];
            }
        }
        System.out.print(sum);
    }
}