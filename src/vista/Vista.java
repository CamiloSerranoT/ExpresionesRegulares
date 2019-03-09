/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import negocio.Controlador;

/**
 *
 * @author Sala_04
 */
public class Vista extends JFrame implements ActionListener {

    JPanel jPanel1;
    JButton jb1;
    JButton jb2;
    JTextField jt1;
    JTextField jt2;
    JTextField jt3;
    JTextField jt4;
    JTextField jt5;
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JLabel jl5;
    FlowLayout estilo;
    Controlador control;

    public Vista() {
    }

    public Vista(int x, int y) {
        crearVista(x, y);
    }

    public void crearVista(int x, int y) {
        this.setTitle("Expresiones regulares");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(x, y);
        this.setLocationRelativeTo(null);
        crear();
        insertar();
        this.setLayout(estilo);
        this.setVisible(true);
    }

    public void crear() {
        jPanel1 = new JPanel();
        jb1 = new JButton();
        jb2 = new JButton();
        jt1 = new JTextField();
        jt2 = new JTextField();
        jt3 = new JTextField();
        jt4 = new JTextField();
        jt5 = new JTextField();
        jl1 = new JLabel();
        jl3 = new JLabel();
        jl2 = new JLabel();
        jl4 = new JLabel();
        jl5 = new JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 15));

        jb1.setFont(new java.awt.Font("Segoe UI Black", 0, 11));
        jb1.setText("Validar");
        jb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb1.addActionListener(this);

        jb2.setFont(new java.awt.Font("Segoe UI Black", 0, 11));
        jb2.setText("Volver");
        jb2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb2.addActionListener(this);

        jt1.setFont(new java.awt.Font("Arial", 1, 24));
        jt2.setFont(new java.awt.Font("Arial", 1, 24));
        jt3.setFont(new java.awt.Font("Arial", 1, 24));
        jt4.setFont(new java.awt.Font("Arial", 1, 24));
        jt5.setFont(new java.awt.Font("Arial", 1, 24));

        jl1.setFont(new java.awt.Font("Castellar", 1, 24));
        jl1.setForeground(new java.awt.Color(255, 255, 255));
        jl1.setText("Entero");

        jl3.setFont(new java.awt.Font("Castellar", 1, 24));
        jl3.setForeground(new java.awt.Color(255, 255, 255));
        jl3.setText("not. científica");

        jl2.setFont(new java.awt.Font("Castellar", 1, 24));
        jl2.setForeground(new java.awt.Color(255, 255, 255));
        jl2.setText("real");

        jl4.setFont(new java.awt.Font("Castellar", 1, 24));
        jl4.setForeground(new java.awt.Color(255, 255, 255));
        jl4.setText("binario");

        jl5.setFont(new java.awt.Font("Castellar", 1, 24));
        jl5.setForeground(new java.awt.Color(255, 255, 255));
        jl5.setText("E-mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl1)
                                        .addComponent(jl2)
                                        .addComponent(jl3)
                                        .addComponent(jl4)
                                        .addComponent(jl5))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jt4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(jt3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jt2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jt1)
                                        .addComponent(jt5))
                                .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jl1)
                                        .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jl2))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jl3))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jl4))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jl5))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
        );
        estilo = new FlowLayout();
        control = new Controlador();
    }

    void insertar() {
        jPanel1.add(jb1);
        jPanel1.add(jb2);
        jPanel1.add(jt1);
        jPanel1.add(jt2);
        jPanel1.add(jt3);
        jPanel1.add(jt4);
        jPanel1.add(jt5);
        jPanel1.add(jl1);
        jPanel1.add(jl2);
        jPanel1.add(jl3);
        jPanel1.add(jl4);
        jPanel1.add(jl5);
        this.add(jPanel1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            control.validar(jt1.getText(),jt2.getText(),jt3.getText(),jt4.getText(),jt5.getText());
        } else {
            if (e.getSource() == jb2) {
                control.salir();
            }
        }
    }
}
