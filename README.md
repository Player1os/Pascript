Pascript
========

a strictly typed, turing complete programming language developed as a school project.

Programs are compiled into llvm byte code, that can be interpreted directly or compiled into executable machine code.

The language's features include:
- support for boolean, integer, float and string primitive datatypes
- dynamic multi-dimensional arrays of any of the mentioned primitve datatype
- full managment of allocated memory, which is automatically deallocated as soon as it isn't needed
- ability to incorporate external functions by linking a library during compilation, provided they support the same data types
- native support for various methods and operations on strings and arrays including concatenation, substring, searching and lexicographic comparison for the former and merging, content equality testing and resizing for the latter
- error messages during compilation point to the exact line and character position, that needs to be rewritten
