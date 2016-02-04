public class Book extends Text 
{
   public String author;

   public Book(int w, String a) {


      super(w);
  
      System.out.println("BOOK CONSTRUCTOR FUNCTION");    
      author = a;
      
System.out.println("BOOK CONSTRUCTOR : super called author set");
   }
   
   public void writtenBy() {
      System.out.print(author + " wrote this book");
   }
   
}