class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++){
            int j = i+1;
            int largest = arr[j];
            for(int k = j; k <  arr.length; k++){
                if(arr[k] > largest ){
                    largest = arr[k];
                }
            }
            arr[i] = largest;
        }
        arr[arr.length -1] = -1;
        return arr;
    }
}
