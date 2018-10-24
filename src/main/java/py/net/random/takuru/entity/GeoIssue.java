package py.net.random.takuru.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Diego Ramírez
 * @version 1.0
 * @since 1.0 2018/06/07
 */
@Entity
public class GeoIssue {

    @Id
    @SequenceGenerator(name = "geo_issue_seq")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
