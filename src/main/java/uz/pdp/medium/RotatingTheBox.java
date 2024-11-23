package uz.pdp.medium;

import java.util.Arrays;

//1861. Rotating the Box
//        Medium
//Topics
//        Companies
//Hint
//You are given an m x n matrix of characters box representing a side-view of a box. Each cell of the box is one of the following:
//
//A stone '#'
//A stationary obstacle '*'
//Empty '.'
//The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.
//
//It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.
//
//Return an n x m matrix representing the box after the rotation described above.
public class RotatingTheBox {
        public char[][] rotateTheBox(char[][] box) {
            int m = box.length, n = box[0].length;
            char ans[][] = new char[n][m];
            for(char d[] : ans)
                Arrays.fill(d, '.');


            for(int i=0; i<m; i++)
            {
                int minIndex  = n-1;
                for(int j=n-1; j>=0; j--)
                {
                    if(box[i][j]=='#')
                    {
                        ans[minIndex][m-i-1] = '#';
                        minIndex--;
                    }
                    if(box[i][j]=='*')
                    {
                        minIndex = j-1;
                        ans[j][m-i-1] = '*';
                    }
                }
            }
            return ans;
        }

}
