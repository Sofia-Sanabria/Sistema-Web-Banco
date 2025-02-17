package Contenidos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author MAN-U
 */
public class PanelPagarMisTarjetas extends javax.swing.JPanel implements Interface_Panel {

    /**
     * Creates new form PagarMisTarjetas
     */
    public PanelPagarMisTarjetas() {
        initComponents();
        changeComponentsProperties();
    }
    
    /**
     * Método que cambia el color y la transparencia del jPanel. 
     */
    @Override
    public final void changeComponentsProperties(){
        this.setBackground(new Color(0, 0, 0, 0));
    }
    
    /**
     * Llama al método desplegarX para desplegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void desplegarComponentes(){
        desplegarX(jLabelTituloPagarMisTarjetas, 290,1);
        desplegarX(jLabelCodigoTarjetaAPagar, 290,1);
        desplegarX(jPanelPagarMisTarjetas, 290,1);
        desplegarX(jLabelMontoAPagarTarjeta, 290,1);
        desplegarX(jComboBoxCodigosTarjetas, 290,1);
        desplegarX(jTextMontoAPagarTarjeta, 290,1);
        desplegarX(jButtonConfirmarPagoMiTarjeta, 290,1);
        desplegarX(jLabelPagoMinimoTarjeta, 290,1);
        desplegarX(jLabelDatoPagoMinimo, 290,1);
    }
    
    /**
     * Llama al método plegarX para plegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void plegarComponentes(){
        plegarX(jLabelTituloPagarMisTarjetas, 290,1);
        plegarX(jLabelCodigoTarjetaAPagar, 290,1);
        plegarX(jPanelPagarMisTarjetas, 290,1);
        plegarX(jLabelMontoAPagarTarjeta, 290,1);
        plegarX(jComboBoxCodigosTarjetas, 290,1);
        plegarX(jTextMontoAPagarTarjeta, 290,1);
        plegarX(jButtonConfirmarPagoMiTarjeta, 290,1);
        plegarX(jLabelPagoMinimoTarjeta, 290,1);
        plegarX(jLabelDatoPagoMinimo, 290,1);
    }
    
    /**
     * Método que cambia la dimensión de un Component simulando su despliegue en pantalla
     * @param jcomponent      Component a ser desplegado
     * @param totalDesplegarX Parámetro tipo int que determina cuanto se sumará a la anchura
     * actual del JPanel
     * @param time            Milisegundos para simular los intervalos de la animación
     */
    @Override
    public void desplegarX(Component jcomponent, int totalDesplegarX, int time){
        Thread hiloDesplegar = new Thread() { //declara un nuevo hilo
            @Override
            public void run(){
                int anchuraActual = jcomponent.getWidth();
                //ciclo en donde se redimensiona el widget
                for(int desplegarX = anchuraActual; desplegarX <= anchuraActual+totalDesplegarX; desplegarX++){
                    try {
                        Thread.sleep(time);
                        jcomponent.setSize(new Dimension(desplegarX, jcomponent.getHeight())); //redimensiona el JPanel
                    } catch (InterruptedException ex) {
                        System.err.print("No se pudo desplegar el Component");
                    }
                }
            }
        }; hiloDesplegar.start();
    }
    
    
    /**
     * Método que cambia la dimensión de un Component simulando su plegado
     * @param jcomponent   Component a ser plegado
     * @param totalPlegarX Parámetro tipo int que determina cuanto se restará a la anchura
     * actual del JPanel
     * @param time   Milisegundos para simular los intervalos de la animación
     */
    @Override
    public void plegarX(Component jcomponent, int totalPlegarX, int time){
        Thread hiloPlegar = new Thread() { //declara un nuevo hilo
            @Override
            public void run(){ 
                int anchuraActual = jcomponent.getWidth();
                //ciclo en donde se disminuye la dimensión del JPanel de uno en uno
                for(int plegarX = anchuraActual; plegarX >= anchuraActual-totalPlegarX; plegarX--){ 
                    //captura la excepción InterruptedException generada por .sleep()
                    try {
                        Thread.sleep(time);
                        jcomponent.setSize(new Dimension(plegarX, jcomponent.getHeight())); //redimensiona el JPanel
                    } catch (InterruptedException ex) {
                        System.err.print("No se pudo plegar el Component");
                    }
                }
            }
        }; hiloPlegar.start(); //comienza el hilo
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPagarMisTarjetas = new javax.swing.JPanel();
        jLabelTituloPagarMisTarjetas = new javax.swing.JLabel();
        jTextMontoAPagarTarjeta = new javax.swing.JTextField();
        jLabelCodigoTarjetaAPagar = new javax.swing.JLabel();
        jLabelMontoAPagarTarjeta = new javax.swing.JLabel();
        jButtonConfirmarPagoMiTarjeta = new javax.swing.JButton();
        jComboBoxCodigosTarjetas = new javax.swing.JComboBox<>();
        jLabelPagoMinimoTarjeta = new javax.swing.JLabel();
        jLabelDatoPagoMinimo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(755, 652));

