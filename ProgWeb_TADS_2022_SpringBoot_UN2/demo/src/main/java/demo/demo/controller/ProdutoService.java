package demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import demo.demo.model.Produto;
import demo.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }
    

    public Produto create(Produto p){
        return repository.save(p);
    }
    public void delete(Long id){
        return repository.deleteById(id);
    }
    public produto update(Produto p){

    }
    public produto findByid(Produto p){

    }
    public List<Produto> findall(){

    }

}
