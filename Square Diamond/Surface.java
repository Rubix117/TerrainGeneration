/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package squarediamondalgo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.JPanel;

/**         *
 * @author Dave Matthews
 */
public class Surface extends JPanel
{
    private void doDrawing(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        int mapSize = (int) Math.pow(2, 9) + 1;
        Dimension size = new Dimension(mapSize, mapSize);
        Insets insets = getInsets();
        setSize(size);
        int w = size.width - insets.left - insets.right;
        int h = size.height - insets.top - insets.bottom;

        SquareDiamondAlgo myMap = new SquareDiamondAlgo(mapSize);

        int map[][] = myMap.getMap();

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[0].length; j++)
            {
                if (map[i][j] < 15)
                {
                    g.setColor(Color.BLUE);
                } else if (map[i][j] < 60)
                {
                    g.setColor(Color.green);
                } else if (map[i][j] < 80)
                {
                    g.setColor(Color.gray);
                } else
                {
                    g.setColor(Color.white);
                }
                g2d.drawLine(i, j, i, j);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        doDrawing(g);
    }
}
