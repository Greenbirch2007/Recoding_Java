

# touch file{1..5}.java


import os

themes = ['18.java oi系统','19.枚举类型','20.注解','21.并发','22.图形化用户界面']
base = "/home/karson/Recoding_Java/java编程思想/"
for i in themes:
    file_name = base + str(i)
    os.mkdir(file_name)