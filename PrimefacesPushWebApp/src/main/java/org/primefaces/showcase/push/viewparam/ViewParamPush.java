package org.primefaces.showcase.push.viewparam;
 
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;
 
@SuppressWarnings("serial")
@ManagedBean
@RequestScoped
public class ViewParamPush implements Serializable{
 
    private String data;
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }
 
    public void prerender() {
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/viewparam", data);
    }
}