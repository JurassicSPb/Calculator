package jr.calc;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by spbw0-rep6 on 25.07.2016.
 */
public class Calculator extends JFrame {
//    implements ActionListener.
    private JPanel panel;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private JButton plus, minus, multiplication, division, equal;
    private JButton point, sqrt, percent, negative;
    private JButton ce;
    private JTextField text;

    public Calculator (String s){
    super (s);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setDefaultLookAndFeelDecorated(true);
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBorder(new LineBorder(Color.BLACK, 3));
    setContentPane(panel);
    setSize(276, 292);
    setResizable(false);
    text = new JTextField();
    text.setSize(192, 50);
    text.setLocation(15, 12);
    Font font = new Font("SansSerif", Font.BOLD, 24);
    Font fontButton = new Font("SansSerif", Font.BOLD, 19);
    text.setFont(font);
    text.setHorizontalAlignment(JTextField.RIGHT);
    text.setBorder(new LineBorder(Color.black, 1));
    text.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE) || (text.getText().length()>12)){
                e.consume();
            }
    }
    });
    panel.add (text);
    Border line = LineBorder.createBlackLineBorder();
    Border bevel = BorderFactory.createRaisedBevelBorder();
    Border compound = new CompoundBorder(bevel, line);
    b7 = new JButton("7");
    b7.setSize(45, 40);
    b7.setLocation(12, 72);
    b7.setBorder(compound);
    b7.setFont(fontButton);
    panel.add(b7);
    b8 = new JButton("8");
    b8.setSize(45, 40);
    b8.setLocation(62, 72);
    b8.setBorder(compound);
    b8.setFont(fontButton);
    panel.add(b8);
    b9 = new JButton("9");
    b9.setSize(45,40);
    b9.setLocation(112, 72);
    b9.setBorder(compound);
    b9.setFont(fontButton);
    panel.add(b9);
    division = new JButton("/");
    division.setBackground(Color.CYAN);
    division.setSize(45,40);
    division.setLocation(162,72);
    division.setBorder(compound);
    division.setFont(fontButton);
    panel.add(division);
    b4 = new JButton("4");
    b4.setSize(45,40);
    b4.setLocation(12, 118);
    b4.setBorder(compound);
    b4.setFont(fontButton);
    panel.add(b4);
    b5 = new JButton("5");
    b5.setSize(45,40);
    b5.setLocation(62, 118);
    b5.setBorder(compound);
    b5.setFont(fontButton);
    panel.add(b5);
    b6 = new JButton("6");
    b6.setSize(45,40);
    b6.setLocation(112, 118);
    b6.setBorder(compound);
    b6.setFont(fontButton);
    panel.add(b6);
    multiplication = new JButton("*");
    multiplication.setBackground(Color.CYAN);
    multiplication.setSize(45,40);
    multiplication.setLocation(162, 118);
    multiplication.setBorder(compound);
    panel.add(multiplication);
    sqrt= new JButton("");
    b1 = new JButton("1");
    b1.setSize(45,40);
    b1.setLocation(12, 164);
    b1.setBorder(compound);
    b1.setFont(fontButton);
    panel.add(b1);
    b2 = new JButton("2");
    b2.setSize(45,40);
    b2.setLocation(62, 164);
    b2.setBorder(compound);
    b2.setFont(fontButton);
    panel.add(b2);
    b3 = new JButton("3");
    b3.setSize(45,40);
    b3.setLocation(112, 164);
    b3.setBorder(compound);
    b3.setFont(fontButton);
    panel.add(b3);
    b0 = new JButton("0");
    b0.setSize(95,40);
    b0.setLocation(12, 210);
    b0.setBorder(compound);
    b0.setFont(fontButton);
    panel.add(b0);
    point = new JButton(",");
    point.setSize(45,40);
    point.setLocation(112, 210);
    point.setBorder(compound);
    point.setFont(fontButton);
    panel.add(point);
    minus = new JButton("-");
    minus.setBackground(Color.CYAN);
    minus.setSize(45,40);
    minus.setLocation(162, 164);
    minus.setBorder(compound);
    minus.setFont(fontButton);
    panel.add(minus);
    percent = new JButton("%");
    percent.setSize(45,40);
    percent.setLocation(212, 164);
    percent.setBorder(compound);
    percent.setFont(fontButton);
    panel.add(percent);
    plus = new JButton("+");
    plus.setBackground(Color.CYAN);
    plus.setSize(45,40);
    plus.setLocation(162, 210);
    plus.setBorder(compound);
    plus.setFont(fontButton);
    panel.add(plus);
    equal = new JButton("=");
    equal.setBackground(Color.CYAN);
    equal.setSize(45,40);
    equal.setLocation(212, 210);
    equal.setBorder(compound);
    equal.setFont(fontButton);
    panel.add(equal);


    }

}
