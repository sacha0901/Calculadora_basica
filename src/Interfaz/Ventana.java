package Interfaz;
import java.awt.Color;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame  implements ActionListener  {

    private JButton btnsuma,btnresta,btnmulti,btndiv,btnlimpiar,btnraiz,btnpotencia,btnsalir;
    private JTextField valor1,valor2,camporesultado;
    JLabel label1,label2,TextoResultado;
    public Ventana() {
        this.setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Operacion de cierre predeterminado
        setTitle(("CALCULADORA BASICA ---------------------------------"));
        setLocationRelativeTo(null);
        panel();
    }


    private void panel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);



        label1 = new JLabel();
        label1.setText("Numero 1");
        label1.setBounds(10, 10, 90, 25);
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);
        label1.setBackground(Color.DARK_GRAY);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel.add(label1);

        label2 = new JLabel();
        label2.setText("Numero 2");
        label2.setBounds(10, 50, 90, 25);
        label2.setForeground(Color.WHITE);
        label2.setOpaque(true);
        label2.setBackground(Color.DARK_GRAY);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel.add(label2);

        valor1 = new JTextField();
        valor1.setBounds(130, 10, 50, 25);
        panel.add(valor1);

        valor2 = new JTextField();
        valor2.setBounds(130, 50, 50, 25);
        panel.add(valor2);

        btnsuma = new JButton("+");
        btnsuma.setText("Sumar");
        btnsuma.setBounds(10, 100, 80, 25);
        btnsuma.addActionListener(this);
        panel.add(btnsuma);

        btnresta = new JButton("+");
        btnresta.setText("Restar");
        btnresta.setBounds(100, 100, 80, 25);
        btnresta.addActionListener(this);
        panel.add(btnresta);

        btnmulti = new JButton("+");
        btnmulti.setText("multiplicar");
        btnmulti.setBounds(190, 100, 100, 25);
        btnmulti.addActionListener(this);
        panel.add(btnmulti);

        btndiv = new JButton("+");
        btndiv.setText("Dividir");
        btndiv.setBounds(300, 100, 100, 25);
        btndiv.addActionListener(this);
        panel.add(btndiv);

        TextoResultado = new JLabel();
        TextoResultado.setText("Resultado:");
        TextoResultado.setBounds(10, 150, 100, 25);
        TextoResultado.setForeground(Color.DARK_GRAY);
        TextoResultado.setOpaque(true);
        TextoResultado.setBackground(Color.cyan);
        TextoResultado.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel.add(TextoResultado);

        camporesultado = new JTextField();
        camporesultado.setBounds(130, 150, 80, 25);
        panel.add(camporesultado);

        btnlimpiar = new JButton("+");
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBounds(220, 150, 100, 25);
        btnlimpiar.addActionListener(this);
        panel.add(btnlimpiar);

    }

    public void actionPerformed(ActionEvent e) {
        double  num1,num2,resu;
        String resultado;
        if (e.getSource()==btnsuma) {
            if(valor1.getText().equals("") || valor2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Los datos no est�n completos",
                        "Error",JOptionPane.WARNING_MESSAGE);
            }
            else{
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                resu=num1+num2;
                resultado=String.valueOf(resu);
                camporesultado.setText(resultado);
            }
        }
        if (e.getSource()==btnresta) {
            if(valor1.getText().equals("") || valor2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos no est�n completos",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                resu=num1-num2;
                resultado=String.valueOf(resu);
                camporesultado.setText(resultado);
            }
        }
        if (e.getSource()==btnmulti) {
            if(valor1.getText().equals("") || valor2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos no est�n completos",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                resu=num1*num2;
                resultado=String.valueOf(resu);
                camporesultado.setText(resultado);
            }
        }
        if (e.getSource()==btndiv) {
            if(valor1.getText().equals("") || valor2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Los datos no est�n Incompletos",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }

            else{
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                try{
                    resu=num1/num2;
                    resultado=String.valueOf(resu);
                    camporesultado.setText(resultado);
                }
                catch(ArithmeticException ex){
                    JOptionPane.showMessageDialog(null, "Divisi�n entre cero NO PERMITIDA!",
                            "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        }

        if (e.getSource()==btnlimpiar){
            valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
        }

    }


}
