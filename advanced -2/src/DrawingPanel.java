import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class DrawingPanel extends JPanel{

    final int DEFAULT_DELTA = 10;
    private int dx = DEFAULT_DELTA;
    private int dy = DEFAULT_DELTA;
    private int curX;
    private int curY;


    private ArrayList<Rectangle> commands = new ArrayList<>();

    public DrawingPanel(int dx, int dy) {
        super();
        this.setFocusable(true);

        this.dx = dx;
        this.dy = dy;
        curX = 100;
        curY = 100;


        this.addKeyListener(new KeyListener(){

            @Override
            public void keyPressed(KeyEvent ke) {
                Graphics gr = getGraphics();
                gr.setColor(Color.BLUE);
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        gr.drawLine(curX, curY, curX-dx, curY);
                        commands.add(new Rectangle(curX, curY, curX-dx, curY));
                        curX -= dx;
                        break;
                    case KeyEvent.VK_RIGHT:
                        gr.drawLine(curX, curY, curX+dx, curY);
                        commands.add(new Rectangle(curX, curY, curX+dx, curY));
                        curX += dx;
                        break;
                    case KeyEvent.VK_DOWN:
                        gr.drawLine(curX, curY, curX, curY+dy);
                        commands.add(new Rectangle(curX, curY, curX, curY+dy));
                        curY += dy;
                        break;
                    case KeyEvent.VK_UP:
                        gr.drawLine(curX, curY, curX, curY-dy);
                        commands.add(new Rectangle(curX, curY, curX, curY-dy));
                        curY -= dy;
                        break;

                }
            }

            @Override
            public void keyReleased(KeyEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyTyped(KeyEvent arg0) {
                // TODO Auto-generated method stub

            }});
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.setColor(Color.RED);
        for (Rectangle rect : commands) {
            gr.drawLine(rect.x, rect.y, rect.width, rect.height);
        }
    }
}

