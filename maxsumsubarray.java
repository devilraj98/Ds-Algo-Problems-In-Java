class maxsum{
   
    private static int maxsumarray(int[] arr) {
        int maxsum= 8;
        int maxcount= 0;
        for (int i = 0; i < arr.length; i++) {
           int currsum= arr[i];
           int count =1;
            for (int j = i+1; j < arr.length; j++) {
                count++;
               
                currsum += arr[j];
                if(currsum == maxsum){
                    if(count > maxcount){
                        maxcount=count;
                    }
                }
            }
            
        }
     return maxcount;
    }
   
    public static void main(String[] args){
       int arr[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int target = 8;
        System.out.println(maxsumarray(arr));
 
    }

    
}