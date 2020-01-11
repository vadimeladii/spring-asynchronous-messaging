package md.springboot.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {

    private static final long serialVersionUID = -295422703255886286L;

    private Long id;
    private String name;
    private String details;
}
