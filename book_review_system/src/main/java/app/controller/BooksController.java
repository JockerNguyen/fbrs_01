package app.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import app.dto.BookInfo;
import app.service.BookService;

@Controller
public class BooksController {
	private static final Logger logger = Logger.getLogger(BooksController.class);

	@Autowired
	private BookService bookService;

	@RequestMapping("books/{id}")
	public ModelAndView bookDetail(@PathVariable String id) {
		logger.info("Book Detail");
		ModelAndView model = new ModelAndView("bookDetail");
		BookInfo bookInfo = bookService.findBookById(Integer.parseInt(id));
		model.addObject("bookInfo", bookInfo);
		return model;
	}
}