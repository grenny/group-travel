/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grouptravel.event.notification;

import com.grouptravel.event.BaseEvent;
import com.grouptravel.event.EventType;

/**
 * @class   NotificationEvent
 * @created Apr 13, 2013
 * @author  grenville
 */
public class NotificationEvent extends BaseEvent {

    public NotificationEvent() {
        super(EventType.Notification);
    }
    

}
