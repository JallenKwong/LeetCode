# Java内存区域与内存溢出异常 #

## 概述 ##

**内存泄露 Memory Leak**

**内存溢出 Out Of Memory**

有JVM存在，无需为每个new操作写配对的delete/free代码，不易出现 **Out Of Memory** 或 **Memory Leak**。但是，愿望是美好的，该出现的问题还是会出现，了解JVM如何使用内存有助于解决问题。

>A memory leak in Java is when objects you aren't using cannot be garbage collected because you still have a reference to them somewhere.

>An OutOfMemoryError is thrown when there is no memory left to allocate new objects. This is usually caused by a memory leak, but can also happen if you're just trying to hold too much data in memory at once.

>——[What is the difference between an OutOfMemoryError and a memory leak](https://stackoverflow.com/a/4943570)

## 运行时数据区域 ##

![JVM运行时数据区](image/JVM-data-area.png)




