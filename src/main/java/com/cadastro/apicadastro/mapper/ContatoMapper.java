package com.cadastro.apicadastro.mapper;

import com.cadastro.apicadastro.dtos.AtualizaContatoDTO;
import com.cadastro.apicadastro.dtos.ContatoDTO;
import com.cadastro.apicadastro.dtos.ListarContatoPorPessoaDTO;
import com.cadastro.apicadastro.entities.Contato;
import com.cadastro.apicadastro.requests.ContatoRegistroRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ContatoMapper {

    ContatoMapper INSTANCE = Mappers.getMapper(ContatoMapper.class);

    ContatoDTO toContatoDTO(Contato contato);

    List<ListarContatoPorPessoaDTO> toListContatoDTO(List<ListarContatoPorPessoaDTO> contatos);

    AtualizaContatoDTO toAtualizaContatoDTO(Contato contato);

    Contato toContato(ContatoRegistroRequest request);
}
