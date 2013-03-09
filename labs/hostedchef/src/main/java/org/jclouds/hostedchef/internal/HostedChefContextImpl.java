/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.hostedchef.internal;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.jclouds.annotations.Name;
import org.jclouds.domain.Credentials;
import org.jclouds.hostedchef.HostedChefApi;
import org.jclouds.hostedchef.HostedChefAsyncApi;
import org.jclouds.hostedchef.HostedChefContext;
import org.jclouds.lifecycle.Closer;
import org.jclouds.location.Provider;
import org.jclouds.providers.ProviderMetadata;
import org.jclouds.rest.Utils;
import org.jclouds.rest.internal.RestContextImpl;

import com.google.common.base.Supplier;
import com.google.inject.Injector;
import com.google.inject.TypeLiteral;

/**
 * @author Ignasi Barrera
 */
@Singleton
public class HostedChefContextImpl extends RestContextImpl<HostedChefApi, HostedChefAsyncApi> implements
      HostedChefContext {

   @Inject
   protected HostedChefContextImpl(@Name String name, ProviderMetadata providerMetadata,
         @Provider Supplier<Credentials> creds, Utils utils, Closer closer, Injector injector) {
      super(name, providerMetadata, creds, utils, closer, injector, TypeLiteral.get(HostedChefApi.class), TypeLiteral
            .get(HostedChefAsyncApi.class));
   }

}