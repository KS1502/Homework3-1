public class Main {
    public static void main(String[] args) {
       int[] ints = {7,2,9,0,5};
       int max = ints[0];
       for(int i=0;i<ints.length;i++){

           if(ints[i]>max){
               max=ints[i];
           }
       }
       System.out.println("Max element is "+max);
    }
    /*Max element is 9 */

}