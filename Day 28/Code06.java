public class Code06 {
    public static void main(String[] args) {
        int[] a = { 1,2,3,3,1,2,1};
        boolean isFirst = false;
        for( int i = 0; i<a.length; i++){
            for( int j  = i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println("Here we got the first repeating element in an array : Value : "+a[i]+" Original value index : ["+i+"]");
                    System.out.println("Second occurence index : ["+j+"]");
                    isFirst = true;
                }
                if(isFirst) {
                    System.out.print("Other remaining Duplicate value index : ");
                    for (int l = j + 1; l < a.length; l++) {
                        if (a[j] == a[l]){
                            System.out.print("["+l+"]");
                        }
                    }
                    return;
                }
            }
        }
    }
}
/*
* public class Code06 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3, 1, 2, 1 };
        boolean found = false;

        // Find the first repeating element
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    // Found the first repeating element
                    int repeatingValue = a[i];
                    int firstIndex = i;

                    System.out.println("First repeating element: " + repeatingValue);
                    System.out.println("First occurrence index: [" + firstIndex + "]");
                    System.out.println("Second occurrence index: [" + j + "]");

                    // Find and print all remaining indices of this value
                    System.out.print("All other indices with same value: ");
                    boolean otherFound = false;

                    for (int k = j + 1; k < a.length; k++) {
                        if (a[k] == repeatingValue) {
                            System.out.print("[" + k + "] ");
                            otherFound = true;
                        }
                    }

                    if (!otherFound) {
                        System.out.print("None");
                    }

                    System.out.println(); // New line
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No repeating elements found");
        }
    }
}*/