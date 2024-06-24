package arqref.one.web.security.service.impl;

import org.springframework.stereotype.Service;

import arqref.one.web.security.domain.ArqRefUserDetails;
import arqref.one.web.security.service.ArqRefUserDetailsService;

@Service
public class ArqRefUSerDetailsServiceImpl implements ArqRefUserDetailsService {

    @Override
    public ArqRefUserDetails loadUserByUsername(String principalName) {
        // TODO Auto-generated method stub
        return null;
    }

}
