package netology.ru.jdbc_layers.controller;

import lombok.RequiredArgsConstructor;
import netology.ru.jdbc_layers.service.GetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetController {
    private final GetService getService;
    
    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name") String name) {
        return getService.getProductName(name);
    }

}

