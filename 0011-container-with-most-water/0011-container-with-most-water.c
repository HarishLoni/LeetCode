int maxArea(int* height, int heightSize) {
    
    int left=0;
    int right=heightSize-1;
    int maxarea=0;
    
    while(left<right){
        int area=(height[left]<height[right] ? height[left] : height[right]) * (right-left);
        maxarea=(area>maxarea) ? area : maxarea;
        
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
    }
    return maxarea;
}