

# touch file{1..5}.java


import os


themes = ['1.java程序设计概述','2.java程序设计环境','3.java的基本程序设计结构','4.对象与类','5.继承','6.接口，lambda表达式与内部类','7.异常、断言和日志','8.泛型程序设计','9.集合','10.图形程序设计','11.事件处理','12.Swing用户界面组件','13.部署java应用程序','14.并发']
base = "/home/karson/Recoding_Java/Java核心技术卷一/"
for i in themes:
    file_name = base + str(i)
    os.mkdir(file_name)