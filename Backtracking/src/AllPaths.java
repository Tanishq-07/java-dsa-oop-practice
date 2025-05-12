import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        Boolean[][] matrix = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[matrix.length][matrix[0].length] ;
        allPathsPrint("",matrix,0,0,path,1) ;
    }
    public static void allPathsPrint(String p, Boolean[][] maze, int r, int c,int[][]path,int step){
        if(r== maze.length-1 && c==maze[0].length-1){
            path[r][c] = step ;
            for(int[] ele : path){
                System.out.println(Arrays.toString(ele));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        if(!maze[r][c]){
            return  ;
        }
        maze[r][c] = false ;
        path[r][c] = step ;
        if(r<maze.length-1){
            allPathsPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            allPathsPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathsPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathsPrint(p+'L',maze,r,c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
