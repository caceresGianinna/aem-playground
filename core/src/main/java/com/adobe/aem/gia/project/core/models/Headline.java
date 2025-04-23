package com.adobe.aem.gia.project.core.models;

import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code Headline Component} Sling Model used for the page and
 * section headings
 */
@ConsumerType
public interface Headline   {

    /**
     * Returns the title text
     * 
     * @return
     * @throws IllegalStateException if title is empty or null
     */
    public String getTitle() throws IllegalStateException ;

    /**
     * Returns the headline component authored ID
     * 
     * @return
     */
    public String getId() throws IllegalStateException;

    /**
     * Returns the heading element type
     * 
     * @return heading type h1 - h6
     */
    public String getType() throws IllegalStateException;

}
