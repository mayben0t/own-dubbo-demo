# own-dubbo-demo
乞丐版dubbo demo 自己动手搭建^^

先启动provider再启动consumer

记得先启动zookeeper 占用默认端口2181

启动provider或者consumer的时候必须加上 -Djava.net.preferIPv4Stack=true 的 VM options



```后期优化点```
<ul>
  <li>1.提取出consumer模块 和provider模块一样</li>
<li>2.提取出api 形成单独模块，这样就可以解耦</li>
<li>3.可以多用一用其他的功能</li>
<li>4.看看dubbo的重试机制 写出文档</li>
<li>5.阅读dubbo源码</li>
<li>6.看能不能搞成jekins自动化部署dubbo provider</li>
<li>7.可以做成demo模板 提取出main方法 放到私服里 形成独立jar包（后续再说吧）</li>
</ul>
