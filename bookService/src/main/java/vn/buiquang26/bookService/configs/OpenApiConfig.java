package vn.buiquang26.bookService.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Book Service API",
                version = "1.0",
                description = "Book Service API"
        )
)
public class OpenApiConfig {
}
