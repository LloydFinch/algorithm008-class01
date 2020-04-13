学习笔记

1 移动0到末尾思想：
    属于”不是就是“的类型，如果是，把是的取出来，剩下的肯定不是，然后得到是和不是的边界就行。
    具体就是一个数组的元素，要么是0，要么不是0，先统计是0的元素有几个，这里统计为index个，剩下的就是不是0的，然后是0的元素从头开始，那么从index开始就是不是0的元素了。
    所以伪代码很容易就是:
    int index = 0;
    //统计几个非0元素，如果不是0，从头开始放，0 - index-1就是非0元素
    for (int i = 0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[index] = nums[i];
            index++;
        }
    }

    //剩下的肯定是0，index - nums.length-1就是0元素，直接设置即可
    for(int i = index;i<nums.length;i++>){
        nums[i]=0;
    }
2 移动0可以联想到快速排序思想，可以选择0作为pivot，然后将所有不是0的(小于pivot的)移动到0的左边
    int pivot = 0;
    int leftIndex = 0;
    for(int i = 0;i<nums.length;i++){
        if(nums[i]!=pivot){
            //交换枢纽元
            swap(nums,leftIndex,i);
            //移动左边界
            leftIndex++;
        }
    }