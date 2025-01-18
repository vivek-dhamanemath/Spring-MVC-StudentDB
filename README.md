# Spring MVC Overview

## Introduction
Spring MVC (Model-View-Controller) is a web framework provided by Spring for building web applications in Java. It follows the MVC architectural pattern, which divides an application into three interconnected components: Model, View, and Controller.

## Components of Spring MVC

### 1. Model
- Represents the application's data and business logic.
- Encapsulates the state of the application and provides methods to manipulate that data.
- Typically consists of objects that represent entities in the application, such as users, products, orders, etc.

### 2. View
- Represents the presentation layer of the application.
- Responsible for rendering the user interface based on the data provided by the Model.
- Generates HTML output that is sent back to the client's web browser for display.

### 3. Controller
- Acts as an intermediary between the Model and the View.
- Receives incoming requests from the client, processes them, and determines how to respond.
- Implemented as Java classes annotated with `@Controller` or `@RestController`.
- Contains handler methods annotated with `@RequestMapping` that map specific URL patterns to business logic.

## Flow of a Request in Spring MVC Architecture

1. **Client Request**: A request is triggered from the client and hits the configuration file known as `web.xml` (Deployment Descriptor). If there is no information present in the `web.xml` file, it tries to search for the `DispatcherServlet` class.
2. **DispatcherServlet Initialization**: A custom initializer class, which must be a child of `AbstractAnnotationConfigDispatcherServletInitializer`, is used as a replacement for the `web.xml` file. The `DispatcherServlet` is responsible for two main jobs:
   - Invoking the Spring bean container and creating the respective objects for the mentioned classes in the `AppConfig` class.
   - Receiving the dynamic URL request from the UI and sending back the responses after processing the request.
3. **Handler Mapping and Adapter**: The `DispatcherServlet` uses `HandlerMapper` and `HandlerAdapter` to achieve the above-mentioned goals. The `HandlerMapper` contains information about all the handler methods present in the classes annotated with `@Controller`. The respective handler details are sent back to the `DispatcherServlet`, which then talks to the `HandlerAdapter` and forwards the request to the respective Controller layer of the application.
4. **Controller Processing**: Once the data is received on the Controller layer, it is forwarded to other layers of the application to process the request.
5. **Response Handling**: Once the data is processed and the response is ready to be sent back to the client, the Controller layer again takes the help of `HandlerAdapter` to reach the `DispatcherServlet`.
6. **View Resolution**: The `DispatcherServlet` takes the help of the view resolver to get the information of the view technology file that needs to be rendered on the browser based on the request received and processed. After receiving the view technology file details, the `DispatcherServlet` gives back the response to the client.

## ModelAndView
`ModelAndView` is a class in Spring MVC used to encapsulate both model (data) and view (HTML or JSP file) in a single object. It allows the controller class methods to return the data and the name of the view as a response. We can provide the view details using the `setViewName(String viewName)` method from the `ModelAndView` class. We can set the name and value for the data that has to be transferred using the `addObject(String name, Object value)` method from the `ModelAndView` class.

## Package Structure
This package contains the following components:
- **AddStudent.jsp**: A JSP file for adding student details.
- **Controller Classes**: Java classes annotated with `@Controller` to handle incoming requests.
- **Model Classes**: Java classes representing the entities in the application.
- **Configuration Classes**: Java classes for configuring the Spring application context.

### AddStudent.jsp
This JSP file provides a form for entering student details:
```html
<!-- ...existing code... -->
<form action="add-student" method="post">
    <input type="number" placeholder="Enter Student Id" name="studentId"> <br>
    <input type="text" placeholder="Enter Student Name" name="studentName"> <br>
    <input type="text" placeholder="Enter Student Email" name="studentEmail"> <br>
    <input type="number" placeholder="Enter Student Age" name="studentAge"> <br>
    <input type="number" placeholder="Enter Student Marks" name="studentMarks"> <br>
    <input type="submit" value="ADD">
</form>
<!-- ...existing code... -->
```

This form submits the student details to the `add-student` URL, which is handled by a controller class in the application.

## Flow of Execution

1. **Client Request**: The user fills out the form in `AddStudent.jsp` and submits it.
2. **DispatcherServlet**: The request is received by the `DispatcherServlet`, which is initialized by a custom initializer class.
3. **Handler Mapping**: The `DispatcherServlet` uses `HandlerMapper` to find the appropriate controller method to handle the request.
4. **Controller**: The request is forwarded to the controller method mapped to the `add-student` URL.
5. **Model Processing**: The controller processes the request, interacts with the model to handle business logic, and prepares the data.
6. **ModelAndView**: The controller returns a `ModelAndView` object containing the model data and the view name.
7. **View Resolution**: The `DispatcherServlet` uses the view resolver to determine the view technology file (e.g., JSP) to render.
8. **Response**: The view is rendered and the response is sent back to the client's web browser.
