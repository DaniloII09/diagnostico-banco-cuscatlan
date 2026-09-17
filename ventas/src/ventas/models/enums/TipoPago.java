package ventas.models.enums;

public enum TipoPago {
    CONTADO(-0.05),
    CREDITO(0.10);

    private final double ajuste;

    TipoPago(double ajuste) {
        this.ajuste = ajuste;
    }

    public double getAjuste() {
        return ajuste;
    }
}
