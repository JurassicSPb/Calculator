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
    private JButton plus, minus, multiplication, division, enter;
    private JButton point, sqrt, percent, negative, backspace;
    private JButton ce;
    private JTextField text;
    private JTextField text2;
    private double a=0, b=0, result=0;
    private int operator=0, operatorEnter=0;
    private String str1 = ".";



    public Calculator (String s) {
        super(s);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setFocusable(true);
        setContentPane(panel);
        setSize(326, 318);
        setResizable(false);
        text = new JTextField();
        text.setSize(291, 45);
        text.setLocation(15, 37);
        Font font = new Font("SansSerif", Font.BOLD, 24);
        Font fontButton = new Font("SansSerif", Font.BOLD, 19);
        Font fontText2 = new Font("Courier", Font.PLAIN,17);
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
        text.setBackground(Color.WHITE);
        panel.add(text);
        text2 = new JTextField();
        text2.setSize(292, 25);
        text2.setLocation(15, 12);
        text2.setFont(fontText2);
        text2.setBackground(Color.WHITE);
        text2.setHorizontalAlignment(JTextField.RIGHT);
        text2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
                panel.requestFocus();
            }
        });
        text2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent m) {
                m.consume();
                panel.requestFocus();
            }
        });
        panel.add(text2);
        Border line = LineBorder.createBlackLineBorder();
        Border bevel = BorderFactory.createRaisedBevelBorder();
        Border compound = new CompoundBorder(bevel, line);
        Border lowered = new SoftBevelBorder(BevelBorder.LOWERED);
        b7 = new JButton("7");
        b7.setSize(45, 40);
        b7.setLocation(12, 87);
        b7.setBorder(compound);
        b7.setFont(fontButton);
        b7.addActionListener(this);
        panel.add(b7);
        b8 = new JButton("8");
        b8.setSize(45, 40);
        b8.setLocation(62, 87);
        b8.setBorder(compound);
        b8.setFont(fontButton);
        b8.addActionListener(this);
        panel.add(b8);
        b9 = new JButton("9");
        b9.setSize(45, 40);
        b9.setLocation(112, 87);
        b9.setBorder(compound);
        b9.setFont(fontButton);
        b9.addActionListener(this);
        panel.add(b9);
        division = new JButton("/");
        division.setBackground(Color.CYAN);
        division.setSize(45, 40);
        division.setLocation(162, 87);
        division.setBorder(compound);
        division.setFont(fontButton);
        panel.add(division);
        negative = new JButton("±");
        negative.setSize(45, 40);
        negative.setLocation(212, 87);
        negative.setBorder(compound);
        negative.setFont(fontButton);
        panel.add(negative);
        ce = new JButton("C");
        ce.setSize(45, 85);
        ce.setLocation(262, 87);
        ce.setBorder(compound);
        ce.setFont(fontButton);
        ce.setBackground(Color.ORANGE);
        ce.addActionListener(this);
        panel.add(ce);
        b4 = new JButton("4");
        b4.setSize(45, 40);
        b4.setLocation(12, 133);
        b4.setBorder(compound);
        b4.setFont(fontButton);
        b4.addActionListener(this);
        panel.add(b4);
        b5 = new JButton("5");
        b5.setSize(45, 40);
        b5.setLocation(62, 133);
        b5.setBorder(compound);
        b5.setFont(fontButton);
        b5.addActionListener(this);
        panel.add(b5);
        b6 = new JButton("6");
        b6.setSize(45, 40);
        b6.setLocation(112, 133);
        b6.setBorder(compound);
        b6.setFont(fontButton);
        b6.addActionListener(this);
        panel.add(b6);
        multiplication = new JButton("*");
        multiplication.setBackground(Color.CYAN);
        multiplication.setSize(45, 40);
        multiplication.setLocation(162, 133);
        multiplication.setBorder(compound);
        panel.add(multiplication);
        sqrt = new JButton("√");
        sqrt.setSize(45, 40);
        sqrt.setLocation(212, 133);
        sqrt.setBorder(compound);
        panel.add(sqrt);
        b1 = new JButton("1");
        b1.setSize(45, 40);
        b1.setLocation(12, 179);
        b1.setBorder(compound);
        b1.setFont(fontButton);
        b1.addActionListener(this);
        panel.add(b1);
        b2 = new JButton("2");
        b2.setSize(45, 40);
        b2.setLocation(62, 179);
        b2.setBorder(compound);
        b2.setFont(fontButton);
        b2.addActionListener(this);
        panel.add(b2);
        b3 = new JButton("3");
        b3.setSize(45, 40);
        b3.setLocation(112, 179);
        b3.setBorder(compound);
        b3.setFont(fontButton);
        b3.addActionListener(this);
        panel.add(b3);
        b0 = new JButton("0");
        b0.setSize(95, 40);
        b0.setLocation(12, 225);
        b0.setBorder(compound);
        b0.setFont(fontButton);
        b0.addActionListener(this);
        panel.add(b0);
        point = new JButton(",");
        point.setSize(45, 40);
        point.setLocation(112, 225);
        point.setBorder(compound);
        point.setFont(fontButton);
        point.addActionListener(this);
        panel.add(point);
        minus = new JButton("-");
        minus.setBackground(Color.CYAN);
        minus.setSize(45, 40);
        minus.setLocation(162, 179);
        minus.setBorder(compound);
        minus.setFont(fontButton);
        panel.add(minus);
        percent = new JButton("%");
        percent.setSize(45, 40);
        percent.setLocation(212, 179);
        percent.setBorder(compound);
        percent.setFont(fontButton);
        panel.add(percent);
        backspace = new JButton("←");
        backspace.setSize(45, 40);
        backspace.setLocation(262,179);
        backspace.setBorder(compound);
        backspace.setFont(fontButton);
        backspace.addActionListener(this);
        panel.add(backspace);
        plus = new JButton("+");
        plus.setBackground(Color.CYAN);
        plus.setSize(45, 40);
        plus.setLocation(162, 225);
        plus.setBorder(compound);
        plus.setFont(fontButton);
        plus.addActionListener(this);
        panel.add(plus);
        enter = new JButton("=");
        enter.setBackground(Color.CYAN);
        enter.setSize(95, 40);
        enter.setLocation(212, 225);
        enter.setBorder(compound);
        enter.setFont(fontButton);
        enter.addActionListener(this);
        panel.add(enter);
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (c==KeyEvent.VK_BACK_SPACE && text.getText().length()!=0) {
                    backspace.setBorder(lowered);
                    text.setText(text.getText().substring(0, text.getText().length()-1));
                }
                if (c==KeyEvent.VK_ESCAPE && text.getText().length()!=0){
                    ce.setBorder(lowered);
                    text.setText("");
                }

                if (text.getText().length()<18) {
                    if (c == KeyEvent.VK_1) {
                        b1.setBorder(lowered);
                        text.setText(text.getText() + "1");
                    }
                    if (c==KeyEvent.VK_2){
                        b2.setBorder(lowered);
                        text.setText(text.getText() + "2");
                    }
                    if (c==KeyEvent.VK_3){
                        b3.setBorder(lowered);
                        text.setText(text.getText() + "3");
                    }
                    if (c==KeyEvent.VK_4){
                        b4.setBorder(lowered);
                        text.setText(text.getText() + "4");
                    }
                    if (c==KeyEvent.VK_5){
                        b5.setBorder(lowered);
                        text.setText(text.getText() + "5");
                    }
                    if (c==KeyEvent.VK_6){
                        b6.setBorder(lowered);
                        text.setText(text.getText() + "6");
                    }
                    if (c==KeyEvent.VK_7){
                        b7.setBorder(lowered);
                        text.setText(text.getText() + "7");
                    }
                    if (c==KeyEvent.VK_8){
                        b8.setBorder(lowered);
                        text.setText(text.getText() + "8");
                    }
                    if (c==KeyEvent.VK_9){
                        b9.setBorder(lowered);
                        text.setText(text.getText() + "9");
                    }
                    if (c==KeyEvent.VK_0){
                        b0.setBorder(lowered);
                        if (text.getText().length()<1) {
                            text.setText(text.getText() + "0");
                        }
                    }
                    if (c==KeyEvent.VK_PERIOD || c==KeyEvent.VK_QUOTE){
                        if ( (text.getText().length()!=0)) {
                            String str1 = ".";
                            if (text.getText().indexOf(str1) >= 1) {
                                return;
                            } else {
                                point.setBorder(lowered);
                                text.setText(text.getText() + str1);
                            }
                        }
                    }
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                b1.setBorder(compound);
                b2.setBorder(compound);
                b3.setBorder(compound);
                b4.setBorder(compound);
                b5.setBorder(compound);
                b6.setBorder(compound);
                b7.setBorder(compound);
                b8.setBorder(compound);
                b9.setBorder(compound);
                b0.setBorder(compound);
                backspace.setBorder(compound);
                ce.setBorder(compound);
                point.setBorder(compound);
            }
        });
    }
            public void actionPerformed (ActionEvent e) {
                if (text.getText().length()==0 || text.getText().length()>=18){
                    panel.requestFocus();
                }
                if (e.getSource().equals(backspace) && text.getText().length()!=0){
                    text.setText(text.getText().substring(0, text.getText().length()-1));
                    panel.requestFocus();
                }
                if (e.getSource().equals(ce)){
                    text.setText("");
                    a=0;
                    b=0;
                    panel.requestFocus();
                }
                if (e.getSource().equals(plus)){
                        if(text.getText().length()!=0) {
                            b = Double.parseDouble(text.getText());
                            a = a + b;
                            double roundA = (double)Math.round(a * 1000000) / 1000000;
                            operator = 1;
                            operatorEnter=1;
                            if ((a == Math.floor(a)) && !Double.isInfinite(a)) {
                                text.setText((int)a + "");
                                if (a!=0) {
                                    text2.setText((int) b + "+" + (int) a + "=" + (int) a);
                                }
                            }
                            else
                                text.setText(roundA + "");

                        }
                        panel.requestFocus();
                }
                if (e.getSource().equals((enter))){
                    b=Double.parseDouble(text.getText());
                    switch (operatorEnter){
                        case 1: result=a+b;
                            break;
                        default: result=0;
                    }
                    if ((result == Math.floor(result)) && !Double.isInfinite(result)){
                        text.setText((int)result+"");
                    }
                    else {
                        text.setText(result + "");
                    }
                    a=0;
                    panel.requestFocus();
                }
                if (text.getText().length() < 18) {
                    if (e.getSource().equals(b1)) {
                        setNull();
                        text.setText(text.getText() + "1");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b2)) {
                        setNull();
                        text.setText(text.getText() + "2");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b3)) {
                        setNull();
                        text.setText(text.getText() + "3");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b4)) {
                        setNull();
                        text.setText(text.getText() + "4");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b5)) {
                        setNull();
                        text.setText(text.getText() + "5");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b6)) {
                        setNull();
                        text.setText(text.getText() + "6");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b7)) {
                        setNull();
                        text.setText(text.getText() + "7");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b8)) {
                        setNull();
                        text.setText(text.getText() + "8");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b9)) {
                        setNull();
                        text.setText(text.getText() + "9");
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(b0)) {
                        setNull();
                        if (text.getText().length()<1) {
                            text.setText(text.getText() + "0");
                        }
                        panel.requestFocus();
                    }
                    if (e.getSource().equals(point) && text.getText().length()!=0){
                        if (text.getText().indexOf(str1)>=1)
                        {
                            panel.requestFocus();
                            return;
                        }
                        else
                        {
                            text.setText(text.getText() + str1);
                            panel.requestFocus();
                        }
                    }
                }
            }
            public void setNull() {
                if (operator == 1) {
                    text.setText("");
                    operator = 0;
                }
            }

}

