package com.example.shoppingcart.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseObject {


    private  String message ;
    private String fieldName ;
    private String code ;
    private  Object data ;

}
