
package com.epidata.onedrive.generated.adapters;

import com.epidata.onedrive.OneDriveConnector;
import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;


/**
 * A <code>OneDriveConnectorCapabilitiesAdapter</code> is a wrapper around {@link OneDriveConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-02-07T04:46:05-03:00", comments = "Build UNNAMED.2793.f49b6c7")
public class OneDriveConnectorCapabilitiesAdapter
    extends OneDriveConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
