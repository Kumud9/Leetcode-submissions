class Solution {
    public int hIndex(int[] citations) {
    //     int h=0;
    //    for(int i=citations.length-1;i>=0;i--){
    //     if(citations[i]>h){
    //         h++;
    //     }else{
    //         break;
    //     }
    //    }   
    //    return h;
    int l= 0;int r = citations.length - 1;
        while (l<=r) {
            int mid = l+(r-l) / 2;
            if (citations[mid] == citations.length- mid) {
                return citations[mid];
            } else if (citations[mid] < citations.length - mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return citations.length - l;
    }
}