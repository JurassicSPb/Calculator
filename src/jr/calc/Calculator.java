package jr.calc;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by spbw0-rep6 on 25.07.2016.
 */
public class Calculator extends JFrame implements ActionListener{
    private JPanel panel;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private JButton plus, minus, multiplication, division, equal;
    private JButton point, sqrt, percent, negative, backspace;
    private JButton ce;
    private JTextField text;

    public Calculator (String s) {
        super(s);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setFocusable(true);
        setContentPane(panel);
        setSize(326, 292);
        setResizable(false);
        text = new JTextField();
        text.setSize(291, 50);
        text.setLocation(15, 12);
        Font font = new Font("SansSerif", Font.BOLD, 24);
        Font fontButton = new Font("SansSerif", Font.BOLD, 19);
        text.setFont(font);
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setBorder(new LineBorder(Color.black, 1));
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
                panel.requestFocus();
            }
        });
        text.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent m) {
                m.consume();
                panel.requestFocus();
            }
        });
        panel.add(text);
        Border line = LineBorder.createBlackLineBorder();
        Border bevel = BorderFactory.createRaisedBevelBorder();
        Border compound = new CompoundBorder(bevel, line);
        Border lowered = new SoftBevelBorder(BevelBorder.LOWERED);
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
        b9.setSize(45, 40);
        b9.setLocation(112, 72);
        b9.setBorder(compound);
        b9.setFont(fontButton);
        panel.add(b9);
        division = new JButton("/");
        division.setBackground(Color.CYAN);
        division.setSize(45, 40);
        division.setLocation(162, 72);
        division.setBorder(compound);
        division.setFont(fontButton);
        panel.add(division);
        negative = new JButton("±");
        negative.setSize(45, 40);
        negative.setLocation(212, 72);
        negative.setBorder(compound);
        negative.setFont(fontButton);
        panel.add(negative);
        ce = new JButton("C");
        ce.setSize(45, 85);
        ce.setLocation(262, 72);
        ce.setBorder(compound);
        ce.setFont(fontButton);
        ce.setBackground(Color.ORANGE);
        panel.add(ce);
        b4 = new JButton("4");
        b4.setSize(45, 40);
        b4.setLocation(12, 118);
        b4.setBorder(compound);
        b4.setFont(fontButton);
        panel.add(b4);
        b5 = new JButton("5");
        b5.setSize(45, 40);
        b5.setLocation(62, 118);
        b5.setBorder(compound);
        b5.setFont(fontButton);
        panel.add(b5);
        b6 = new JButton("6");
        b6.setSize(45, 40);
        b6.setLocation(112, 118);
        b6.setBorder(compound);
        b6.setFont(fontButton);
        panel.add(b6);
        multiplication = new JButton("*");
        multiplication.setBackground(Color.CYAN);
        multiplication.setSize(45, 40);
        multiplication.setLocation(162, 118);
        multiplication.setBorder(compound);
        panel.add(multiplication);
        sqrt = new JButton("√");
        sqrt.setSize(45, 40);
        sqrt.setLocation(212, 118);
        sqrt.setBorder(compound);
        panel.add(sqrt);
        b1 = new JButton("1");
        b1.setSize(45, 40);
        b1.setLocation(12, 164);
        b1.setBorder(compound);
        b1.setFont(fontButton);
        b1.addActionListener(this);
        panel.add(b1);
        b2 = new JButton("2");
        b2.setSize(45, 40);
        b2.setLocation(62, 164);
        b2.setBorder(compound);
        b2.setFont(fontButton);
        panel.add(b2);
        b3 = new JButton("3");
        b3.setSize(45, 40);
        b3.setLocation(112, 164);
        b3.setBorder(compound);
        b3.setFont(fontButton);
        panel.add(b3);
        b0 = new JButton("0");
        b0.setSize(95, 40);
        b0.setLocation(12, 210);
        b0.setBorder(compound);
        b0.setFont(fontButton);
        panel.add(b0);
        point = new JButton(",");
        point.setSize(45, 40);
        point.setLocation(112, 210);
        point.setBorder(compound);
        point.setFont(fontButton);
        panel.add(point);
        minus = new JButton("-");
        minus.setBackground(Color.CYAN);
        minus.setSize(45, 40);
        minus.setLocation(162, 164);
        minus.setBorder(compound);
        minus.setFont(fontButton);
        panel.add(minus);
        percent = new JButton("%");
        percent.setSize(45, 40);
        percent.setLocation(212, 164);
        percent.setBorder(compound);
        percent.setFont(fontButton);
        panel.add(percent);
        backspace = new JButton("←");
        backspace.setSize(45, 40);
        backspace.setLocation(262,164);
        backspace.setBorder(compound);
        backspace.setFont(fontButton);
        panel.add(backspace);
        plus = new JButton("+");
        plus.setBackground(Color.CYAN);
        plus.setSize(45, 40);
        plus.setLocation(162, 210);
        plus.setBorder(compound);
        plus.setFont(fontButton);
        panel.add(plus);
        equal = new JButton("=");
        equal.setBackground(Color.CYAN);
        equal.setSize(95, 40);
        equal.setLocation(212, 210);
        equal.setBorder(compound);
        equal.setFont(fontButton);
        panel.add(equal);
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (text.getText().length()<18) {
                    if (c == KeyEvent.VK_1) {
                        b1.setBorder(lowered);
                        text.setText(text.getText() + "1");
                    }
                    else if (c==KeyEvent.VK_2){
                        b2.setBorder(lowered);
                        text.setText(text.getText() + "2");
                    }
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                b1.setBorder(compound);
                b2.setBorder(compound);
            }
        });
    }
            public void actionPerformed (ActionEvent e) {
                if (text.getText().length() < 18) {
                    if (e.getSource().equals(b1)) {
                        text.setText(text.getText() + "1");
                        panel.requestFocus();
                    }
                }
            }


}

