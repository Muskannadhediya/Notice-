package com.wkrzywiec.medium.noticeboard.mapper;

import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO;
import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO.AuthorDTOBuilder;
import com.wkrzywiec.medium.noticeboard.entity.Author;
import com.wkrzywiec.medium.noticeboard.entity.Author.AuthorBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-13T23:03:02+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorDTO authorToDto(Author author) {
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

    @Override
    public Author dtoToAuthor(AuthorDTO authorDTO) {
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
