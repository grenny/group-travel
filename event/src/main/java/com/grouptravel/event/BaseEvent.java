/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grouptravel.event;

/**
 * @class   BaseEvent
 * @created Apr 13, 2013
 * @author  grenville
 */
public abstract class BaseEvent implements Event {
    
    EventType eventType;

    public BaseEvent(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public EventType getEventType() {
        return eventType;
    }
    
}
