package netology.ru.jdbc_layers.repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface GetRepository {
    List<String> getProductName(String name);
}
