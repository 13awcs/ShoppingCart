package com.example.shoppingcart.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVo {
    private String pro_name;
    private Long pro_category_id;
    private Integer pro_price;
    private Long pro_author_id;
    private Integer active;
    private Integer pro_number;
    private String pro_description;
    private String pro_avatar;
}
