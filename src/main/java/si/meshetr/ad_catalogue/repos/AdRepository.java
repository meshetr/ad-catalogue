package si.meshetr.ad_catalogue.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import si.meshetr.ad_catalogue.models.AdModel;

public interface AdRepository extends PagingAndSortingRepository<AdModel, Long> {

}
