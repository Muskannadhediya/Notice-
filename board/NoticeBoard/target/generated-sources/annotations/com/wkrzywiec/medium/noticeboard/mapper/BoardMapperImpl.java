package com.wkrzywiec.medium.noticeboard.mapper;

import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO;
import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO.AuthorDTOBuilder;
import com.wkrzywiec.medium.noticeboard.controller.dto.BoardDTO;
import com.wkrzywiec.medium.noticeboard.controller.dto.BoardDTO.BoardDTOBuilder;
import com.wkrzywiec.medium.noticeboard.controller.dto.NoticeDTO;
import com.wkrzywiec.medium.noticeboard.controller.dto.NoticeDTO.NoticeDTOBuilder;
import com.wkrzywiec.medium.noticeboard.entity.Author;
import com.wkrzywiec.medium.noticeboard.entity.Author.AuthorBuilder;
import com.wkrzywiec.medium.noticeboard.entity.Board;
import com.wkrzywiec.medium.noticeboard.entity.Board.BoardBuilder;
import com.wkrzywiec.medium.noticeboard.entity.Notice;
import com.wkrzywiec.medium.noticeboard.entity.Notice.NoticeBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-13T23:03:02+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
public class BoardMapperImpl implements BoardMapper {

    @Override
    public BoardDTO boardToDto(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardDTOBuilder<?, ?> boardDTO = BoardDTO.builder();

        boardDTO.id( board.getId() );
        boardDTO.creationDate( board.getCreationDate() );
        boardDTO.title( board.getTitle() );
        boardDTO.noticeList( noticeListToNoticeDTOList( board.getNoticeList() ) );

        return boardDTO.build();
    }

    @Override
    public Board dtoToBoard(BoardDTO boardDTO) {
        if ( boardDTO == null ) {
            return null;
        }

        BoardBuilder<?, ?> board = Board.builder();

        board.id( boardDTO.getId() );
        board.creationDate( boardDTO.getCreationDate() );
        board.title( boardDTO.getTitle() );
        board.noticeList( noticeDTOListToNoticeList( boardDTO.getNoticeList() ) );

        return board.build();
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

    protected NoticeDTO noticeToNoticeDTO(Notice notice) {
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

    protected List<NoticeDTO> noticeListToNoticeDTOList(List<Notice> list) {
        if ( list == null ) {
            return null;
        }

        List<NoticeDTO> list1 = new ArrayList<NoticeDTO>( list.size() );
        for ( Notice notice : list ) {
            list1.add( noticeToNoticeDTO( notice ) );
        }

        return list1;
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

    protected Notice noticeDTOToNotice(NoticeDTO noticeDTO) {
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

    protected List<Notice> noticeDTOListToNoticeList(List<NoticeDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Notice> list1 = new ArrayList<Notice>( list.size() );
        for ( NoticeDTO noticeDTO : list ) {
            list1.add( noticeDTOToNotice( noticeDTO ) );
        }

        return list1;
    }
}
