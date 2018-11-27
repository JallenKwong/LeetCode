# -*- coding: utf-8 -*

#为Leetcode的题目，生成 md 及 java文件

import os

os.chdir("C:\\eclipse-workspace\\LeetCode")

print "Current working directory: "
print os.getcwd()

print "Please input the difficulty of problem. (e for Easy, m for Medium, h for Hard)"

difficulty,fileName = "",""

while(True):
    difficulty = raw_input()
    
    if difficulty in ("e", "m", "h", 'E', 'M', 'H'):
        break
    else:
        print "Input code wrongly. Please input again."
    
print "Please input the name of problem. e.g HelloWorld"

import re

while(True):

    fileName = raw_input()

    if re.match(r"^[A-Z][A-Za-z0-9]*", fileName):
        break
    else:
        print "Input file name wrongly. Please input again."

dirName = "src\\main\\java\\com\\lun\\"

if difficulty in ('e', 'E'):
    difficulty = 'easy'
elif difficulty in ('m', 'M'):
    difficulty = 'medium'
else:
    difficulty = 'hard'

dirName = dirName + difficulty + "\\"

#生成Md文件

mdFile = open(dirName + fileName + ".md","w")

mdFile.write("# " + fileName + " #\n\n")

mdFile.close()

#生成Java文件

javaFile = open(dirName + fileName + ".java","w")

javaFile.write("package com.lun." + difficulty + ";\n\n")
javaFile.write("public class " + fileName + " {\n\n}\n")

javaFile.close()

#生成测试Java文件

testFile = open((dirName + fileName + "Test.java").replace('main','test'),"w")

testFile.write("package com.lun." + difficulty + ";\n\n")
testFile.write("import static org.junit.Assert.*;\n")
testFile.write("import org.junit.Test;\n\n")
testFile.write("public class " + fileName + "Test {\n\n")
testFile.write("\t@Test\n")
testFile.write("\tpublic void test() {\n\n\t}\n}\n")

testFile.close()


print "Create %s.md and %s.java and %sTest.java successfully! Press Enter to exit."%(fileName,fileName,fileName)

try:
    raw_input()
    print "Bye!"
except:
    print "Bye!"
