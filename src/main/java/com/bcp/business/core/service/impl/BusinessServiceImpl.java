package com.bcp.business.core.service.impl;

import com.bcp.business.core.client.DataMsClient;
import com.bcp.business.core.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    DataMsClient dataMsClient;

    public String callBusinessMethod() {
        return "CALL BUSINESS METHOD ---> "+dataMsClient.dataMethod();
    }
}
