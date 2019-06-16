# -*- coding: utf-8 -*

#显示题目

import re

head2Regex = re.compile(r'## (.+) ##')


textFile = open("README.md","r")

total = 0

for line in textFile.readlines():
    mo = head2Regex.search(line)

    if mo is not None:
        total = total + 1
        head2 = mo.group(1).decode('utf-8')
        print head2

print "total: " + str(total)
