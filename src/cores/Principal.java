package cores;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    File file = new File("C:/Users/Iago/Pictures/frades.jpg"); //importando arquivo
    BufferedImage original = ImageIO.read(file);
    ImageIcon iconOriginal = new ImageIcon(original);
    Color color;
    
    
    public Principal() throws IOException {
        initComponents();
        LabelOriginal.setIcon(iconOriginal);
        LabelOriginal.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelOriginal = new javax.swing.JLabel();
        LabelResult = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PeB = new javax.swing.JButton();
        EsclCinz = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EC4 = new javax.swing.JButton();
        EC16 = new javax.swing.JButton();
        EC8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        slider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iago Tíbor");

        PeB.setText("Preto e Branco");
        PeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeBActionPerformed(evt);
            }
        });

        EsclCinz.setText("Escala de Cinza");
        EsclCinz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsclCinzActionPerformed(evt);
            }
        });

        jLabel3.setText("Escala de Cores");

        EC4.setText("4");
        EC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EC4ActionPerformed(evt);
            }
        });

        EC16.setText("16");
        EC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EC16ActionPerformed(evt);
            }
        });

        EC8.setText("8");
        EC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EC8ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manipulação de Cores");

        slider.setMaximum(200);
        slider.setValue(100);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EsclCinz))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PeB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EC4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EC8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EC16)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EC16, EC4, EC8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(LabelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(PeB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EC16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EC8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EC4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EsclCinz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeBActionPerformed
        try {
            preto_branco();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PeBActionPerformed

    private void EC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EC4ActionPerformed
        try {
            cores(4);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EC4ActionPerformed

    private void EC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EC16ActionPerformed
        try {
            cores(16);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EC16ActionPerformed

    private void EC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EC8ActionPerformed
        try {
            cores(8);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EC8ActionPerformed

    private void EsclCinzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsclCinzActionPerformed
        
        float slidervalor = slider.getValue();
            
        BufferedImage manipulada;
        try {
            manipulada = ImageIO.read(file);
            int w = manipulada.getWidth();
            int h = manipulada.getHeight();
            int[] pixels = manipulada.getRGB(0, 0, w, h, null, 0, w);
            int cor;
            for (int col = 0; col < w - 1; col++) {
                for (int lin = 0; lin < h - 1; lin++) {
                    int pos = col * w + lin;
                    Color c = new Color(manipulada.getRGB(col, lin));
                    cor = (c.getBlue() + c.getGreen() + c.getRed()) / 3;
                    
                    int valor = (int)(cor *(slidervalor/100));
                         
                    if(valor >= 255){
                        color = new Color(255,255,255);
                        manipulada.setRGB(col, lin,color.getRGB());
                    }else{
                        color = new Color(valor,valor,valor);
                        manipulada.setRGB(col, lin, color.getRGB());
                    }
                }
            }
            ImageIcon iconManipulado = new ImageIcon(manipulada);

            LabelResult.setIcon(iconManipulado);
            LabelResult.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EsclCinzActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
                
    }//GEN-LAST:event_sliderStateChanged

    public Color quatroCores(float val) {
        Color cor;
        if (val >= 192) {
            cor = new Color(255);
            return cor;
        } else if (val < 192 && val >= 128) {
            cor = new Color(192);
            return cor;
        } else if (val < 128 && val >= 64) {
            cor = new Color(128);
            return cor;
        } else if (val < 64 && val >= 0) {
            cor = new Color(64);
            return cor;
        } else {
            return Color.WHITE;
        }
    }

    public int oitoCores(float val) {
        if (val >= 192) {
            return 255;
        } else if (val < 192 && val >= 160) {
            return 192;
        } else if (val < 160 && val >= 128) {
            return 160;
        } else if (val < 128 && val >= 96) {
            return 128;
        } else if (val < 96 && val >= 64) {
            return 96;
        } else if (val < 64 && val >= 32) {
            return 64;
        } else if (val < 32 && val >= 0) {
            return 32;
        } else {
            return 0;
        }
    }

    public int dezesseisCores(float val) {
        if (val >= 240) {
            return 255;
        } else if (val < 240 && val >= 225) {
            return 240;
        } else if (val < 225 && val >= 218) {
            return 225;
        } else if (val < 218 && val >= 208) {
            return 218;
        } else if (val < 208 && val >= 192) {
            return 208;
        } else if (val < 192 && val >= 176) {
            return 192;
        } else if (val < 176 && val >= 160) {
            return 176;
        } else if (val < 160 && val >= 144) {
            return 160;
        } else if (val < 144 && val >= 128) {
            return 144;
        } else if (val < 128 && val >= 112) {
            return 128;
        } else if (val < 112 && val >= 96) {
            return 112;
        } else if (val < 96 && val >= 80) {
            return 80;
        } else if (val < 80 && val >= 64) {
            return 80;
        } else if (val < 64 && val >= 48) {
            return 64;
        } else if (val < 48 && val >= 32) {
            return 48;
        } else if (val < 32 && val >= 16) {
            return 32;
        } else if (val < 16 && val > 0) {
            return 16;
        } else {
            return 0;
        }
    }

    public void cores(int x) throws IOException {
        BufferedImage manipulada = ImageIO.read(file);
        int w = manipulada.getWidth();
        int h = manipulada.getHeight();
        int[] pixels = manipulada.getRGB(0, 0, w, h, null, 0, w);
        int cor;
        for (int col = 0; col < w - 1; col++) {
            for (int lin = 0; lin < h - 1; lin++) {
                int pos = col * w + lin;
                Color c = new Color(manipulada.getRGB(col, lin));
                cor = (c.getBlue() + c.getGreen() + c.getRed()) / 3;
                int corImagem;
                if (x == 4) {
                    corImagem = quatroCores(cor).getRGB();
                } else if (x == 8) {
                    corImagem = oitoCores(cor);
                } else {
                    corImagem = dezesseisCores(cor);
                }

                manipulada.setRGB(col, lin, corImagem);

            }
        }
        ImageIcon iconManipulado = new ImageIcon(manipulada);

        LabelResult.setIcon(iconManipulado);
        LabelResult.setVisible(true);
    }

    public void preto_branco() throws IOException {

        BufferedImage manipulada = ImageIO.read(file); //cria uma variavel para ser manipulada

        int w = manipulada.getWidth(); //pega a largura da imagem
        int h = manipulada.getHeight(); //pega a altura da imagem
        int[] pixels = manipulada.getRGB(0, 0, w, h, null, 0, w);
        int cor;
        for (int col = 0; col < w - 1; col++) {
            for (int lin = 0; lin < h - 1; lin++) {
//                int pos = col * w + lin;
                Color c = new Color(manipulada.getRGB(col, lin));
                cor = (c.getBlue() + c.getGreen() + c.getRed()) / 3; //faz uma media das cores da imagem
                if (cor < 128) { //se a media for menor q 128, atribui preto ao pixel
                    manipulada.setRGB(col, lin, Color.BLACK.getRGB());
                } else { //se for maior ou igual a 128, atribui branco ao pixel
                    manipulada.setRGB(col, lin, Color.WHITE.getRGB());
                }
            }
        }
        ImageIcon iconManipulado = new ImageIcon(manipulada);

        LabelResult.setIcon(iconManipulado); //seta a nova imagem ao label
        LabelResult.setVisible(true);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EC16;
    private javax.swing.JButton EC4;
    private javax.swing.JButton EC8;
    private javax.swing.JButton EsclCinz;
    private javax.swing.JLabel LabelOriginal;
    private javax.swing.JLabel LabelResult;
    private javax.swing.JButton PeB;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
