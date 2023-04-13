class Ex3{
  public static void main(String args[]){
    int arr[]={-4,-5,-1,7,4,9,2};
    int temp=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]<0){
          if(arr[i]<arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
        else{
          if(arr[i]<arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ " ");
    }
      
  }
}
