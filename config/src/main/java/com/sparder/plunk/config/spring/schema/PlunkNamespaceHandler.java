/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sparder.plunk.config.spring.schema;

import com.sparder.plunk.config.ServiceConfig;
import com.sparder.plunk.config.ReferenceConfig;
import com.sparder.plunk.config.ApplicationConfig;
import com.sparder.plunk.config.RegistryConfig;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * PlunkNamespaceHandler
 * 
 * @author weimin.sun
 *
 */
public class PlunkNamespaceHandler extends NamespaceHandlerSupport {

//	static {
//		Version.checkDuplicate(DubboNamespaceHandler.class);
//	}

	public void init() {
	    registerBeanDefinitionParser("application", new PlunkBeanDefinitionParser(ApplicationConfig.class, true));
        //registerBeanDefinitionParser("module", new DubboBeanDefinitionParser(ModuleConfig.class, true));
        registerBeanDefinitionParser("registry", new PlunkBeanDefinitionParser(RegistryConfig.class, true));
        //registerBeanDefinitionParser("monitor", new DubboBeanDefinitionParser(MonitorConfig.class, true));
        //registerBeanDefinitionParser("provider", new DubboBeanDefinitionParser(ProviderConfig.class, true));
        //registerBeanDefinitionParser("consumer", new DubboBeanDefinitionParser(ConsumerConfig.class, true));
        //registerBeanDefinitionParser("protocol", new DubboBeanDefinitionParser(ProtocolConfig.class, true));
        registerBeanDefinitionParser("service", new PlunkBeanDefinitionParser(ServiceConfig.class, true));
        registerBeanDefinitionParser("reference", new PlunkBeanDefinitionParser(ReferenceConfig.class, false));
        //registerBeanDefinitionParser("annotation", new DubboBeanDefinitionParser(AnnotationBean.class, true));
    }

}