/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.discovery.api.service;

import java.util.Collections;
import java.util.Map;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
public interface Service {

    String HTTP_SCHEME = "http";
    String HTTPS_SCHEME = "https";
    String DEFAULT_BASE_PATH = "/";

    String id();

    String host();

    int port();

    default String scheme() {
        return HTTP_SCHEME;
    }

    default String basePath() {
        return DEFAULT_BASE_PATH;
    }

    default Map<String, Object> metadata() {
        return Collections.emptyMap();
    }
}
