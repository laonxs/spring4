package cn.ade.bean;

/**
 * 需求：汽车实体类
 *
 * @author ade
 * @version 1.0，2017-11-8 11:43:51
 */
public class CarBean {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 价格
     */
    private Double price;

    public CarBean() {
    }

    public CarBean(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "CarBean{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

}
