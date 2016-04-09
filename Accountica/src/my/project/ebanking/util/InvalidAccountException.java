package my.project.ebanking.util;

import org.springframework.core.NestedRuntimeException;

public class InvalidAccountException extends NestedRuntimeException{
	private static final long serialVersionUID = -5705813683661824922L;
    Integer  identity;
	public InvalidAccountException(Integer  identity) {
		super("Unknown account");
        this.identity = identity;
	}
	public Integer getIdentity() {
        return identity;
    }

}
