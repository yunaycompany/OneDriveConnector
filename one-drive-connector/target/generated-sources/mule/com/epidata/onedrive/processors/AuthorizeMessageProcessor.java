
package com.epidata.onedrive.processors;

import com.epidata.onedrive.oauth.OneDriveConnectorOAuthManager;
import java.util.regex.Pattern;
import javax.annotation.Generated;
import org.mule.security.oauth.processor.BaseOAuth2AuthorizeMessageProcessor;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-02-07T04:46:05-03:00", comments = "Build UNNAMED.2793.f49b6c7")
public class AuthorizeMessageProcessor
    extends BaseOAuth2AuthorizeMessageProcessor<OneDriveConnectorOAuthManager>
{

    private final static Pattern AUTH_CODE_PATTERN = Pattern.compile("code=([^&]+)");

    @Override
    protected String getAuthCodeRegex() {
        return AUTH_CODE_PATTERN.pattern();
    }

    @Override
    protected Class<OneDriveConnectorOAuthManager> getOAuthManagerClass() {
        return OneDriveConnectorOAuthManager.class;
    }

}
