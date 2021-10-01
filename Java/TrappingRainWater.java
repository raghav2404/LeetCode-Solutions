class Solution {
    public int trap(int[] height) {
            int len=height.length;
            if(len==0)
                    return 0;
            int lmax[]=new int[len];
            int rmax[]=new int[len];
            lmax[0]=height[0];
            rmax[len-1]=height[len-1];
            int res=0;
            for(int i=1;i<len;i++)
            lmax[i]=Math.max(height[i],lmax[i-1]);
            for(int i=len-2;i>=0;i--)
                    rmax[i]=Math.max(height[i],rmax[i+1]);
        for(int i=0;i<len;i++)
               res=res+(Math.min(lmax[i],rmax[i])-height[i]);
        return res;
}
