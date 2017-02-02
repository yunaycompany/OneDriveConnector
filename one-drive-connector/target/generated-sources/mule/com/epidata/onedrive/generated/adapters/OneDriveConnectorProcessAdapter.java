
package com.epidata.onedrive.generated.adapters;

import com.epidata.onedrive.OneDriveConnector;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>OneDriveConnectorProcessAdapter</code> is a wrapper around {@link OneDriveConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-02-02T06:35:07-03:00", comments = "Build UNNAMED.2793.f49b6c7")
public class OneDriveConnectorProcessAdapter
    extends OneDriveConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<OneDriveConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, OneDriveConnectorCapabilitiesAdapter> getProcessTemplate() {
        final OneDriveConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,OneDriveConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, OneDriveConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, OneDriveConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
