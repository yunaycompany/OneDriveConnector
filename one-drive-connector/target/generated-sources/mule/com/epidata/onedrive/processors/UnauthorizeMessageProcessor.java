
package com.epidata.onedrive.processors;

import com.epidata.onedrive.oauth.OneDriveConnectorOAuthManager;
import javax.annotation.Generated;
import org.mule.api.construct.FlowConstructAware;
import org.mule.api.processor.MessageProcessor;
import org.mule.security.oauth.processor.BaseOAuth2UnauthorizeMessageProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-02-07T04:46:05-03:00", comments = "Build UNNAMED.2793.f49b6c7")
public class UnauthorizeMessageProcessor
    extends BaseOAuth2UnauthorizeMessageProcessor
    implements FlowConstructAware, MessageProcessor
{

    private static Logger logger = LoggerFactory.getLogger(UnauthorizeMessageProcessor.class);

    @Override
    protected Class<OneDriveConnectorOAuthManager> getOAuthManagerClass() {
        return OneDriveConnectorOAuthManager.class;
    }

}
