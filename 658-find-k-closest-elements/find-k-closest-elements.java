class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int start = 0;
        int end = arr.length - k;
        
        while(start<end){
            int middle = start + (end-start)/2;
            
            if(x-arr[middle]>arr[middle+k]-x){
                start = middle + 1;
            }
            else{
                end = middle;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = start; i < start + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}