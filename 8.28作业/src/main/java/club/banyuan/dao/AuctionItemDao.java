package club.banyuan.dao;

import club.banyuan.entity.AuctionItem;

import java.util.List;

public interface AuctionItemDao {

    int addItem(AuctionItem auctionItem);
    int modifyAuctionItem(AuctionItem auctionItem);
    int deleteAuctionItem(AuctionItem auctionItem);
    List<AuctionItem> getAuctionItem(AuctionItem auctionItem);
}
