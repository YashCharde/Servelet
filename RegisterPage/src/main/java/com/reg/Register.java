package com.reg;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Register extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String fName = req.getParameter("fname");
	   String lName = req.getParameter("lname");
	   String email = req.getParameter("email");
	   String password = req.getParameter("password");
	   String mobno = req.getParameter("mobno");
	   String gender = req.getParameter("gender");
	   String dob = req.getParameter("dob");
	   String age = req.getParameter("age");
	   String degree = req.getParameter("degree");
	   String passing_year = req.getParameter("passing-year");
	   String address = req.getParameter("address");
	   String city = req.getParameter("city");
	   String country = req.getParameter("country");
	   
	   System.out.println("First Name: " + fName);
       System.out.println("Last Name: " + lName);
       System.out.println("Email: " + email);
       System.out.println("Password: " + password);
       System.out.println("Mobile Number: " + mobno);
       System.out.println("Gender: " + gender);
       System.out.println("Date of Birth: " + dob);
       System.out.println("Age: " + age);
       System.out.println("Degree: " + degree);
       System.out.println("Passing Year: " + passing_year);
       System.out.println("Address: " + address);
       System.out.println("City: " + city);
       System.out.println("Country: " + country);
       
       PrintWriter out = resp.getWriter();
       
       out.println("<html>");
       out.println("<head><title>Registration Success</title></head>");
       out.println("<body>");
       out.println("<h1>Registration Successful!</h1>");
       out.println("<p>Thank you for registering, " + fName + " " + lName + "</p>");
       out.println("<h3>Registration Details:</h3>");
       out.println("</html>");
       out.println(fName);
       out.println(lName);
       out.println(email);
       out.println( password);
       out.println(mobno);
       out.println(gender);
       out.println(dob);
       out.println(age);
       out.println(degree);
       out.println(passing_year);
       out.println(address);
       out.println(city);
       out.println(country);
       
       
	}

}
