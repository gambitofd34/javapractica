
package cha;
import javax.swing.*;
public class Cha extends JFrame implements ActionListener {
    
    
    public JLabel comentario = new JLabel("bienvenidos a formulario:");
    public JLabel comentario1 = new JLabel("que hacen vagos");
    public JLabel comentario2 = new JLabel("oeeeeee");
        JButton boton1;
      public Cha(){
        setLayout(null);
        boton1 = new JButton("aceptar");
        boton1.setBounds(10,100,300,30);
        comentario.setBounds(10,20,300,30);
        comentario1.setBounds(10,60,300,30);
        comentario2.setBounds(10,80,300,30);
        add(boton1);
      add(comentario);
      add(comentario1);
      add(comentario2);
    }

    public static void main(String[] args) {
     Cha hola = new Cha();
     hola.setBounds(0,0,400,550);
     hola.setVisible(true);
     hola.setLocationRelativeTo(null);
     hola.setResizable(false);
    }
    
}

