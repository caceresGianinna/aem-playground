package com.adobe.aem.gia.project.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.gia.project.core.models.Headline;
import com.adobe.xfa.ut.StringUtils;

@Model(adaptables = { SlingHttpServletRequest.class,
        Resource.class }, adapters = Headline.class, resourceType = HeadlineModelImpl.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeadlineModelImpl implements Headline {
    static final String RESOURCE_TYPE = "aem-gia-project/components/headline";

    @ValueMapValue()
    private String title;

    @ValueMapValue()
    private String id;

    @ValueMapValue()
    private String type;

    
    @Override
    public String getTitle() throws IllegalStateException {
        if (StringUtils.isEmpty(title)) {
            throw new IllegalStateException("Title cannot be empty");
        }
        return title;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

}
