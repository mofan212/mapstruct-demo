package indi.mofan.mapper;

import indi.mofan.common.dto.NovelDto;
import indi.mofan.common.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan 2021/2/5
 */
@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    NovelDto toNovelDto(Book book);
}
