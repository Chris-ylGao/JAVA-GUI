import javax.swing.*;
public class LoginPage {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Page");
        //setting the size of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating a panel and adding it to the frame
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        //display frame
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel p){
        p.setLayout(null);
        // adding userLabel
        //setBounds(x,y,width,height) defines the location and size of component;
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20,80,25);
        p.add(userLabel);
        //adding  a text field for user to input
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        p.add(userText);

        //Similarly, create and add pwLabel
        JLabel pwLabel = new JLabel("Password:");
        pwLabel.setBounds(10,50,80,25);
        p.add(pwLabel);
        //adding password field for user to input password
        //the difference between text field and password field is that
        // the content in the password field would be seen as solid circle.
        JPasswordField pwField = new JPasswordField(20);
        pwField.setBounds(100,50,165,25);
        p.add(pwField);

        // create and add login button
        JButton loginButton = new JButton ("Login");
        loginButton.setBounds(10,80,80,25);
        p.add(loginButton);
    }
}
