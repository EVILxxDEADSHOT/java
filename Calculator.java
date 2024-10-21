import java.awt.*;
import java.awt.event.*;

class Calculator {
    Calculator() {
        Frame f = new Frame();

        // Create components
        TextField x = new TextField();
        TextField y = new TextField();
        TextField result = new TextField();
        Button add = new Button("+");
        Button subtract = new Button("-");
        Button multiply = new Button("*");
        Button division = new Button("/");

        // Set bounds for components
        x.setBounds(20, 50, 150, 30);  // First input box
        y.setBounds(20, 90, 150, 30);  // Second input box
        add.setBounds(20, 130, 60, 30);
        subtract.setBounds(90, 130, 60, 30);
        multiply.setBounds(20, 170, 60, 30);
        division.setBounds(90, 170, 60, 30);
        result.setBounds(20, 210, 150, 30); // Output box
        result.setEditable(false); // Make the result field non-editable

        // Add components to the frame
        f.add(x);
        f.add(y);
        f.add(add);
        f.add(subtract);
        f.add(multiply);
        f.add(division);
        f.add(result);

        // Frame properties
        f.setSize(200, 300);
        f.setTitle("Calculator");
        f.setLayout(null);
        f.setVisible(true);

        // Add action listeners for buttons
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(x.getText());
                int num2 = Integer.parseInt(y.getText());
                result.setText(String.valueOf(num1 + num2));
            }
        });

        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(x.getText());
                int num2 = Integer.parseInt(y.getText());
                result.setText(String.valueOf(num1 - num2));
            }
        });

        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(x.getText());
                int num2 = Integer.parseInt(y.getText());
                result.setText(String.valueOf(num1 * num2));
            }
        });

        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(x.getText());
                int num2 = Integer.parseInt(y.getText());
                if (num2 == 0) {
                    result.setText("Cannot divide by zero");
                } else {
                    result.setText(String.valueOf(num1 / num2));
                }
            }
        });

        // Close window event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }

    public static void main(String args[]) {
        new Calculator();
    }
}
