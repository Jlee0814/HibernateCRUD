package com.jionghong.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "event", schema = "event_list")
public class EventEntity {
    private int eventId;
    private String name;
    private String location;

    public EventEntity(String name, String location) {
        super();
        this.name = name;
        this.location = location;
    }


    @Id
    @Column(name = "event_id")
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEntity that = (EventEntity) o;
        return eventId == that.eventId &&
                Objects.equals(name, that.name) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, name, location);
    }

    @Override
    public String toString() {
        return "EventEntity{" +
                "eventId=" + eventId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
