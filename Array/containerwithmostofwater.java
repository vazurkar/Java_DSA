package Array;

public class containerwithmostofwater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int i=0;
        int j=height.length-1;
        int width=0;
        int area=0;
        int max=0;
        while(i<j){
            width = j-i;
            area = width * Math.min(height[i], height[j]);
            if(max < area){
                max = area;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(max);
    }
}
