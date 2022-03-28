package exam.model.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class ImportShopDTO {

    @XmlElement
    @Size(min = 4)
    private String address;

    @XmlElement(name = "employee-count")
    @Positive
    @Max(50)
    private int employeeCount;

    @XmlElement
    @Min(20000)
    private BigDecimal income;

    @XmlElement
    @Size(min = 4)
    private String name;

    @XmlElement(name = "shop-area")
    @Min(150)
    private int shopArea;

    @XmlElement
    private ImportTownShopDTO town;

    public ImportShopDTO() {
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }

    public int getShopArea() {
        return shopArea;
    }

    public ImportTownShopDTO getTown() {
        return town;
    }
}
