public class Code05 {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3};
        int[] visitedArr = new int[a.length];
        int visited = -1;
        int frequency;
        for( int i = 0; i<a.length; i++){
            if(visitedArr[i] == visited){
                continue;
            }
            frequency = 1;
            for( int j = i+1; j<a.length; j++){
                if( a[i] == a[j]){
                    frequency++;
                    visitedArr[j] = visited;
                }
            }
            visitedArr[i] = frequency;
        }
        // finding majority element (appears more than n/2 times)
        double majority = a.length/2.0;
        int majorityIndex = 0;
        boolean isMajority = false;
        for(int i = 0; i<visitedArr.length; i++){
            if(visitedArr[i]>majority){
                isMajority = true;
                majorityIndex = i;
            }
        }
        if(isMajority){
            System.out.println("Majority number in array : "+a[majorityIndex]+" with frequency : "+visitedArr[majorityIndex]);
        }
        else{
            System.out.println("Majority element doesn't exist the array contains multiple elements with tied frequencies.");
        }
    }
}