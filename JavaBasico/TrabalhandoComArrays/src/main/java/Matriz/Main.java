package Matriz;

public class Main {
    public static void main(String[] args){
        int[] away = {12,32,45,50,87,43,42};
        for(int i = 0; i < away.length; i++){
            System.out.println("FOI!");
        }

        int[][] multiAway = {{12,32,43},{5,6,8}};
        for(int i = 0; i<multiAway.length; i++){
            for(int j = 0; j<multiAway[i].length; ++j){
                System.out.println(multiAway[i][j]);
            }
        }
    }
}
