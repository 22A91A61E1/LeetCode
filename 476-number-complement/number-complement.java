class Solution {
    public int findComplement(int num) {
      String a=Integer.toBinaryString(num);
      String str="";
      for(int i=0;i<a.length();i++)
      {
        if(a.charAt(i)=='0')
        {
            str=str+"1";
            
        }
        else{
            str=str+"0";
            
        }
      }
       return Integer.parseInt(str,2);
    }
}