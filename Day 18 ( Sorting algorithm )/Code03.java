public class Code03 {
    public static void main(String[] args){
        int[] a = {2,12,34,5,6,7};

        boolean isAscending = true;
        boolean isDescending = true;

        // Check in ONE loop
        for(int i = 1; i < a.length; i++) {
            if(a[i] > a[i-1]) {
                // Current > Previous → could be ascending
                isDescending = false;
            } else if(a[i] < a[i-1]) {
                // Current < Previous → could be descending
                isAscending = false;
            }
            // If equal, both could still be true
        }

        // Determine result
        if(isAscending) {
            System.out.println("Sorted in Ascending order");
        } else if(isDescending) {
            System.out.println("Sorted in Descending order");
        } else {
            System.out.println("Not sorted!");
        }
    }
}