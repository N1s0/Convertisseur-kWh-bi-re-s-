import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class CurrencyConverter {
   
     
    private JFrame window;
    private JLabel sourceLabel;
    private JTextField sourceField;
    private JLabel destLabel;
    private JTextField destField;
    private JButton convertButton;
    private JButton clearButton;
    
    public CurrencyConverter() {
      
        initUI();
    }
    
    private void initUI() {
        window = new JFrame("Convertisseur Kw/h en bière");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        sourceLabel = new JLabel("Kw/h");
        sourceField = new JTextField();
        
        destLabel = new JLabel("Équivalent Bière");
        destField = new JTextField();
        destField.setEditable(false);
        
        
        convertButton = new JButton("Convertir");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convert();
            }
        });
        
        clearButton = new JButton("Encore!");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        
 
        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new GridLayout(7, 4));
        
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(sourceLabel);
        fieldsPanel.add(sourceField);
        fieldsPanel.add(new JPanel());
        
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(destLabel);
        fieldsPanel.add(destField);
        fieldsPanel.add(new JPanel());
        
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(clearButton);
        fieldsPanel.add(convertButton);
        fieldsPanel.add(new JPanel());
        
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        fieldsPanel.add(new JPanel());
        
        window.getContentPane().add(fieldsPanel);
        window.getRootPane().setDefaultButton(convertButton);
        window.setSize(400, 200);
    }
    
    public void setVisible(boolean visible) {
        window.setVisible(visible);
    }
    
    public void clearFields() {
        sourceField.setText("");
        destField.setText("");
    }
    
    public void convert() {
        try {
            double source = Double.parseDouble(sourceField.getText());
            double rate = 0.06;
            String result = new DecimalFormat("0.00##").format(source * rate);
            destField.setText(result);
        } catch (NumberFormatException e) {
            destField.setText("invalid: " + e.getLocalizedMessage());
        }
    }
    
    public static void main(String args[]) {
        CurrencyConverter converter = new CurrencyConverter();
        converter.setVisible(true);
    }
}

