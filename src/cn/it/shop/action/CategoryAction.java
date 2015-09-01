package cn.it.shop.action;

import cn.it.shop.service.CategoryService;

import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport {
	
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	public String update(){
		System.out.println("-----update-----");
		System.out.println(categoryService);
		return "update";
	}
	public String save(){
		System.out.println("-----save-----");
		System.out.println(categoryService);
		return "save";
	}
}
