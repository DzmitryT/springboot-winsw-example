# Spring Boot as a Windows Service example
Complete example for running Spring Boot 1.5 based application as Windows service.  
[Maven](https://maven.apache.org/download.cgi) 3.3.3 or higher and [.NET Framework](https://www.microsoft.com/net/download/windows) 4.0 or higher are required.

Project contains fully working Maven's pom.xml for downloading [winsw](https://github.com/kohsuke/winsw),  generating its XML-based config file “on the fly”  at the  **"package"** phase of build lifecycle and copy files to the dist folder at the **"install"** phase. All the settings are placed in the separate profile named **"winsvc"**, which could be enabled with "-Pwinsvc" maven command line param:

    mvn clean package -Pwinsvc
    mvn install -Pwinsvc

The names of executable file and Windows service are depend on the "project.artifactId" property and you can simple change it in the pom.xml. 
Example application is a "Hello world"-like with embedded Tomcat, so it could be accessed at the localhost  - http://127.0.0.1:8080
