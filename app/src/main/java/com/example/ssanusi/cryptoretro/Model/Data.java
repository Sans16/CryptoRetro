package com.example.ssanusi.cryptoretro.Model;

public class Data {
    private String name;
    private String symbol;
    private String website_slug;
    private String rank;
    private String circulating_supply;
    private String total_supply;
    private String price;
    private String volume_24h;

    public Data(String name, String symbol, String website_slug, String rank,
                String circulating_supply, String total_supply, String price, String volume_24h) {
        this.name = name;
        this.symbol = symbol;
        this.website_slug = website_slug;
        this.rank = rank;
        this.circulating_supply = circulating_supply;
        this.total_supply = total_supply;
        this.price = price;
        this.volume_24h = volume_24h;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSymbol() { return symbol; }

    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getWebsite_slug() { return website_slug; }

    public void setWebsite_slug(String website_slug) { this.website_slug = website_slug; }

    public String getRank() { return rank; }

    public void setRank(String rank) { this.rank = rank; }

    public String getCirculating_supply() { return circulating_supply; }

    public void setCirculating_supply(String circulating_supply) { this.circulating_supply = circulating_supply; }

    public String getTotal_supply() { return total_supply; }

    public void setTotal_supply(String total_supply) { this.total_supply = total_supply; }

    public String getPrice() { return price; }

    public void setPrice(String price) { this.price = price; }

    public String getVolume_24h() { return volume_24h; }

    public void setVolume_24h(String volume_24h) { this.volume_24h = volume_24h; }
}
