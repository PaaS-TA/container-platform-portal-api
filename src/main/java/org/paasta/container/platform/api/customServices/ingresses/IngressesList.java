package org.paasta.container.platform.api.customServices.ingresses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.paasta.container.platform.api.common.model.CommonItemMetaData;
import org.paasta.container.platform.api.common.model.CommonMetaData;
import org.paasta.container.platform.api.common.model.CommonSpec;
import org.paasta.container.platform.api.common.model.CommonStatus;
import org.paasta.container.platform.api.customServices.ingresses.support.IngressesSpec;

import java.util.List;
import java.util.Map;

/**
 * Ingresses Model 클래스
 *
 * @author jjy
 * @version 1.0
 * @since 2022.05.24
 */
@Data
public class IngressesList {
    private String resultCode;
    private String resultMessage;
    private Integer httpStatusCode;
    private String detailMessage;
    private Map metadata;
    private CommonItemMetaData itemMetaData;
    private List<IngressesListItem> items;
}

@Data
class IngressesListItem {
    private String name;
    private String namespace;
    private String pathType;
    private String host;
    private String path;
    private int port;
    private String targetService;
    private String creationTimestamp;

    @JsonIgnore
    private CommonMetaData metadata;

    @JsonIgnore
    private IngressesSpec spec;

    /*@JsonIgnore
    private CommonSpec spec;*/

    @JsonIgnore
    private CommonStatus status;

    public String getName() {
        return name = metadata.getName();
    }

    public String getNamespace() {
        return namespace = metadata.getNamespace();
    }

    public String getCreationTimestamp() {
        return creationTimestamp = metadata.getCreationTimestamp();
    }

    public String getPath() {
        return path = spec.getRules().get(0).getHttp().getPaths().get(0).getPath();
    }

    public String getPathType() {
        return pathType = spec.getRules().get(0).getHttp().getPaths().get(0).getPathType();
    }

    public String getHost() {
        return host = spec.getRules().get(0).getHost();
    }

    public int getPort() {
        return port = spec.getRules().get(0).getHttp().getPaths().get(0).getBackend().getService().getPort().getNumber();
    }

    public String getTargetService() {
        return targetService = spec.getRules().get(0).getHttp().getPaths().get(0).getBackend().getService().getName();
    }
}