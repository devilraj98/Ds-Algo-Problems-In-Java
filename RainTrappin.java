class RainTrapping{
  
    private static int rainTrapping(int[] arr) {
       int trappedRain = 0; 
        for(int i=1; i<arr.length; i++) {
           int nextMax = arr[i];
           int prevMax = arr[i];
            for(int k=i+1; k < arr.length; k++) {
              if( arr[k] > nextMax ){
                  nextMax = arr[k];
              }
            }


            for(int j=i-1; j>=0;j--) {
                if(arr[j] > prevMax){
                    prevMax = arr[j];
                }
            }
        
            trappedRain = trappedRain + Math.min(nextMax, prevMax)-arr[i];
    
    }
    return trappedRain;
}
  
    public static void main(String[] args){
     int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
     System.out.println(rainTrapping(arr));

    }

   
}