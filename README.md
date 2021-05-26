# GCP Storage library for Robot Framework
Introduction
------------
The Robot Framework GCP Storage Library is a library which provides common functionality for testing Google Cloud Storage file storage on Google Cloud Platform infrastructure.

Usage
-----
If you are using the [robotframework-maven-plugin](http://robotframework.org/MavenPlugin/) you can
use this library by adding the following dependency to
your pom.xml:

    <dependency>
        <groupId>com.github.leandrogianotti</groupId>
        <artifactId>robotframework-java-gcp-storage-library</artifactId>
        <version>0.1.0-SNAPSHOT</version>
    </dependency>

With Gradle, library can be use by importing it as a dependency in build.gradle:

    runtime('com.github.leandrogianotti:robotframework-java-gcp-storage-library:0.1.0-SNAPSHOT')

Library import in Robot tests can be done with:

|                    |                                 |
| ----------------   | ------------------------------- |
| *** Settings ***   |                                 |
| Library            | GCPStorageLibrary               |

Please note that to use the GCP Storage Library you need to set an environment variable where your code runs. Provide authentication credentials to your application code by setting the environment variable GOOGLE_APPLICATION_CREDENTIALS. This variable only applies to your current shell session, so if you open a new session, set the variable again. [Setting the environment variable](https://cloud.google.com/docs/authentication/getting-started#setting_the_environment_variable).

Example
-------

*** Test Cases ***

Upload File To GCP Storage Bucket 
    Upload File To Storage   bucket=<BucketName>   fileName=<FileName>    filePath=<PathDir/file.ext>
