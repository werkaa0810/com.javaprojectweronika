import javax.swing.*;
import javax.swing.JPanel;

public class Frame extends JFrame{
    private static final long serialVersionUID = 1L;
    public Frame(){
        super("Kolko i krzyzyk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setLocation(700,100);
       
        
        JPanel buttonsPanel = new Buttons();
        add(buttonsPanel);

        setVisible(true);
    }

}
