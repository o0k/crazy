git fatal: destination path ‘/test’ already exists and is not an empty directory.解决
把本地文件上传到GitHub上时，出现git fatal: destination path ‘/test’ already exists and is not an empty directory错误。网上说的需要删除本地文件.git,或者删除本地文件夹。
其实只需要
1.进入文件目录
2.初始化 git init
3.添加远程仓库地址 git remote add origin (address)
4.添加本地代码 git add 项目名
5.提交本地代码 git commit -m"描述"
6.提交到远程库 git push origin master
————————————————
版权声明：本文为CSDN博主「小橙橙OUOU」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_39992056/article/details/85217609