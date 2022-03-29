package me.christyjohn.product.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catalogue {

    private Long catalogueId;
    private String catalogueName;
    private String catalogueCode;
}
