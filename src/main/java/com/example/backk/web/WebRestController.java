package com.example.backk.web;

import com.example.backk.domain.posts.PostsRepository;
import com.example.backk.dto.posts.PostsSaveRequestDto;
import com.example.backk.service.PostsService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    //private static final Logger logger = LoggerFactory.getLogger(MetricsProperties.Web.class);
    //private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        //logger.info(dto.toString());
        //postsRepository.save(dto.toEntity());
        postsService.save(dto);
    }
}
