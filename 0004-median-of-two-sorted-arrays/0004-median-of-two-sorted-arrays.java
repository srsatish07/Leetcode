class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index=0;
		int ar3[]=new int [nums1.length+nums2.length];
		
		for (int i = 0; i < nums1.length; i++) {
			ar3[index++]=nums1[i];
		}
		
		for (int i = 0; i < nums2.length; i++) {
			ar3[index++]=nums2[i];
		}
		Arrays.sort(ar3);
		double maidian=0;
		int n=ar3.length;
		if(n%2==0) {
			
			maidian=(ar3[n/2]+ar3[n/2-1])/2.0;
		}
		else {
			maidian=ar3[n/2];
		}
        return maidian;
    }
}