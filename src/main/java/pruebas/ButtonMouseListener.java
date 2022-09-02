package pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//extends MouseAdapter-->Clase tiene implementación de MouseListener pero vacío para no tener que hacer todos los métodos de dsdsf
public class ButtonMouseListener extends MouseAdapter implements MouseListener {

    Color c;
    @Override
        public void mouseClicked(MouseEvent e){
        //casting para la compilación, porque originalmente devuelve uno arriba de la jerarquía (Component object)
        JButton b = (JButton) e.getSource();
        System.out.println("Click!!");
        System.out.println(b.getText());
    }

    @Override
    public void mouseEntered(MouseEvent e){
        JButton b = (JButton) e.getSource();
        b.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e){
        JButton b = (JButton) e.getSource();
        c = b.getBackground();
        b.setBackground(c); //para que al salir sea del color que era en un principio
    }

}
//swing->component->jradiobutton,jlabel,etc