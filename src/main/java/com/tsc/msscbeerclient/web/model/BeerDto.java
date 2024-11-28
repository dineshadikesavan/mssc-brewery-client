package com.tsc.msscbeerclient.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private String beerName;
    private String beerStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;

}
