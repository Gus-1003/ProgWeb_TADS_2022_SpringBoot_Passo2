package demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.demo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
    Produto findProdutoByDescrição(String descricao);
}
