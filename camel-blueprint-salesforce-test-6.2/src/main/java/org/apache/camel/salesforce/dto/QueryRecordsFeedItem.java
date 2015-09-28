/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type FeedItem
 */
public class QueryRecordsFeedItem extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<FeedItem> records;

    public List<FeedItem> getRecords() {
        return records;
    }

    public void setRecords(List<FeedItem> records) {
        this.records = records;
    }
}