import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.TableHeaderUI;
public class vikas36 extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame("My Frame");// Creating a new frame to display the contents of the frame
        
        // Creating LABELS WHICH WILL WE DISPLAYED BEFORE THE TEXTFIELDS
        Label l1= new Label("First");
        Label l2= new Label("Second"); 

        // Creating textfields in which the user can enter any text with the size
        TextField t1= new TextField(10);// The size of the textfield mentioned in the constructor
        TextField t2= new TextField(10);

        // A button to press OK
        Button b= new Button("Ok");
        b.setBounds(150,100,150,100);
        // Note the tags should be added in the order they are to representated
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        
        b.addActionListener(new ActionListener(){// event listener
            public void actionPerformed(ActionEvent e){ // When b listen's to an event it will perform this action
            // It will exchange the text between the fields
                String temp =t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });


        // A flow layout arranges components in a directional flow, much like lines of text in a paragraph.
        //  The flow direction is determined by the container's componentOrientation property and may be one of two values: ComponentOrientation.
        // f.setLayout(new FlowLayout());
        f.setSize(450,300);// Setting the size of the frame
        f.setVisible(true);// Making that frame visible
    }
}
