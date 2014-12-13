package org.primefaces.showcase.push.viewparam;
 
import org.apache.commons.lang.StringEscapeUtils;
import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;
 
@PushEndpoint("/viewparam")
public class ViewParamResource {
     
    @OnMessage(encoders = {JSONEncoder.class})
    public String onMessage(String data) {
        return StringEscapeUtils.escapeHtml(data);
    }
}