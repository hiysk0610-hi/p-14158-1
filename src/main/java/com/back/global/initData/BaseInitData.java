package com.back.global.initData;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.ApplicationArguments;
@Configuration

public class BaseInitData {
   @Autowired
   private PostRepository postRepository;

    @Bean
    ApplicationRunner BaseInitDataAppLicationRunner() {
        return  args -> {
         //   if (postRepository.count()>0) return; //데이터가 있으면 =0이상이면 리턴

            Post post1 = postRepository.save(new Post("제목1", "내용1"));
            Post post2 = postRepository.save(new Post("제목2", "내용2"));
            System.out.println("기본 데이터가 초기화되었습니다.");


            //   postRepository.count();
            //SELECT COUNT(*) FROM post; 이거랑 동일하다. count()는 “DB 잘 붙었는지 확인용 테스트 코드”
         };
    }
}
