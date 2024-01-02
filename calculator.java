import java.awt.*;
import java.awt.event.*;
class calculator extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bper;
    public calculator(String t)
    {
        super(t);
        setLayout(new GridLayout(5,4,10,10));
        l1=new Label("Enter first no.");
        l2= new Label("Enter second no.");
        l3= new Label("Result");
        t1= new TextField(10);
        t2=new TextField(4);
        t3=new TextField(4);

       b0=new Button("0");
       b1=new Button("1");
       b2=new Button("2");
       b3=new Button("3");
       b4=new Button("4");
       b5=new Button("5");
       b6=new Button("6");
       b7=new Button("7");
       b8=new Button("8");
       b9=new Button("9");

        badd=new Button("+");
        bsub=new Button("-");
        bmul=new Button("x");
        bdiv=new Button("/");
        bper=new Button("%");
        

        add(l1);add(t1);
        add(l2);add(t2);
        t3.setEditable(false);
        add(l3);add(t3);
        add(b0);add(b1);add(b2); add(b3);add(b4);add(b5); add(b6);add(b7);add(b8);add(b9);
        add(badd);add(bsub);add(bdiv);add(bmul);add(bper);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bper.addActionListener(this);
        bsub.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int r;
        if (ae.getSource()==badd)
        {
            r=n1+n2;
            t3.setText(r+"");
        }
        else if(ae.getSource()==bsub)
        {
            r=n1-n2;
            t3.setText(r+"");
        }
         else if(ae.getSource()==bmul)
        {
            r=n1*n2;
            t3.setText(r+"");
        }
         else if(ae.getSource()==bdiv)
        {
           if(n2!=0) {r=n1/n2;
            t3.setText(r+"");}
            else t3.setText("Error");
        }
         else if(ae.getSource()==bper)
        {
            if(n2!=0) {r=n1%n2;
            t3.setText(r+"");}
            else t3.setText("Error");
        }

    }
    public static void main(String[] args) {
        calculator c = new calculator("Calculator");
        c.setSize(450,450);
        c.setVisible(true);
    }
}
