package pruebas;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//extends MouseAdapter-->Clase tiene implementación de MouseListener pero vacío para no tener que hacer todos los métodos de dsdsf
public class ButtonMouseListener extends MouseAdapter implements MouseListener {
    @Override
        public void mouseClicked(MouseEvent e){
        //casting para la compilación, porque originalmente devuelve uno arriba de la jerarquía (Component object)
        JButton b = (JButton) e.getSource();
        System.out.println("Click!!");
        System.out.println(b.getText());
    }
}
//swing->component->jradiobutton,jlabel,etc