/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jetty9;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JettyHttpComponent9Configurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JettyHttpComponent9 target = (JettyHttpComponent9) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "sslkeypassword":
        case "sslKeyPassword": target.setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslpassword":
        case "sslPassword": target.setSslPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keystore": target.setKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "errorhandler":
        case "errorHandler": target.setErrorHandler(property(camelContext, org.eclipse.jetty.server.handler.ErrorHandler.class, value)); return true;
        case "sslsocketconnectors":
        case "sslSocketConnectors": target.setSslSocketConnectors(property(camelContext, java.util.Map.class, value)); return true;
        case "socketconnectors":
        case "socketConnectors": target.setSocketConnectors(property(camelContext, java.util.Map.class, value)); return true;
        case "minthreads":
        case "minThreads": target.setMinThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxthreads":
        case "maxThreads": target.setMaxThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "threadpool":
        case "threadPool": target.setThreadPool(property(camelContext, org.eclipse.jetty.util.thread.ThreadPool.class, value)); return true;
        case "enablejmx":
        case "enableJmx": target.setEnableJmx(property(camelContext, boolean.class, value)); return true;
        case "jettyhttpbinding":
        case "jettyHttpBinding": target.setJettyHttpBinding(property(camelContext, org.apache.camel.component.jetty.JettyHttpBinding.class, value)); return true;
        case "httpbinding":
        case "httpBinding": target.setHttpBinding(property(camelContext, org.apache.camel.http.common.HttpBinding.class, value)); return true;
        case "httpconfiguration":
        case "httpConfiguration": target.setHttpConfiguration(property(camelContext, org.apache.camel.http.common.HttpConfiguration.class, value)); return true;
        case "mbcontainer":
        case "mbContainer": target.setMbContainer(property(camelContext, org.eclipse.jetty.jmx.MBeanContainer.class, value)); return true;
        case "sslsocketconnectorproperties":
        case "sslSocketConnectorProperties": target.setSslSocketConnectorProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "socketconnectorproperties":
        case "socketConnectorProperties": target.setSocketConnectorProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "continuationtimeout":
        case "continuationTimeout": target.setContinuationTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "usecontinuation":
        case "useContinuation": target.setUseContinuation(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "responsebuffersize":
        case "responseBufferSize": target.setResponseBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestbuffersize":
        case "requestBufferSize": target.setRequestBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestheadersize":
        case "requestHeaderSize": target.setRequestHeaderSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "responseheadersize":
        case "responseHeaderSize": target.setResponseHeaderSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "usexforwardedforheader":
        case "useXForwardedForHeader": target.setUseXForwardedForHeader(property(camelContext, boolean.class, value)); return true;
        case "sendserverversion":
        case "sendServerVersion": target.setSendServerVersion(property(camelContext, boolean.class, value)); return true;
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": target.setAllowJavaSerializedObject(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
