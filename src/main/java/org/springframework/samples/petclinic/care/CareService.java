package org.springframework.samples.petclinic.care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CareService {    

	@Autowired
	private CareProvisionRepository careProvisionRepository;
    
	public List<Care> getAllCares(){
        List<Care> c = careProvisionRepository.findAllCares();
        return c;
    }

    public List<Care> getAllCompatibleCares(String petTypeName){
        return null;
    }

    public Care getCare(String careName) {
       Care c = careProvisionRepository.findCareByName(careName);
       return c;
    }

    
    public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {
        return null;   
    }

    public List<CareProvision> getAllCaresProvided(){
        List<CareProvision> c = careProvisionRepository.findAll();
        return c;
    }

    public List<CareProvision> getCaresProvided(Integer visitId){
        return null;

    }
    
}
