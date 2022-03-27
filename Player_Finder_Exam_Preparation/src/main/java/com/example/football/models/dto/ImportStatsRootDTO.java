package com.example.football.models.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImportStatsRootDTO {

    @XmlElement(name = "stat")
    private List<ImportStatDTO> stats;

    public ImportStatsRootDTO() {
    }

    public List<ImportStatDTO> getStats() {
        return stats;
    }
}
