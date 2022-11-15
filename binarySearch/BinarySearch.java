class binarySearch{

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12}; 
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length);     
    }
  
    private static int search(int[] nums, int target, int l, int h){
        if (l > h) return -1;    
        int res = (l+h)/2;
        int mid = nums[(l+h)/2];
        if (target == mid){
            return res;
        } else if(target > nums[mid]){
           res = search(nums, target, mid+1, h);    
        } else {
            res = search(nums, target, l, mid-1);
        }
        return res;
    }
    
}