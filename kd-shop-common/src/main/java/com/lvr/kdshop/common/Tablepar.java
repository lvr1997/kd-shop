package com.lvr.kdshop.common;

import lombok.Data;

@Data
public class Tablepar {

    private String searchText;

    private String orderByColumn;

    private Integer page;

    private Integer limit;



}
