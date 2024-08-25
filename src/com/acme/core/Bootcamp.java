package com.acme.core;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private Set<Dev> subscribedDevList = new HashSet<>();
    private Set<Content> contentList = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Dev> getSubscribedDevList() {
        return this.subscribedDevList;
    }

    public void setSubscribedDevList(Set<Dev> subscribedDevList) {
        this.subscribedDevList = subscribedDevList;
    }

    public Set<Content> getContentList() {
        return contentList;
    }

    public void setContentList(Set<Content> contentList) {
        this.contentList = contentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        return Objects.equals(name, bootcamp.name) && 
            Objects.equals(description, bootcamp.description) && 
            Objects.equals(startDate, bootcamp.startDate) && 
            Objects.equals(endDate, bootcamp.endDate) && 
            Objects.equals(subscribedDevList, bootcamp.subscribedDevList) && 
            Objects.equals(contentList, bootcamp.contentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, subscribedDevList, contentList);
    }
}