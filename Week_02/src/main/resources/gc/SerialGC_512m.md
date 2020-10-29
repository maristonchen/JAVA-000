# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -XX:+UseSerialGC -Xmx512m -Xms512m -Xloggc:gc.serial.512.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8801908k free), swap 18740704k(6500644k free)
   CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC 
   2020-10-29T15:26:50.017+0800: 0.192: [GC (Allocation Failure) 2020-10-29T15:26:50.017+0800: 0.192: [DefNew: 139776K->17472K(157248K), 0.0236945 secs] 139776K->45367K(506816K), 0.0238252 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
   2020-10-29T15:26:50.061+0800: 0.236: [GC (Allocation Failure) 2020-10-29T15:26:50.061+0800: 0.236: [DefNew: 157131K->17470K(157248K), 0.0313933 secs] 185027K->87696K(506816K), 0.0314473 secs] [Times: user=0.00 sys=0.03, real=0.03 secs] 
   2020-10-29T15:26:50.110+0800: 0.285: [GC (Allocation Failure) 2020-10-29T15:26:50.110+0800: 0.285: [DefNew: 157144K->17471K(157248K), 0.0249160 secs] 227370K->132099K(506816K), 0.0249699 secs] [Times: user=0.02 sys=0.02, real=0.03 secs] 
   2020-10-29T15:26:50.154+0800: 0.328: [GC (Allocation Failure) 2020-10-29T15:26:50.154+0800: 0.328: [DefNew: 157247K->17470K(157248K), 0.0234175 secs] 271875K->173408K(506816K), 0.0235074 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
   2020-10-29T15:26:50.198+0800: 0.372: [GC (Allocation Failure) 2020-10-29T15:26:50.198+0800: 0.372: [DefNew: 156962K->17469K(157248K), 0.0254466 secs] 312900K->217885K(506816K), 0.0255005 secs] [Times: user=0.02 sys=0.01, real=0.03 secs] 
   2020-10-29T15:26:50.243+0800: 0.418: [GC (Allocation Failure) 2020-10-29T15:26:50.243+0800: 0.418: [DefNew: 157245K->17471K(157248K), 0.0246641 secs] 357661K->261975K(506816K), 0.0247310 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
   2020-10-29T15:26:50.285+0800: 0.460: [GC (Allocation Failure) 2020-10-29T15:26:50.285+0800: 0.460: [DefNew: 157012K->17470K(157248K), 0.0240974 secs] 401516K->303415K(506816K), 0.0241513 secs] [Times: user=0.00 sys=0.01, real=0.02 secs] 
   2020-10-29T15:26:50.328+0800: 0.503: [GC (Allocation Failure) 2020-10-29T15:26:50.328+0800: 0.503: [DefNew: 157246K->17471K(157248K), 0.0256180 secs] 443191K->349141K(506816K), 0.0256739 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
   2020-10-29T15:26:50.371+0800: 0.546: [GC (Allocation Failure) 2020-10-29T15:26:50.371+0800: 0.546: [DefNew: 157247K->157247K(157248K), 0.0000139 secs]2020-10-29T15:26:50.371+0800: 0.546: [Tenured: 331670K->274325K(349568K), 0.0344578 secs] 488917K->274325K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0345436 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
   2020-10-29T15:26:50.423+0800: 0.598: [GC (Allocation Failure) 2020-10-29T15:26:50.423+0800: 0.598: [DefNew: 139776K->17472K(157248K), 0.0070302 secs] 414101K->320542K(506816K), 0.0070816 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:26:50.449+0800: 0.624: [GC (Allocation Failure) 2020-10-29T15:26:50.449+0800: 0.624: [DefNew: 157248K->157248K(157248K), 0.0000336 secs]2020-10-29T15:26:50.449+0800: 0.624: [Tenured: 303070K->307928K(349568K), 0.0402921 secs] 460318K->307928K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0404062 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
   2020-10-29T15:26:50.507+0800: 0.682: [GC (Allocation Failure) 2020-10-29T15:26:50.507+0800: 0.682: [DefNew: 139776K->139776K(157248K), 0.0000132 secs]2020-10-29T15:26:50.507+0800: 0.682: [Tenured: 307928K->320873K(349568K), 0.0407805 secs] 447704K->320873K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0408576 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
   2020-10-29T15:26:50.562+0800: 0.737: [GC (Allocation Failure) 2020-10-29T15:26:50.562+0800: 0.737: [DefNew: 139776K->139776K(157248K), 0.0000139 secs]2020-10-29T15:26:50.562+0800: 0.737: [Tenured: 320873K->319893K(349568K), 0.0429762 secs] 460649K->319893K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0430553 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
   2020-10-29T15:26:50.623+0800: 0.797: [GC (Allocation Failure) 2020-10-29T15:26:50.623+0800: 0.797: [DefNew: 139776K->139776K(157248K), 0.0000143 secs]2020-10-29T15:26:50.623+0800: 0.797: [Tenured: 319893K->342972K(349568K), 0.0318486 secs] 459669K->342972K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0319300 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
   2020-10-29T15:26:50.672+0800: 0.847: [GC (Allocation Failure) 2020-10-29T15:26:50.672+0800: 0.847: [DefNew: 139776K->139776K(157248K), 0.0000136 secs]2020-10-29T15:26:50.672+0800: 0.847: [Tenured: 342972K->343521K(349568K), 0.0365580 secs] 482748K->343521K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0366336 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
   2020-10-29T15:26:50.726+0800: 0.901: [GC (Allocation Failure) 2020-10-29T15:26:50.726+0800: 0.901: [DefNew: 139776K->139776K(157248K), 0.0000141 secs]2020-10-29T15:26:50.726+0800: 0.901: [Tenured: 343521K->342979K(349568K), 0.0382620 secs] 483297K->342979K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0383462 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
   2020-10-29T15:26:50.783+0800: 0.958: [GC (Allocation Failure) 2020-10-29T15:26:50.783+0800: 0.958: [DefNew: 139776K->139776K(157248K), 0.0000139 secs]2020-10-29T15:26:50.783+0800: 0.958: [Tenured: 342979K->328589K(349568K), 0.0440072 secs] 482755K->328589K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0440869 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
   2020-10-29T15:26:50.844+0800: 1.019: [GC (Allocation Failure) 2020-10-29T15:26:50.844+0800: 1.019: [DefNew: 139776K->139776K(157248K), 0.0000134 secs]2020-10-29T15:26:50.844+0800: 1.019: [Tenured: 328589K->349489K(349568K), 0.0297876 secs] 468365K->356335K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0298664 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
   2020-10-29T15:26:50.892+0800: 1.067: [Full GC (Allocation Failure) 2020-10-29T15:26:50.892+0800: 1.067: [Tenured: 349489K->349497K(349568K), 0.0394740 secs] 506660K->362086K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0395297 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
   Heap
    def new generation   total 157248K, used 18428K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
     eden space 139776K,  13% used [0x00000000e0000000, 0x00000000e11ff2e8, 0x00000000e8880000)
     from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
     to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
    tenured generation   total 349568K, used 349497K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
      the space 349568K,  99% used [0x00000000eaaa0000, 0x00000000fffee5f0, 0x00000000fffee600, 0x0000000100000000)
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
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
```
+ -XX:InitialHeapSize=536870912 初始堆大小:512M(536870912/(1024*1024))
+ -XX:MaxHeapSize=536870912 最大堆大小:512M(536870912/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseSerialGC 串行垃圾回收器，响应速度优先

**年轻代GC(Minor GC)**
```cmd
2020-10-29T14:18:03.878+0800: 0.616: [GC (Allocation Failure)  [DefNew: 157247K->157247K(157248K), 0.0000128 secs]2020-10-29T14:18:03.878+0800: 0.616: [Tenured: 299628K->303382K(349568K), 0.0381364 secs] 456876K->303382K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0382122 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
```
+ 2020-10-29T14:18:03.878+0800: 0.616 =>GC的日期、时间戳、时区
+ GC (Allocation Failure) => 触发GC的原因：给对象分配堆内存失败
+ DefNew => Default New Generation : 默认新生代，Serial收集器，串行，采用标记复制(mark-copy)算法，响应速度优先
+ \[DefNew: 157247K->157247K(157248K), 0.0000128 secs] => 年轻代GC的内存变化：原大小157248K，已使用大小157247K，GC后大小157247K(这次GC，NewGen一点空间都没有被回收)
+ Tenured => Tenured Generation: 老年代的养老区，Serial Old 收集器，串行，采用标记清除整理(mark-sweep-compact)算法，响应速度优先
+ \[Tenured: 299628K->303382K(349568K), 0.0381364 secs] => 老年代内存的变化：原大小349568K，已使用大小299628K，GC后大小303382K(老年代内存不减反增，已使用86.7%)
+ 0.0050200 secs => 这次年轻代GC耗费时间5.02毫秒
+ \[Times: user=0.00 sys=0.09, real=0.00 secs] => user=0.00:CPU花费的总时间为0秒 ,sys=0.09:系统调用时间为90毫秒，real=0.00:应用暂停时间为0秒

**Full GC**
```cmd
2020-10-29T14:18:04.381+0800: 1.119: [Full GC (Allocation Failure) 2020-10-29T14:18:04.381+0800: 1.119: [Tenured: 349519K->349516K(349568K), 0.0465791 secs] 506630K->374682K(506816K), [Metaspace: 2834K->2834K(1056768K)], 0.0466928 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
```
+ Full GC (Allocation Failure) => Full GC的原因：老年代内存使用已达99%，从而对象分配内存失败
+ \[Tenured: 349519K->349516K(349568K), 0.0465791 secs] => 老年代GC的内存变化：原大小301056K，已使用大小180536K，GC后大小167653K(GC后老年代的大小应该包括年轻代留下的部分和老年代剩下的部分两个部分)

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了16次年轻代GC、4次Full GC(平均耗时40毫秒)
+ 年轻代GC和老年代GC都会触发STW事件
