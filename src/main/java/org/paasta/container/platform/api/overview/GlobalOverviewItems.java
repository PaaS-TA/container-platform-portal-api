package org.paasta.container.platform.api.overview;

import lombok.Data;
import org.paasta.container.platform.api.overview.support.Count;

import java.util.Map;

/**
 * Global Overview Model 클래스
 *
 * @author kjhoon
 * @version 1.0
 * @since 2022.06.29
 **/
@Data
public class GlobalOverviewItems {

    private String clusterId;
    private String clusterName;
    private String clusterProviderType;
    private String version;
    private Count nodeCount;
    private Count podCount;
    private Count pvcCount;
    private Count pvCount;
    private Map<String, Object> usage;


    public GlobalOverviewItems() {

    }

    public GlobalOverviewItems(String clusterId, String clusterName, String clusterProviderType,
                               String version, Count nodeCount, Count podCount, Count pvcCount, Count pvCount, Map<String, Object> usage) {
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this. clusterProviderType = clusterProviderType;
        this.version = version;
        this.nodeCount = nodeCount;
        this.podCount = podCount;
        this.pvcCount = pvcCount;
        this.pvCount = pvCount;
        this.usage = usage;
    }
}