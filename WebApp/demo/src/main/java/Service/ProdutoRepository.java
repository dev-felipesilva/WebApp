package Service;

import Model.Produto;

import java.util.List;

public class ProdutoRepository {
    public List<Produto> findAll() {
        return List.of();
    }

    public Produto save(Produto produto) {
        return produto;
    }
}
