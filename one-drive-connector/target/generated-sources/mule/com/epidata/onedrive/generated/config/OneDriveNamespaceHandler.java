
package com.epidata.onedrive.generated.config;

import com.epidata.onedrive.config.AuthorizeDefinitionParser;
import com.epidata.onedrive.config.UnauthorizeDefinitionParser;
import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/one-drive</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-02-07T04:46:05-03:00", comments = "Build UNNAMED.2793.f49b6c7")
public class OneDriveNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(OneDriveNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [one-drive] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [one-drive] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config-with-oauth", new OneDriveConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config-with-oauth", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("authorize", new AuthorizeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("authorize", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("unauthorize", new UnauthorizeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("unauthorize", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-drive", new GetDriveDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-drive", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-drives", new GetDrivesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-drives", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-recent-used-files", new GetRecentUsedFilesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-recent-used-files", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-folder", new CreateFolderDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-folder", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-custom-facets", new GetCustomFacetsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-custom-facets", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-by-u-r-l", new GetByURLDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-by-u-r-l", "@Processor", ex);
        }
    }

}
