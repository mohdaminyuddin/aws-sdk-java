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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * 
 */
public class GetPatchBaselineForPatchGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the patch baseline that should be used for the patch group.
     * </p>
     */
    private String baselineId;
    /**
     * <p>
     * The name of the patch group.
     * </p>
     */
    private String patchGroup;

    /**
     * <p>
     * The ID of the patch baseline that should be used for the patch group.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline that should be used for the patch group.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline that should be used for the patch group.
     * </p>
     * 
     * @return The ID of the patch baseline that should be used for the patch group.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline that should be used for the patch group.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline that should be used for the patch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineForPatchGroupResult withBaselineId(String baselineId) {
        setBaselineId(baselineId);
        return this;
    }

    /**
     * <p>
     * The name of the patch group.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group.
     */

    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The name of the patch group.
     * </p>
     * 
     * @return The name of the patch group.
     */

    public String getPatchGroup() {
        return this.patchGroup;
    }

    /**
     * <p>
     * The name of the patch group.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineForPatchGroupResult withPatchGroup(String patchGroup) {
        setPatchGroup(patchGroup);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBaselineId() != null)
            sb.append("BaselineId: " + getBaselineId() + ",");
        if (getPatchGroup() != null)
            sb.append("PatchGroup: " + getPatchGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPatchBaselineForPatchGroupResult == false)
            return false;
        GetPatchBaselineForPatchGroupResult other = (GetPatchBaselineForPatchGroupResult) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetPatchBaselineForPatchGroupResult clone() {
        try {
            return (GetPatchBaselineForPatchGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
