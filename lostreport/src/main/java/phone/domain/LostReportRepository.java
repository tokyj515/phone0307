package phone.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phone.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "lostReports",
    path = "lostReports"
)
public interface LostReportRepository
    extends PagingAndSortingRepository<LostReport, Long> {}
