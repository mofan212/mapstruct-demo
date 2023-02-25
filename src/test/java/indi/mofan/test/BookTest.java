package indi.mofan.test;

import indi.mofan.common.dto.NovelDto;
import indi.mofan.common.entity.Book;
import indi.mofan.mapper.BookMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mofan 2021/2/5
 */
public class BookTest {

    @Test
    public void testToNovel() {
        Book book = new Book();
        book.setBookName("Effective Java");
        book.setPrice(78.0);
        NovelDto novelDto = BookMapper.INSTANCE.toNovelDto(book);

        assertEquals("Effective Java", novelDto.getBookName());
        assertEquals("author", novelDto.getAuthor());
        assertEquals(78.0, novelDto.getPrice(), 0.0);
    }
}
