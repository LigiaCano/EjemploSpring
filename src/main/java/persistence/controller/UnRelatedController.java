package persistence.controller;

import java.util.Arrays;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import persistence.daos.UnRelatedDao;
import persistence.entities.Gender;
import persistence.entities.UnRelatedEntity;

@Controller
public class UnRelatedController {

    @Autowired
    private UnRelatedDao unRelatedDao;

    public void process() {
    	  String[] list = {"0", "1", "2", "3", "4"};
          UnRelatedEntity entity = new UnRelatedEntity("Ligia", Gender.MALE, new GregorianCalendar(1964, 11, 31), "...", list,
                  Arrays.asList(list), "no persistence");
          unRelatedDao.save(entity);
        System.out.println(">>>> UnRelatedEntity:  " + unRelatedDao.findByIdIn(Arrays.asList(0,1,2,3)));
        System.out.println(">>>> UnRelatedEntity:  " + unRelatedDao.findByIdGreaterThan(5, new PageRequest	(1, 3)));
        
        System.out.println(unRelatedDao.findGenderByGenderLike(Gender.MALE));
        
        System.out.println( unRelatedDao.findNickByNickLike("Ligia"));
        
        System.out.println(unRelatedDao.findStringsById(1));
    }
}
