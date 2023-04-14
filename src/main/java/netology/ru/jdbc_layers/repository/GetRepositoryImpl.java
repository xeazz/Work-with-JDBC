package netology.ru.jdbc_layers.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Repository
@RequiredArgsConstructor
public class GetRepositoryImpl implements GetRepository {
    private static final String QUERY_FILENAME = "create_JOIN_request.sql";
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<String> getProductName(String name) {
        return namedParameterJdbcTemplate.queryForList(read(), Map.of("name", name), String.class);
    }

    private static String read() {
        try (InputStream is = new ClassPathResource(QUERY_FILENAME).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
