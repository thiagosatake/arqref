package arqref.one.security.service;

import arqref.one.security.domain.ArqRefUserDetails;

public interface ArqRefUserDetailsService {
    
    ArqRefUserDetails loadUserByUsername(String principalName);

}
