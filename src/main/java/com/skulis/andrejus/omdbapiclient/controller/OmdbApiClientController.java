package com.skulis.andrejus.omdbapiclient.controller;

import com.skulis.andrejus.omdbapiclient.model.Season;
import com.skulis.andrejus.omdbapiclient.service.RestTemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OmdbApiClientController {

    private final RestTemplateService restTemplateService;

    public OmdbApiClientController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping("/episodes/{movieId}/{seasonNumber}")
    public String getAllEpisodes(@PathVariable String movieId, @PathVariable String seasonNumber, Model model) {
        Season season = restTemplateService.getSeasonNumberForMovieId(seasonNumber, movieId);
        model.addAttribute("season", season);
//        model.addAttribute("episodes", restTemplateService.getEpisodesForSeason(movieId, seasonNumber));
        return "episodes";
    }

//    @GetMapping("/students/edit/{id}")
//    public String editStudentForm(@PathVariable Long id, Model model) {
//        model.addAttribute("student", studentService.getStudentById(id));
//        return "edit_student";
//    }
}
