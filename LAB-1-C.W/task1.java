class task1{
  public static void main(String [] args){
    int[] arr1={1,2,3};
    int[] arr2={2,5,6};
    int[] ans = new int[arr1.length+arr2.length];
  int i=0,j=0,k=0;
  while(i<arr1.length && j<arr2.length){
    if(arr1[i]<arr2[j]){
      ans[k]=arr1[i];
      i++;
      k++;
    }
    else{
    ans[k]=arr2[j];
      j++;
      k++;
    }
  }
  while(i<arr1.length || j<arr2.length){
    if(i<arr1.length){
      ans[k]=arr1[i];
      i++;
      k++;
    }
    else{
    ans[k]=arr2[j];
      j++;
      k++;
    }
  }
  for(int x=0;x<k;x++){
    System.out.print(ans[x]);
  }
  }
}