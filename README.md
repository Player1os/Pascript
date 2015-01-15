Pascript
========

a strictly typed, high-level, turing-complete programming language developed as a school project.

Programs are compiled into llvm byte code, which can be interpreted directly or compiled into executable machine code.

The language's features include:
- support for boolean, integer, float and string primitive datatypes
- dynamic multi-dimensional arrays of any of the mentioned primitive datatype
- full management of allocated memory, which is automatically deallocated as soon as it isn't needed
- ability to incorporate external functions by linking a library during compilation, provided they support the same data types
- native support for various methods and operations on strings and arrays including concatenation, substring, searching and lexicographic comparison for the former and merging, content equality testing and resizing for the latter
- error messages during compilation point to the exact line and character position, that needs to be rewritten
- support for recursive function calling

The language does not directly support advanced data types, some operations can however be easily implemented using the available arrays, these are a few examples:

- **a.push(x)** : `a.insert(0, x);`
- **x = a.pop()** : `x = a.get(0); a.remove(0);`
- **a.addLast(x)** : `a.insert(a.size() - 1, x);`
- **x = a.removeLast()** : `x = a.get(a.size() - 1); a.remove(a.size() - 1);`

To learn more please read the [specification](https://github.com/Player1os/Pascript/wiki/Specification)
