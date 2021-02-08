package com.bcp.business.core.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "data-ms" , url = "${feign.data-ms.url}", path = "/v1/data")
public interface DataMsClient {

    @GetMapping
    public String dataMethod();
}
