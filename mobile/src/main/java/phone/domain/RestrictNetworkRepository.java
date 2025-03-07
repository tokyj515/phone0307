package phone.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phone.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "restrictNetworks",
    path = "restrictNetworks"
)
public interface RestrictNetworkRepository
    extends PagingAndSortingRepository<RestrictNetwork, Long> {}
