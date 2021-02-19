import java.swing.Jframe;

public class Frame extends JFrame{
    private static final long serialVersionUID = 1L;
    public Frame (){
        super("Kolko i krzyzyk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOUSE);
        setSize(300,400);
        setLocation(700,100);
        setVisible(true);
    }

}
