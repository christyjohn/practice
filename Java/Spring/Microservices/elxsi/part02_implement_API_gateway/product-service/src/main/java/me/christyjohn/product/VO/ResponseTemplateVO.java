package me.christyjohn.product.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.christyjohn.product.entity.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Product product;
    private Catalogue catalogue;
}
