package com.clara.producer.resource;

import com.clara.producer.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemResource {
    @Autowired
    MensagemService service;

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem){
        service.enviarMensagem(mensagem);
        return ResponseEntity.ok("Mensagem enviada com sucesso!! "+mensagem);
    }
}
