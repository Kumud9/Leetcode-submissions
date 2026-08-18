class Solution {
    String ans = "";
    public String largestTimeFromDigits(int[] arr) {
        boolean [] used= new boolean[4];
        func(arr,used,"");
        if(ans.equals(""))return "";

        return ans.substring(0,2)+ ":" +ans.substring(2);
    }
    void func(int [] arr, boolean [] used, String time){
     
     if(time.length()==4){
        int hr= Integer.parseInt(time.substring(0,2));
        int min= Integer.parseInt(time.substring(2,4));

        if(hr<24  && min<60){
             if (ans.equals("") || time.compareTo(ans) > 0) ans=time;
        }
        return;
     }
     for(int i=0;i<4;i++){
        if(used[i])continue;
        used[i]= true;
        func(arr,used,time+arr[i]);
        used[i]= false;
     }
    }
}