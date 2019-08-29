import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 This applet displays a timed traffic signal.
 */

public class TrafficApplet extends JApplet
{
    // Constants for the traffic signal
    public final int WIDTH = 300;
    public final int HEIGHT = 400;
    public final int X_TRAFFICLIGHT = WIDTH / 3;
    public final int Y_TRAFFICLIGHT = HEIGHT / 7;
    public final int TRAFFICLIGHT_WIDTH = WIDTH / 2;
    public final int TRAFFICLIGHT_HEIGHT = HEIGHT * 3 / 5;
    public final int LIGHT_DIAMETER =
            TRAFFICLIGHT_HEIGHT / 5;
    public final int HOOD_START_ANGLE = 20;
    public final int HOOD_ANGLE_SWEPT = 140;
    public final int X_LIGHTS =
            TRAFFICLIGHT_WIDTH /
                    3 + X_TRAFFICLIGHT;
    public final int Y_REDLIGHT =
            TRAFFICLIGHT_HEIGHT /
                    10 + Y_TRAFFICLIGHT;
    public final int Y_ORANGELIGHT =
            TRAFFICLIGHT_HEIGHT * 4 /
                    10 + Y_TRAFFICLIGHT;
    public final int Y_GREENLIGHT =
            TRAFFICLIGHT_HEIGHT * 7 /
                    10 + Y_TRAFFICLIGHT;
    public final int TIME_DELAY = 1000;

    private String status = "green"; // Signal status
    private Timer timer;             // Timer object

    public void init() {
        timer = new Timer(TIME_DELAY, new TimerListener());
        timer.start();
        setSize(WIDTH, HEIGHT);

    }

    class TimerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            if (status.equalsIgnoreCase("green"))
            {
                status = "orange";
            }
            if (status.equalsIgnoreCase("orange"))
            {
                status = "green";
            }
            if (status.equalsIgnoreCase("green"))
            {
                status = "red";
            }
            repaint();
        }
    }

    public void Paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.drawRect(X_TRAFFICLIGHT,Y_TRAFFICLIGHT,TRAFFICLIGHT_WIDTH,TRAFFICLIGHT_HEIGHT);
        g.fillRect(X_TRAFFICLIGHT,Y_TRAFFICLIGHT,TRAFFICLIGHT_WIDTH,TRAFFICLIGHT_HEIGHT);

        if (status.equalsIgnoreCase("green")) {
            g.setColor(Color.green);
            g.fillOval(X_LIGHTS,Y_GREENLIGHT,LIGHT_DIAMETER / 2,LIGHT_DIAMETER / 2);

            // set color to white, to prevent interim the different colors
            g.setColor(Color.white);
            g.fillOval(X_LIGHTS,Y_ORANGELIGHT,LIGHT_DIAMETER / 2,LIGHT_DIAMETER / 2);
            g.fillOval(X_LIGHTS,Y_REDLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);

            // Set color to Black
            g.setColor(Color.BLACK);
            g.drawOval(X_LIGHTS, Y_GREENLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
            g.drawOval(X_LIGHTS, Y_ORANGELIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
            g.drawOval(X_LIGHTS, Y_REDLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
        } else if (status.equalsIgnoreCase("orange"))
        {
            g.setColor(Color.orange);
            g.fillOval(X_LIGHTS,Y_GREENLIGHT,LIGHT_DIAMETER / 2,LIGHT_DIAMETER / 2);

            // set color to white, to prevent interim the different colors
            g.setColor(Color.white);
            g.fillOval(X_LIGHTS,Y_ORANGELIGHT,LIGHT_DIAMETER / 2,LIGHT_DIAMETER / 2);
            g.fillOval(X_LIGHTS,Y_REDLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);

            // Set color to Black
            g.setColor(Color.BLACK);
            g.drawOval(X_LIGHTS, Y_GREENLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
            g.drawOval(X_LIGHTS, Y_ORANGELIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
            g.drawOval(X_LIGHTS, Y_REDLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
        }else if (status.equalsIgnoreCase("red"))
        {
            g.setColor(Color.red);
            g.fillOval(X_LIGHTS,Y_GREENLIGHT,LIGHT_DIAMETER / 2,LIGHT_DIAMETER / 2);

            // set color to white, to prevent interim the different colors
            g.setColor(Color.white);
            g.fillOval(X_LIGHTS,Y_ORANGELIGHT,LIGHT_DIAMETER / 2,LIGHT_DIAMETER / 2);
            g.fillOval(X_LIGHTS,Y_REDLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);

            // Set color to Black
            g.setColor(Color.BLACK);
            g.drawOval(X_LIGHTS, Y_GREENLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
            g.drawOval(X_LIGHTS, Y_ORANGELIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
            g.drawOval(X_LIGHTS, Y_REDLIGHT, LIGHT_DIAMETER / 2, LIGHT_DIAMETER / 2);
        }
    }

}

