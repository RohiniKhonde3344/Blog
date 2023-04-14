package com.Blog.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.Blog.BlogRepo;
import com.Blog.CommentRepo;
import com.Blog.UserRepo;
import com.Blog.Entity.Blog;
import com.Blog.Entity.Comments;
import com.Blog.Entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class UserController {

	@Autowired
	private UserRepo re;

	@Autowired
	private BlogRepo rep;

	@Autowired
	private CommentRepo repo;
	
	
	
	@GetMapping("/showlist")
	  public String showBlogs(Model model) {
	    List<Blog> blogs = rep.findAll();
	    model.addAttribute("blog", blogs);
	    return "blog-list";
	  }
	
    
	@PostMapping(path = "/showblog")
	public String showblog(HttpServletRequest request, Model model) {

		String Title = (request.getParameter("Title"));
		String Content= (request.getParameter("Content"));
		
	         //model.(Title,Content);
		
		
		return "";
	}
	
	 @GetMapping("/links")
	    public String showLinks(Model model) {
	        // Create a list of anchor tags
	        List<Blog> links = rep.findAll();
//	        links.add("<a href='https://www.google.com'>Google</a>");
//	        links.add("<a href='https://www.facebook.com'>Facebook</a>");
//	        links.add("<a href='https://www.linkedin.com'>LinkedIn</a>");

	        // Add the list to the model
	        model.addAttribute("links", links);
	        return "links";
	    }
	
	
	 @GetMapping("/home")
	    public String myPage(HttpServletRequest request) {
	        // Get the value of the href attribute from the anchor tag
	        String hrefValue = request.getParameter("Bigdata");

	        // Do something with the href value
	        // ...

	        return "home";
	    }
	
	
	
	
	
	

	@GetMapping(path = "/blogs")
	public String bg() {
		return "blogs";
	}
	
	@PostMapping(path = "/saveblogs")
	public String saveblog(HttpServletRequest request, Model model) {

		String Title = (request.getParameter("Title"));
		String Content= (request.getParameter("Content"));
		
		Blog sb = new Blog(Title, Content, 0, 0,0);
		rep.save(sb);
		model.addAttribute("rohoni", "Added successfully");
		return "create_blog";
	}
	
	
	@GetMapping(path = "/b1comments")
	public String com1() {
		return "b1comments";
	}


	@PostMapping(path = "/doComment")
	public String docom(HttpServletRequest request, Model model) {

		String Comment = (request.getParameter("Comment"));
		Comments com = new Comments(0, Comment, null, null, null);
		repo.save(com);
		model.addAttribute("rohini", "Added successfully");
		return "b1comments";
	}

	
	

	@GetMapping(path = "/login")
	public String getlogin() {
		return "login";
	}

	@PostMapping(path = "/in")
	public String getin(HttpServletRequest request, Model model) {

		String name = (request.getParameter("name"));
		String pass = (request.getParameter("pass"));
		User u = re.finduser(name, pass);

		if (u != null)
		{
			if (u.getRole().equalsIgnoreCase("user")) {
				return "User";
		     	 }
			else {
				return "admin";
		     	 }
	  } 
		else {
			//model.addAttribute("errorMessage", "Invalid username or password");
			return "loginfail";
		     }

	}

		


	@PostMapping(path = "/regi")
	public String getregi(HttpServletRequest request, Model model) {

		String role = (request.getParameter("role"));
		String name = (request.getParameter("name"));
		String email = (request.getParameter("email"));
		String pass = (request.getParameter("pass"));

		User ms = new User(role, name, email, pass);
		re.save(ms);
		//model.addAttribute("rohoni", "Added successfully");
		return "success";
	}
	
	
	@GetMapping(path = "/cb")
	public String createblog() {
		return "create_blog";
	}

	
	
	
    
    
    
    
	
	
	
	
	
	

	@GetMapping(path = "/regi")
	public String getregi() {
		return "registration";
	}

	@GetMapping(path = "/home")
	public String gethome() {
		return "home";
	}

	@GetMapping(path = "/success")
	public String registered() {
		return "success";
	}
	
	

	@GetMapping(path = "/nb")
	public String newb() {
		return "NewBlog";
	}
	
	@GetMapping(path = "/b1")
	public String AI() {
		return "1-AI";
	}
//	 @GetMapping(path = "/b1")
//	    public String getAllBlogs() {
//	       
//	       //;
//	        return "blogs";
//	    }
	
//
//	@PostMapping(path = "/b1")
//    public String createBlog(@ModelAttribute Blog blog,Model model) {
//		 List<Blog> blogs = rep.findAll();
//		 model.addAttribute("blogs", blogs);
//        rep.save(blog);
//        return "1-AI";
//    }
	
    
//
//	@Service
//	public class BlogService {
//	  
//	    public void saveBlog(String title, String content) {
//	        Blog blog = new Blog();
//	        blog.setTitle(title);
//	        blog.setContent(content);
//	        rep.save(blog);
//	    }
//	}
	 
//	@PostMapping("/saveBlog")
//    public String saveBlog(@RequestParam("title") String title, @RequestParam("content") String content) {
//        blogService.saveBlog(title, content);
//        return "blogs";
//    }
//	
	

	@GetMapping(path = "/b2")
	public String ML() {
		return "ML";
	}


	@GetMapping(path = "/b3")
	public String IOT() {
		return "IOT";
	}

	@GetMapping(path = "/b4")
	public String RPA() {
		return "RPA";
	}

	@GetMapping(path = "/b5")
	public String ds() {
		return "DS";
	}
	
	

	
	
	@GetMapping(path = "bblog")
    public String getAllBlogs() {
        //List<Blog> blogs = rep.findAll();
      //  model.addAttribute("blogs", blogs);
        return "create_blog";
    }
	

	@GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        // Invalidate the session and redirect the user to the login page
        request.getSession().invalidate();
        return "redirect:/login?logout";
    }
	
	
	
}
