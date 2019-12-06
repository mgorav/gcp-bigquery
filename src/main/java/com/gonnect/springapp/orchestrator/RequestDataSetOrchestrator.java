package com.gonnect.springapp.orchestrator;

import com.gonnect.springapp.sal.entity.DataSetEntity;
import com.gonnect.springapp.sal.repository.DataSetRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * Orchestrate Retrieve calls to the DB
 *
 */
@Component
public class RequestDataSetOrchestrator {

    private DataSetRepository repository;

    public RequestDataSetOrchestrator(final DataSetRepository repository) {
        this.repository = repository;
    }

    /**
     * Get the dataSets by request Id
     * @param requestId request id
     * @return List<DataSetEntity> {@link DataSetEntity}
     */
    public List<DataSetEntity> getDataSet(final UUID requestId) {
        return repository.findBySearchRequestId(requestId);
    }
}
