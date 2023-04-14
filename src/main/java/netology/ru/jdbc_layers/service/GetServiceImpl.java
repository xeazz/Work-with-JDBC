package netology.ru.jdbc_layers.service;

import lombok.RequiredArgsConstructor;
import netology.ru.jdbc_layers.repository.GetRepository;
import netology.ru.jdbc_layers.repository.GetRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetServiceImpl implements GetService {
    private final GetRepositoryImpl getRepository;

    @Override
    public List<String> getProductName(String name) {
        return getRepository.getProductName(name);
    }
}
