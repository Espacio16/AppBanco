import java.util.Date;
class Movimiento
{
    private Date fecha;
    private char tipo;
    private float importe;
    private float saldo;
    
    public Movimiento (Date aFecha, char aTipo, float aImporte, float
    aSaldo) {
        fecha = aFecha;
        tipo = aTipo;
        importe = aImporte;
        saldo = aSaldo;
    }
}