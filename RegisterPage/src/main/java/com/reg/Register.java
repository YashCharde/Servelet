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
     
      // Create the response page 
        out.println("<html>");
       out.println("<head><title>Registration Success</title></head>");
       out.println("<body>");
       out.println("<h1>Registration Successful!</h1>");
       out.println("<p>Thank you for registering, " + fName + " " + lName + "!</p>");
       out.println("<h3>Your Registration Details:</h3>");
       
       // Display the details in a more structured manner
       out.println("<table border='1' cellpadding='5'>");
       out.println("<tr><td><strong>First Name</strong></td><td>" + fName + "</td></tr>");
       out.println("<tr><td><strong>Last Name</strong></td><td>" + lName + "</td></tr>");
       out.println("<tr><td><strong>Email</strong></td><td>" + email + "</td></tr>");
       out.println("<tr><td><strong>Password</strong></td><td>" + password + "</td></tr>");
       out.println("<tr><td><strong>Mobile Number</strong></td><td>" + mobno + "</td></tr>");
       out.println("<tr><td><strong>Gender</strong></td><td>" + gender + "</td></tr>");
       out.println("<tr><td><strong>Date of Birth</strong></td><td>" + dob + "</td></tr>");
       out.println("<tr><td><strong>Age</strong></td><td>" + age + "</td></tr>");
       out.println("<tr><td><strong>Degree</strong></td><td>" + degree + "</td></tr>");
       out.println("<tr><td><strong>Passing Year</strong></td><td>" + passing_year + "</td></tr>");
       out.println("<tr><td><strong>Address</strong></td><td>" + address + "</td></tr>");
       out.println("<tr><td><strong>City</strong></td><td>" + city + "</td></tr>");
       out.println("<tr><td><strong>Country</strong></td><td>" + country + "</td></tr>");
       out.println("</table>");

       out.println("</body>");
       out.println("</html>");
   }
}
