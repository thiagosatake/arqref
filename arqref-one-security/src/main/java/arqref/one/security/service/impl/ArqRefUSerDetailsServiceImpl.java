package arqref.one.security.service.impl;

import org.springframework.stereotype.Service;

import arqref.one.security.domain.ArqRefUserDetails;
import arqref.one.security.service.ArqRefUserDetailsService;

@Service
public class ArqRefUSerDetailsServiceImpl implements ArqRefUserDetailsService {

    @Override
    public ArqRefUserDetails loadUserByUsername(String principalName) {
        // TODO Auto-generated method stub
        return null;
    }

}
