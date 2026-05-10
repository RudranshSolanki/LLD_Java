# Problem 1 — Single Responsibility Principle (SRP)

The following class does too many things. Refactor it so each class has one reason to change.

## Given Code 1

```javascript
class UserManager {
  constructor() {
    this.users = [];
  }

  addUser(user) {
    this.users.push(user);
    console.log(`User ${user.name} added.`);
  }

  getUserById(id) {
    return this.users.find(u => u.id === id);
  }

  saveToDatabase(user) {
    // Simulates saving to DB
    console.log(`Saving ${user.name} to database...`);
  }

  sendWelcomeEmail(user) {
    // Simulates sending email
    console.log(`Sending welcome email to ${user.email}...`);
  }

  generateUserReport() {
    return this.users.map(u => `${u.id}: ${u.name}`).join('\n');
  }
}
```

---

# Refactored Solution 1

```java
class UserManager {
    void addUser(User user) { }
}

class UserRepository {
    User fetchUserById(int id) { return null; }

    void saveToDb(User user) { }
}

class NotificationService {
    void sendWelcomeNotification(User user) { }
}

class UserReportGenerator {
    void generateUserReport(User user) { }
}
```


## Give Code 2

```java
class OrderService {
    
    void placeOrder(Order order) {
        // place the order
        System.out.println("Order placed: " + order.id);
    }

    double calculateTotal(Order order) {
        // calculate total price with tax
        return order.price * 1.18;
    }

    void saveOrder(Order order) {
        // save order to database
        System.out.println("Saving order " + order.id + " to DB...");
    }

    void sendOrderConfirmation(Order order) {
        // send confirmation email
        System.out.println("Sending confirmation to " + order.userEmail);
    }

    void printInvoice(Order order) {
        // print invoice
        System.out.println("Invoice for order: " + order.id);
    }

    void logOrder(Order order) {
        // log order details
        System.out.println("Logging order: " + order.id);
    }
}
```

# Refactored Solution 2

```java
class OrderService{
    void placeOrder(Order order);
}
class OrderPrice{
    double calculatePrice(Order order);
}
class OrderRepository{
    void saveOrder(Order order);
}
class NotificationService{
    void sendOrderConfirmation(Order order);
}
class OrderInvoice{
    void printInvoice(Order order);
}
class OrderLogger{
    void logOrder(Order order);
}
```



## Give Code 3

```java
class BlogPost {
    String title;
    String content;
    String authorName;

    void createPost(String title, String content) {
        // create a new blog post
        System.out.println("Post created: " + title);
    }

    void editPost(String title, String newContent) {
        // edit existing post
        System.out.println("Post edited: " + title);
    }

    void savePost(BlogPost post) {
        // save post to database
        System.out.println("Saving post to DB: " + post.title);
    }

    void deletePost(BlogPost post) {
        // delete post from database
        System.out.println("Deleting post: " + post.title);
    }

    void sendNewPostNotification(BlogPost post) {
        // notify subscribers about new post
        System.out.println("Notifying subscribers about: " + post.title);
    }

    void renderPostAsHtml(BlogPost post) {
        // convert post to HTML for display
        System.out.println("<h1>" + post.title + "</h1>");
    }

    void logPostActivity(BlogPost post) {
        // log post activity
        System.out.println("Logging activity for: " + post.title);
    }
}
```

# Refactored Solution 3

```java
class BlogPost{
    String title;
    String content;
    String authorName;
    BlogPost(String title,String content,String authorName){
        this.title = title;
        this.content = content;
        this.authorName = authorName;
    }
}
class ManagePost{


    void createPost(BlogPost post){
        System.out.println("Post Created: "+ post.title);
    }
    void editPost(BlogPost post){
          System.out.println("Post edited: " + post.title);
    }
}

class PostRepository{
    void savePost(BlogPost post){
        System.out.println("Post save to db");
    }
    void deletePost(BlogPost post){
        System.out.println("Post deleted");
    }
}

class NotificationService{
    void sendNewPostNotification(BlogPost post){
        System.out.println("Notifying subscribers about: " + post.title);
    }
}

class Renderer{
    void renderPostAsHtml(BlogPost post){
        System.out.println("<h1>" + post.title + "</h1>");
    }
}

class Logger{
    void logPostActivity(BlogPost post){
        System.out.println("Logging activity for: "+post.title);
    }
}
```