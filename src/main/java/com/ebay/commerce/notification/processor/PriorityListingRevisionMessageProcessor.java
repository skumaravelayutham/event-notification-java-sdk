/*
 * Copyright (c) 2021 eBay Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.ebay.commerce.notification.processor;

import org.openapitools.client.model.PriorityListingRevisionData;

public class PriorityListingRevisionMessageProcessor extends BaseMessageProcessor {

    public PriorityListingRevisionMessageProcessor(Class type) {
        super(type);
    }

    @Override
    protected void processInternal(Object data) {
        PriorityListingRevisionData priorityListingRevisionData = (PriorityListingRevisionData) data;
        // do something with the correctly serialized data for this topic.
        StringBuilder sb = new StringBuilder();
        sb.append("Data=> {\n");
        sb.append("    itemId: ").append(priorityListingRevisionData.getItemId()).append("\n");
        sb.append("    primaryItemGroupId: ").append(priorityListingRevisionData.getPrimaryItemGroupId()).append("\n");
        sb.append("    listingMarketplaceId: ").append(priorityListingRevisionData.getListingMarketplaceId()).append("\n");
        sb.append("    seller: ").append(priorityListingRevisionData.getSeller().toString()).append("\n");
        sb.append("    categoryId: ").append(priorityListingRevisionData.getCategoryId()).append("\n");
        sb.append("    metaCategoryId: ").append(priorityListingRevisionData.getMetaCategoryId()).append("\n");
        sb.append("    priorityListing: ").append(priorityListingRevisionData.getPriorityListing()).append("\n");
        sb.append("}");
        System.out.println(sb.toString());
    }
}
