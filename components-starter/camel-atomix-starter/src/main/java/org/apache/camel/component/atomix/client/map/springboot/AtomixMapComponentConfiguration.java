/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.atomix.client.map.springboot;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.annotation.Generated;
import io.atomix.Atomix;
import io.atomix.catalyst.transport.Address;
import io.atomix.resource.ReadConsistency;
import org.apache.camel.component.atomix.client.map.AtomixMap.Action;
import org.apache.camel.component.atomix.client.map.AtomixMapComponent;
import org.apache.camel.component.atomix.client.map.AtomixMapConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Access Atomix's distributed map.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.atomix-map")
public class AtomixMapComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the atomix-map component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The Atomix instance to use. The option is a io.atomix.Atomix type.
     */
    private Atomix atomix;
    /**
     * The shared component configuration. The option is a
     * org.apache.camel.component.atomix.client.map.AtomixMapConfiguration type.
     */
    private AtomixMapConfiguration configuration;
    /**
     * The path to the AtomixClient configuration
     */
    private String configurationUri;
    /**
     * The default action.
     */
    private Action defaultAction = Action.PUT;
    /**
     * The key to use if none is set in the header or to listen for events for a
     * specific key. The option is a java.lang.Object type.
     */
    private Object key;
    /**
     * The nodes the AtomixClient should connect to
     */
    private List<Address> nodes;
    /**
     * The header that wil carry the result.
     */
    private String resultHeader;
    /**
     * The class name (fqn) of the Atomix transport
     */
    private String transportClassName = "io.atomix.catalyst.transport.netty.NettyTransport";
    /**
     * The resource ttl. The option is a long type.
     */
    private Long ttl;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * The cluster wide default resource configuration. The option is a
     * java.util.Properties type.
     */
    private Properties defaultResourceConfig;
    /**
     * The local default resource options. The option is a java.util.Properties
     * type.
     */
    private Properties defaultResourceOptions;
    /**
     * Sets if the local member should join groups as PersistentMember or not.
     * If set to ephemeral the local member will receive an auto generated ID
     * thus the local one is ignored.
     */
    private Boolean ephemeral = false;
    /**
     * The read consistency level.
     */
    private ReadConsistency readConsistency;
    /**
     * Cluster wide resources configuration.
     */
    private Map<String, Properties> resourceConfigs;
    /**
     * Local resources configurations
     */
    private Map<String, Properties> resourceOptions;

    public Atomix getAtomix() {
        return atomix;
    }

    public void setAtomix(Atomix atomix) {
        this.atomix = atomix;
    }

    public AtomixMapConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(AtomixMapConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getConfigurationUri() {
        return configurationUri;
    }

    public void setConfigurationUri(String configurationUri) {
        this.configurationUri = configurationUri;
    }

    public Action getDefaultAction() {
        return defaultAction;
    }

    public void setDefaultAction(Action defaultAction) {
        this.defaultAction = defaultAction;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public List<Address> getNodes() {
        return nodes;
    }

    public void setNodes(List<Address> nodes) {
        this.nodes = nodes;
    }

    public String getResultHeader() {
        return resultHeader;
    }

    public void setResultHeader(String resultHeader) {
        this.resultHeader = resultHeader;
    }

    public String getTransportClassName() {
        return transportClassName;
    }

    public void setTransportClassName(String transportClassName) {
        this.transportClassName = transportClassName;
    }

    public Long getTtl() {
        return ttl;
    }

    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public Properties getDefaultResourceConfig() {
        return defaultResourceConfig;
    }

    public void setDefaultResourceConfig(Properties defaultResourceConfig) {
        this.defaultResourceConfig = defaultResourceConfig;
    }

    public Properties getDefaultResourceOptions() {
        return defaultResourceOptions;
    }

    public void setDefaultResourceOptions(Properties defaultResourceOptions) {
        this.defaultResourceOptions = defaultResourceOptions;
    }

    public Boolean getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
    }

    public ReadConsistency getReadConsistency() {
        return readConsistency;
    }

    public void setReadConsistency(ReadConsistency readConsistency) {
        this.readConsistency = readConsistency;
    }

    public Map<String, Properties> getResourceConfigs() {
        return resourceConfigs;
    }

    public void setResourceConfigs(Map<String, Properties> resourceConfigs) {
        this.resourceConfigs = resourceConfigs;
    }

    public Map<String, Properties> getResourceOptions() {
        return resourceOptions;
    }

    public void setResourceOptions(Map<String, Properties> resourceOptions) {
        this.resourceOptions = resourceOptions;
    }
}