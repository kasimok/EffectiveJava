# Effective Java Learning.

----------
## Chapter2
### 创建销毁对象
1. 静态工厂方法
```text
  public static Boolean valueOf(boolean b) {
        return (b ? TRUE : FALSE);
  }
```
#### 优点
* 与构造器方法不同，静态工厂方法可以有自己定义的名字
> 当一个类需要多个带有相同签名的构造器的时候，可以使用静态方法替代构造器。

* 与构造器方法不同，静态工厂方法并不需要在每次调用的时候创建新对象
> 如果程序经常创建新对象，且创建对象的开销很高，使用静态工厂方法可以很大程度上提高性能。