package org.springframework.samples.petclinic.care;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class CareFormatter implements Formatter<Care>{

	private CareService cS;
	
	@Autowired
	public CareFormatter(CareService careService){
        this.cS= careService;
    }
	
    @Override
    public String print(Care object, Locale locale) {
        return object.getName();
    }

    @Override
    public Care parse(String text, Locale locale) throws ParseException {
    	Care care = cS.getCare(text);
        if(care != null){
            return care;
        }
        else{
            throw new ParseException("care not found"+ text, 0);
        }
    }
    
     
}
