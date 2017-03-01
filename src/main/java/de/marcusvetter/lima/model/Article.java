package de.marcusvetter.lima.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Article {

    @Id
    private String id;

    private String name;

}
