这是使用图片图标的实例，由于编译器原因，按照《Java从入门到精通》P231实例中会报错如下：

```
nullException in thread "main" java.lang.NullPointerException
	at javax.swing.ImageIcon.<init>(ImageIcon.java:204)
	at MyImageIcon.<init>(MyImageIcon.java:17)
	at MyImageIcon.main(MyImageIcon.java:32)

```
这是因为代码

```
URL url = MyImageIcon.class.getResource("imageButton.jpg");
System.out.print(url);
Icon icon = new ImageIcon(url);

```
输出url为null，所以MyImageIcon.class.getResource是从bin下获取imageButton.jpg的url，故解决方案可以是：

```
1.将imageButton.jpg放在bin目录下
2.直接将Icon icon = new ImageIcon(url);改成Icon icon = new ImageIcon("imageButton.jpg");
```

参考：
[java图片路径怎么弄](http://zhidao.baidu.com/link?url=hcAnmFSaXjoTY_vJ7N2DM-e1AuEtEMwM_l02Vv5argtcZRH_NtJoNrej_ZwT9u2IZ35i7Cu_e4taj7eJPIncB0YQbgdHt-pXtVJaqHdhrKq)
[这句java语句的含义 URL url=MyImageIcon.class.getresources（“/imagebuttoo.jpg”）](http://zhidao.baidu.com/link?url=f8w8rQNivKZKEU92anuHeKKTcuzY-0B9iT8Nsr_DLSLqkkqp6qyWeKjAO-U2SnG4QpVCRKZBZmZ70wyXUjX2X_)
