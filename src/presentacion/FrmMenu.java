
package presentacion;

import domain.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmMenu extends javax.swing.JFrame {
    
    
    private int  problmNumer=0; 
  
    public FrmMenu() {
        initComponents();   
        
    }
    
    
    public FrmMenu (boolean visible){ 
        initComponents(); 
        btn_value1.setVisible(false); 
        btn_value2.setVisible(false); 
        setVisible(visible);  
        setLocationRelativeTo(null); 
    }
    
    public void resetTextFields(){
        txtfld_valor1.setText("");
        txtfld_valor2.setText("");
        txtfld_valor3.setText("");
        textarea_resultado.setText(""); 
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        panel_principal = new javax.swing.JPanel();
        title_problema = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_problema = new javax.swing.JTextArea();
        txtfld_valor1 = new javax.swing.JTextField();
        txtfld_valor2 = new javax.swing.JTextField();
        label_valor1 = new javax.swing.JLabel();
        label_valor2 = new javax.swing.JLabel();
        btn_solucion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea_resultado = new javax.swing.JTextArea();
        btn_reset = new javax.swing.JButton();
        label_valor3 = new javax.swing.JLabel();
        txtfld_valor3 = new javax.swing.JTextField();
        btn_value1 = new javax.swing.JButton();
        btn_value2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItem_prob1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob4 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob5 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob7 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob8 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob9 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob10 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob11 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob12 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob13 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob14 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob15 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob16 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob17 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob18 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob19 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        menuItem_prob20 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_principal.setBorder(javax.swing.BorderFactory.createTitledBorder("Problema Frame"));

        title_problema.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        title_problema.setText("Problema : ");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textarea_problema.setEditable(false);
        textarea_problema.setColumns(20);
        textarea_problema.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        textarea_problema.setRows(5);
        jScrollPane1.setViewportView(textarea_problema);

        txtfld_valor1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        txtfld_valor1.setForeground(new java.awt.Color(51, 51, 51));

        txtfld_valor2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        txtfld_valor2.setForeground(new java.awt.Color(51, 51, 51));

        label_valor1.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        label_valor1.setText("Valor 1");

        label_valor2.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        label_valor2.setText("Valor 2");

        btn_solucion.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        btn_solucion.setText("Confirmar");
        btn_solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solucionActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textarea_resultado.setEditable(false);
        textarea_resultado.setColumns(20);
        textarea_resultado.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        textarea_resultado.setRows(5);
        jScrollPane2.setViewportView(textarea_resultado);

        btn_reset.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        btn_reset.setText("Restablecer");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        label_valor3.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        label_valor3.setText("Valor 3");

        txtfld_valor3.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        txtfld_valor3.setForeground(new java.awt.Color(51, 51, 51));

        btn_value1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        btn_value1.setText("Value 1");
        btn_value1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_value1ActionPerformed(evt);
            }
        });

        btn_value2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        btn_value2.setText("Value 2");
        btn_value2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_value2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(label_valor1))
                            .addComponent(label_valor2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_valor3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfld_valor2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfld_valor1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfld_valor3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_principalLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(btn_value1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_value2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_reset)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_solucion))
                        .addGroup(panel_principalLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                                    .addComponent(title_problema)
                                    .addGap(390, 390, 390))))))
                .addGap(18, 18, 18))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(title_problema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_valor1))
                        .addGap(44, 44, 44)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_valor2)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_valor3)
                    .addComponent(txtfld_valor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_solucion)
                    .addComponent(btn_reset)
                    .addComponent(btn_value1)
                    .addComponent(btn_value2))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu De Problemas ");

        menuItem_prob1.setText("Problema 1- Persona");
        menuItem_prob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob1ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob1);
        jMenu1.add(jSeparator2);

        menuItem_prob2.setText("Problema 2- Dia Semana");
        menuItem_prob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob2ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob2);
        jMenu1.add(jSeparator3);

        menuItem_prob3.setText("Problema 3- Circulo");
        menuItem_prob3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob3ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob3);
        jMenu1.add(jSeparator4);

        menuItem_prob4.setText("Problema 4- Rectangulo");
        menuItem_prob4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob4ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob4);
        jMenu1.add(jSeparator5);

        menuItem_prob5.setText("Problema 5- Triangulo");
        menuItem_prob5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob5ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob5);
        jMenu1.add(jSeparator6);

        menuItem_prob6.setText("Problema 6- Cuenta Bancaria");
        menuItem_prob6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob6ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob6);
        jMenu1.add(jSeparator7);

        menuItem_prob7.setText("Problema 7- Fecha");
        menuItem_prob7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob7ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob7);
        jMenu1.add(jSeparator8);

        menuItem_prob8.setText("Problema 8- Libro");
        menuItem_prob8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob8ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob8);
        jMenu1.add(jSeparator9);

        menuItem_prob9.setText("Problema 9- Coche");
        menuItem_prob9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob9ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob9);
        jMenu1.add(jSeparator10);

        menuItem_prob10.setText("Problema 10- Animal");
        menuItem_prob10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob10ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob10);
        jMenu1.add(jSeparator11);

        menuItem_prob11.setText("Problema 11- Ordenador");
        menuItem_prob11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob11ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob11);
        jMenu1.add(jSeparator12);

        menuItem_prob12.setText("Problema 12- Telefono");
        menuItem_prob12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob12ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob12);
        jMenu1.add(jSeparator13);

        menuItem_prob13.setText("Problema 13- Articulo");
        menuItem_prob13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob13ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob13);
        jMenu1.add(jSeparator14);

        menuItem_prob14.setText("Problema 14- Pelicula");
        menuItem_prob14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob14ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob14);
        jMenu1.add(jSeparator15);

        menuItem_prob15.setText("Problema 15- Restaurante");
        menuItem_prob15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob15ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob15);
        jMenu1.add(jSeparator16);

        menuItem_prob16.setText("Problema 16- Hotel");
        menuItem_prob16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob16ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob16);
        jMenu1.add(jSeparator17);

        menuItem_prob17.setText("Problema 17- Paquete Turistico");
        menuItem_prob17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob17ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob17);
        jMenu1.add(jSeparator18);

        menuItem_prob18.setText("Problema 18- Mascota");
        menuItem_prob18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob18ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob18);
        jMenu1.add(jSeparator19);

        menuItem_prob19.setText("Problema 19- Descuento Articulo");
        menuItem_prob19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob19ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob19);
        jMenu1.add(jSeparator21);

        menuItem_prob20.setText("Problema 20- Trabajador");
        menuItem_prob20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_prob20ActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_prob20);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_prob13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob13ActionPerformed
        // TODO add your handling code here: 
        resetTextFields();
        problmNumer=13; 
        
        title_problema.setText("Problema 13: Articulo"); 
        label_valor1.setText("Nombre:");
        label_valor2.setText("Descripcion:");
        label_valor3.setText("Precio:"); 
        
        textarea_problema.setText("13. Crear una clase \"Artículo\" que tenga como atributos nombre, descripción \n" +
"y precio, y métodos para obtener la información del artículo."); 
        
    }//GEN-LAST:event_menuItem_prob13ActionPerformed

    private void menuItem_prob12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob12ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer =12;
        btn_value1.setText("Llamar"); 
        btn_value2.setText("Enviar Mensaje:");
        label_valor1.setText("Marca:"); 
        label_valor2.setText("Modelo:"); 
        label_valor3.setText("Tamaño:"); 
        
        textarea_problema.setText("12.Crear una clase \"Teléfono\" que tenga como atributos marca,\n" +
"modelo y tamaño de pantalla, y métodos para llamar y enviar mensajes");
      
        btn_value2.setVisible(true); 
        btn_value1.setVisible(true); 
        
        
    }//GEN-LAST:event_menuItem_prob12ActionPerformed

    private void menuItem_prob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob1ActionPerformed
        // TODO add your handling code here: 
        resetTextFields();
        problmNumer =1; 
        title_problema.setText("Problema 1: Persona");
        // Problema 1   
        textarea_problema.setLineWrap(true);
        textarea_problema.setWrapStyleWord(true); 
        textarea_problema.setText("Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. \n" +
"    Construye los siguientes métodos para la clase: • Un constructor, vacío y un constructor \n" +
"    con los atributos. • Los setters y getters para cada uno de los atributos. \n" +
"    • mostrar(): Muestra los datos de la persona. • \n" +
"    esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.");
        label_valor1.setText("Name"); 
        label_valor2.setText("DNI"); 
        label_valor3.setText("Age"); 
        title_problema.setText("Problema 1 -Persona");
        
        
        
    }//GEN-LAST:event_menuItem_prob1ActionPerformed

    private void btn_solucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solucionActionPerformed
        // TODO add your handling code here: 
         textarea_resultado.setLineWrap(true); 
         textarea_resultado.setWrapStyleWord(true);   
         
         
        switch (problmNumer){
            case 1 : 
                Persona person = new Persona(txtfld_valor1.getText(),txtfld_valor2.getText(),Integer.parseInt(txtfld_valor3.getText())); 
             textarea_resultado.setText(person.mostrar()+"\nEs mayor de edad :"+String.valueOf(person.esMayorEdad())); 
             break; 
            case 2:  
                DiaSemana diasemana = new DiaSemana(Integer.parseInt(txtfld_valor1.getText()));  
              textarea_resultado.setText(diasemana.diaSemana());  
              break; 
            case 3:   
                Circulo circulo = new Circulo(Double.parseDouble(txtfld_valor2.getText()), txtfld_valor1.getText());
                textarea_resultado.setText("Color Circulo : "+circulo.getColor()+"\nRadio Circulo: "+circulo.getRadio()
                        +"\nPerimetro:\n"+circulo.perimetro()+"\nArea :\n"+circulo.area() );
                break;  
            case 4:  
                Rectangulo rectangulo = new Rectangulo(Double.parseDouble(txtfld_valor1.getText()),
                        Double.parseDouble(txtfld_valor2.getText())); 
                
                textarea_resultado.setText("ANCHO RECTANGULO : \n"+rectangulo.getAncho() 
                        +"\nALTO DEL RECTANGULO:\n"+rectangulo.getAlto()+"Perimetro del RECTANGULO : \n"
                        +rectangulo.perimetro()+"\nArea del RECTANGULO: \n"+rectangulo.area());
                break;  
            case 5: 
                Triangulo triangulo = new Triangulo(Double.parseDouble(txtfld_valor2.getText()),
                        Double.parseDouble(txtfld_valor1.getText()));  
                triangulo.setLados(Integer.parseInt(txtfld_valor3.getText())); 
                
                
                textarea_resultado.setText("Base Triangulo : \n"+triangulo.getAncho()+"\nAltura Triangulo :\n"
                        +triangulo.getAltura()+"\nPerimetro del Triangulo:\n"+triangulo.perimetro() 
                        +"\nArea Triangulo:\n"+triangulo.area());
                break; 
            case 7:
                Fecha fecha = new Fecha(Integer.parseInt(txtfld_valor1.getText()),
                        Integer.parseInt(txtfld_valor2.getText()),Integer.parseInt(txtfld_valor3.getText())); 
                
                textarea_resultado.setText("Formato Corto:"+fecha.formatoCorto() 
                        +"\nFormato Mediano:"+fecha.formatoMediano()+"\nFormato Largo: \n"+fecha.formatoLargo());
                break;
                
            case 8:  
                Libro lib = new Libro(txtfld_valor1.getText(), txtfld_valor2.getText(),
                        Integer.parseInt(txtfld_valor3.getText()));   
                
                textarea_resultado.setText("Titulo Libro:\n"+lib.titulo() +"\nAutor:\n"+lib.autor()
                        +"\nNumero de paginas:"+lib.numeroPaginas());
                break;
            case 10:   
                Animal animal = new Animal(txtfld_valor1.getText(), txtfld_valor2.getText()
                        , Integer.parseInt(txtfld_valor3.getText())); 
                
                textarea_resultado.setText("Especie :"+animal.obtenerEspecie()
                        +"\nColor:"+animal.obtenerColor()+"\nEdad:"+animal.obtenerEdad());
                break;
            case 11: 
                Ordenador ordenador = new Ordenador(txtfld_valor1.getText(),txtfld_valor2.getText(),
                        Double.parseDouble(txtfld_valor3.getText())); 
                
                 textarea_resultado.setText("Marca :"+ordenador.obtenerMarca()
                        +"\nModelo:"+ordenador.obtenerModelo()+"\nPrecio:"+ordenador.obtenerPrecio());
                break; 
            case 13: 
                Articulo arti = new Articulo(txtfld_valor1.getText(),txtfld_valor2.getText(),
                        Double.parseDouble(txtfld_valor3.getText())); 
                
                textarea_resultado.setText("Nombre : "+arti.obtenerNombre()+"\nDescripcion:\n"+arti.obtenerDescripcion()
                        +"\nPrecio: "+arti.obtenerPrecio());
                break; 
            case 14:  
                Pelicula peli = new Pelicula(txtfld_valor1.getText(), txtfld_valor2.getText()
                        , Double.parseDouble(txtfld_valor3.getText())); 
                
                textarea_resultado.setText("Titulo: "+peli.obtenerTitulo()+"\nDirector:"+peli.obtenerDirector()
                        +"\nDuraccion: "+peli.obtenerDuracion());
                break; 
            case 15: 
                Restaurante res = new Restaurante(txtfld_valor1.getText(), txtfld_valor2.getText(), txtfld_valor3.getText());
                
                textarea_resultado.setText("Nombre: "+res.obtenerNombre() +"\nDireccion:\n"
                        +res.obtenerDireccion()+"\nTipo de Comida:"+res.obtenerTipoComida());
                break;
            case 16: 
                Hotel ho = new Hotel(txtfld_valor1.getText(),txtfld_valor2.getText()
                       ,Integer.parseInt(txtfld_valor3.getText())); 
                textarea_resultado.setText("Nombre: "+ho.obtenerNombre() +"\nDireccion:\n"
                        +ho.obtenerDireccion()+"\nNº Habitaciones: "+ho.obtenerNumHabitaciones());
                break;
            case 17:  
                PaqueteTuristico pack = new PaqueteTuristico(txtfld_valor1.getText(), txtfld_valor2.getText()
                        , Double.parseDouble(txtfld_valor3.getText())); 
                
                textarea_resultado.setText("Destino : \n"+pack.obtenerDestino() +"\nFecha Salida: "
                        +pack.obtenerFechaSalida()+"\nPrecio: "+pack.obtenerPrecio());
                break; 
            case 18:  
                Mascota mascota = new Mascota(txtfld_valor1.getText(), txtfld_valor2.getText()
                        ,Integer.parseInt(txtfld_valor3.getText())); 
                textarea_resultado.setText("Nombre: "+mascota.obtenerNombre() +"\nRaza: "+mascota.obtenerRaza()
                +"\nEdad: "+mascota.obtenerEdad()); 
                break; 
            case 19: 
                DescuentoArticulo desArti = new DescuentoArticulo(txtfld_valor1.getText(),
                        Double.parseDouble(txtfld_valor2.getText())); 
                textarea_resultado.setText("Descripcion: "+desArti.getDescripcion() +"\nPrecio: "+desArti.getPrecio() 
                        +"\nDescuento Aplicado : "+desArti.descuentoAplicado());
                break; 
            case 20:  
                Trabajador trabajador = new Trabajador(txtfld_valor1.getText()
                        , Double.parseDouble(txtfld_valor2.getText())); 
                
                trabajador.setHorasTrabajadas(Integer.parseInt(txtfld_valor3.getText())); 
                
                textarea_resultado.setText("Nombre Trabajador: "+trabajador.getNombreTrabajador() 
                        +"\nSueldo:"+trabajador.getSueldo()+"\nHoras Trabajadas: "+trabajador.getHorasTrabajadas()
                        +"\nPago Semanal: "+trabajador.sueldoSemanal(trabajador.getHorasTrabajadas())); 
                break;
        }       
           
       
        
    }//GEN-LAST:event_btn_solucionActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here: 
        problmNumer=0; 
        label_valor1.setText("Valor 1"); 
         label_valor2.setText("Valor 2");
          label_valor3.setText("Valor 3"); 
          txtfld_valor1.setText("");
          txtfld_valor2.setText("");
          txtfld_valor3.setText("");  
          textarea_problema.setText(""); 
          textarea_resultado.setText("");
        title_problema.setText("Problema: ");
        textarea_problema.setText(""); 
        
        
        btn_value1.setVisible(false); 
        btn_value2.setVisible(false); 
        
        txtfld_valor1.setEnabled(true); 
        txtfld_valor2.setEnabled(true); 
        txtfld_valor3.setEnabled(true); 
        
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void menuItem_prob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob2ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer =2;   
        title_problema.setText("Problema 2: Formato Fechas");
        label_valor1.setText("Dia Semana:"); 
        label_valor2.setText(""); 
        label_valor3.setText(""); 
        textarea_problema.setText(" 2.Realice una clase en java que, con base en un número proporcionado (1-7),\n" +
"devuelva el día de la semana que le corresponde (Lunes a Domingo)."); 
        txtfld_valor2.setEnabled(false); 
        txtfld_valor3.setEnabled(false);
        
        
    }//GEN-LAST:event_menuItem_prob2ActionPerformed

    private void menuItem_prob3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob3ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer =3; 
        title_problema.setText("Problema 3: Circulo Hallar el Perimetro y Area ");
        label_valor3.setText(""); 
        txtfld_valor3.setEnabled(false); 
        textarea_problema.setText("3.Crear una clase \"Círculo\" que tenga como atributos radio y color, \n" +
"    y métodos para calcular el área y el perímetro del círculo.");  
        label_valor1.setText("Color Circulo: "); 
        label_valor2.setText("Radio Circulo :");  
        label_valor3.setText(""); 
        
        
    }//GEN-LAST:event_menuItem_prob3ActionPerformed

    private void menuItem_prob4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob4ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer=4;  
        title_problema.setText("Problema 4: Rectangulo Hallar Area y Perimetro");
        textarea_problema.setText("  4.Crear una clase \"Rectángulo\" que tenga como atributos ancho y alto,\n" +
"    y métodos para calcular el área y el perímetro del rectángulo."); 
        
        label_valor1.setText("Rectangulo (Ancho):");
        label_valor2.setText("Rectangulo (Alto):");
        label_valor3.setText(""); 
        txtfld_valor3.setEnabled(false); 
        
    }//GEN-LAST:event_menuItem_prob4ActionPerformed

    private void menuItem_prob5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob5ActionPerformed
        // TODO add your handling code here:   
        resetTextFields();
        problmNumer =5;  
        title_problema.setText("Problema 5_:Hallar Perimetro y Area del Triangulo");
        label_valor1.setText("Base Triangulo : ");
        label_valor2.setText("Altura Triangulo :"); 
        label_valor3.setText("Numeros Lados:");
        
        textarea_problema.setText("  4.Crear una clase \"Triangulo\" que tenga como atributos base y altura,\n" +
"    y métodos para calcular el área y el perímetro del Triangulo.");
        
    }//GEN-LAST:event_menuItem_prob5ActionPerformed

    private void menuItem_prob6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob6ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer =6; 
        
        JFrmDialog dialog = new JFrmDialog(this, true); 
        dialog.setTitle("Cuenta Bancaria");
        dialog.setVisible(true);  
        
        
    }//GEN-LAST:event_menuItem_prob6ActionPerformed

    private void menuItem_prob7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob7ActionPerformed
        // TODO add your handling code here: 
        resetTextFields();
        problmNumer=7; 
        title_problema.setText("Problema 7: Fecha"); 
        label_valor1.setText("Dia :");
        label_valor2.setText("Mes"); 
        label_valor3.setText("Año:"); 
        
        textarea_problema.setText("7. Crear una clase \"Fecha\" que tenga como atributos día, mes y año, \n" +
"y métodos para establecer y obtener la fecha en diferentes formatos.\n" +
"Debe imprimir la fecha en formato corto (MM/DD/AA)\n" +
",formato largo (DD de “MES EN PALABRAS” del AÑO), y en formato mediano (MM-DD-AAAA)");  
        
    }//GEN-LAST:event_menuItem_prob7ActionPerformed

    private void menuItem_prob8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob8ActionPerformed
        // TODO add your handling code here: 
        resetTextFields();
        problmNumer=8; 
        title_problema.setText("Problema 8: Libro");  
        label_valor1.setText("Titulo:"); 
        label_valor2.setText("Autor:"); 
        label_valor3.setText("Numero de Paginas:");  
        
        textarea_problema.setText("8.Crear una clase \"Libro\" que tenga como atributos título\n" +
", autor y número de páginas, y métodos para obtener la información del libro.");
        
    }//GEN-LAST:event_menuItem_prob8ActionPerformed

    private void menuItem_prob9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob9ActionPerformed
        // TODO add your handling code here:
        resetTextFields();
        problmNumer=9; 
        btn_value1.setText("Acelerar") ;
        btn_value2.setText("Frenar"); 
        
        title_problema.setText("Problema 9: Coche");
        label_valor1.setText("Marca:");
        label_valor2.setText("Modelo:");
        label_valor3.setText("Velocidad:");
        textarea_problema.setText("8.Crear una clase \"Coche\" que tenga como atributos Marca\n" +
", Modelo y Velocidad, y métodos para acelerar y frenar coche."); 
        
        btn_value1.setVisible(true); 
        btn_value2.setVisible(true); 
        
        
    }//GEN-LAST:event_menuItem_prob9ActionPerformed

    private void btn_value1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_value1ActionPerformed
        // TODO add your handling code here: 
       if(problmNumer==9){
        Coche coche =  new Coche();
        textarea_resultado.setText(coche.acelerar());   
       } 
       else if(problmNumer==12){
           Telefono telefono = new Telefono();  
           textarea_resultado.setText(telefono.llamar());
       }
        
    }//GEN-LAST:event_btn_value1ActionPerformed

    private void btn_value2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_value2ActionPerformed
        // TODO add your handling code here: 
        if(problmNumer==9){
             Coche coche = new Coche(); 
            textarea_resultado.setText(coche.frenar());
        }
        else if(problmNumer==12){
            Telefono telefono = new Telefono();  
            textarea_resultado.setText(telefono.enviarMensaje());
        }
       
    }//GEN-LAST:event_btn_value2ActionPerformed

    private void menuItem_prob10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob10ActionPerformed
        // TODO add your handling code here: 
        resetTextFields();
        problmNumer=10;
        title_problema.setText("Problema 10: Animal");  
        label_valor1.setText("Especie :"); 
        label_valor2.setText("Color: ");
        label_valor3.setText("Edad:"); 
        
        textarea_problema.setText("10.Crear una clase \"Animal\" que tenga como atributos especie, \n" +
"edad y color, y métodos para establecer y obtener estos atributos.");
        
    }//GEN-LAST:event_menuItem_prob10ActionPerformed

    private void menuItem_prob11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob11ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer=11; 
        title_problema.setText("Problema 11: Ordenador"); 
        label_valor1.setText("Marca:");
        label_valor2.setText("Modelo: "); 
        label_valor3.setText("Precio: ");
        
        textarea_problema.setText("11.Crear una clase \"Ordenador\" que tenga como atributos \n" +
"marca, modelo y precio, y métodos para obtener la información del ordenador."); 
        
    }//GEN-LAST:event_menuItem_prob11ActionPerformed

    private void menuItem_prob14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob14ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer=14; 
        title_problema.setText("Problema 14: Pelicula"); 
        label_valor1.setText("Titulo:");
        label_valor2.setText("Director:"); 
        label_valor3.setText("Duraccion:"); 
        
        textarea_problema.setText("14. Crear una clase \"Película\" que tenga como atributos \n" +
"título, director y duración, y métodos para obtener la información de la película.");
    }//GEN-LAST:event_menuItem_prob14ActionPerformed

    private void menuItem_prob15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob15ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer=15; 
        title_problema.setText("Problema 15: Restaurante"); 
        label_valor1.setText("Nombre: "); 
        label_valor2.setText("Direccion: ");
        label_valor3.setText("Tipo de comida :"); 
        
        textarea_problema.setText("15.Crear una clase \"Restaurante\" que tenga como atributos nombre, dirección y tipo de comida,\n" +
"y métodos para obtener la información del restaurante.");
        
    }//GEN-LAST:event_menuItem_prob15ActionPerformed

    private void menuItem_prob16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob16ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer=16; 
        title_problema.setText("Problema 16: Hotel"); 
        label_valor1.setText("Nombre:");
        label_valor2.setText("Direccion: ");
        label_valor3.setText("Nº Habitaciones: "); 
        
        textarea_problema.setText("16.Crear una clase \"Hotel\" que tenga como atributos nombre, dirección y \n" +
"número de habitaciones, y métodos para obtener la información del hotel.");
        
        
    }//GEN-LAST:event_menuItem_prob16ActionPerformed

    private void menuItem_prob17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob17ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer=17; 
        
        title_problema.setText("Problema 17: Paquete Turistico"); 
        label_valor1.setText("Destino: ");
        label_valor2.setText("Fecha de Salida:"); 
        label_valor3.setText("Precio:"); 
        
        textarea_problema.setText("17.Crear una clase \"Paquete Turístico\" que tenga como atributos destino, fecha de salida y precio,\n" +
"y métodos para obtener la información del paquete turístico.");
    }//GEN-LAST:event_menuItem_prob17ActionPerformed

    private void menuItem_prob18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob18ActionPerformed
        // TODO add your handling code here: 
        resetTextFields();
        problmNumer=18; 
        title_problema.setText("Problema 18: Mascota"); 
        label_valor1.setText("Nombre:");
        label_valor2.setText("Raza:");
        label_valor3.setText("Edad:"); 
        
        textarea_problema.setText("18.Crear una clase \"Mascota\" que tenga como atributos nombre, raza y edad,\n" +
"y métodos para establecer y obtener estos atributos."); 
        
    }//GEN-LAST:event_menuItem_prob18ActionPerformed

    private void menuItem_prob19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob19ActionPerformed
        // TODO add your handling code here:  
        resetTextFields();
        problmNumer=19; 
        
        title_problema.setText("Problema 19: Descuento Articulo"); 
        label_valor1.setText("Descripcion: "); 
        label_valor2.setText("Precio: ");
        label_valor3.setText(""); 
        
        txtfld_valor3.setEnabled(false); 
        textarea_problema.setText("19.Desarrolla una clase en Java para determinar el descuento que tendrá un artículo. "
        + "\nConsidere que si su precio es mayor o igual a $200 se le aplica un descuento de 15%, "
        + "\ny si su precio es mayor a $100 pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%."
                + "\n" 
        +
"a. Los atributos que tendrá la clase son descripción del artículo, precio, valor del descuento\n" +
"b. La clase debe tener un método que me devuelva el descuento aplicado al artículo.\n" +
"c. Implementar en el método main un objeto que use esta clase con valores leídos del teclado.");
        
    }//GEN-LAST:event_menuItem_prob19ActionPerformed

    private void menuItem_prob20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_prob20ActionPerformed
        // TODO add your handling code here: 
       resetTextFields();
        problmNumer=20;  
        title_problema.setText("Problema 20: Trabajador"); 
        
        label_valor1.setText("Nombre del Trabajador: ");
        label_valor2.setText("Sueldo:");
        label_valor3.setText("Horas Trabajadas:"); 
        
        textarea_problema.setText("20.Desarrollar una clase en para determinar el sueldo semanal de un trabajador con un nombre,"
                + "\ncon base en las horas trabajadas y el pago por hora, considerando que después de las 40 horas "
                + "\ncada hora se considera como excedente y se paga el doble.\n" +
"a.	Identifique los atributos a utilizar\n" +
"b.	Identifique los constructores y métodos a utilizar\n" +
"c.	Cree un programa en el main que utilice esta clase con valores leídos del teclado.");
        
         
    }//GEN-LAST:event_menuItem_prob20ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_solucion;
    private javax.swing.JButton btn_value1;
    private javax.swing.JButton btn_value2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel label_valor1;
    private javax.swing.JLabel label_valor2;
    private javax.swing.JLabel label_valor3;
    private javax.swing.JMenuItem menuItem_prob1;
    private javax.swing.JMenuItem menuItem_prob10;
    private javax.swing.JMenuItem menuItem_prob11;
    private javax.swing.JMenuItem menuItem_prob12;
    private javax.swing.JMenuItem menuItem_prob13;
    private javax.swing.JMenuItem menuItem_prob14;
    private javax.swing.JMenuItem menuItem_prob15;
    private javax.swing.JMenuItem menuItem_prob16;
    private javax.swing.JMenuItem menuItem_prob17;
    private javax.swing.JMenuItem menuItem_prob18;
    private javax.swing.JMenuItem menuItem_prob19;
    private javax.swing.JMenuItem menuItem_prob2;
    private javax.swing.JMenuItem menuItem_prob20;
    private javax.swing.JMenuItem menuItem_prob3;
    private javax.swing.JMenuItem menuItem_prob4;
    private javax.swing.JMenuItem menuItem_prob5;
    private javax.swing.JMenuItem menuItem_prob6;
    private javax.swing.JMenuItem menuItem_prob7;
    private javax.swing.JMenuItem menuItem_prob8;
    private javax.swing.JMenuItem menuItem_prob9;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextArea textarea_problema;
    private javax.swing.JTextArea textarea_resultado;
    private javax.swing.JLabel title_problema;
    private javax.swing.JTextField txtfld_valor1;
    private javax.swing.JTextField txtfld_valor2;
    private javax.swing.JTextField txtfld_valor3;
    // End of variables declaration//GEN-END:variables
}
