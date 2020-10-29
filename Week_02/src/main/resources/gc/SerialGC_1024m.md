# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -XX:+UseSerialGC -Xmx1024m -Xms1024m -Xloggc:gc.serial.1024.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8727816k free), swap 18740704k(6734544k free)
   CommandLine flags: -XX:InitialHeapSize=1073741824 -XX:MaxHeapSize=1073741824 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC 
   2020-10-29T15:06:51.474+0800: 0.262: [GC (Allocation Failure) 2020-10-29T15:06:51.474+0800: 0.262: [DefNew: 279616K->34943K(314560K), 0.0437374 secs] 279616K->83302K(1013632K), 0.0438937 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
   2020-10-29T15:06:51.559+0800: 0.347: [GC (Allocation Failure) 2020-10-29T15:06:51.559+0800: 0.347: [DefNew: 314559K->34942K(314560K), 0.0556908 secs] 362918K->160483K(1013632K), 0.0557839 secs] [Times: user=0.02 sys=0.05, real=0.06 secs] 
   2020-10-29T15:06:51.652+0800: 0.439: [GC (Allocation Failure) 2020-10-29T15:06:51.652+0800: 0.439: [DefNew: 314558K->34944K(314560K), 0.0432056 secs] 440099K->236890K(1013632K), 0.0432586 secs] [Times: user=0.02 sys=0.03, real=0.04 secs] 
   2020-10-29T15:06:51.731+0800: 0.518: [GC (Allocation Failure) 2020-10-29T15:06:51.731+0800: 0.518: [DefNew: 314560K->34943K(314560K), 0.0463628 secs] 516506K->317415K(1013632K), 0.0464197 secs] [Times: user=0.02 sys=0.03, real=0.05 secs] 
   2020-10-29T15:06:51.812+0800: 0.600: [GC (Allocation Failure) 2020-10-29T15:06:51.812+0800: 0.600: [DefNew: 314559K->34942K(314560K), 0.0466329 secs] 597031K->397154K(1013632K), 0.0467568 secs] [Times: user=0.03 sys=0.01, real=0.05 secs] 
   2020-10-29T15:06:51.894+0800: 0.682: [GC (Allocation Failure) 2020-10-29T15:06:51.894+0800: 0.682: [DefNew: 314558K->34943K(314560K), 0.0430278 secs] 676770K->474254K(1013632K), 0.0430850 secs] [Times: user=0.03 sys=0.02, real=0.04 secs] 
   2020-10-29T15:06:51.971+0800: 0.758: [GC (Allocation Failure) 2020-10-29T15:06:51.971+0800: 0.759: [DefNew: 314559K->34943K(314560K), 0.0477403 secs] 753870K->557405K(1013632K), 0.0477987 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
   2020-10-29T15:06:52.054+0800: 0.842: [GC (Allocation Failure) 2020-10-29T15:06:52.055+0800: 0.842: [DefNew: 314559K->34943K(314560K), 0.0459053 secs] 837021K->635315K(1013632K), 0.0459684 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
   2020-10-29T15:06:52.134+0800: 0.921: [GC (Allocation Failure) 2020-10-29T15:06:52.134+0800: 0.921: [DefNew: 314559K->34944K(314560K), 0.0511246 secs] 914931K->713594K(1013632K), 0.0511802 secs] [Times: user=0.01 sys=0.03, real=0.05 secs] 
   2020-10-29T15:06:52.219+0800: 1.007: [GC (Allocation Failure) 2020-10-29T15:06:52.219+0800: 1.007: [DefNew: 314560K->314560K(314560K), 0.0000137 secs]2020-10-29T15:06:52.219+0800: 1.007: [Tenured: 678650K->379125K(699072K), 0.0472650 secs] 993210K->379125K(1013632K), [Metaspace: 2835K->2835K(1056768K)], 0.0473511 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-29T15:06:52.301+0800: 1.089: [GC (Allocation Failure) 2020-10-29T15:06:52.301+0800: 1.089: [DefNew: 279616K->34942K(314560K), 0.0131549 secs] 658741K->475895K(1013632K), 0.0132132 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   Heap
    def new generation   total 314560K, used 52465K [0x00000000c0000000, 0x00000000d5550000, 0x00000000d5550000)
     eden space 279616K,   6% used [0x00000000c0000000, 0x00000000c111ca88, 0x00000000d1110000)
     from space 34944K,  99% used [0x00000000d1110000, 0x00000000d332fb00, 0x00000000d3330000)
     to   space 34944K,   0% used [0x00000000d3330000, 0x00000000d3330000, 0x00000000d5550000)
    tenured generation   total 699072K, used 440953K [0x00000000d5550000, 0x0000000100000000, 0x0000000100000000)
      the space 699072K,  63% used [0x00000000d5550000, 0x00000000f03ee490, 0x00000000f03ee600, 0x0000000100000000)
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
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
```
+ -XX:InitialHeapSize=1073741824 初始堆大小:1024M(1073741824/(1024*1024))
+ -XX:MaxHeapSize=1073741824 最大堆大小:1024M(1073741824/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseSerialGC 串行垃圾回收器，响应速度优先

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了11次年轻代GC(平均耗时50毫秒)、0次Full GC
