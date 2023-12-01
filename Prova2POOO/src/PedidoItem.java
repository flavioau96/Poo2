class PedidoItem {
    private String nomeItem;
    private int qtdeItem;
    private double precoItem;
    private Produto produto;

    public PedidoItem(String nomeItem, int qtdeItem, double precoItem, Produto produto) {
        this.nomeItem = nomeItem;
        this.qtdeItem = qtdeItem;
        this.precoItem = precoItem;
        this.produto = produto;
    }

    // Getter and setter methods
    public String getNomeItem() {
        return nomeItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean atualizarEstoqueItem() {
        if (produto != null) {
            int estoqueAtual = produto.getEstoqueAtual();
            if (estoqueAtual >= qtdeItem) {
                produto.setEstoqueAtual(estoqueAtual - qtdeItem);
                return true;
            }
        }
        return false;
    }
}