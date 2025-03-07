package phone.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phone.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "blockDevices",
    path = "blockDevices"
)
public interface BlockDeviceRepository
    extends PagingAndSortingRepository<BlockDevice, Long> {}
