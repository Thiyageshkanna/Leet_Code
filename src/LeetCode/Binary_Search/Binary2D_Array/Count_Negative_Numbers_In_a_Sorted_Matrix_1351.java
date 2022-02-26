package LeetCode.Binary_Search.Binary2D_Array;

public class Count_Negative_Numbers_In_a_Sorted_Matrix_1351 {
    public static void main(String[] args) {
        int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        //System.out.println(countNegative(grid));
        System.out.println(countNegativeUsingBinarySearch(grid));
    }
    //Binary Search Approach
    //Time Complexity - 0(m*(LogN)) or 0(row*(logcolulmn))

    static int countNegativeUsingBinarySearch(int[][] grid){
        int totalNegative=0;
        //by going through rows
        for (int rows = 0; rows < grid.length; rows++) {
            //Finding the first Negative index so we can subtract total length - first NegativeIndex
            int index=firstNegativeIndexNumber(grid,rows,0,grid[rows].length-1);
            if(index!=-1){
               totalNegative=totalNegative+(grid[rows].length-index);
            }
        }
        return totalNegative;
    }

    private static int firstNegativeIndexNumber(int[][] grid, int currRow, int start, int end) {
        //Returns the firstNegativeValueIndex
        //[-1]
        if(start==end){
            if(grid[currRow][start]<0){
                return start;// or end both are equal no problem
                //returns 0 and then 1-0=> becomes 1 negative value
            }
            else{
                return -1;
            }
        }

        int mid =start+(end-start)/2;


        //[-1,-1]
        //all elements are negative so return 0 or mid both are same
        //and in main function ot returns grid[currRow].length ==> 2 - 0= 2, so 2 negative elements

        if(mid==0 && grid[currRow][mid]<0){
            return 0; // or  mid both are same
        }
        // if the above if statement is not available means when
        //[-1,-2] => when mid is -1 value when you perform {mid-1} in the below statement it returns
        // ArrayOfBoundException

        //eg: [4,3,-1,-3]
        //when mid is in index 2 ==>-1
        if(grid[currRow][mid]<0 && grid[currRow][mid-1]>=0){
            return mid;
        }

        //eg: [4,3,-1,-3]
        //when mid is in index 3==>-1 to get back mid to -1 we are doing this.
        //to go to before element we are reducing the mid
        if(grid[currRow][mid]<0){
            return firstNegativeIndexNumber(grid,currRow,start,mid-1);
        }

        //eg: [4,3,-1,-3]
        //when mid is in index1 ==> 3  to go to next element we are increasing start
        else{
            return firstNegativeIndexNumber(grid,currRow,mid+1,end);
        }

    }


    //Linear Search Approach
    //Time Complexity - o(n)
    static int countNegativeLinearSearch(int[][] grid){
        int count=0;
        for (int rows = 0; rows < grid.length; rows++) {
            for (int col = 0; col < grid[0].length; col++) {
                if(grid[rows][col]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
