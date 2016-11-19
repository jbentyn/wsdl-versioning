package pl.kuba.ws.api;

import pl.kuba.common.dto.BookDto;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Kuba on 2016-11-19.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL)
public interface LibraryWebService {

    @WebMethod
    public BookDto getBookById(Long id);
}
