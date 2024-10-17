import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

// Applet class
public class TableLampApplet extends Applet implements Runnable {
    private Color lampColor;  // Color of the lamp
    private Thread colorThread;  // Thread to change color
    private Random random;  // Random number generator for colors

    @Override
    public void init() {
        // Initialize the random color generator
        random = new Random();
        // Set initial lamp color
        lampColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Start the thread to change the lamp color
        colorThread = new Thread(this);
        colorThread.start();
    }

    @Override
    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.WHITE);

        // Draw the table lamp
        g.setColor(Color.BLACK);
        g.fillRect(90, 300, 120, 10);  // Lamp base (table)

        // Draw the lamp stand
        g.fillRect(140, 200, 20, 100);  // Lamp stand

        // Draw the lamp shade with the changing color
        g.setColor(lampColor);
        g.fillOval(100, 120, 100, 80);  // Lamp shade
    }

    @Override
    public void run() {
        // Continuously change the lamp color every second
        while (true) {
            try {
                // Change the lamp color randomly
                lampColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                // Repaint the applet with the new color
                repaint();
                // Sleep for 1 second (1000 ms) before changing the color again
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    @Override
    public void stop() {
        // Stop the thread when the applet is stopped
        colorThread = null;
    }

}
