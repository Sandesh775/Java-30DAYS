public class Code06 {
    public static void main(String[] args){
        int [] a = {1,2,5,4,3};
        int x = 3;
        boolean isFound = false;
        for(int i = 0; i<a.length; i++){
            if(a[i] == x){
                isFound = true;
                System.out.println(x+" is found in array : ");
                System.out.println("Index position : a["+i+"]");
            }
        }
        if(!isFound){
            System.out.println("-1 ! Not found :-)");
        }
    }
}
