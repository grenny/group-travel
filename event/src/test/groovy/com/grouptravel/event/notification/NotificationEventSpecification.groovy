package com.grouptravel.event.notification


import spock.lang.Specification;
import com.grouptravel.event.notification.NotificationEvent;
import com.grouptravel.event.EventType;


/**
 *
 * @author grenville
 */
class NotificationEventSpecification extends Specification {
	
    
    def "new notification event has event type of notification"() {
        setup:
            NotificationEvent event = new NotificationEvent();
        
        when:
            EventType eventType = event.getEventType();
            
        then:
            eventType == EventType.Notification
    }
}

