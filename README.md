# Слой DAO (Data Access Object)

**Шаг 1.** Создать Spring Boot приложение с зависимостями на два стартера — `spring-boot-starter-jdbc` и `spring-boot-starter-web`.

**Шаг 2.** Создать скрипт для создания таблицы `schema.sql`, чтобы Spring Boot автоматически создавал таблицу.

**Шаг 3.** Разработать скрипт запроса так, чтобы он возвращал `product_name` для именованного параметра `name`, который будем передавать в методы выполнения скрипта `NamedParameterJdbcTemplate` вместе со скриптом запроса.

**Шаг 4.** Написать репозиторий для работы с БД.

**Шаг 5.** Написать контроллер с методом-обработчиком `GET`-метода запроса с маппингом на endpoint `/products/fetch-product`. В `query params` запроса будет приходить строковый параметр `name`, который надо будет передавать дальше в репозиторий. То есть, метод должен уметь обрабатывать запрос вида `localhost:8080/products/fetch-product?name=Ivan`. Контроллер должен будет возвращать название продукта, которое он получит от репозитория.