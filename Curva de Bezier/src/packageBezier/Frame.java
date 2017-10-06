package packageBezier;

import java.awt.Graphics;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashSet;

public class Frame extends javax.swing.JFrame {
    
    private final ArrayList listaPontos;
    private final ArrayList listaPontos2;
    Graphics g;
    Paint p = null;
    HashSet<Point> pontosBezier;
    
    public Frame() {
        
        pontosBezier = new HashSet<>();
        listaPontos = new ArrayList();
        listaPontos2 = new ArrayList();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        canvas = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setName(""); // NOI18N
        canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        canvas.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void canvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseClicked
        int x=evt.getX();
        int y=evt.getY();
        Point p = new Point(x,y);
        this.listaPontos.add(p);
        this.desenhaRetas();
        this.desenharCurvaBezier();
    }//GEN-LAST:event_canvasMouseClicked
    
    public void desenharCurvaBezier(){
        
        g = canvas.getGraphics();
        g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        this.desenhaRetas();
        double indiceT = 0.0005;
        
        this.curvaBezier(listaPontos, indiceT);
       
        if(this.listaPontos2.size() < 1){
            return;
        }
               
        for(int i=1 ; i<this.listaPontos2.size() ; i++){
                Point ant = (Point) this.listaPontos2.get(i-1);
                Point prox = (Point) this.listaPontos2.get(i);
                g.drawLine(ant.getValorX(), ant.getValorY(), prox.getValorX(), prox.getValorY());
                g.fillOval(prox.getValorX(), prox.getValorY(), 10, 10);
        }
        this.listaPontos2.clear();
    }
    
    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    
    public void desenhaRetas(){
        int i;
        
        g = canvas.getGraphics();
        if(this.listaPontos.size()<1){
            Point aux = (Point) this.listaPontos.get(0);
            g.fillOval(aux.getValorX(), aux.getValorY(), 10, 10);
            
        }else{
            for(i=1 ; i<this.listaPontos.size() ; i++){
                Point ant = (Point) this.listaPontos.get(i-1);
                Point prox = (Point) this.listaPontos.get(i);
                g.drawLine(ant.getValorX(), ant.getValorY(), prox.getValorX(), prox.getValorY());
                g.fillOval(prox.getValorX(), prox.getValorY(), 10, 10);
            }
        }
    }
    
    private long fatorial(int n) {
	if (n == 1 || n == 0) {
            return 1;
	} else {
            return n * fatorial(n-1);
	}		
    }
    
    private double C(int N, int i) {
        double dblRetorno = 0.0;
	dblRetorno = fatorial(N) / (fatorial(i) * fatorial(N - i));		
	return dblRetorno;
    }
    
    public void curvaBezier(ArrayList pontosControle,  double indiceT) {
		Point ponto = new Point();
		int i, k, x, y, N;	//Pontos de controle menos 1 (um)
		double t;
		
		N = pontosControle.size()-1;
		t = 0;
		for (i=1 ; t<=1 ; i++) {						
			x = 0; 
			y = 0;
			for (k=0 ; k <= N  ; k++) {
					x = x + (int)(C(N, k) * Math.pow((double)t, (double)k) * Math.pow((double)1-t,(double)N-k) * ((Point)pontosControle.get(k)).x);
					y = y + (int)(C(N, k) * Math.pow((double)t, (double)k) * Math.pow((double)1-t,(double)N-k) * ((Point)pontosControle.get(k)).y);
			}

			ponto = new Point(x,y);
                        this.listaPontos2.add(ponto);
						
			if (t == 1) {
				t = 1.1;
			} else if (indiceT * i > 1) {
				t = 1;
			} else {
				t = indiceT * i;
			}
		}				 
	}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas;
    private java.awt.Canvas canvas1;
    // End of variables declaration//GEN-END:variables
}
