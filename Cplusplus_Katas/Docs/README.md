#C++ Kata Complier

If it is a simple single source program:

`make foo`  

where the source file is **foo.c** or **foo.cpp**, etc.

You dont even need a makefile. Make has enough built-in rules to build your source file into an executable of the same name, minus extension.

**Running** the executable just built is the same as running any program - but you will most often need to specify the path to the executable as the shell will only search what is in **$PATH** to find executables, and most often that does not include the current directory (.).

So to run the built executable foo:

`./foo`

[C Plus Plus Documentation ](http://www.cplusplus.com/doc/tutorial/program_structure/)
