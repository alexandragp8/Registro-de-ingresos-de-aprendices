
package modelo.conexion;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class Validar {
    
    public void validartext(JTextField campo ){
        
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                
                if(Character.isDigit(c)){
                    e.consume();
                }
            
        }
        });
    }
      public void validarnumero(JTextField campo ){
        
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                
                if(!Character.isDigit(c)){
                    e.consume();
                }
            
        }
        });
    }
        public void limitar (JTextField campo, int cantidad ){
        
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                int tam= campo.getText().length(); 
                if(tam>=cantidad){
                    e.consume();
                }
            
        }
        });
    }
}
