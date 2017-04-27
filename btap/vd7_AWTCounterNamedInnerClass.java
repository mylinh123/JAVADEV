import java.awt.*;
import java.awt.event.*;
 
public class AWTCounterNamedInnerClass extends Frame {
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   public AWTCounterNamedInnerClass () {
      setLayout(new FlowLayout()); 
      add(new Label("Counter"));    
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);    
      add(tfCount);                
 
      btnCount = new Button("Count");
      add(btnCount);               
 
      // Construct an anonymous instance of BtnCountListener (a named inner class).
      // btnCount adds this instance as a ActionListener.
      btnCount.addActionListener(new BtnCountListener());
 
      setTitle("Đếm - AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounterNamedInnerClass(); // Let the constructor do the job
   }
 
   /**
    * BtnCountListener is a "named inner class" used as ActionListener.
    * This inner class can access private variables of the outer class.
    */
   private class BtnCountListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
         ++count;
         tfCount.setText(count + "");
      }
   }
}