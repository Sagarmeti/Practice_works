class Ex5{
  public static void main(String args[]){
    String str="mnmnmnkn";
    int count=0;
    int cmd=0;
    
    for(int i=0;i<str.length();i++){  
      for(int j=i+1;j<str.length();j++){ 
        if(str.charAt(i)==str.charAt(j)){
          count++; 
        }
      }
      if(str.length()-count==count+2){
        cmd++;
        break;
      }
      count=0;
    }
    if(cmd!=0){
      System.out.print("Yes");
    }
      else{
        System.out.print("No");
      }
     }
}