package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

    @RequestMapping(path="", method=RequestMethod.GET)
    public List<Auction> list(@RequestParam(required=false) String auction, @RequestParam(required=false, defaultValue="") String title_like, @RequestParam(required=false, defaultValue="0") double currentBid_lte) {
    	
    	List<Auction> auctions = dao.list();
    	
    	for (Auction auctionA : auctions) {
    		
    		if(currentBid_lte != 0 && title_like != null) {
    			
    			return dao.searchByTitleAndPrice(title_like, currentBid_lte);
    		}
    		
    		
    		if (currentBid_lte != 0) {
    			
    			return dao.searchByPrice(currentBid_lte);
    			
    		}
    		
    		
    		if(title_like != null) {
    			
    			return dao.searchByTitle(title_like);
    		}
    		
    		
    		if (auction != null) {
    			
    			auctions.add(auctionA);
    		}
    	}
    	
    	return auctions;
    }
    
    
    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    public Auction get(@PathVariable int id) {
    	return dao.get(id);
    }
    
    
    
    @RequestMapping(path="", method=RequestMethod.POST)
    public Auction addReservation(@RequestBody Auction auction) {
    	return dao.create(auction);
    }
    
    
//    @RequestMapping(path="", method=RequestMethod.GET)
//    public List<Auction> searchByTitle(@RequestParam(required=false, defaultValue="") String title_like){
// 	
//    	return dao.searchByTitle(title_like);
//    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
