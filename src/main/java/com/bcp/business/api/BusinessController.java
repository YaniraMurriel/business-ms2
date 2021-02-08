package com.bcp.business.api;

import com.bcp.business.core.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/business")
public class BusinessController {

    @Autowired
    BusinessService businessService;

    @GetMapping
    public ResponseEntity businessMethod() {
        return ResponseEntity.ok(businessService.callBusinessMethod());
    }

}
