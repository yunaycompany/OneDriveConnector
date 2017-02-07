
package com.epidata.onedrive.oauth;

import com.epidata.onedrive.adapters.OneDriveConnectorOAuth2Adapter;
import com.epidata.onedrive.config.ConnectorConfig;
import java.io.Serializable;
import javax.annotation.Generated;
import org.mule.api.store.ObjectStore;
import org.mule.common.security.oauth.OAuthState;
import org.mule.security.oauth.BaseOAuthClientFactory;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-02-07T04:46:05-03:00", comments = "Build UNNAMED.2793.f49b6c7")
public class OneDriveConnectorOAuthClientFactory
    extends BaseOAuthClientFactory
{

    private OneDriveConnectorOAuthManager oauthManager;

    public OneDriveConnectorOAuthClientFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        super(oauthManager, objectStore);
        this.oauthManager = (OneDriveConnectorOAuthManager) oauthManager;
    }

    @Override
    protected Class<? extends OAuth2Adapter> getAdapterClass() {
        return OneDriveConnectorOAuth2Adapter.class;
    }

    @Override
    protected void setCustomAdapterProperties(OAuth2Adapter adapter, OAuthState state) {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) adapter);
        ((ConnectorConfig) connector.getConfig()).setScope(oauthManager.getScope());
        ((ConnectorConfig) connector.getConfig()).setApiUrl(oauthManager.getApiUrl());
        ((ConnectorConfig) connector.getConfig()).setApiVersion(oauthManager.getApiVersion());
    }

    @Override
    protected void setCustomStateProperties(OAuth2Adapter adapter, OAuthState state) {
        OneDriveConnectorOAuth2Adapter connector = ((OneDriveConnectorOAuth2Adapter) adapter);
    }

}
