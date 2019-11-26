# RequestLibraryTestServer

This is the test server for [link](https://github.com/hshen12/SeniorProject)

## Get Start

### Prerequisites

```
Java 8 or higher version
Gradle
```

### Installing

To install gradle on mac/linux

SDKMAN! is a tool for managing parallel versions of multiple Software Development Kits on most Unix-based systems.

````
$ sdk install gradle 5.6.4
````

Homebrew is “the missing package manager for macOS”.

````
$ brew install gradle
````

Verify your installation

````
$ gradle -v

------------------------------------------------------------
Gradle 5.6.4
------------------------------------------------------------
````

To install gradle on windows

Create a new directory C:\Gradle with File Explorer.

Open a second File Explorer window and go to the directory where the Gradle distribution was downloaded. Double-click the ZIP archive to expose the content. Drag the content folder gradle-5.6.4 to your newly created C:\Gradle folder.

Alternatively you can unpack the Gradle distribution ZIP into C:\Gradle using an archiver tool of your choice.

Step 3. Configure your system environment
Linux & MacOS users
Configure your PATH environment variable to include the bin directory of the unzipped distribution, e.g.:

````
 $ export PATH=$PATH:/opt/gradle/gradle-5.6.4/bin
````
Microsoft Windows users
In File Explorer right-click on the This PC (or Computer) icon, then click Properties -> Advanced System Settings -> Environmental Variables.

Under System Variables select Path, then click Edit. Add an entry for C:\Gradle\gradle-5.6.4\bin. Click OK to save.

For detail, please see [link](https://gradle.org/install/)

## Usage

````
./gradlew run
````

## Built With

* [Gradle](https://gradle.org/) - Package control tool and build-automation system

## Authors

* **Hao Shen** - *Initial work* - [hshen12](https://github.com/hshen12)
* **Jeremy Li** - *Initial work* - [zechengli](https://github.com/zechnegli)
* **Tracy Feng** - *Initial work* - [xfeng23](https://github.com/xfeng23)
