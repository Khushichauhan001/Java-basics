// nahi show horha h  complete code at (12:34:10) to ()

import javax.swing.*;
 class LoginScreen extends JFrame
{
    LoginScreen(String s1)
    {
      super(s1); // jb child ka object bnaya jata h to child class ka constuctor chlta h or wo super ko likh k parent ka constructor chalata h 
    }
    LoginScreen()
    {
    
    }
    void setComponents()
    {
        JLabel l1 = new JLabel("welcome");
        add(l1);
        setLayout(null);
        l1.setBounds(200, 200, 100 , 30);
    }
    public static void main(String[] args) {
        // JFrame j1 = new JFrame("welcome to here");
        // j1.setSize(500,500);
        // j1.setVisible(true);
        // j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginScreen s1 = new LoginScreen("welcome to khushi chauhan");  
        s1.setVisible(true);
        s1.setSize(600,600);
        s1.setComponents();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
