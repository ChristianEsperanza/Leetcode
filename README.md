To run the C# files, install the dotnet-script tool by running the following in command prompt:
```
dotnet tool install -g dotnet-script
```

Each file can be run individually by navigating to the CSharpLC folder in command prompt and running
```
dotnet script .\{FilenameGoesHere.csx}
```

To run the Java files, compile then execute the specified file by running the following in command prompt:
```
javac {java file name}
java {Compiled file name without extension}
```