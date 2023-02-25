package indi.mofan.common.dto;

import indi.mofan.common.annotation.Default;
import lombok.Getter;

import java.beans.ConstructorProperties;

/**
 * @author mofan 2021/2/5
 */
@Getter
public class NovelDto {
    private String bookName;
    private Double price;
    private String author;

    @Default
    @ConstructorProperties({"bookName", "price", "author"})
    public NovelDto(String book, Double price, String author) {
        this.bookName = book;
        this.price = price;
        this.author = "author";
    }


    public NovelDto(String bookName, Double price) {
        this.bookName = bookName;
        this.price = price;
    }
}
