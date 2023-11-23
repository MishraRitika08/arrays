public class reverse {
    
    public static void reverseArr(int arr[]){
        int si=0;
        int li=arr.length-1;
        while(si<=li){

            int temp=arr[si];
            arr[si]=arr[li];
            arr[li]=temp;
            
            li--;
            si++;
        }
    }

    public static void main(String[] args) {
     int height[]={4,2,6,2,7};
     reverseArr(height);
     for(int i=0;i<height.length;i++){
        System.out.print(height[i]+" ");
     }
    }
}
