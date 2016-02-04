import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;


public static boolean isPalindrome(String word) {
      if(word.equals("")) { return false; } // if its an empty string it doesnt count
      
      // ignore case
      word = word.toLowerCase();
      
      // will hold the word minus all of the puncuation
      String newWord = "";
      
      // loops through the word and adds each character to newWord only if it is a digit 
      for(int i=0; i<word.length(); i++) {
         
         if(Character.isLetterOrDigit(word.charAt(i))) {
            newWord += "" + word.charAt(i);
         }
      
      }

      //holds reversed word
      String reversed = "";
      
      // loops through new word and adds letter starting from end to the word
      for(int i=0; i<newWord.length(); i++) {
         reversed+="" + newWord.charAt(newWord.length()-1-i);
      }
      
      // if the original and reversed word are Palindromes, compareTo will be 0, thus returning true
      return (newWord.compareTo(reversed) == 0);
   }


  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    boolean palindrome = isPalindrome(str);
    
    if(palindrome) {
      str = "Is a palindrome!";
    } else {
      str = "Not a palindrome.";
    }

    result.setText(str);
    input.selectAll();
  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

