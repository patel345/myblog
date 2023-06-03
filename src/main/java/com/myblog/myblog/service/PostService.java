package com.myblog.myblog.service;

import com.myblog.myblog.payload.PostDto;

import java.util.List;

public interface PostService {
  PostDto createPost(PostDto postDto);


    List<PostDto> getAllPosts();

  PostDto updatePost(PostDto postDto, long id);

  void deletePostById(long id);

  PostDto getPostById(long id);
}
