/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateVpcEndpointRequest Marshaller
 */

public class CreateVpcEndpointRequestMarshaller implements Marshaller<Request<CreateVpcEndpointRequest>, CreateVpcEndpointRequest> {

    public Request<CreateVpcEndpointRequest> marshall(CreateVpcEndpointRequest createVpcEndpointRequest) {

        if (createVpcEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpcEndpointRequest> request = new DefaultRequest<CreateVpcEndpointRequest>(createVpcEndpointRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpcEndpoint");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpcEndpointRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createVpcEndpointRequest.getVpcId()));
        }

        if (createVpcEndpointRequest.getServiceName() != null) {
            request.addParameter("ServiceName", StringUtils.fromString(createVpcEndpointRequest.getServiceName()));
        }

        if (createVpcEndpointRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(createVpcEndpointRequest.getPolicyDocument()));
        }

        com.amazonaws.internal.SdkInternalList<String> createVpcEndpointRequestRouteTableIdsList = (com.amazonaws.internal.SdkInternalList<String>) createVpcEndpointRequest
                .getRouteTableIds();
        if (!createVpcEndpointRequestRouteTableIdsList.isEmpty() || !createVpcEndpointRequestRouteTableIdsList.isAutoConstruct()) {
            int routeTableIdsListIndex = 1;

            for (String createVpcEndpointRequestRouteTableIdsListValue : createVpcEndpointRequestRouteTableIdsList) {
                if (createVpcEndpointRequestRouteTableIdsListValue != null) {
                    request.addParameter("RouteTableId." + routeTableIdsListIndex, StringUtils.fromString(createVpcEndpointRequestRouteTableIdsListValue));
                }
                routeTableIdsListIndex++;
            }
        }

        if (createVpcEndpointRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createVpcEndpointRequest.getClientToken()));
        }

        return request;
    }

}
