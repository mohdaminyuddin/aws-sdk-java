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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AutoScalingPolicyMarshaller
 */
public class AutoScalingPolicyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AutoScalingPolicy autoScalingPolicy, StructuredJsonGenerator jsonGenerator) {

        if (autoScalingPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (autoScalingPolicy.getConstraints() != null) {
                jsonGenerator.writeFieldName("Constraints");
                ScalingConstraintsJsonMarshaller.getInstance().marshall(autoScalingPolicy.getConstraints(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<ScalingRule> rulesList = (com.amazonaws.internal.SdkInternalList<ScalingRule>) autoScalingPolicy.getRules();
            if (!rulesList.isEmpty() || !rulesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Rules");
                jsonGenerator.writeStartArray();
                for (ScalingRule rulesListValue : rulesList) {
                    if (rulesListValue != null) {

                        ScalingRuleJsonMarshaller.getInstance().marshall(rulesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AutoScalingPolicyJsonMarshaller instance;

    public static AutoScalingPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingPolicyJsonMarshaller();
        return instance;
    }

}
