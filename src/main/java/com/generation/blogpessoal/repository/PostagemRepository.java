package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> { // precisa de dois parametros, a primeira seria a classe no qual a interface ira interagir, e o segundo o ID da mesma, no caso o ID da classe Postagem. 

}
