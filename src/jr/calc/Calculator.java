package jr.calc;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionListener;

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
    setSize(240, 330);
    text = new JTextField();
    text.setSize(200, 50);
    text.setLocation(17, 10);
    Font font = new Font("SansSerif", Font.BOLD, 24);
    text.setFont(font);
    text.setHorizontalAlignment(JTextField.RIGHT);
    text.setBorder(new LineBorder(Color.black, 1));
    panel.add (text);
    Border line = LineBorder.createBlackLineBorder();
    Border bevel = BorderFactory.createRaisedBevelBorder();
    Border compound = new CompoundBorder(bevel, line);
    b7 = new JButton("7");
    b7.setSize(45, 40);
    b7.setLocation(12, 72);
    b7.setBorder(compound);
    panel.add(b7);
    b8 = new JButton("8");
    b8.setSize(45, 40);
    b8.setLocation(62, 72);
    b8.setBorder(compound);
    panel.add(b8);
    b9 = new JButton("9");
    b9.setSize(45,40);
    b9.setLocation(112, 72);
    b9.setBorder(compound);
    panel.add(b9);
    division = new JButton("/");
    division.setSize(45,40);
    division.setLocation(162,72);
    division.setBorder(compound);
    panel.add(division);
    b4 = new JButton("4");
    b4.setSize(45,40);
    b4.setLocation(12, 118);
    b4.setBorder(compound);
    panel.add(b4);
    b5 = new JButton("5");
    b5.setSize(45,40);
    b5.setLocation(62, 118);
    b5.setBorder(compound);
    panel.add(b5);
    b6 = new JButton("6");
    b6.setSize(45,40);
    b6.setLocation(112, 118);
    b6.setBorder(compound);
    panel.add(b6);
    multiplication = new JButton("*");
    multiplication.setSize(45,40);
    multiplication.setLocation(162, 118);
    multiplication.setBorder(compound);
    panel.add(multiplication);
    b1 = new JButton("1");
    b1.setSize(45,40);
    b1.setLocation(12, 164);
    b1.setBorder(compound);
    panel.add(b1);
    b2 = new JButton("2");
    b2.setSize(45,40);
    b2.setLocation(62, 164);
    b2.setBorder(compound);
    panel.add(b2);
    b3 = new JButton("3");
    b3.setSize(45,40);
    b3.setLocation(112, 164);
    b3.setBorder(compound);
    panel.add(b3);
    b0 = new JButton("0");
    b0.setSize(95,40);
    b0.setLocation(12, 210);
    b0.setBorder(compound);
    panel.add(b0);
    point = new JButton(",");
    point.setSize(45,40);
    point.setLocation(112, 210);
    point.setBorder(compound);
    panel.add(point);

    }

}
