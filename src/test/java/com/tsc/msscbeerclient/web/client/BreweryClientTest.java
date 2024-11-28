package com.tsc.msscbeerclient.web.client;

import com.tsc.msscbeerclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;

    @Test
    void getBeerById() {
        BeerDto dto = breweryClient.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void testSaveNewBeer() {
        BeerDto dto = BeerDto.builder().beerName("New Beer")
                .build();
        URI uri = breweryClient.saveNewBeer(dto);
        assertNotNull(uri);

        System.out.println(uri.toString());
    }

    @Test
    void testUpdateBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("Updated Beer").build();
        breweryClient.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void testDeleteBeer() {
        breweryClient.deleteBeer(UUID.randomUUID());
    }
}