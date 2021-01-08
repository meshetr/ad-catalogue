package si.meshetr.ad_catalogue.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import si.meshetr.ad_catalogue.models.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
