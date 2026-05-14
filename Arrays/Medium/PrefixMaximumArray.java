public class PrefixMaximumArray {
    public static void main(String[] args) {
        int [] input = {3, 1, 4, 2, 5};
        System.out.println("Array : ");
        for( int i: input){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        int max = input[0];
        //boolean isPrefixMaxUpdate = false;
//        for(int i = 1; i< input.length ; i++){// we know at index 0 it is maximum value until
//            //isPrefixMaxUpdate = false;
//            for(int j = 1; j<=i ; j++){
//                if(input[j]>max){
//                    max = input[j];
//                    //isPrefixMaxUpdate = true;
//                }
//            }
////            if(isPrefixMaxUpdate){
////                input[i] = max;
////            }
//            input[i] = max;
//        }
        for( int i = 1; i< input.length ; i++){
            if(input[i]>max){
                max = input[i];
            }
            input[i] = max;
        }
        System.out.println("Prefix maximum array : ");// using original array updated !
        for( int i: input){
            System.out.print(i+" ");
        }
    }
}