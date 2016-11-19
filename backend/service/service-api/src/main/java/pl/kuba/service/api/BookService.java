package pl.kuba.service.api;

import pl.kuba.common.dto.BookDto;

/**
 * Created by Kuba on 2016-11-19.
 */
public interface BookService {

    BookDto findBookById(Long id);
}
