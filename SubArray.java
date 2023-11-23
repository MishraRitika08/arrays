public class SubArray {

  public static int kadansAlgo(int arr[]) {

    int ms=Integer.MIN_VALUE;
    int cs=0;

    for(int i=0;i<arr.length;i++){
        cs=cs+arr[i];

        if(cs<0){
            cs=0;
        }

        ms=Math.max(cs,ms);
    }
    return ms;
    
    }
  
    public static void main(String[] args) {
        int height[]={1,3,4,7};
      System.out.println(kadansAlgo(height));
    }
}
