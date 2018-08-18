# -*- coding: utf-8 -*

#将已完成的题目索引制造到本目录的README.md

import os

targetFile = open("README.md","w")

# 读取 src\main\java\com\lun 的文件名 EASY,MEDIUM,HARD 作大标题

srcDir = "src\\main\\java\\com\\lun\\"

#dirs = os.listdir(srcDir)

dirs = ['easy','medium','hard']

for d in dirs:

    #print d
    
    targetFile.write("# " + d.upper() + " #\n\n")

    dirs2 = os.listdir(srcDir + d)

    for d2 in dirs2:

        if d2.endswith('.md'):
            fileName = d2.split('.')

            dir1 = (srcDir + d + "\\").replace("\\","/")
            
            line = "- [" + fileName[0] + "](" + dir1 + d2 + \
                ") --- [Solution Code]("+ dir1 + fileName[0]  + ".java)\n\n"
            targetFile.write(line)

targetFile.close()

print "Update README.md successfully! Press Enter to exit."

try:
    raw_input()
    print "Bye!"
except:
    print "Bye!"
    
