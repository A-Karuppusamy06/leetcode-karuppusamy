// Last updated: 9/14/2026, 8:20:52 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int arr[][]=new int[n][n];
4        int num=1,sr=0,sc=0,er=n-1,ec=n-1;
5        while(sr<=er&&sc<=ec){
6           
7            for(int j=sc;j<=ec;j++){
8                arr[sr][j]=num;
9                num++;
10            }
11            sr++;
12       
13            for(int i=sr;i<=er;i++){
14                arr[i][ec]=num;
15                num++;
16            }
17            ec--;
18            if(sr<=er){
19     
20            for(int j=ec;j>=sc;j--){
21                arr[er][j]=num;
22                num++;
23            }
24            er--;
25            }
26       
27            if(sc<=ec){
28            for(int i=er;i>=sr;i--){
29                arr[i][sc]=num;
30                num++;
31            }
32            sc++;
33            }
34        }
35        return arr;
36    }
37}