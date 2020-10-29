# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -XX:+UseConcMarkSweepGC -Xmx1024m -Xms1024m -Xloggc:gc.cms.1024.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8518312k free), swap 18740704k(4273908k free)
   CommandLine flags: -XX:InitialHeapSize=1073741824 -XX:MaxHeapSize=1073741824 -XX:MaxNewSize=357916672 -XX:MaxTenuringThreshold=6 -XX:NewSize=357916672 -XX:OldPLABSize=16 -XX:OldSize=715825152 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC 
   2020-10-30T00:39:29.497+0800: 0.269: [GC (Allocation Failure) 2020-10-30T00:39:29.497+0800: 0.269: [ParNew: 279616K->34943K(314560K), 0.0167834 secs] 279616K->82749K(1013632K), 0.0169332 secs] [Times: user=0.00 sys=0.13, real=0.02 secs] 
   2020-10-30T00:39:29.554+0800: 0.326: [GC (Allocation Failure) 2020-10-30T00:39:29.554+0800: 0.326: [ParNew: 314559K->34944K(314560K), 0.0232484 secs] 362365K->165747K(1013632K), 0.0233055 secs] [Times: user=0.02 sys=0.09, real=0.02 secs] 
   2020-10-30T00:39:29.615+0800: 0.387: [GC (Allocation Failure) 2020-10-30T00:39:29.615+0800: 0.387: [ParNew: 314560K->34944K(314560K), 0.0464382 secs] 445363K->240406K(1013632K), 0.0465035 secs] [Times: user=0.30 sys=0.05, real=0.05 secs] 
   2020-10-30T00:39:29.695+0800: 0.466: [GC (Allocation Failure) 2020-10-30T00:39:29.695+0800: 0.466: [ParNew: 314560K->34943K(314560K), 0.0476129 secs] 520022K->313683K(1013632K), 0.0476730 secs] [Times: user=0.31 sys=0.03, real=0.05 secs] 
   2020-10-30T00:39:29.776+0800: 0.547: [GC (Allocation Failure) 2020-10-30T00:39:29.776+0800: 0.547: [ParNew: 314391K->34944K(314560K), 0.0511793 secs] 593131K->389955K(1013632K), 0.0512358 secs] [Times: user=0.34 sys=0.01, real=0.05 secs] 
   2020-10-30T00:39:29.827+0800: 0.599: [GC (CMS Initial Mark) [1 CMS-initial-mark: 355011K(699072K)] 390334K(1013632K), 0.0001691 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:39:29.827+0800: 0.599: [CMS-concurrent-mark-start]
   2020-10-30T00:39:29.830+0800: 0.602: [CMS-concurrent-mark: 0.003/0.003 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:39:29.830+0800: 0.602: [CMS-concurrent-preclean-start]
   2020-10-30T00:39:29.831+0800: 0.603: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:39:29.831+0800: 0.603: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:39:29.860+0800: 0.631: [GC (Allocation Failure) 2020-10-30T00:39:29.860+0800: 0.631: [ParNew: 314560K->34943K(314560K), 0.0601929 secs] 669571K->480065K(1013632K), 0.0602595 secs] [Times: user=0.44 sys=0.06, real=0.06 secs] 
   2020-10-30T00:39:29.953+0800: 0.725: [GC (Allocation Failure) 2020-10-30T00:39:29.953+0800: 0.725: [ParNew: 314559K->34943K(314560K), 0.0504713 secs] 759681K->560827K(1013632K), 0.0505471 secs] [Times: user=0.33 sys=0.03, real=0.05 secs] 
   2020-10-30T00:39:30.035+0800: 0.806: [GC (Allocation Failure) 2020-10-30T00:39:30.035+0800: 0.806: [ParNew: 314559K->34943K(314560K), 0.0543957 secs] 840443K->646063K(1013632K), 0.0544516 secs] [Times: user=0.31 sys=0.03, real=0.05 secs] 
   2020-10-30T00:39:30.120+0800: 0.891: [GC (Allocation Failure) 2020-10-30T00:39:30.120+0800: 0.891: [ParNew: 314559K->314559K(314560K), 0.0000176 secs]2020-10-30T00:39:30.120+0800: 0.891: [CMS2020-10-30T00:39:30.120+0800: 0.891: [CMS-concurrent-abortable-preclean: 0.008/0.288 secs] [Times: user=1.22 sys=0.13, real=0.29 secs] 
    (concurrent mode failure): 611119K->359636K(699072K), 0.0501522 secs] 925679K->359636K(1013632K), [Metaspace: 2835K->2835K(1056768K)], 0.0502454 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-30T00:39:30.203+0800: 0.975: [GC (Allocation Failure) 2020-10-30T00:39:30.203+0800: 0.975: [ParNew: 279616K->34942K(314560K), 0.0131132 secs] 639252K->444237K(1013632K), 0.0132015 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-30T00:39:30.217+0800: 0.988: [GC (CMS Initial Mark) [1 CMS-initial-mark: 409294K(699072K)] 445007K(1013632K), 0.0005302 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:39:30.217+0800: 0.989: [CMS-concurrent-mark-start]
   2020-10-30T00:39:30.219+0800: 0.990: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:39:30.219+0800: 0.991: [CMS-concurrent-preclean-start]
   2020-10-30T00:39:30.220+0800: 0.992: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:39:30.220+0800: 0.992: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:39:30.253+0800: 1.025: [GC (Allocation Failure) 2020-10-30T00:39:30.253+0800: 1.025: [ParNew: 314558K->34943K(314560K), 0.0174193 secs] 723853K->526527K(1013632K), 0.0174989 secs] [Times: user=0.14 sys=0.00, real=0.02 secs] 
   2020-10-30T00:39:30.304+0800: 1.076: [GC (Allocation Failure) 2020-10-30T00:39:30.304+0800: 1.076: [ParNew: 314559K->34943K(314560K), 0.0169613 secs] 806143K->602756K(1013632K), 0.0170217 secs] [Times: user=0.11 sys=0.00, real=0.02 secs] 
   Heap
    par new generation   total 314560K, used 119207K [0x00000000c0000000, 0x00000000d5550000, 0x00000000d5550000)
     eden space 279616K,  30% used [0x00000000c0000000, 0x00000000c5249d18, 0x00000000d1110000)
     from space 34944K,  99% used [0x00000000d3330000, 0x00000000d554ff38, 0x00000000d5550000)
     to   space 34944K,   0% used [0x00000000d1110000, 0x00000000d1110000, 0x00000000d3330000)
    concurrent mark-sweep generation total 699072K, used 567812K [0x00000000d5550000, 0x0000000100000000, 0x0000000100000000)
    Metaspace       used 2841K, capacity 4486K, committed 4864K, reserved 1056768K
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
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:MaxNewSize=178958336 -XX:MaxTenuringThreshold=6 -XX:NewSize=178958336 -XX:OldPLABSize=16 -XX:OldSize=357912576 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
```
+ -XX:InitialHeapSize=536870912 初始堆大小:1024M(536870912/(1024*1024))
+ -XX:MaxHeapSize=536870912 最大堆大小:1024M(536870912/(1024*1024))
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
+ 1秒钟内发生了13次年轻代GC、16次Full GC
