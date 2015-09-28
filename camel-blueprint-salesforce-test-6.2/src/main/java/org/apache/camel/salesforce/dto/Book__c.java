/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Book__c
 */
@XStreamAlias("Book__c")
public class Book__c extends AbstractSObjectBase {

    // Price__c
    private String Price__c;

    @JsonProperty("Price__c")
    public String getPrice__c() {
        return this.Price__c;
    }

    @JsonProperty("Price__c")
    public void setPrice__c(String Price__c) {
        this.Price__c = Price__c;
    }

}