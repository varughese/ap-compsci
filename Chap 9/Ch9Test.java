public class Ch9Test {

   // NUMBER 1
   public static int randomChooser(int[] arr) {
      return arr[(int)(Math.random() * arr.length)];
   }
   
   // NUMBER 2
   public static int[] fibonacci(int n) {
      int[] f = new int[n];
      f[0] = 1;
      f[1] = 1;
      
      for(int i=2; i<n; i++) {
         f[i] = f[i-1] + f[i-2];
      }
      
      return f;
   }
   
   // NUMBER 4   
   public static void printMultipleOccurences(char[][] grid) {
      int counter = 0;
      
      for(int r = 0; r<grid.length; r++) {
         for(int c = 0; c<grid[0].length; c++) {
            
            char currentChar = grid[r][c];
            int rCount = 0;
            int cCount = 0;
            
            for(int searchCol = 0; searchCol<grid[0].length; searchCol++) {
               if(currentChar == grid[r][searchCol]) {
                  rCount++;
               }
               
              // System.out.println("ROW: " + r + " COL: " + searchCol + " CHAR: " + grid[r][searchCol] + " RCOUNT" + rCount);
               

            }
            
            for(int searchRow = 0; searchRow<grid.length; searchRow++) {
               if(currentChar == grid[searchRow][c]) {
                  cCount++;
               }
            }
            
            if(rCount >= 3 && cCount >= 3) {
               System.out.println("ROW: " + r + " COL: " + c + " CHAR: " + grid[r][c]);
            }
            
         }
         
      }
   }
   
   // NUMBER 5
   public static void compact(String[] lines) {
		int insertIndex = 0;
		
		for(String s:lines) {
			if(s.trim().equals("")) {
				continue;
			} else {
				lines[insertIndex] = s.trim();
            insertIndex++;
			}			
		}
		
		for(int i = insertIndex; i < lines.length; i++) {
			lines[i] = "";
		}
	
   }
   
   // NUMBER 6
   
   public static int[][] makeMagicSquare(int n) {
      int[][] arr = new int[n][n];
      
      
      int r = 0; int c = n/2; arr[r][c]=1; int fill = 2;
      
      while(fill <= n*n) {         
         int nxtR = r - 1, nxtC = c + 1;
         
         if(nxtR < 0) {
            nxtR = n-1;
         }
                 
         if(nxtC >= n) {
            nxtC = 0;
         }      
         
         if(arr[nxtR][nxtC] != 0) {
            nxtR = r + 1;
            nxtC = c;
         }
                  
         arr[nxtR][nxtC] = fill;
         
         r= nxtR; c=nxtC;
         
         fill++;
      }
      
      return arr;
   }
   
   public static void printArr(int[][] arr) {
      for(int[] r : arr) {
         for(int c : r) {
            System.out.printf("%3d", c);
         }
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      
      /*
      int[] arr = fibonacci(50);
      for(int n : arr) {
         System.out.print(n + " ");
      }
      System.out.println("\n\n");
      
      
      System.out.println(randomChooser(arr));
      
      
      String[] lines = {"   ONe ", " as ", "\t", "   ", " ","     two "};    
 		
 		compact(lines);
 		
       for(String s : lines) {
 			System.out.println(s);
 		}
      System.out.println("\n\n");
      
      char[][] grid = {
       {'A','A','A','B'},
       {'A','A','C','B'},
       {'C','B','B','B'},
       {'A','A','C','B'}};

      
      printMultipleOccurences(grid);
      System.out.println("\n\n");
      */
      
      int[][] m = makeMagicSquare(3);
      
      printArr(m);
      
   }
}