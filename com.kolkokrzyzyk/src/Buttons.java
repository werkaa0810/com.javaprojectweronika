import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Buttons extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    JButton reset;
    JButton[] button = new JButton[9];
    boolean myTurn = true;
    public Buttons(){
        for (int i = 0; i < button.length; i++){
            button[i] = new JButton("");
            button[i].addActionListener(this);
            add(button[i]);
            button[i].setBackground(Color.WHITE);
        }
        reset = new JButton("RESET");
        reset.addActionListener(this);
        reset.setBackground(Color.WHITE);
        add(reset);
        setLayout(new GridLayout(4, 3));
    }
        @Override
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            char symbol = 'X';
            if(myTurn){
            symbol = 'O';
            }
            myTurn = !myTurn;
            for (int i = 0; i < button.length; i++){
            if (source.equals(reset)) {
             button[i].setText("");
             button [i].setEnabled(true);
             button [i].setBackground(Color.WHITE);
             System.out.println("WYSZŁO");
                }

                if(source.equals(button[i])){
                    button[i].setText(""+symbol);
                    button[i].setEnabled(false);
                }
            }
            checkResult();
        
        }
        private void checkResult() {
        
        String []s = new String[9];

        for(int fi = 0; fi < 3; fi++){
            for(int i = fi*3; i < (fi*3)+3; i++){
                s[i] = button[i].getText();
            }
            int i = fi*3;
            System.out.println(i);
            if (s[i].equals(s[i+1]) && s[i].equals("")){
                button [i].setBackground(Color.GREEN);
                button [i+1].setBackground(Color.GREEN);
                button [i+2].setBackground(Color.GREEN);
            }
        }
    }
    

}
