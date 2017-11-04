
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
clase de tipo Jpanel que llamas los hilos
*/
public class Bola extends javax.swing.JPanel implements Runnable {
   Thread hilo,hilo1,hilo2,hilo3,hilo4,hilo5;
    int x;

 
   /*
    constructor de la clase Bola
    */
    public Bola() {
        initComponents();
     
         hilo1=new Thread(this);
         hilo2=new Thread(this);
         hilo3=new Thread(this);
        
        
    }

    /*
    metodo que pinta la bola en el jpanel
    */
    public void paint(Graphics sd){
        sd.setColor(Color.getHSBColor(0, 64, 67));
        sd.fillRect(0, 0, getWidth(), getHeight());
        sd.setColor(Color.red);
        sd.fillOval(x, 0, 20, 20);
        
    }
    /*
    metodo para iniciar los hilos de acuerdo a la tecla presionada enviada a traves de una variable entera
    */
     public void iniciar(int r,int d){
         this.x=r;
         switch(d){
             case 1:{
                 if(hilo!=null){
                    System.out.println("Aqui");
                    reset(1); 
                    hilo=new Thread(this);
                    hilo.start();                    
                 }else{
                     System.out.println("Aqui121");
                    hilo=new Thread(this);
                    hilo.start();
                 }
                 break;
             }
             case 2:{
                  if(hilo1!=null){
                    System.out.println("Aqui");
                    reset(1); 
                    hilo1=new Thread(this);
                    hilo1.start();                    
                 }else{
                     System.out.println("Aqui121");
                    hilo1=new Thread(this);
                    hilo1.start();
                 }
                 break;
             }
             case 3:{
                  if(hilo2!=null){
                    System.out.println("Aqui");
                    reset(1); 
                    hilo2=new Thread(this);
                    hilo2.start();                    
                 }else{
                     System.out.println("Aqui121");
                    hilo2=new Thread(this);
                    hilo2.start();
                 }
                 break;
             }
             case 4:{
                 if(hilo3!=null){
                    System.out.println("Aqui");
                    reset(4); 
                    hilo3=new Thread(this);
                    hilo3.start();                    
                 }else{
                     System.out.println("Aqui121");
                    hilo3=new Thread(this);
                    hilo3.start();
                 }
                 break;
             }
             case 5:{
                 if(hilo4!=null){
                    System.out.println("Aqui");
                    reset(4); 
                    hilo4=new Thread(this);
                    hilo4.start();                    
                 }else{
                     System.out.println("Aqui121");
                    hilo4=new Thread(this);
                    hilo4.start();
                 }
             }
             case 6:{
                if(hilo5!=null){
                    System.out.println("Aqui");
                    reset(4); 
                    hilo5=new Thread(this);
                    hilo5.start();                    
                 }else{
                     System.out.println("Aqui121");
                    hilo5=new Thread(this);
                    hilo5.start();
                 } 
             }
         }
       }  
/*
     metodo para indicar la posicion de acuerdo a donde termina la bola
     */
public void reset(int bandera){
    switch(bandera){
        case 4:this.x=0;break;
        case 1:this.x=320;break;
        
    }
  
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed
/*
    metodo que ejecuta el hilo, es decir mueve la bola 
    */
    @Override
     public void run() {
       try {
        
          if(x==0){
              System.out.println("Esta a pelota aquiqwqw"+x);
            while(x<=360){
               Thread.sleep(90);
                x+=10;
                System.out.println("Termine el ciclo"+x);
                repaint();
            }
         
     
            }
            else{
                  System.out.println("Esta a pelota aquixx"+x);       
                while(x>=-10){
                       Thread.sleep(90);
                        x-=10;
                        repaint();
                    }
                   
            } 
       
       }catch (Exception e) {
                   
                }
       System.out.println("Esta a pelota aqui......."+x);
        }
   
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

