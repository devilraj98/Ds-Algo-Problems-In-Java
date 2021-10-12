public class reverseInt {

    private static void reversInt(int x) {
    
        // // if(x<0){
        // //     System.out.print("-");
        // // }
        // String s = Integer.toString(x);
        // String ans = "";
        // for (int i=s.length()-1;i>=0; i--) {
           
        //     ans =ans+ s.charAt(i);
          

        // }  System.out.print(ans);   
        
        int rev =0;
        while(x!=0){
            int digit = x %10;
            rev = rev*10 +digit;
            x = x/10;

        }
        System.out.println(rev);
    
    }
    public static void main(String[] args){
       int x = -123;
       reversInt(x);
    }

   
    
}
