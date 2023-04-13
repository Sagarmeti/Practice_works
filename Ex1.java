class Ex1{
 public static void main(String args[]){

  String str="hi im sagar hi hello hi";
  int max=0;
  String words[]=str.split(" ");
  int count=1;
  String word=null;

  for(int i=0;i<words.length;i++){
    for(int j=i+1;j<words.length;j++){

    if(words[i].equals(words[j])){
      count=count+1;
      words[j]=" ";
    }
    
  }
  if(max<count){
    max=count;
    word=words[i];
  }
  
  count=1;
  }
   System.out.println("Highest frequency word is "+word+ " and it appeared "+max+" times");
}
}