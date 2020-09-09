package club.banyuan.entity;

import java.util.Date;

public class AuctionItem {

    private Integer id;
    private String name;
    private Double startPrice;
    private Double basePrice;
    private Date startTime;
    private Date endTime;
    private String description;

    public AuctionItem() {
    }

    public AuctionItem(Integer id, String name, Double startPrice, Double basePrice, Date startTime, Date endTime, String description) {
        this.id = id;
        this.name = name;
        this.startPrice = startPrice;
        this.basePrice = basePrice;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Double startPrice) {
        this.startPrice = startPrice;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AuctionItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startPrice=" + startPrice +
                ", basePrice=" + basePrice +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", description='" + description + '\'' +
                '}';
    }
}
