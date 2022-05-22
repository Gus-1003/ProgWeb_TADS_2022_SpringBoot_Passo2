package demo.demo.service;

import demo.demo.model.Produto;
import demo.demo.repository.ProdutoRepository;

import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto create(Produto p) {
        return repository.save(p);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Produto update(Produto p) {
        return repository.saveAndFlush(p);
    }

    public Produto findById(Long id) {

        Optional<Produto> produtoOptional = repository.findById(id);
        if (produtoOptional.isPresent()) {
            return produtoOptional.get();
        } else {
            return null;
        }
    }

    /*
     * public List<Produto> findAll(){
     * return repository.findAll();
     * }
     */
}
