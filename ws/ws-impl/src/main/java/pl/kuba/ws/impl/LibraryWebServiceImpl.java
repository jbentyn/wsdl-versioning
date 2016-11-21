package pl.kuba.ws.impl;

import pl.kuba.common.dto.BookDto;
import pl.kuba.service.api.BookService;
import pl.kuba.service.impl.BookServiceImpl;
import pl.kuba.ws.api.LibraryWebService;

import javax.jws.WebService;

/**
 * Created by Kuba on 2016-11-19.
 */
@WebService(endpointInterface = "pl.kuba.ws.api.LibraryWebService", targetNamespace = "http://pl.kuba.ws/library")
public class LibraryWebServiceImpl implements LibraryWebService {

    //Na razie bez DI
    private BookService bookService = new BookServiceImpl();

    public BookDto getBookById(Long id) {
        return bookService.findBookById(id);
    }
}
