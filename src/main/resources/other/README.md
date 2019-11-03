# 一些算法题 #

## 两个文件a和b，各存放50亿条URL，每条URL占用64字节，内存限制是4G，让你找出a,b文件共同的URL ##

**第一步**：对a中的每条URL记录，经过hash(URL）%2048处理分别放入a_file0, a_file1,.....a_file2047文件中。

对b中的记录进行同样的处理，放入b_file0, b_file1,................., b_file2047文件中。

**第二步**：对a_file0, a_file1,.....a_file2047中的记录分别进行排序、去重，b_file0, b_file1,................., b_file2047文件中的记录分别进行排序、去重。

**第三步**：对每一个子文件而言，其中的记录都是不同的。此时原文件a，b中的相同记录，肯定出现在a_filei和b_filei中。

即在a_file0和b_file0找相同的， 在a_file1和b_file1找相同的,.......................,在a_file2047和b_file2047中找相同的。

**第四步**：统计每组文件中的相同记录，得到总的相同记录。

﻿﻿[Reference](https://blog.csdn.net/Manketon/article/details/39522547)
