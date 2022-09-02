package pruebas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//extends MouseAdapter-->Clase tiene implementación de MouseListener pero vacío para no tener que hacer todos los métodos de dsdsf
public class ButtonMouseListener extends MouseAdapter implements MouseListener {
    @Override
        public void mouseClicked(MouseEvent e){
        System.out.println("Click!!");
    }
}
