import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoiceGUI extends JFrame {

    private JTextField titleField, addressField;
    private JTextField productNameField, unitPriceField, quantityField;
    private JTextArea invoiceTextArea;

    public InvoiceGUI() {
        setTitle("Invoice Entry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Invoice Panel
        JPanel invoicePanel = new JPanel(new GridLayout(2, 2));
        invoicePanel.add(new JLabel("Invoice Title:"));
        titleField = new JTextField();
        invoicePanel.add(titleField);
        invoicePanel.add(new JLabel("Customer Address:"));
        addressField = new JTextField();
        invoicePanel.add(addressField);

        // Line Item Panel
        JPanel lineItemPanel = new JPanel(new GridLayout(4, 2));
        lineItemPanel.setBorder(BorderFactory.createTitledBorder("Line Item"));
        lineItemPanel.add(new JLabel("Product Name:"));
        productNameField = new JTextField();
        lineItemPanel.add(productNameField);
        lineItemPanel.add(new JLabel("Unit Price:"));
        unitPriceField = new JTextField();
        lineItemPanel.add(unitPriceField);
        lineItemPanel.add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        lineItemPanel.add(quantityField);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addButton = new JButton("Add Line Item");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLineItem();
            }
        });
        buttonPanel.add(addButton);

        // Text Area
        invoiceTextArea = new JTextArea(10, 40);
        invoiceTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(invoiceTextArea);

        mainPanel.add(invoicePanel, BorderLayout.NORTH);
        mainPanel.add(lineItemPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(scrollPane, BorderLayout.EAST);

        add(mainPanel);
        setVisible(true);
    }

    private void addLineItem() {
        // Implement adding line item functionality here
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InvoiceGUI::new);
    }
}