/*
* Static Printing pattern :
* """""""
 *     * * * *
 *     *
 *     *
 * * * * * * *
       *     *
       *     *
 * * * *     *
 * """"""
 * */
public class Code02 {
    public static void main(String[] args){
        int n = 7;
        for( int row = 1; row <= n; row++){
            for(int col = 1; col <= 7; col++){
                if(row == 1 || col == n || col == 1 || row ==n || row == (n/2)+1 || col == (n/2)+1){
                    if(col==1 && (row==5 || row==6)||row==1 &&(col==2 || col==3)||row==n &&(col==5 || col==6)||(col==n && (row==2 || row==3))){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                    }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
* Alternative :
* public class Swastikapattern{
    public static void main(String[] args) {
       for(int i=1;i<=7;i++){
         for(int j=1;j<=7;j++){
           if((j==4)||(i==4)||(j==0&&i<=2)||(i==0&&j>=4)||(i==6&&j<=2)||(j==6&&i>=4)){
             System.out.print("*"+" ");
           }
           else{
             System.out.print("  ");
           }
         }
         System.out.println();
       }
    }
}*/