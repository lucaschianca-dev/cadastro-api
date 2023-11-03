package com.cadastro.apicadastro.erros;

import com.cadastro.apicadastro.erros.excecoesTratadas.NotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Erro> methodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest http) {
        Erro erro = new Erro(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), "MethodArgumentNotValidException", http.getRequestURI(), e.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Erro> methodArgumentNotValidException(NotFoundException e, HttpServletRequest http) {
        Erro erro = new Erro(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), "NotFoundException", http.getRequestURI(), e.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
}
