package pl.kuba.common.dto;

/**
 * Created by Kuba on 2016-11-19.
 */
public class BookDto {

    private Long id;
    private String author;
    private String title;

    public static BookDto getMockInstance() {
        BookDto bookDto = new BookDto();
        bookDto.id = 1L;
        bookDto.author = "Robert C. Martin";
        bookDto.title = "Clean Code";
        return bookDto;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BookDto{" + "id=" + id + ", author='" + author + '\'' + ", title='" + title + '\'' + '}';
    }
}
