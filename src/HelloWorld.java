import javax.swing.*;
public class HelloWorld {
    /**
     * create and display the window
     */
    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        // create and set windows
        JFrame frame = new JFrame("HelloWorld");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add "Hello World Label"
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //display windows
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // apply GUI
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            createAndShowGUI();
        }
    });
    }
}
