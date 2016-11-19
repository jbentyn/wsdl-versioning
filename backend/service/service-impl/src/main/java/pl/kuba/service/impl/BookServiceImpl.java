package pl.kuba.service.impl;

import pl.kuba.common.dto.BookDto;
import pl.kuba.service.api.BookService;

/**
 * Created by Kuba on 2016-11-19.
 */
public class BookServiceImpl implements BookService {

    public BookDto findBookById(Long id) {
        return BookDto.getMockInstance();
    }
}
