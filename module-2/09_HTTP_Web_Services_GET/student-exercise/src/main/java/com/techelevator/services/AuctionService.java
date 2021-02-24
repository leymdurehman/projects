package com.techelevator.services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;



public class AuctionService {

    public static final String BASE_URL = "http://localhost:3000/auctions";
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();


    public Auction[] listAllAuctions() {
    	Auction[] auctions = restTemplate.getForObject(BASE_URL, Auction[].class);
    	return auctions;

    }

    public Auction listDetailsForAuction(int id) {
    	String endpointUrl = BASE_URL + "/" + id;
    	Auction auction = restTemplate.getForObject(endpointUrl, Auction.class);
        return auction;
    }

    public Auction[] findAuctionsSearchTitle(String title) {
    	String endpointUrl = BASE_URL + "?title_like=" + title;
    	Auction[] auction = restTemplate.getForObject(endpointUrl, Auction[].class);
        return auction;

     
    }

    public Auction[] findAuctionsSearchPrice(double price) {
    	String endpointUrl = BASE_URL + "?currentBid_lte=" + price;
    	Auction[] auction = restTemplate.getForObject(endpointUrl,Auction[].class);
        return auction;
    }

}
