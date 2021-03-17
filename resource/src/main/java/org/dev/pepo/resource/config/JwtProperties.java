package org.dev.pepo.resource.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.Resource;

@Getter
@Setter
public class JwtProperties {

    private Resource publicKey;
}
