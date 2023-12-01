import java.util.ArrayList;
import java.util.Date;
class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }

    // Getter and setter methods
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void inserirItensPedido(PedidoItem item) {
        this.itensPedido.add(item);
    }

    public void excluirItensPedido(PedidoItem item) {
        this.itensPedido.remove(item);
    }

    public double calcularTotalPagar() {
        double total = 0;
        for (PedidoItem item : itensPedido) {
            total += item.getPrecoItem();
        }
        return total;
    }

    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }
}