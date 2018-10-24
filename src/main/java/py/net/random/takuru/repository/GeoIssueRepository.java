package py.net.random.takuru.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import py.net.random.takuru.entity.GeoIssue;

/**
 * @author Diego Ramírez
 * @version 1.0
 * @since 1.0 2018/06/07
 */
@Repository
public interface GeoIssueRepository extends CrudRepository<GeoIssue, Long> {
}
