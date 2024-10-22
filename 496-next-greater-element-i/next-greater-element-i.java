class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] newarray = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean found = false;
            int maximum = -1;
            for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                     found = true;
                 }
                 if(found){
                     for(int k=j;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            maximum = nums2[k];
                            break;
                        }
                     }
                     break;
                 }
            }
                newarray[i] = maximum;
        }
        return newarray;

    }
}