        jPanelPagarMisTarjetas.setBackground(new java.awt.Color(68, 114, 196));
        jPanelPagarMisTarjetas.setPreferredSize(new java.awt.Dimension(707, 388));

        jLabelTituloPagarMisTarjetas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTituloPagarMisTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPagarMisTarjetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPagarMisTarjetas.setText("PAGAR MIS TARJETAS");

        jTextMontoAPagarTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextMontoAPagarTarjeta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabelCodigoTarjetaAPagar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCodigoTarjetaAPagar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoTarjetaAPagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCodigoTarjetaAPagar.setText("Codigo de Tarjeta a Pagar");

        jLabelMontoAPagarTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMontoAPagarTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMontoAPagarTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMontoAPagarTarjeta.setText("Monto a Pagar");
        jLabelMontoAPagarTarjeta.setToolTipText("");

        jButtonConfirmarPagoMiTarjeta.setBackground(new java.awt.Color(0, 51, 102));
        jButtonConfirmarPagoMiTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonConfirmarPagoMiTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmarPagoMiTarjeta.setText("Confirmar Pago");

        jComboBoxCodigosTarjetas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBoxCodigosTarjetas.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCodigosTarjetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta 1", "Tarjeta 2", "Tarjeta 3", "Tarjeta 4" }));

        jLabelPagoMinimoTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelPagoMinimoTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagoMinimoTarjeta.setText("Pago Minimo");

        jLabelDatoPagoMinimo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelDatoPagoMinimo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatoPagoMinimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDatoPagoMinimo.setText("{pago minimo}");

        javax.swing.GroupLayout jPanelPagarMisTarjetasLayout = new javax.swing.GroupLayout(jPanelPagarMisTarjetas);
        jPanelPagarMisTarjetas.setLayout(jPanelPagarMisTarjetasLayout);
        jPanelPagarMisTarjetasLayout.setHorizontalGroup(
            jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloPagarMisTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelCodigoTarjetaAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                        .addComponent(jLabelMontoAPagarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelPagoMinimoTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxCodigosTarjetas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextMontoAPagarTarjeta)
                    .addComponent(jLabelDatoPagoMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagarMisTarjetasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmarPagoMiTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanelPagarMisTarjetasLayout.setVerticalGroup(
            jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloPagarMisTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelCodigoTarjetaAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(jComboBoxCodigosTarjetas))
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabelPagoMinimoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDatoPagoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextMontoAPagarTarjeta)
                    .addComponent(jLabelMontoAPagarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonConfirmarPagoMiTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPagarMisTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jPanelPagarMisTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarPagoMiTarjeta;
    private javax.swing.JComboBox<String> jComboBoxCodigosTarjetas;
    private javax.swing.JLabel jLabelCodigoTarjetaAPagar;
    private javax.swing.JLabel jLabelDatoPagoMinimo;
    private javax.swing.JLabel jLabelMontoAPagarTarjeta;
    private javax.swing.JLabel jLabelPagoMinimoTarjeta;
    private javax.swing.JLabel jLabelTituloPagarMisTarjetas;
    private javax.swing.JPanel jPanelPagarMisTarjetas;
    private javax.swing.JTextField jTextMontoAPagarTarjeta;
    // End of variables declaration//GEN-END:variables
}
