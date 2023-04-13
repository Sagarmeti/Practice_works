class Ex6{
  public static void main(String args[]){
    String str = "hkhlh";
    char ch[] = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    int dcount = 1,acount=0;
    for (int i = 0; i < ch.length; i++) {
      dcount=1;
      acount=1;
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          dcount++;
        }
        else{
          acount++;
        }
      }
     if (dcount > 1) {
 
       System.out.println("Duplicate count:"+dcount);
       System.out.println("Other count:"+acount);
     }
    if(dcount==acount){
      System.out.println("yes");
      break;
    }
    else{
      System.out.println("No");
      break;
    }
    }
  }
}