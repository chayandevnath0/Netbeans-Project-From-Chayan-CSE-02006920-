package exceptiondemo;
import java.applet.*;
import java.awt.Event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author FIROZ
 */
public class ExceptionDemo extends Applet implements ActionListener
{
    TextField t1, t2, t3;
    Label l1, l2;
    Button b1, b2;
    public void init()
    { 
        t1 = new TextField (5);
        t2 = new TextField (5);
        t3 = new TextField (5);
        l1 = new Label ("Num1");
        l2 =  new Label ("Num2");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(t3);
        b1 = new Button ("Divide");
        b2 = new Button  ("Clear");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
       
    }

 
    public void actionPerformed (ActionEvent act) 
    
    {
        String str = act.getActionCommand();
        if(str.equals ("Divide"))
        {
            try
            {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int num3 = num1/ num2;
                t3.setText(""+num3 );
            }
            catch(ArithmeticException e)
            {
                jOptionPane.shovMessageDialog(null,"Arithmetic Exception");
            }
            
            catch (NumberFormatException e)
            {
                jOptionPane.shovMessageDialog(null,"NumberFormatException");
                
            }
            
           }
           else
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
}
