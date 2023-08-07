import java.util.*;
public class Linear_search {
    public static int Linear_search(int Numbers[],int key)
    {
        for(int i=0;i<Numbers.length;i++) {
            if (Numbers[i] == key) {
                return i;
            }
        }
            {
                return -1;
            }
        }



    public static void main(String[] args) {
        int Numbers[]={2,4,6,12,8,3,19};
        int key=8;
        int index=Linear_search(Numbers,key);
                if(index==-1)
                {
                    System.out.println("Not found");
                }
                else
                {
                    System.out.println("Key found at index : "+index);
                }
    }
}
