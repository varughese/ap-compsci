public int findBestFit(int size1, int size2, int space) 
{
   int current = 0;
   
   if(size1 > space && size2 > space) {
      current = 0;
   } else if(size1 < space && size2 > space) {
      current = 1;
   } else if(size1 > space && size2 < space) {
      current = 2;
   } else if(size1 + size2 < space) {
      current = 3;
   }
   
   return current;
}