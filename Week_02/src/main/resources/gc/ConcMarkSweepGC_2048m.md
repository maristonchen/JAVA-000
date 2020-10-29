# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -XX:+UseConcMarkSweepGC -Xmx2048m -Xms2048m -Xloggc:gc.cms.2048.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8539648k free), swap 18740704k(4296420k free)
   CommandLine flags: -XX:InitialHeapSize=2147483648 -XX:MaxHeapSize=2147483648 -XX:MaxNewSize=697933824 -XX:MaxTenuringThreshold=6 -XX:NewSize=697933824 -XX:OldPLABSize=16 -XX:OldSize=1395867648 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC 
   2020-10-30T00:40:04.203+0800: 0.419: [GC (Allocation Failure) 2020-10-30T00:40:04.203+0800: 0.419: [ParNew: 545344K->68096K(613440K), 0.3186208 secs] 545344K->147423K(2029056K), 0.3188300 secs] [Times: user=0.14 sys=0.19, real=0.32 secs] 
   2020-10-30T00:40:04.599+0800: 0.815: [GC (Allocation Failure) 2020-10-30T00:40:04.599+0800: 0.815: [ParNew: 613440K->68096K(613440K), 0.0366450 secs] 692767K->270655K(2029056K), 0.0367509 secs] [Times: user=0.05 sys=0.19, real=0.04 secs] 
   2020-10-30T00:40:04.704+0800: 0.920: [GC (Allocation Failure) 2020-10-30T00:40:04.704+0800: 0.920: [ParNew: 613440K->68096K(613440K), 0.0758636 secs] 815999K->391323K(2029056K), 0.0759174 secs] [Times: user=0.53 sys=0.05, real=0.08 secs] 
   2020-10-30T00:40:04.848+0800: 1.064: [GC (Allocation Failure) 2020-10-30T00:40:04.848+0800: 1.064: [ParNew: 613440K->68096K(613440K), 0.0847833 secs] 936667K->518707K(2029056K), 0.0848768 secs] [Times: user=0.56 sys=0.03, real=0.09 secs] 
   Heap
    par new generation   total 613440K, used 89994K [0x0000000080000000, 0x00000000a9990000, 0x00000000a9990000)
     eden space 545344K,   4% used [0x0000000080000000, 0x0000000081562ad8, 0x00000000a1490000)
     from space 68096K, 100% used [0x00000000a1490000, 0x00000000a5710000, 0x00000000a5710000)
     to   space 68096K,   0% used [0x00000000a5710000, 0x00000000a5710000, 0x00000000a9990000)
    concurrent mark-sweep generation total 1415616K, used 450611K [0x00000000a9990000, 0x0000000100000000, 0x0000000100000000)
    Metaspace       used 2840K, capacity 4486K, committed 4864K, reserved 1056768K
     class space    used 307K, capacity 386K, committed 512K, reserved 1048576K

    ```
3. 日志分析与总结
**系统环境**
```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8418396k free), swap 18811060k(3799852k free)
```
+ 64位windows系统，物理内存16G
+ JRE1.8

**JVM环境**
 ```cmd
CommandLine flags: -XX:InitialHeapSize=2147483648 -XX:MaxHeapSize=2147483648 -XX:MaxNewSize=697933824 -XX:MaxTenuringThreshold=6 -XX:NewSize=697933824 -XX:OldPLABSize=16 -XX:OldSize=1395867648 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
```
+ -XX:InitialHeapSize=536870912 初始堆大小:2048M(536870912/(1024*1024))
+ -XX:MaxHeapSize=536870912 最大堆大小:2048M(536870912/(1024*1024))
+ -XX:NewSize=44740608  年轻代初始大小：42.67M(44740608/(1024*1024))
+ -XX:MaxNewSize=44740608 年轻代最大大小：42.67M(44740608/(1024*1024)) => 堆大小的1/3
+ -XX:MaxTenuringThreshold=6 该参数主要是控制新生代需要经历多少次GC晋升到老年代中的最大阈值（在JVM中用4个bit存储（放在对象头中），所以其最大值是15）
+ -XX:OldPLABSize=16  => Size of old gen promotion labs (in HeapWords)
+ -XX:OldSize=89477120 老年代初始化大小：85.33M(89477120/(1024*1024)) => 堆大小的2/3
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseConcMarkSweepGC CMS垃圾收集器 ，并发mark-sweep(标记清除)，没有明显的STW
+ -XX:+UseParNewGC 年轻代并行垃圾收集器，并行STW方式的mark-copy(标记复制)算法


**总 结(ConcMarkSweepGC)**
+ 1秒钟内发生了4次年轻代GC、0次Full GC
