# ConnectChange
当网络发生改变时，根据定义的规则执行相应的方法，支持无网络状态，Wi-Fi，2G，3G，4G
# 使用方式
1、初始化，建议在Application的OnCreate()方法中

`
ConnectionChangeInit.init(getApplicationContext());
`

2、在需要的类中添加注册

`
ConnectionChangeUtils.register(this);
`

3、在合适的地方解除注册

`
ConnectionChangeUtils.unregister(this);
`

4、方法定义

`
@ConnectionChangeAnnotation(tag = NetStatus.NO_NET)
public void test3() 
{  
   Toast.makeText(getApplicationContext(), "testtest", Toast.LENGTH_LONG).show();   
}
`


