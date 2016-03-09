package persistence.daos.library;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import persistence.entities.library.Theme;

public interface ThemeDao extends JpaRepository<Theme, Integer> {
	
	 @Query("select t.name from Book b join b.themeList t join b.authorList a where a.name = ?1")
	 List<String> findNameByAuthorName(String authorName);
	 
	 
	 
}
