public class Code04 {
    public static void main(String[] args) {
        int[]a = {5,5,2,3,2,2,1,1,1,1};
        int frequency = 1;
        int visited = -1;
        int[]visitedArr = new int[a.length];
        for( int i = 0; i < a.length; i++){
            if(visitedArr[i] == visited) {
                continue;
            }
            frequency = 1;
            for( int j = i+1; j<a.length; j++){// we are counting frequency of first occurence and avoiding duplicates !
                if( a[i] == a[j]){
                    frequency++;
                    visitedArr[j] = visited;
                }
            }
            visitedArr[i] = frequency;
//            if(visitedArr[i] != visited){
//                visitedArr[i] = frequency;
//            }
        }
        for(int i = 0; i<a.length; i++){
            if(visitedArr[i] != visited){
                System.out.println("Number : "+a[i]+" frequency : "+visitedArr[i]);
            }
        }
    }
}