package com.wkrzywiec.medium.noticeboard.mapper;

import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO;
import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO.AuthorDTOBuilder;
import com.wkrzywiec.medium.noticeboard.controller.dto.NoticeDTO;
import com.wkrzywiec.medium.noticeboard.controller.dto.NoticeDTO.NoticeDTOBuilder;
import com.wkrzywiec.medium.noticeboard.entity.Author;
import com.wkrzywiec.medium.noticeboard.entity.Author.AuthorBuilder;
import com.wkrzywiec.medium.noticeboard.entity.Notice;
import com.wkrzywiec.medium.noticeboard.entity.Notice.NoticeBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-13T23:03:01+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
public class NoticeMapperImpl implements NoticeMapper {

    @Override
    public NoticeDTO noticeToDto(Notice notice) {
        if ( notice == null ) {
            return null;
        }

        NoticeDTOBuilder<?, ?> noticeDTO = NoticeDTO.builder();

        noticeDTO.id( notice.getId() );
        noticeDTO.creationDate( notice.getCreationDate() );
        noticeDTO.title( notice.getTitle() );
        noticeDTO.description( notice.getDescription() );
        noticeDTO.author( authorToAuthorDTO( notice.getAuthor() ) );

        return noticeDTO.build();
    }

    @Override
    public Notice dtoToNotice(NoticeDTO noticeDTO) {
        if ( noticeDTO == null ) {
            return null;
        }

        NoticeBuilder<?, ?> notice = Notice.builder();

        notice.id( noticeDTO.getId() );
        notice.creationDate( noticeDTO.getCreationDate() );
        notice.title( noticeDTO.getTitle() );
        notice.description( noticeDTO.getDescription() );
        notice.author( authorDTOToAuthor( noticeDTO.getAuthor() ) );

        return notice.build();
    }

    protected AuthorDTO authorToAuthorDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDTOBuilder<?, ?> authorDTO = AuthorDTO.builder();

        authorDTO.id( author.getId() );
        authorDTO.creationDate( author.getCreationDate() );
        authorDTO.firstName( author.getFirstName() );
        authorDTO.lastName( author.getLastName() );

        return authorDTO.build();
    }

    protected Author authorDTOToAuthor(AuthorDTO authorDTO) {
        if ( authorDTO == null ) {
            return null;
        }

        AuthorBuilder<?, ?> author = Author.builder();

        author.id( authorDTO.getId() );
        author.creationDate( authorDTO.getCreationDate() );
        author.firstName( authorDTO.getFirstName() );
        author.lastName( authorDTO.getLastName() );

        return author.build();
    }
}
