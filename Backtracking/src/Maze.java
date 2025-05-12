import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        Boolean[][] matrix = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        System.out.println(count(3,2));

//        path("",3,3);

//        System.out.println(pathret("",3,3));

//        System.out.println(incdiag("",3,3));

//        System.out.println(obstacles("",matrix,0,0));

        System.out.println(allpaths("",matrix,0,0));
    }
    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r,c-1);
        int left = count(r-1,c);

        return right+left ;
    }
    public static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    public static ArrayList<String> pathret(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(pathret(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(pathret(p+'R',r,c-1));
        }
        return ans ;
    }

    public static ArrayList<String> incdiag(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1 && c>1){
            ans.addAll(incdiag(p+'D',r-1,c-1));
        }
        if(r>1){
            ans.addAll(incdiag(p+'V',r-1,c));
        }
        if(c>1){
            ans.addAll(incdiag(p+'H',r,c-1));
        }
        return ans ;
    }
    public static ArrayList<String> obstacles(String p,Boolean[][] maze, int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            ArrayList<String> list = new ArrayList<>();
            return list ;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r<maze.length-1){
            ans.addAll(obstacles(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            ans.addAll(obstacles(p+'R',maze,r,c+1));
        }
        return ans ;
    }

    public static ArrayList<String> allpaths(String p,Boolean[][] maze, int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            ArrayList<String> list = new ArrayList<>();
            return list ;
        }
        maze[r][c] = false ;

        ArrayList<String> ans = new ArrayList<>();
        if(r<maze.length-1){
            ans.addAll(allpaths(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            ans.addAll(allpaths(p+'R',maze,r,c+1));
        }
        if(c>0){
            ans.addAll(allpaths(p+'L',maze,r,c-1));
        }
        if(r>0){
            ans.addAll(allpaths(p+'U',maze,r-1,c));
        }

        maze[r][c] = true;
        return ans ;
    }
}
