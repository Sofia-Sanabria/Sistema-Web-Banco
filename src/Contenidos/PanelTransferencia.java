package Contenidos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import java.util.List;

import clasesSWB.Cliente;
import clasesSWB.Cuenta;
import clasesSWB.PersistenceManager;
//import clasesSWB.TransaccionesThread;

import javax.swing.JOptionPane;


/**
 *
 * @author MAN-U
 */
public class PanelTransferencia extends javax.swing.JPanel implements Interface_Panel{

    private PersistenceManager persistenceManager;
    private Cliente cliente;
    
    /**
     * Creates new form Transferencias
     */
    public PanelTransferencia(PersistenceManager persistenceManager, Cliente cliente) {
        initComponents();
        changeComponentsProperties();
        this.cliente = cliente;
        this.persistenceManager = persistenceManager;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        desplegarX(jLabelTransferencia, 290, 1);
        desplegarX(jPanelTransferencia, 290, 1);
        desplegarX(jButtonTransferencia, 290, 1);
        desplegarX(jTextCuentaOrigen, 290, 1);
        desplegarX(jTextCuentaDestino, 290, 1);
        desplegarX(jTextNumeroCedula, 290, 1);
        desplegarX(jTextNombre, 290, 1);
        desplegarX(jTextMonto, 290, 1);
        desplegarX(jPasswordPINTransaccion, 290, 1);
        desplegarX(jTextComentario, 290, 1);
    }
    
