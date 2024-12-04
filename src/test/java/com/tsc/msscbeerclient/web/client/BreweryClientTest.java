package com.tsc.msscbeerclient.web.client;

import com.tsc.msscbeerclient.web.model.BeerDto;
import com.tsc.msscbeerclient.web.model.CustomerDto;
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
        BeerDto beerDto = BeerDto.builder()
                .beerName("New Beer")
                .beerStyle("Pale Ale")
                .build();
        URI uri = breweryClient.saveNewBeer(beerDto);
        assertNotNull(uri);

        System.out.println(uri.toString());
    }

    @Test
    void testUpdateBeer() {
        BeerDto beerDto = BeerDto.builder()
                .beerName("Updated Beer")
                .beerStyle("Pale Ale")
                .build();
        breweryClient.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void testDeleteBeer() {
        breweryClient.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {
        CustomerDto dto = breweryClient.getCustomerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void saveNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .customerName("New Customer Name")
                .gender("Male")
                .build();
    }

    @Test
    void updateCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .customerName("Update Customer Name")
                .gender("Male")
                .build();
        this.breweryClient.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void deleteCustomer() {
        this.breweryClient.deleteCustomer(UUID.randomUUID());
    }
}