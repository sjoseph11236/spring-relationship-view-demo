package com.wozu.day17.Repository;

import com.wozu.day17.Models.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LibraryRepo extends CrudRepository<Library, Long> { }
