运行步骤：
在项目根目录下运行以下命令：
(1)编译：mvn clean compile
(2)运行：mvn exec:java -Dexec.mainClass="com.hand.main.Main" -Dexec.args="arg0 arg1 arg2"
注：数据库配置文件在 src\main\java里面 dbconfig.properties