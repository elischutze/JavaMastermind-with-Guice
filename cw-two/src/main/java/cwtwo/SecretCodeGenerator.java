package cwtwo;

import com.google.inject.BindingAnnotation;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

public class SecretCodeGenerator implements CodeGenerator {

	public SecretCodeGenerator(){
	}
	

	@Override
	public Code generateCode() {
		
		return null;
	}



	
	

}
