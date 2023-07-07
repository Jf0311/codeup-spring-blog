package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import com.codeup.codeupspringblog.models.User;
import com.codeup.codeupspringblog.repositories.PostRepository;
import com.codeup.codeupspringblog.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
@RequestMapping("/posts")
public class PostController {
    private final PostRepository postDao;
    private final UserRepository userRepository;

    @GetMapping("")
    public String posts(Model model) {
        List<Post> posts = postDao.findAll();
        List<User> users = userRepository.findAll();

        model.addAttribute("posts", posts);
        model.addAttribute("users", users);

        return "/posts/show";
    }

    @GetMapping("/{id}")
    public String showSinglePost(@PathVariable Long id, Model model) {
        Optional<Post> optionalPost = postDao.findById(id);
        if (optionalPost.isEmpty()) {
            System.out.printf("Post with id " + id + " not found!");
            return "home";
        }

        Post post = optionalPost.get();
        User user = post.getUser();

        model.addAttribute("post", post);
        model.addAttribute("userEmail", user != null ? user.getEmail() : null);

        return "/posts/index";
    }


    @GetMapping("/create")
    public String showCreate() {
        return "/posts/create";
    }

    @PostMapping("/create")
    public String doCreate(@RequestParam String title, @RequestParam String body) {
        Post post = new Post();
        post.setTitle(title);
        post.setBody(body);

        // Assign a user to the post
        List<User> users = userRepository.findAll();
        if (!users.isEmpty()) {
            User user = users.get(0); // Assign the first user, you can change the logic as needed
            post.setUser(user);
        }

        postDao.save(post);

        return "redirect:/posts";
    }


    // Add other methods and functionality as needed
}
