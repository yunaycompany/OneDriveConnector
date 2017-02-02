package com.epidata.onedrive.enums;

public enum URLDrive {
	OAUTH_LOGIN_URL("https://login.live.com/oauth20_authorize.srf"),
	OAUTH_AUTHORIZATION_CODE_URL("POST https://login.microsoftonline.com/common/oauth2/token Content-Type: application/x-www-form-urlencoded client_id={client_id}&redirect_uri={redirect_uri}&client_secret={client_secret}&code={code}&grant_type=authorization_code&resource={resource_id}"),
	
	
	OAUTH20_AUTHORIZE_URL("https://login.live.com/oauth20_authorize.srf"),
    OAUTH20_TOKEN_URL("https://login.live.com/oauth20_token.srf"),
    OAUTH20_DESKTOP_REDIRECT_URL("https://login.live.com/oauth20_desktop.srf"),
    API_URL("https://apis.live.net/v5.0/"),
    GRANT_TYPE_AUTHORIZATION_CODE("authorization_code"),
    GRANT_TYPE_REFRESH_TOKEN("refresh_token");

    private String value;
    
    /**
     * Construct a new OneDriveAPI enumeration.
     * 
     * @param value value of the key
     */
    private URLDrive(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public String toString() {
        return this.value;
    }
}
