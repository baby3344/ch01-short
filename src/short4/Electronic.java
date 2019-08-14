package short4;

import java.math.BigDecimal;
import java.util.Date;

public class Electronic {
    private Integer id;
    private String model;
    private BigDecimal price;
    private Date production;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProduction(Date production) {
        this.production = production;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getProduction() {
        return production;
    }
}
