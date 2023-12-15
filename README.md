To run the C# files, install the dotnet-script tool by running the following in command prompt:
```
dotnet tool install -g dotnet-script
```

Each file can be run individually by navigating to the CSharpLC folder in command prompt and running
```
dotnet script .\{FilenameGoesHere.csx}
```

Java files are executed through Main.java. Edit the main method in Main.java by making a new object of the desired class. Each file is made to run in the same format.
```
javac Main.java
java main
```