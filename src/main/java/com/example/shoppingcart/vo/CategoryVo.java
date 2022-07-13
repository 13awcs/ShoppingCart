package com.example.shoppingcart.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryVo {

    private String c_name;
    private String c_icon;
    private String c_avatar;
    private Integer c_active;
}
