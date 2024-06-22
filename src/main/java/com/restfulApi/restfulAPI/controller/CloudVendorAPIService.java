package com.restfulApi.restfulAPI.controller;

import com.restfulApi.restfulAPI.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
                /*("999999999", "Vendor1",
                "Address1", "101");*/
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Created Successfully!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "updated Successfully!";
    }

    @DeleteMapping("{vendorId}")
    public String updateCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Deleted Successfully!";
    }
}
