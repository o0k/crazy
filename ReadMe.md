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

下面是一些.gitignore文件忽略的匹配规则：

*.a       # 忽略所有 .a 结尾的文件
!lib.a    # 但 lib.a 除外
/TODO     # 仅仅忽略项目根目录下的 TODO 文件，不包括 subdir/TODO
build/    # 忽略 build/ 目录下的所有文件
doc/*.txt # 会忽略 doc/notes.txt 但不包括 doc/server/arch.txt

.gitignore只能忽略那些原来没有被track的文件，如果某些文件已经被纳入了版本管理中，则修改.gitignore是无效的。那么解决方法就是先把本地缓存删除（改变成未track状态），然后再提交：
输入：
git rm -r –cached filePath
git commit -m “remove xx”
或者：
git rm -r -–cached .
git add .
git commit -m “update .gitignore”
git push origin master

编译:javac XXX.java
反编:javap XXX.class

Lets:在H-disc

考考大家： 
一斤牛肉进价48元。现市场价大甩卖36元一斤。
顾客买了两公斤，给了蒋师傅200元假钱，蒋师傅没零钱，
于是找邻居换了200元。
事后邻居存钱过程中发现钱是假的，
被银行没收了，蒋师傅又赔了邻居200，
请问蒋师傅一共亏了多少?（这道题目不简单，到底亏了多少？)

48*4 = 152

200-36*4 = 56

144









