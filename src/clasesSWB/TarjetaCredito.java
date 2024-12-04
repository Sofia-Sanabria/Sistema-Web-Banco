package clasesSWB;

import clasesSWB.PagoTarjeta;

/**
 * Clase que representa una tarjeta de crédito y se compone de un pago asociado.
 */
public class TarjetaCredito {
    
    private String IDCliente;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private PagoTarjeta pagoAsociado; // Composicion

    /**
     * Constructor de la clase TarjetaCredito.
     *
     * @param IDCliente ID del cliente asociado a la tarjeta.
     * @param numeroTarjeta Número de la tarjeta de crédito.
     * @param tipoTarjeta Tipo de la tarjeta de crédito.
     * @param pagoAsociado Pago asociado a la tarjeta de crédito.
     */
    public TarjetaCredito(String IDCliente,String numeroTarjeta , String tipoTarjeta, PagoTarjeta pagoAsociado) {
        this.IDCliente = IDCliente;
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.pagoAsociado = pagoAsociado;
    }

    /**
    * Obtiene el numero de tarjeta de crédito.
    *
    * @return Numero de tarjeta.
    */
    
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Establece el Numero de tarjeta de crédito.
     *
     * @param numeroTarjeta Numero de tarjeta.
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Obtiene el tipo de la tarjeta de crédito.
     *
     * @return Tipo de tarjeta.
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Establece el tipo de tarjeta de crédito.
     *
     * @param tipoTarjeta Nuevo tipo de tarjeta.
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
    /**
     * Obtiene el pago asociado a la tarjeta de crédito.
     *
     * @return Pago asociado.
     */
    public PagoTarjeta getPagoAsociado() {
        return pagoAsociado;
    }

    /**
     * Establece el pago asociado a la tarjeta de crédito.
     *
     * @param pagoAsociado Nuevo pago asociado.
     */
    public void setPagoAsociado(PagoTarjeta pagoAsociado) {
        this.pagoAsociado = pagoAsociado;
    }
    
}
