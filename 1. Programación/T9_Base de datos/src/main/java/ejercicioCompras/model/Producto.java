package ejercicioCompras.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Producto {
    private long id;
    private String title;
    private String description;
    private long price;
    private double rating;
    private long stock;
    private String brand;
    private String category;



}

