为重载的实现，同时可以发现不定长的语法如下：
返回值	方法名(参数数据类型···参数名称)

```
public static int add(int... a) {
		int s = 0;
		for (int i = 0; i < a.length; i++)
		   s += a[i]; 
		return s; 
	}

```
