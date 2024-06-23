package arqref.one.security.exception;

import java.io.IOException;

public class ArqRefOneSecurityException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    public ArqRefOneSecurityException(IOException e){
        super(e);
     }

}
