# sbsvc1
Webservice using springboot and gradle

## Install *gradle* with SDKMAN!
1. Get SDKMAN!
	```
	$ curl -s https://get.sdkman.io | bash
	```

2. Open a new terminal and install Gradle
	```
	$ sdk install gradle 3.3
	```

3. Verify gradle
	```
	$ gradle
	```
	This should output some text like below with a *BUILD SUCCESSFUL*. If you check your current path there would be a *.gradle* folder.
	```
	:help
	
	Welcome to Gradle 3.3.
	
	To run a build, run gradle <task> ...
	
	To see a list of available tasks, run gradle tasks
	
	To see a list of command-line options, run gradle --help
	
	To see more detail about a task, run gradle help --task <task>
	
	BUILD SUCCESSFUL
	
	Total time: 0.862 secs
	```
	You might have a different run time.

## Setup workspace
1. Clone this repo
	```
	$ git clone https://github.com/gitbaron/sbsvc1.git
	```

2. Check gradle tasks
	```
	$ gradle tasks
	```
	
	This should have an output as below
	```
	:tasks
	
	------------------------------------------------------------
	All tasks runnable from root project
	------------------------------------------------------------
	
	Application tasks
	-----------------
	bootRun - Run the project with support for auto-detecting main class and reloading static resources
	
	Build tasks
	-----------
	assemble - Assembles the outputs of this project.
	bootRepackage - Repackage existing JAR and WAR archives so that they can be executed from the command line using 'java -jar'
	build - Assembles and tests this project.
	buildDependents - Assembles and tests this project and all projects that depend on it.
	buildNeeded - Assembles and tests this project and all projects it depends on.
	classes - Assembles main classes.
	clean - Deletes the build directory.
	jar - Assembles a jar archive containing the main classes.
	testClasses - Assembles test classes.
	
	Build Setup tasks
	-----------------
	init - Initializes a new Gradle build. [incubating]
	wrapper - Generates Gradle wrapper files. [incubating]
	
	Documentation tasks
	-------------------
	javadoc - Generates Javadoc API documentation for the main source code.
	
	Help tasks
	----------
	buildEnvironment - Displays all buildscript dependencies declared in root project 'sbsvc1'.
	components - Displays the components produced by root project 'sbsvc1'. [incubating]
	dependencies - Displays all dependencies declared in root project 'sbsvc1'.
	dependencyInsight - Displays the insight into a specific dependency in root project 'sbsvc1'.
	dependentComponents - Displays the dependent components of components in root project 'sbsvc1'. [incubating]
	help - Displays a help message.
	model - Displays the configuration model of root project 'sbsvc1'. [incubating]
	projects - Displays the sub-projects of root project 'sbsvc1'.
	properties - Displays the properties of root project 'sbsvc1'.
	tasks - Displays the tasks runnable from root project 'sbsvc1'.
	
	IDE tasks
	---------
	cleanEclipse - Cleans all Eclipse files.
	eclipse - Generates all Eclipse files.
	
	Verification tasks
	------------------
	check - Runs all checks.
	test - Runs the unit tests.
	
	Rules
	-----
	Pattern: clean<TaskName>: Cleans the output files of a task.
	Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
	Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.
	
	To see all tasks and more detail, run gradle tasks --all
	
	To see more detail about a task, run gradle help --task <task>
	
	BUILD SUCCESSFUL
	
	Total time: 0.874 secs
	```
	You might have a different run time.

3. Setup Eclipse environment
	This command creates the *.classpath* and *.project* files used by Eclipse
	```
	$ gradle eclipse
	```

4. Import the gradle project in eclipse
	Boot up eclipse and import a gradle project. Point to the path where you have cloned this repo.

5. Build using gradle
	You can use the Gradle Tasks view from within eclipse to build the project or from the command line in the current project path execute the following command.
	```
	gradle build
	```

6. Run the code
	Again you can run this from within eclipse Gradle Tasks view by running bootRun or from command line
	```
	gradle bootRun
	```
	Logging output is displayed. The service should be up and running within a few seconds.

7. Test the service
	Now that the service is up, visit http://localhost:8080/greeting, where you see:
	
	```
	{"id":1,"content":"Hello, World!"}
	```
	Provide a name query string parameter with http://localhost:8080/greeting?name=User. Notice how the value of the content attribute changes from "Hello, World!" to "Hello User!":
	```
	{"id":2,"content":"Hello, User!"}
	```
8. The Persons service
	There is also a persons service that returns an array of pre-coded person names and their ids. Visit ```http://localhost:8080/persons``` to get all the persons.
	Then use the array position (starting with 0) to get the particular person using ```http://localhost:8080/persons/{id}```. Notice that using id value 4 will return an error. 
ENJOY !! :thumbsup:
