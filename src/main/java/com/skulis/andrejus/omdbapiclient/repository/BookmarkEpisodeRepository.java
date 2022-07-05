package com.skulis.andrejus.omdbapiclient.repository;

import com.skulis.andrejus.omdbapiclient.model.BookmarkEpisode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BookmarkEpisodeRepository extends CrudRepository<BookmarkEpisode, Long> {

    Optional<BookmarkEpisode> findBySiteNameAndChannelType(String siteName, BookmarkEpisode.ChannelType channelType);
}