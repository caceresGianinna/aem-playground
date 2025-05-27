package com.adobe.aem.gia.project.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class DataSelector {

    @Default(values = "Hello from the other side")
    private String message;


    public String getMessage() {
        return message;
    }

}