    /**
     * Llama al método plegarX para plegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void plegarComponentes(){
        plegarX(jLabelTransferencia, 290, 1);
        plegarX(jPanelTransferencia, 290, 1);
        plegarX(jButtonTransferencia, 290, 1);
        plegarX(jTextCuentaOrigen, 290, 1);
        plegarX(jTextCuentaDestino, 290, 1);
        plegarX(jTextNumeroCedula, 290, 1);
        plegarX(jTextNombre, 290, 1);
        plegarX(jTextMonto, 290, 1);
        plegarX(jPasswordPINTransaccion, 290, 1);   
        plegarX(jTextComentario, 290, 1);
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

        jPanelTransferencia = new javax.swing.JPanel();
        jLabelCuentaDestino = new javax.swing.JLabel();
        jLabelTransferencia = new javax.swing.JLabel();
        jLabelNumeroCedula = new javax.swing.JLabel();
        jLabelMonto = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jButtonTransferencia = new javax.swing.JButton();
        jLabelComentario = new javax.swing.JLabel();
        jTextCuentaOrigen = new javax.swing.JTextField();
        jTextNumeroCedula = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextMonto = new javax.swing.JTextField();
        jTextComentario = new javax.swing.JTextField();
        jLabelIngresarPIN = new javax.swing.JLabel();
        jPasswordPINTransaccion = new javax.swing.JPasswordField();
        jTextCuentaDestino = new javax.swing.JTextField();
        jLabelCuentaOrigen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 102, 255));

        jPanelTransferencia.setBackground(new java.awt.Color(68, 114, 196));

        jLabelCuentaDestino.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCuentaDestino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuentaDestino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCuentaDestino.setText("Cuenta Destino");
        jLabelCuentaDestino.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelCuentaDestino.setPreferredSize(new java.awt.Dimension(755, 32));

        jLabelTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTransferencia.setText("Transferencia");
        jLabelTransferencia.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelTransferencia.setPreferredSize(new java.awt.Dimension(755, 32));

        jLabelNumeroCedula.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelNumeroCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumeroCedula.setText("Cedula Beneficiario");
        jLabelNumeroCedula.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelNumeroCedula.setPreferredSize(new java.awt.Dimension(755, 32));

        jLabelMonto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMonto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMonto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMonto.setText("Monto a Transferir");
        jLabelMonto.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelMonto.setPreferredSize(new java.awt.Dimension(755, 32));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombre.setText("Nombre Beneficiario");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(755, 32));

        jButtonTransferencia.setBackground(new java.awt.Color(0, 51, 102));
        jButtonTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTransferencia.setText("Realizar Tranferencia");
        jButtonTransferencia.setMaximumSize(new java.awt.Dimension(1366, 738));
        jButtonTransferencia.setMinimumSize(new java.awt.Dimension(197, 48));
        jButtonTransferencia.setPreferredSize(new java.awt.Dimension(755, 32));
        jButtonTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferenciaActionPerformed(evt);
            }
        });

        jLabelComentario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelComentario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComentario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelComentario.setText("Comentario");
        jLabelComentario.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelComentario.setPreferredSize(new java.awt.Dimension(755, 32));

        jTextCuentaOrigen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextCuentaOrigen.setForeground(new java.awt.Color(102, 102, 102));

        jTextNumeroCedula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextNumeroCedula.setForeground(new java.awt.Color(102, 102, 102));

        jTextNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(102, 102, 102));

        jTextMonto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextMonto.setForeground(new java.awt.Color(102, 102, 102));

        jTextComentario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextComentario.setForeground(new java.awt.Color(102, 102, 102));

        jLabelIngresarPIN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelIngresarPIN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngresarPIN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelIngresarPIN.setText("Ingresar PIN");
        jLabelIngresarPIN.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelIngresarPIN.setPreferredSize(new java.awt.Dimension(755, 32));

        jPasswordPINTransaccion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPasswordPINTransaccion.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordPINTransaccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordPINTransaccion.setOpaque(true);
        jPasswordPINTransaccion.setPreferredSize(new java.awt.Dimension(380, 40));
        jPasswordPINTransaccion.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPasswordPINTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordPINTransaccionActionPerformed(evt);
            }
        });
        jPasswordPINTransaccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordPINTransaccionKeyPressed(evt);
            }
        });

        jTextCuentaDestino.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextCuentaDestino.setForeground(new java.awt.Color(102, 102, 102));

        jLabelCuentaOrigen.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCuentaOrigen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuentaOrigen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCuentaOrigen.setText("Cuenta Origen");
        jLabelCuentaOrigen.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelCuentaOrigen.setPreferredSize(new java.awt.Dimension(755, 32));

        javax.swing.GroupLayout jPanelTransferenciaLayout = new javax.swing.GroupLayout(jPanelTransferencia);
        jPanelTransferencia.setLayout(jPanelTransferenciaLayout);
        jPanelTransferenciaLayout.setHorizontalGroup(
            jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelIngresarPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelCuentaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextNumeroCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextCuentaOrigen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextComentario)
                    .addComponent(jPasswordPINTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextCuentaDestino, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
            .addGroup(jPanelTransferenciaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransferenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanelTransferenciaLayout.setVerticalGroup(
            jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransferenciaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCuentaOrigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuentaOrigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCuentaDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCuentaDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumeroCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumeroCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabelComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordPINTransaccion, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabelIngresarPIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addComponent(jPanelTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanelTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferenciaActionPerformed
  
        // Obtener la cuenta del cliente
        String cuentaOrigen = jTextCuentaOrigen.getText();     
        String CuentaDestino = jTextCuentaDestino.getText();
        System.out.println("Cliente: " + cliente.getIDCliente());
        List<Cuenta> cuentasAsociadas = persistenceManager.getCuentas(cliente.getIDCliente()); 
                
        // Obtener el PIN de transferencia ingresado por el usuario
        String PINTransferencia = new String(jPasswordPINTransaccion.getPassword());
        
        // Verificar que la cuenta proporcionada sea una cuenta propia
        for(Cuenta cuenta: cuentasAsociadas ){
            if (cuenta.getIDCuenta().equals(cuentaOrigen)){
                // Verificar que la cuenta Destino exista
                if (!persistenceManager.VerificarCuenta(CuentaDestino)){     
                    mostrarMensajeError("La Cuenta Destino no existe");     


                // Validar el PIN de transferencia usando el método validarPINTransaccion
                }else if (!cuenta.validarPINTransaccion(PINTransferencia)) {
                    mostrarMensajeError("PIN de Transaccion invalida");

                }else { 

                    String CICliente = jTextNumeroCedula.getText();
                    String NombreCliente = jTextNombre.getText();            
                    String comentario = jTextComentario.getText();            
                    try {
                        double monto = Double.parseDouble(jTextMonto.getText()); // Asume que el monto se ingresa como texto

                        if (monto <= 0){
                            mostrarMensajeError("El monto debe ser mayor a cero");
                        }else{
                            // validar que el saldo de la cuenta origen sea suficiente
                           if (cuenta.getSaldo() < monto) {
                               mostrarMensajeError("Saldo insuficiente para realizar la transferencia.");
                           }else{
                               // Valida la información de los jText
                               if (CICliente.isEmpty() || NombreCliente.isEmpty() || comentario.isEmpty() || monto <= 0) {
                                   mostrarMensajeError("Por favor, completa todos los campos.");

                               }else{
                                   // Guardar la transferencia
                                   persistenceManager.guardarTransferencia(cuenta, persistenceManager.getCuenta(CuentaDestino), comentario, monto);
                                   persistenceManager.imprimirTransferencias();    
                                   JOptionPane.showMessageDialog(this, "La transferencia fue Exitosa");

                                   /* // Crear e iniciar el hilo de transferencia
                                   TransaccionesThread transaccionThread = new TransaccionesThread(persistenceManager, IDCuentaOrigen, IDCuentaDestino, comentario, monto);
                                   transaccionThread.start();*/
                               }
                           }
                        }
                    } catch (NumberFormatException e) {
                        mostrarMensajeError("Ingrese un monto válido.");
                    }
                }
                return;
            }
        }
          
        mostrarMensajeError("La cuenta proporcionada no pertenece al cliente actual");

    }//GEN-LAST:event_jButtonTransferenciaActionPerformed

    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error en la transferencia", JOptionPane.ERROR_MESSAGE);
    }
    private void jPasswordPINTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordPINTransaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordPINTransaccionActionPerformed

    private void jPasswordPINTransaccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordPINTransaccionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordPINTransaccionKeyPressed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTransferencia;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelCuentaDestino;
    private javax.swing.JLabel jLabelCuentaOrigen;
    private javax.swing.JLabel jLabelIngresarPIN;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroCedula;
    private javax.swing.JLabel jLabelTransferencia;
    private javax.swing.JPanel jPanelTransferencia;
    private javax.swing.JPasswordField jPasswordPINTransaccion;
    private javax.swing.JTextField jTextComentario;
    private javax.swing.JTextField jTextCuentaDestino;
    private javax.swing.JTextField jTextCuentaOrigen;
    private javax.swing.JTextField jTextMonto;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNumeroCedula;
    // End of variables declaration//GEN-END:variables
}
