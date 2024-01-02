 class encoding {
public static void main(String[] args) {
    
    int f=getLengthOfOptimalCompression("aabaabbcbbbaccc",6);
    System.out.println(f);

}

    public static int getLengthOfOptimalCompression(String s, int k) {
    
    String encode="",e="";int c=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(!(encode.contains(String.valueOf(ch))))
        {for(int j=0;j<s.length();j++)
            if(ch==s.charAt(j)) c++;

         if(c>1) e=String.valueOf(ch)+String.valueOf(c);
         else e=String.valueOf(ch);
         encode=encode+e;   
        }
        c=0;e="";
    }
    System.out.println(encode);
    if(k==0)
      return encode.length();
   else return encode.length()-k;
        
    }
}

