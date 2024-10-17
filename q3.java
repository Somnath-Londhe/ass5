import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTableApp extends JFrame {
    // UI components
    private JTextField numberField; // TextField for user to input the number
    private JButton generateButton; // Button to generate the multiplication table
    private JList<String> multiplicationList; // List box to display the multiplication table
    private DefaultListModel<String> listModel; // List model to manage the data in the JList

    public MultiplicationTableApp() {
        // Set up the frame
        setTitle("Multiplication Table Generator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the components
        numberField = new JTextField(10); // TextField to input number
        generateButton = new JButton("Generate Table"); // Button to generate table
        listModel = new DefaultListModel<>(); // ListModel to hold the multiplication results
        multiplicationList = new JList<>(listModel); // JList to display results

        // Panel to hold the input and button
        JPanel inputPane l = new JPanel();
        inputPanel.add(new JLabel("Enter number:"));
        inputPanel.add(numberField);
        inputPanel.add(generateButton);

        // Add the panel and list to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(multiplicationList), BorderLayout.CENTER);

        // Button click event
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateMultiplicationTable();
            }
        });
    }

    // Method to generate multiplication table and display in JList
    private void generateMultiplicationTable() {
        listModel.clear(); // Clear previous results

        try {
            // Get the number from the text field
            int number = Integer.parseInt(numberField.getText());

            // Generate multiplication table from 1 to 10
            for (int i = 1; i <= 10; i++) {
                String result = number + " x " + i + " = " + (number * i);
                listModel.addElement(result); // Add each result to the list model
            }
        } catch (NumberFormatException e) {
            // Show error message if the input is not a valid number
            JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> {
            MultiplicationTableApp app = new MultiplicationTableApp();
            app.setVisible(true);
        });
    }
}
