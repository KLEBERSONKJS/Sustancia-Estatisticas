package com.ads.sustancia.infra;

import org.springframework.security.core.AuthenticationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ads.sustancia.dto.response.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice  extends ResponseEntityExceptionHandler{
    

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("Error Interno:", "Contate o Desenvolvedor");
        model.addAttribute("error", error);
        return "error";
        
    }

    
    
   

}
