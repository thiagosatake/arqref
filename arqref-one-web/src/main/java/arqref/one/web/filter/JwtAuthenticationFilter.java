package arqref.one.web.filter;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import arqref.one.security.service.ArqRefUserDetailsService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private ArqRefUserDetailsService arqRefUserDetailsService;
    
    public JwtAuthenticationFilter(ArqRefUserDetailsService arqRefUserDetailsService) {    
        this.arqRefUserDetailsService = arqRefUserDetailsService;
    }
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        log.info("Jwt Authentication Filter .... do something nice here for user {}", currentPrincipalName);
        arqRefUserDetailsService.loadUserByUsername(currentPrincipalName);
        filterChain.doFilter(request, response);
    }
}
