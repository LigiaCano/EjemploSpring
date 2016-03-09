package persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import persistence.daos.library.AuthorDao;
import persistence.daos.library.BookDao;
import persistence.daos.library.LibraryRepository;
import persistence.daos.library.StyleDao;

@Controller
public class LibraryController {

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private AuthorDao authorDao;

    @Autowired
    private StyleDao styleDao;

    @Autowired
    private BookDao bookDao;

    public void process() {
        libraryRepository.populate();

        System.out.println(">>>> Books:  " + bookDao.findAll());

        System.out.println(">>>> Authores del estilo: Infantil");
        System.out.println("     " + authorDao.findByStyle(styleDao.findByNameIgnoreCase("Infantil")));
        
        System.out.println(">>>> Name of Author by name of style");
        System.out.println(this.authorDao.findNameByStyleName("Especializado"));

        System.out.println(">>>> Author Any Book");
        System.out.println(this.authorDao.findNameByAnyBook());
        
        System.out.println(">>>> Author by Theme name");
        System.out.println(this.authorDao.findNameByThemeName("Acción"));
        
        libraryRepository.deleteAll();

    }
}
