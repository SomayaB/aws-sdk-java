/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteForecastExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteForecastExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast export job to delete.
     * </p>
     */
    private String forecastExportJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast export job to delete.
     * </p>
     * 
     * @param forecastExportJobArn
     *        The Amazon Resource Name (ARN) of the forecast export job to delete.
     */

    public void setForecastExportJobArn(String forecastExportJobArn) {
        this.forecastExportJobArn = forecastExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast export job to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the forecast export job to delete.
     */

    public String getForecastExportJobArn() {
        return this.forecastExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast export job to delete.
     * </p>
     * 
     * @param forecastExportJobArn
     *        The Amazon Resource Name (ARN) of the forecast export job to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteForecastExportJobRequest withForecastExportJobArn(String forecastExportJobArn) {
        setForecastExportJobArn(forecastExportJobArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getForecastExportJobArn() != null)
            sb.append("ForecastExportJobArn: ").append(getForecastExportJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteForecastExportJobRequest == false)
            return false;
        DeleteForecastExportJobRequest other = (DeleteForecastExportJobRequest) obj;
        if (other.getForecastExportJobArn() == null ^ this.getForecastExportJobArn() == null)
            return false;
        if (other.getForecastExportJobArn() != null && other.getForecastExportJobArn().equals(this.getForecastExportJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecastExportJobArn() == null) ? 0 : getForecastExportJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteForecastExportJobRequest clone() {
        return (DeleteForecastExportJobRequest) super.clone();
    }

}
