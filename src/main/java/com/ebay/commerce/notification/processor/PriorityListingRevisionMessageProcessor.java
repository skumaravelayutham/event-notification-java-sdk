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

import com.fasterxml.jackson.core.JsonProcessingException;
import org.openapitools.client.model.PriorityListingRevisionData;

public class PriorityListingRevisionMessageProcessor extends BaseMessageProcessor {

    public PriorityListingRevisionMessageProcessor(Class type) {
        super(type);
    }

    @Override
    protected void processInternal(Object data) throws JsonProcessingException {
        //ObjectMapper mapper = new ObjectMapper();
        // convert user object to json string and return it
//        String priorityListingRevisionData = mapper.writeValueAsString(data);
//        System.out.println(priorityListingRevisionData);
        PriorityListingRevisionData priorityListingRevisionData = (PriorityListingRevisionData) data;
        StringBuilder sb = new StringBuilder();
        sb.append("Data=>");
        sb.append("itemId: ").append(priorityListingRevisionData.getItemId());
        sb.append(",priorityListing: ").append(priorityListingRevisionData.getPriorityListing());
        System.out.println(sb.toString());
    }
}
