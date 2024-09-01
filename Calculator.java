import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener {
    int num1, num2, result;
    char opt;
    Frame fr = new Frame("my calculator");
    TextField tf = new TextField();
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");
    Button bc = new Button("C");
    Button ba = new Button("+");
    Button bs = new Button("-");
    Button bm = new Button("*");
    Button bd = new Button("/");
    Button be = new Button("=");
    Panel pn = new Panel();
    Calculator() {
        fr.add(tf, "North");
        fr.add(pn, "Center");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bc.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);
        pn.add(b7);
        pn.add(b8);
        pn.add(b9);
        pn.add(ba);
        pn.add(b4);
        pn.add(b5);
        pn.add(b6);
        pn.add(bs);
        pn.add(b1);
        pn.add(b2);
        pn.add(b3);
        pn.add(bm);
        pn.add(b0);
        pn.add(bc);
        pn.add(be);
        pn.add(bd);
        pn.setLayout(new GridLayout(4, 4));
        fr.setVisible(true);
        fr.setSize(500, 500);
    }
  public void actionPerformed(ActionEvent ae) {
      String str = ae.getActionCommand();
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            opt = str.charAt(0);
            num1 = Integer.parseInt(tf.getText());
            tf.setText("");
        } else if (str.equals("=")) {
            num2 = Integer.parseInt(tf.getText());
            switch (opt) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            tf.setText(result + "");
        } else if (str.equals("C")) {
            num1 = num2 = result = 0;
            tf.setText("");
        } else {
            tf.setText(tf.getText() + str);
        }
    }

    public static void main(String args[]) {
        new Calculator();
    }
}
