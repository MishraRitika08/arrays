import java.util.*;
class trappingRainwater{
    public static int rainWaterTrapped(int arr[]){

     int n=arr.length;
     int leftMax[] = new int [n] ;
     int rightMax[] = new int [n] ;
      
     //left maximum water level

     leftMax[0]= arr[0];
     for(int i=1;i<n;i++){
       leftMax[i]=Math.max(leftMax[i-1],arr[i]);
     }
     
      //right Maximum water level 

     rightMax[n-1]= arr[n-1];
     for(int i=n-2;i>=0;i--){
       rightMax[i]=Math.max(rightMax[i+1],arr[i]);
     }

     //water level at each height

     int waterLevel[] = new int [n];
     for(int i=0; i<n; i++){
      waterLevel[i]=Math.min(leftMax[i],rightMax[i]);
     }
     //trapped water

     int waterTrapped=0;
     for(int i=0; i<n; i++){
      waterTrapped+=waterLevel[i]-arr[i];
     }
    
     return waterTrapped;
    }
    public static void main(String[] args) {
        int height[]={4,2,6,1,2,7};
        System.out.println(rainWaterTrapped(height));
    }
}