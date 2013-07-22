/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package squarediamondalgo;

import java.awt.Dimension;
import javax.swing.JFrame;


/**
 *
 * @author Dave Matthews
 */
public class MapWindow extends JFrame
{

    public MapWindow(int size)
    {
        initUI(size);
    }

    private void initUI(int size)
    {
        Dimension map = new Dimension(size, size);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(map);
        add(new Surface());
        setVisible(true);

    }
}
