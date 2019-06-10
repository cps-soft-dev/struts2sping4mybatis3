# struts2sping4mybatis3
struts2, sping4, mybatis3
git@github.com:cps-soft-dev/struts2sping4mybatis3.git
# 只看代码
https://github.com/cps-soft-dev/struts2sping4mybatis3
# 克隆手顺
1.安装git windows
https://git-scm.com/download/win
2.设定
安装完成后，在开始菜单里找到“Git”->“Git Bash”，蹦出一个类似命令行窗口的东西，就说明Git安装成功！
@初期设定命令
git config --global user.name "Your Name"
git config --global user.email "email@..."
@提交时文件换行变换设置为无效
git config --global core.safecrlf false
@设置 Git 支持 utf-8 编码
显示 status 编码
git config --global core.quotepath false
图形界面编码
git config --global gui.encoding utf-8
提交信息编码
git config --global i18n.commit.encoding utf-8
输出 log 编码
git config --global i18n.logoutputencoding utf-8
3.ssh做成
打开 Git Bash，输入如下命令
ssh-keygen -t rsa -C "email@..."
重命名ssh-key
copy ~/.ssh/id_rsa.pub ~/.ssh/email@....pub
把email@....pub这个文件发给我(微信或者邮件：li_shuanglin@cps-soft.co.jp)
4.项目克隆
使用下面命令或者用gui界面
git clone  git@github.com:cps-soft-dev/struts2sping4mybatis3.git  目录名
# 其他手顺
参考：
https://www.liaoxuefeng.com/wiki/896043488029600
