package org.mycompany.service;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
		super(parameters);
    	add(new LoginForm("loginForm"));
    }
    
    /*class LoginForm extends Form{
    	private TextField usernameField;
    	private PasswordTextField passwordField;
    	private Label loginStatus;
    		
    	public LoginForm(String id) {
    		super(id);
    			
    		usernameField = new TextField("username", Model.of(""));
    		passwordField = new PasswordTextField("password", Model.of(""));			
    		loginStatus = new Label("loginStatus", Model.of(""));
    			
    		add(usernameField);
    		add(passwordField);
    		add(loginStatus);
    	}

    	public final void onSubmit() {
    		String username = (String)usernameField.getDefaultModelObject();
    		String password = (String)passwordField.getDefaultModelObject();
    			
    		if(username.equals("test") && password.equals("test"))
    		     loginStatus.setDefaultModelObject("Congratulations!");
    		else
    		     loginStatus.setDefaultModelObject("Wrong username or password!");			
    	}
    }*/
} 
    class LoginForm extends Form{
    	 /*private String username;
    	 private String password;
    	 private String loginStatus;*/
    	User user = new User();
    	List<String> fruitsList = new ArrayList<String>();
    	DropDownChoice dropDownChoice;
    	public LoginForm(String id) {
    		super(id);    		
    		CompoundPropertyModel compoundPropertyModel = new CompoundPropertyModel(user);
    		setDefaultModel(compoundPropertyModel);
    		add(new TextField("username"));
    		add(new PasswordTextField("password"));			
    		add(new Label("loginStatus"));
/*    		fruitsList.add("Apple");
    		fruitsList.add("Banana");
*///    		dropDownChoice = new DropDownChoice<String>("fruits", Model.of(""),fruitsList);
//    		add(dropDownChoice);	
/*    		dropDownChoice = new DropDownChoice<String>("fruits", compoundPropertyModel.bind("selectedFruit"),fruitsList);*/
//    		dropDownChoice.add(new FormComponentUpdatingBehavior());
    		/*add(dropDownChoice);*/
//    		add(new DropDownChoice<String>("fruits",compoundPropertyModel.bind("selectedFruit"), fruitsList));
    	}

    	public final void onSubmit() {
//    		System.out.println("Select fruit--- "+dropDownChoice.getDefaultModelObjectAsString());
//    		System.out.println(user.getSelectedFruit());
    		if(user.getUserName().equals("test") && user.getPassword().equals("test"))
    		     user.setLoginStatus("Congratulations!");
    		else
    		     user.setLoginStatus("Wrong username or password!");			
    	}
    }
