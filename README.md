# SoftwareSecurity

Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

The client was Artemis Financial and they are a consulting company that develops financial plans for their customers including savings, retirement, investment and insurance. They needed to improve their software by incorporating effective software security strategies in order to protect user data and financial information. In my second project, Artemis Financial needed to add a file verification step (checksum) to its web application to enable secure communication.


What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

I did well on coming up with a mitigation plan and refactoring the application code. For my mitigation plan, I focused on stregnthening the applicable areas on security and incorporate best practices. For refactoring the application code, I focused on making sure that I did not introduce new vulnerabilities. It is important to code securely because it prevents common vulnerabilities that bad actors could exploit and cause significant damage. For the client, it helps protect data by avoiding costly data breaches, makes sure they are in complance with government laws and maintains the trust of the user. 


Which part of the vulnerability assessment was challenging or helpful to you?

For static testing, the OWASP Dependency Check tool was very useful in identifying improvements that need to be made based on known vulnerabilities. It would have taken a lot more time to go through all of the dependencies in the pom.xml file manually to make sure that they were up to date and did not have known vulnerabilities. 


How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

To protect data in transit I added encrpytion using the RSA algorithm with 2048 bit keys and enabled a secure HTTPS connection to increase the layers of security. For data at rest, I employed a SHA-384 hashing algorithm to maintain data integrity. In the future, I will continue to use static and dynamic testing to make a comprehensive assessment of existing vulnerabilities. In the future, I want to incorporate more tools into my kit as a developer such as the OWASP Dependency Check that we used in this class.  


How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

In order to make sure my application was functional and secure I conducted a code review and functional testing. When I conducted a code review I looked for security issues and logic errors. From there, I conducted functional testing to make sure that application behaved in a way that satisfied the requirements of the client (Artemis Financial).  After I refactored my code, I ran a new dependency check to make sure that I did not introduce new vulnerabilities into the applicaiton.



What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Three resources that were useful for me during this class that I will continue to use are the Spring Framework website, the OWASP website and the Java Platform SE 8 website. The Spring Framework website helped me understand more about Spring Boot. I would like to continue learning more about Boot and other features. The OWASP website helped me learn more about the Dependency Check tool. I would like to learn more about other tools that are offered that could be useful in future projects. The Java Platform SE 8 website was useful in learning about different algorithm ciphers. This website will be useful in continuing to learn Java specific libraries or features. I plan to continue to refer to these resources in order to deepen my understanding of software security and improve my practices as a developer. 
 
Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I would show them my cryptography work on Project Two. I learned to incorporate my recommendation of algorithm ciphers, certificate generation, and  deploy these ciphers to establish a secure HTTPS connection in an application. This project highlights my understanding of symmetric and asymmetric encryption as well as digital signatures. 
