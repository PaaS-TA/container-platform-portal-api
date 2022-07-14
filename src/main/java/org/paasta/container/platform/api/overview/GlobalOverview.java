package org.paasta.container.platform.api.overview;
import io.swagger.models.auth.In;
import lombok.Data;
import org.paasta.container.platform.api.common.model.CommonItemMetaData;
import org.paasta.container.platform.api.metrics.TopNodes;
import org.paasta.container.platform.api.metrics.TopPods;

import java.util.List;

/**
 * Global Overview Model 클래스
 *
 * @author kjhoon
 * @version 1.0
 * @since 2022.06.29
 **/
@Data
public class GlobalOverview {
    private String resultCode;
    private String resultMessage;
    private Integer httpStatusCode;
    private String detailMessage;

    private CommonItemMetaData itemMetaData;

    // count
    private Integer clusterStatus;
    private Integer namespaceStatus;
    private Integer pvcStatus;
    private Integer pvStatus;
    private Integer podStatus;

    private List<GlobalOverviewItems> items;

    private List<TopNodes> topNodesCPU;
    private List<TopNodes> topNodesMEM;

    private List<TopPods> topPodsCPU;
    private List<TopPods> topPodsMEM;


    public GlobalOverview(){

    }

    public GlobalOverview(Integer clusterStatus, Integer namespaceStatus, Integer pvcStatus, Integer pvStatus, Integer podStatus, List<GlobalOverviewItems> items,
                          List<TopNodes> topNodesCPU, List<TopNodes> topNodesMEM, List<TopPods> topPodsCPU, List<TopPods> topPodsMEM) {
        this.clusterStatus = clusterStatus;
        this.namespaceStatus = namespaceStatus;
        this.pvcStatus = pvcStatus;
        this.pvStatus = pvStatus;
        this.podStatus = podStatus;
        this.items = items;
        this.topNodesCPU = topNodesCPU;
        this.topNodesMEM = topNodesMEM;
        this.topPodsCPU = topPodsCPU;
        this.topPodsMEM = topPodsMEM;
    }
}