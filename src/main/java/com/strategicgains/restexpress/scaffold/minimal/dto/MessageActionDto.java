package com.strategicgains.restexpress.scaffold.minimal.dto;

import com.strategicgains.restexpress.loader.dto.BaseBean;
import com.strategicgains.restexpress.loader.dto.RestDto;

import com.strategicgains.syntaxe.annotation.StringValidation;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
@RestDto("MessageActionDto")
public class MessageActionDto extends BaseBean {
    //~ Static fields/initializers =====================================================================================

    /**  */
    private static final long serialVersionUID = 1L;

    //~ Instance fields ================================================================================================

    @StringValidation(name = "App", required = true)
    String app;
    @StringValidation(name = "Payload", required = true)
    String payload;
    @StringValidation(name = "To", required = true)
    String to;

    //~ Methods ========================================================================================================

    /**
     * DOCUMENT ME!
     *
     * @return the app
     */
    public String getApp() {
        return app;
    }

    /**
     * DOCUMENT ME!
     *
     * @return the payload
     */
    public String getPayload() {
        return payload;
    }

    /**
     * DOCUMENT ME!
     *
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * DOCUMENT ME!
     *
     * @param app the app to set
     */
    public void setApp(String app) {
        this.app = app;
    }

    /**
     * DOCUMENT ME!
     *
     * @param payload the payload to set
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * DOCUMENT ME!
     *
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }
}
