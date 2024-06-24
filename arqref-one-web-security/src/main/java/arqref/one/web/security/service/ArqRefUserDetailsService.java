package arqref.one.web.security.service;

import arqref.one.web.security.domain.ArqRefUserDetails;

public interface ArqRefUserDetailsService {
    
    ArqRefUserDetails loadUserByUsername(String principalName);

}
