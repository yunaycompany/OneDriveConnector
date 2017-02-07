
package com.epidata.onedrive.oauth;

import com.epidata.onedrive.OneDriveConnector;
import com.epidata.onedrive.adapters.OneDriveConnectorOAuth2Adapter;
import com.epidata.onedrive.config.ConnectorConfig;
import java.io.Serializable;
import javax.annotation.Generated;
import org.apache.commons.pool.KeyedPoolableObjectFactory;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.expression.ExpressionManager;
import org.mule.api.store.ObjectStore;
import org.mule.security.oauth.BaseOAuth2Manager;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;
import org.mule.security.oauth.OnNoTokenPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A {@code OneDriveConnectorOAuthManager} is a wrapper around {@link OneDriveConnector } that adds access token management capabilities to the pojo.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-02-07T04:46:05-03:00", comments = "Build UNNAMED.2793.f49b6c7")
public class OneDriveConnectorOAuthManager
    extends BaseOAuth2Manager<OAuth2Adapter>
{

    private static Logger logger = LoggerFactory.getLogger(OneDriveConnectorOAuthManager.class);

    @Override
    protected Logger getLogger() {
        return logger;
    }

    /**
     * Sets clientId
     * 
     * @param key to set
     */
    public void setClientId(String value) {
        super.setConsumerKey(value);
    }

    /**
     * Sets clientSecret
     * 
     * @param secret to set
     */
    public void setClientSecret(String value) {
        super.setConsumerSecret(value);
    }

    /**
     * Sets scope
     * 
     * @param scope to set
     */
    public void setScope(String value) {
        super.setScope(value);
    }

    /**
     * Sets apiUrl
     * 
     * @param scope to set
     */
    public void setApiUrl(String value) {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        ((ConnectorConfig) connector.getConfig()).setApiUrl(value);
    }

    /**
     * Retrieves apiUrl
     * 
     */
    public String getApiUrl() {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        return ((ConnectorConfig) connector.getConfig()).getApiUrl();
    }

    /**
     * Sets apiVersion
     * 
     * @param scope to set
     */
    public void setApiVersion(String value) {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        ((ConnectorConfig) connector.getConfig()).setApiVersion(value);
    }

    /**
     * Retrieves apiVersion
     * 
     */
    public String getApiVersion() {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        return ((ConnectorConfig) connector.getConfig()).getApiVersion();
    }

    @Override
    protected OAuth2Adapter instantiateAdapter() {
        return new OneDriveConnectorOAuth2Adapter(this);
    }

    @Override
    protected KeyedPoolableObjectFactory createPoolFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        return new OneDriveConnectorOAuthClientFactory(oauthManager, objectStore);
    }

    @Override
    protected void setCustomProperties(OAuth2Adapter adapter) {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) adapter);
        ((ConnectorConfig) connector.getConfig()).setClientId(getConsumerKey());
        ((ConnectorConfig) connector.getConfig()).setClientSecret(getConsumerSecret());
        ((ConnectorConfig) connector.getConfig()).setScope(getScope());
        ((ConnectorConfig) connector.getConfig()).setApiUrl(getApiUrl());
        ((ConnectorConfig) connector.getConfig()).setApiVersion(getApiVersion());
    }

    protected void fetchCallbackParameters(OAuth2Adapter adapter, String response) {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) adapter);
        ExpressionManager expressionManager = (muleContext.getExpressionManager());
        MuleMessage muleMessage = new DefaultMuleMessage(response, (muleContext));
    }

    public void setOnNoToken(OnNoTokenPolicy policy) {
        this.getDefaultUnauthorizedConnector().setOnNoTokenPolicy(policy);
    }

}
