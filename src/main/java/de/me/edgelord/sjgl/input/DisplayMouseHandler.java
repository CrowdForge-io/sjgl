package de.me.edgelord.sjgl.input;

import java.awt.event.MouseEvent;

public interface DisplayMouseHandler {

    void mouseClicked(MouseEvent e);

    void mousePressed(MouseEvent e);

    void mouseReleased(MouseEvent e);

    void mouseEntered(MouseEvent e);

    void mouseExited(MouseEvent e);

    void mouseWheelMoved(MouseEvent e);

    void mouseDragged(MouseEvent e);

    void mouseMoved(MouseEvent e);
}