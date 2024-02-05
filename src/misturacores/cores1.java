
package misturacores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class cores1 extends javax.swing.JFrame {

   int cor1a , cor2a ; 
    public cores1() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        grpcor1 = new javax.swing.ButtonGroup();
        grpcor2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblsele1 = new javax.swing.JLabel();
        rdamarelo1 = new javax.swing.JRadioButton();
        rdvermelho1 = new javax.swing.JRadioButton();
        rdverde1 = new javax.swing.JRadioButton();
        rdazul1 = new javax.swing.JRadioButton();
        rdbranco1 = new javax.swing.JRadioButton();
        rdpreto1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rdamarelo2 = new javax.swing.JRadioButton();
        rdvermelho2 = new javax.swing.JRadioButton();
        rdverde2 = new javax.swing.JRadioButton();
        rdazul2 = new javax.swing.JRadioButton();
        rdbranco2 = new javax.swing.JRadioButton();
        rdpreto2 = new javax.swing.JRadioButton();
        lblcor1 = new javax.swing.JLabel();
        lblcormais = new javax.swing.JLabel();
        lblcor2 = new javax.swing.JLabel();
        btnmistura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblcorresul = new javax.swing.JLabel();
        lblnomecor1 = new javax.swing.JLabel();
        lblnomecor2 = new javax.swing.JLabel();
        lblnomecorresul = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mistura de Cores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Mistura de cores");

        lblsele1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsele1.setText("Selecione a primeira  cor:");

        grpcor1.add(rdamarelo1);
        rdamarelo1.setSelected(true);
        rdamarelo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/amarelo.png"))); // NOI18N
        rdamarelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdamarelo1ActionPerformed(evt);
            }
        });

        grpcor1.add(rdvermelho1);
        rdvermelho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/vermelho.png"))); // NOI18N
        rdvermelho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdvermelho1ActionPerformed(evt);
            }
        });

        grpcor1.add(rdverde1);
        rdverde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/verde.png"))); // NOI18N
        rdverde1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdverde1ActionPerformed(evt);
            }
        });

        grpcor1.add(rdazul1);
        rdazul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/azul.png"))); // NOI18N
        rdazul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdazul1ActionPerformed(evt);
            }
        });

        grpcor1.add(rdbranco1);
        rdbranco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/branco.png"))); // NOI18N
        rdbranco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbranco1ActionPerformed(evt);
            }
        });

        grpcor1.add(rdpreto1);
        rdpreto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/preto.png"))); // NOI18N
        rdpreto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdpreto1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Selecione a segunda cor:");

        grpcor2.add(rdamarelo2);
        rdamarelo2.setSelected(true);
        rdamarelo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/amarelo.png"))); // NOI18N
        rdamarelo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdamarelo2ActionPerformed(evt);
            }
        });

        grpcor2.add(rdvermelho2);
        rdvermelho2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/vermelho.png"))); // NOI18N
        rdvermelho2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdvermelho2ActionPerformed(evt);
            }
        });

        grpcor2.add(rdverde2);
        rdverde2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/verde.png"))); // NOI18N
        rdverde2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdverde2ActionPerformed(evt);
            }
        });

        grpcor2.add(rdazul2);
        rdazul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/azul.png"))); // NOI18N
        rdazul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdazul2ActionPerformed(evt);
            }
        });

        grpcor2.add(rdbranco2);
        rdbranco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/branco.png"))); // NOI18N
        rdbranco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbranco2ActionPerformed(evt);
            }
        });

        grpcor2.add(rdpreto2);
        rdpreto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misturacores/preto.png"))); // NOI18N
        rdpreto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdpreto2ActionPerformed(evt);
            }
        });

        lblcor1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblcormais.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblcormais.setText("+");
        lblcormais.setToolTipText("");

        lblcor2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnmistura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnmistura.setText("=");
        btnmistura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmisturaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblcorresul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblnomecor1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblnomecor2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblnomecorresul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblcor1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblcormais)
                                .addGap(18, 18, 18)
                                .addComponent(lblcor2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblnomecor1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblnomecor2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmistura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcorresul, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnomecorresul, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblsele1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdamarelo2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdvermelho2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdamarelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdvermelho1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdverde1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdverde2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdazul2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdbranco2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdazul1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdbranco1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdpreto1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdpreto2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblsele1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdvermelho1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdverde1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdazul1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbranco1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdpreto1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdamarelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdvermelho2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdverde2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdazul2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbranco2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdamarelo2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdpreto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcor1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcormais, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcor2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmistura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcorresul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnomecor2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnomecor1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnomecorresul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdamarelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdamarelo1ActionPerformed
        lblcor1.setIcon(new ImageIcon(getClass().getResource("amarelo.png")));
        lblnomecor1.setText("Amarelo");
        cor1a = 1;
    }//GEN-LAST:event_rdamarelo1ActionPerformed

    private void rdamarelo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdamarelo2ActionPerformed
        lblcor2.setIcon(new ImageIcon(getClass().getResource("amarelo.png")));
        lblnomecor2.setText("Amarelo");
        cor2a = 1;
    }//GEN-LAST:event_rdamarelo2ActionPerformed

    private void rdvermelho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdvermelho1ActionPerformed
        lblcor1.setIcon(new ImageIcon(getClass().getResource("vermelho.png")));
        lblnomecor1.setText("Vermelho");
        cor1a = 2;
    }//GEN-LAST:event_rdvermelho1ActionPerformed

    private void rdverde1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdverde1ActionPerformed
        lblcor1.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        lblnomecor1.setText("Verde");
        cor1a = 3;
    }//GEN-LAST:event_rdverde1ActionPerformed

    private void rdazul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdazul1ActionPerformed
        lblcor1.setIcon(new ImageIcon(getClass().getResource("azul.png")));
        lblnomecor1.setText("Azul");
        cor1a = 4;
    }//GEN-LAST:event_rdazul1ActionPerformed

    private void rdbranco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbranco1ActionPerformed
        lblcor1.setIcon(new ImageIcon(getClass().getResource("branco.png")));
        lblnomecor1.setText("Branco");
        cor1a = 5;
    }//GEN-LAST:event_rdbranco1ActionPerformed

    private void rdpreto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdpreto1ActionPerformed
        lblcor1.setIcon(new ImageIcon(getClass().getResource("preto.png")));
        lblnomecor1.setText("Preto");
        cor1a = 6;
    }//GEN-LAST:event_rdpreto1ActionPerformed

    private void rdvermelho2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdvermelho2ActionPerformed
        lblcor2.setIcon(new ImageIcon(getClass().getResource("vermelho.png")));
        lblnomecor2.setText("Vermelho");
        cor2a = 2;
    }//GEN-LAST:event_rdvermelho2ActionPerformed

    private void rdverde2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdverde2ActionPerformed
        lblcor2.setIcon(new ImageIcon(getClass().getResource("verde.png")));
        lblnomecor2.setText("Verde");
        cor2a = 3;
    }//GEN-LAST:event_rdverde2ActionPerformed

    private void rdazul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdazul2ActionPerformed
        lblcor2.setIcon(new ImageIcon(getClass().getResource("azul.png")));
        lblnomecor2.setText("Azul");
        cor2a = 4;
    }//GEN-LAST:event_rdazul2ActionPerformed

    private void rdbranco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbranco2ActionPerformed
        lblcor2.setIcon(new ImageIcon(getClass().getResource("branco.png")));
        lblnomecor2.setText("Branco");
        cor2a = 5;
    }//GEN-LAST:event_rdbranco2ActionPerformed

    private void rdpreto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdpreto2ActionPerformed
        lblcor2.setIcon(new ImageIcon(getClass().getResource("preto.png")));
        lblnomecor2.setText("Preto");
        cor2a = 6;
    }//GEN-LAST:event_rdpreto2ActionPerformed

    private void btnmisturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmisturaActionPerformed
         
    
         
        if(((cor1a == 1)&& (cor2a ==2)) ||((cor1a ==2)&& (cor2a == 1))){
         lblcorresul.setIcon(new ImageIcon(getClass().getResource("laranja.png")));
         lblnomecorresul.setText("Laranja");
         }
        else
            if(((cor1a == 2)&& (cor2a == 4)) ||((cor1a == 4)&& (cor2a == 2))){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("roxo.png")));
                lblnomecorresul.setText("Roxo");
         }
        else
            if((cor1a == 1)&& (cor2a == 3) ||(cor1a == 3)&& (cor2a == 1)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("verdeclaro.png")));
                lblnomecorresul.setText("Verde claro");
         }
        else
            if((cor1a == 3)&& (cor2a == 2) ||(cor1a == 2)&& (cor2a == 3)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("amarelo.png"))); 
                lblnomecorresul.setText("Amarelo");
         }
        else
            if((cor1a == 3)&& (cor2a == 4) ||(cor1a == 4)&& (cor2a ==3)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("ciano.png"))); 
                lblnomecorresul.setText("Ciano");
         }
        else
            if(((cor1a == 5)&& (cor2a == 1)) ||((cor1a == 1)&& (cor2a == 5))){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("perola.png")));
                lblnomecorresul.setText("Pérola");
         }
        else
            if((cor1a == 5)&& (cor2a == 4) ||(cor1a == 4)&& (cor2a == 5)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("azul claro.png")));
                lblnomecorresul.setText("Azul claro");
         }
        else
            if((cor1a == 5)&& (cor2a == 2) ||(cor1a == 2)&& (cor2a == 5)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("rosa.png"))); 
                lblnomecorresul.setText("Rosa");
         }
        else
            if((cor1a == 5)&& (cor2a == 3) ||(cor1a  == 3)&& (cor2a == 5)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("verdeclaro.png")));
                lblnomecorresul.setText("Verde claro");
         }
        else
            if((cor1a == 5)&& (cor2a == 6) ||(cor1a == 6)&& (cor2a == 5)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("cinza.png"))); 
                 lblnomecorresul.setText("Cinza");
         }
        else
            if((cor1a == 6)&& (cor2a == 1) ||(cor1a == 1)&& (cor2a == 6)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("verde abacate.png")));
                lblnomecorresul.setText("Verde abacate");
         }
        else
            if((cor1a == 6)&& (cor2a == 4) ||(cor1a == 4)&& (cor2a == 6)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("azul marinho.png"))); 
                lblnomecorresul.setText("Azul marinho");
         }
        else
            if((cor1a == 6)&& (cor2a == 2) ||(cor1a == 2)&& (cor2a == 6)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("marrom barro.png"))); 
                lblnomecorresul.setText("Marrom barro");
         }
        else
            if((cor1a == 6)&& (cor2a == 3) ||(cor1a == 3)&& (cor2a ==6)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("verde escuro.png")));
                lblnomecorresul.setText("Verde escuro");
         }
        else
            if((cor1a == 1)&& (cor2a == 4) ||(cor1a == 4)&& (cor2a == 1)){
                lblcorresul.setIcon(new ImageIcon(getClass().getResource("verde.png")));
                lblnomecorresul.setText("Verde");
         }
        else
            if((cor1a == 1)&& (cor2a == 1) ||(cor1a == 1)&& (cor2a ==1)){
               lblcorresul.setIcon(new ImageIcon(getClass().getResource("amarelo.png")));
               lblnomecorresul.setText("Amarelo");
         }
        else
            if((cor1a == 2)&& (cor2a == 2) ||(cor1a == 2)&& (cor2a == 2)){
               lblcorresul.setIcon(new ImageIcon(getClass().getResource("vermelho.png")));
               lblnomecorresul.setText("Vermelho");
         }
        else
            if((cor1a == 3)&& (cor2a == 3) ||(cor1a == 3)&& (cor2a == 3)){
               lblcorresul.setIcon(new ImageIcon(getClass().getResource("verde.png")));
               lblnomecorresul.setText("Verde");
         }
        else
            if((cor1a == 4)& (cor2a == 4) ||(cor1a == 4 )&& (cor2a == 4)){
              lblcorresul.setIcon(new ImageIcon(getClass().getResource("azul.png")));
              lblnomecorresul.setText("Azul");
         }
        else
            if((cor1a == 5)&& (cor2a == 5) ||(cor1a == 5)&& (cor2a == 5)){
             lblcorresul.setIcon(new ImageIcon(getClass().getResource("branco.png")));
             lblnomecorresul.setText("Branco");
         }
        else
            if((cor1a == 6)&& (cor2a == 6) ||(cor1a == 6)&& (cor2a == 6)){
             lblcorresul.setIcon(new ImageIcon(getClass().getResource("preto.png")));
             lblnomecorresul.setText("Preto");
         }
            else{
                JOptionPane.showMessageDialog(null,"É necessario selecionar a primeira e \n a segunda cor para verificar"); 
                    cor1a = 0;
                    cor2a = 0;
                    lblcor1.setIcon(null);
                    lblcor2.setIcon(null);
                    lblcorresul.setIcon(null);
                    lblnomecor1.setText("");
                    lblnomecor2.setText("");
                    lblnomecorresul.setText("");
            }
        
    }//GEN-LAST:event_btnmisturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cor1a = 0;
        cor2a = 0;
        lblcor1.setIcon(null);
        lblcor2.setIcon(null);
        lblcorresul.setIcon(null);
        lblnomecor1.setText("");
        lblnomecor2.setText("");
        lblnomecorresul.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

   
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cores1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmistura;
    private javax.swing.ButtonGroup grpcor1;
    private javax.swing.ButtonGroup grpcor2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcor1;
    private javax.swing.JLabel lblcor2;
    private javax.swing.JLabel lblcormais;
    private javax.swing.JLabel lblcorresul;
    private javax.swing.JLabel lblnomecor1;
    private javax.swing.JLabel lblnomecor2;
    private javax.swing.JLabel lblnomecorresul;
    private javax.swing.JLabel lblsele1;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JRadioButton rdamarelo1;
    private javax.swing.JRadioButton rdamarelo2;
    private javax.swing.JRadioButton rdazul1;
    private javax.swing.JRadioButton rdazul2;
    private javax.swing.JRadioButton rdbranco1;
    private javax.swing.JRadioButton rdbranco2;
    private javax.swing.JRadioButton rdpreto1;
    private javax.swing.JRadioButton rdpreto2;
    private javax.swing.JRadioButton rdverde1;
    private javax.swing.JRadioButton rdverde2;
    private javax.swing.JRadioButton rdvermelho1;
    private javax.swing.JRadioButton rdvermelho2;
    // End of variables declaration//GEN-END:variables
}
