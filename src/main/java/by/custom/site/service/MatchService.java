package by.custom.site.service;

import by.custom.site.models.Like;
import by.custom.site.models.Match;
import by.custom.site.repository.LikeRepository;
import by.custom.site.repository.MatchRepository;

import java.util.*;


public class MatchService {
    private final LikeRepository likeRepository;
    private final MatchRepository matchRepository;
    private final Map<String, Set<Like>> likes;
    private final Map<String, Set<Match>> matches;

    public MatchService(LikeRepository likeRepository, MatchRepository matchRepository) {
        this.likeRepository = likeRepository;
        this.matchRepository = matchRepository;
        this.likes = this.likeRepository.getLikes();
        this.matches = this.matchRepository.getMatches();
    }
}

