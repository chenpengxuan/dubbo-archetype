# dubbo-archetype
洋码头dubbo项目骨架：用于新建项目

## how to use

```
mvn archetype:generate

-DinteractiveMode=false

-DarchetypeGroupId=com.ymatou.archetype

-DarchetypeArtifactId=dubbo-archetype

-DarchetypeVersion=0.1.0

-DgroupId=com.ymatou.demoservice

-DartifactId=demoservice

-Dpackage=com.ymatou.demoservice

-Dversion=0.0.1-SNAPSHOT

```
(命令应该在一行,为了方便查看,故分开多行)  
mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=com.ymatou.archetype -DarchetypeArtifactId=dubbo-archetype -DarchetypeVersion=0.1.0 -DgroupId=com.ymatou.demoservice -DartifactId=demoservice -Dpackage=com.ymatou.demoservice -Dversion=0.0.1-SNAPSHOT    
命令 参数的详细说明：
http://maven.apache.org/archetype/maven-archetype-plugin/generate-mojo.html

interactiveMode ： 交互模式，默认为true，在交互模式下运行命令，要求用户指定选用的原型，以及生成项目模版的groupId、artifactId、version、package等属性，否则执行失败  
archetypeCatalog ： Archetype查找规则
   >     internal: 这是maven-archetype-plugin内置的 archetype catalog 包含了约58个archetype信息
   >     local : 指向用户本地的archetype catalog,默认位置为 ~/.m2/archetype-catalog.xml
   >     remote: 指向的是maven中央仓库的archetype catalog
   >     file://... ： 用户可指定本地任务位置
   >     http://... : 用户可使用http指定远程的archetype-catalog.xml文件
   >      比如我们的-DarchetypeCatalog=http://172.16.100.98/nexus/service/local/repositories/releases/content/archetype-catalog.xml

archetypeGroupId:骨架的groupId  
archetypeArtifactId :骨架的artifactId  
archetypeVersion :骨架的版本号  
groupId ： 生成项目的groupId；必选；  
artifactId ： 生成项目 的artifactId；必选；  
version ： 生成项目的version； 默认值 1.0 -SNAPSHOT；  
package ： 生成项目的源码包结构； 默认值 使用${groupId}