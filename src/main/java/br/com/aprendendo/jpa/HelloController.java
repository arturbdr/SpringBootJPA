package br.com.aprendendo.jpa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import br.com.aprendendo.jpa.domain.Casa;
import br.com.aprendendo.jpa.domain.Pessoa;
import br.com.aprendendo.jpa.domain.repository.CasaRepository;
import br.com.aprendendo.jpa.domain.repository.PessoaRepository;

@RestController
@AllArgsConstructor
public class HelloController {

    @Autowired
    private final PessoaRepository pessoaRepository;

    @PostConstruct
    public void init() {
        // popula a base de dados com valores iniciais

        Set<Casa> casasPessoa1 = new HashSet<>();
        Set<Casa> casasPessoa2 = new HashSet<>();
        Set<Casa> casasPessoa3 = new HashSet<>();

        casasPessoa1.add(new Casa("Casa normal 1"));
        casasPessoa2.add(new Casa("Casa 2a"));
        casasPessoa2.add(new Casa("Casa 2b"));
        casasPessoa3.add(new Casa("Casa pequena"));

        Pessoa pessoa1 = new Pessoa("Pessoa da casa normal", casasPessoa1);
        Pessoa pessoa2 = new Pessoa("Pessoa das varias casas", casasPessoa2);
        Pessoa pessoa3 = new Pessoa("Pessoa da casa menor", casasPessoa3);

        pessoaRepository.save(pessoa1);
        pessoaRepository.save(pessoa2);
        pessoaRepository.save(pessoa3);
    }

    @RequestMapping("/pessoa/list")
    public List<Pessoa> getAllPessoas() {
        return Lists.newArrayList(pessoaRepository.findAll());
    }

    @RequestMapping("/pessoa/id/{id}")
    public Pessoa getByPessoasByName(@PathVariable Long id) {
        return pessoaRepository.findOne(id);
    }


}
