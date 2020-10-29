# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -XX:+UseSerialGC -Xmx128m -Xms128m -Xloggc:gc.serial.128.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8723888k free), swap 18740704k(6723460k free)
   CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC 
   2020-10-29T15:11:29.746+0800: 0.129: [GC (Allocation Failure) 2020-10-29T15:11:29.746+0800: 0.129: [DefNew: 34944K->4352K(39296K), 0.0068250 secs] 34944K->11262K(126720K), 0.0069796 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.764+0800: 0.148: [GC (Allocation Failure) 2020-10-29T15:11:29.764+0800: 0.148: [DefNew: 39294K->4351K(39296K), 0.0089248 secs] 46204K->22786K(126720K), 0.0089770 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.780+0800: 0.164: [GC (Allocation Failure) 2020-10-29T15:11:29.780+0800: 0.164: [DefNew: 39197K->4350K(39296K), 0.0073774 secs] 57632K->35026K(126720K), 0.0074311 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.792+0800: 0.176: [GC (Allocation Failure) 2020-10-29T15:11:29.792+0800: 0.176: [DefNew: 39294K->4346K(39296K), 0.0061066 secs] 69970K->45350K(126720K), 0.0061602 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.803+0800: 0.186: [GC (Allocation Failure) 2020-10-29T15:11:29.803+0800: 0.186: [DefNew: 39025K->4350K(39296K), 0.0075210 secs] 80029K->57037K(126720K), 0.0075967 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.816+0800: 0.199: [GC (Allocation Failure) 2020-10-29T15:11:29.816+0800: 0.199: [DefNew: 39260K->4345K(39296K), 0.0048106 secs] 91947K->64696K(126720K), 0.0048635 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.826+0800: 0.209: [GC (Allocation Failure) 2020-10-29T15:11:29.826+0800: 0.209: [DefNew: 39078K->4351K(39296K), 0.0073936 secs] 99429K->77192K(126720K), 0.0074501 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.839+0800: 0.222: [GC (Allocation Failure) 2020-10-29T15:11:29.839+0800: 0.222: [DefNew: 39295K->39295K(39296K), 0.0000136 secs]2020-10-29T15:11:29.839+0800: 0.222: [Tenured: 72841K->83444K(87424K), 0.0138648 secs] 112136K->83444K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0139449 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.857+0800: 0.241: [GC (Allocation Failure) 2020-10-29T15:11:29.857+0800: 0.241: [DefNew: 34844K->34844K(39296K), 0.0000133 secs]2020-10-29T15:11:29.857+0800: 0.241: [Tenured: 83444K->86811K(87424K), 0.0126299 secs] 118288K->94243K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0127063 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.875+0800: 0.258: [Full GC (Allocation Failure) 2020-10-29T15:11:29.875+0800: 0.258: [Tenured: 87209K->87371K(87424K), 0.0124532 secs] 126419K->103226K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0125297 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.891+0800: 0.274: [Full GC (Allocation Failure) 2020-10-29T15:11:29.891+0800: 0.274: [Tenured: 87371K->87285K(87424K), 0.0150950 secs] 126521K->104195K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0151541 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.910+0800: 0.293: [Full GC (Allocation Failure) 2020-10-29T15:11:29.910+0800: 0.293: [Tenured: 87285K->87285K(87424K), 0.0047061 secs] 126568K->112386K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0047671 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.917+0800: 0.300: [Full GC (Allocation Failure) 2020-10-29T15:11:29.917+0800: 0.300: [Tenured: 87408K->87408K(87424K), 0.0060111 secs] 126693K->116498K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0060841 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.924+0800: 0.308: [Full GC (Allocation Failure) 2020-10-29T15:11:29.924+0800: 0.308: [Tenured: 87408K->87408K(87424K), 0.0019922 secs] 126206K->119088K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0020850 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.928+0800: 0.311: [Full GC (Allocation Failure) 2020-10-29T15:11:29.928+0800: 0.311: [Tenured: 87408K->87277K(87424K), 0.0138628 secs] 126630K->118165K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0139575 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:11:29.944+0800: 0.327: [Full GC (Allocation Failure) 2020-10-29T15:11:29.944+0800: 0.327: [Tenured: 87277K->87277K(87424K), 0.0019701 secs] 126537K->121129K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0020176 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.947+0800: 0.330: [Full GC (Allocation Failure) 2020-10-29T15:11:29.947+0800: 0.330: [Tenured: 87277K->87277K(87424K), 0.0018523 secs] 126385K->122138K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0019213 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.949+0800: 0.332: [Full GC (Allocation Failure) 2020-10-29T15:11:29.949+0800: 0.332: [Tenured: 87277K->87277K(87424K), 0.0042518 secs] 125833K->123145K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0042959 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.954+0800: 0.337: [Full GC (Allocation Failure) 2020-10-29T15:11:29.954+0800: 0.337: [Tenured: 87277K->87332K(87424K), 0.0159527 secs] 126376K->123817K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0160002 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
   2020-10-29T15:11:29.970+0800: 0.354: [Full GC (Allocation Failure) 2020-10-29T15:11:29.970+0800: 0.354: [Tenured: 87332K->87332K(87424K), 0.0016536 secs] 126318K->124705K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0016900 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.972+0800: 0.356: [Full GC (Allocation Failure) 2020-10-29T15:11:29.973+0800: 0.356: [Tenured: 87332K->87332K(87424K), 0.0016009 secs] 126417K->124999K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0016451 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.975+0800: 0.358: [Full GC (Allocation Failure) 2020-10-29T15:11:29.975+0800: 0.358: [Tenured: 87332K->87332K(87424K), 0.0023487 secs] 126050K->125621K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0023986 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.977+0800: 0.361: [Full GC (Allocation Failure) 2020-10-29T15:11:29.977+0800: 0.361: [Tenured: 87420K->87385K(87424K), 0.0152033 secs] 126711K->126361K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0152669 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
   2020-10-29T15:11:29.993+0800: 0.376: [Full GC (Allocation Failure) 2020-10-29T15:11:29.993+0800: 0.376: [Tenured: 87385K->87385K(87424K), 0.0015721 secs] 126487K->126429K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0016122 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:11:29.994+0800: 0.378: [Full GC (Allocation Failure) 2020-10-29T15:11:29.994+0800: 0.378: [Tenured: 87385K->87365K(87424K), 0.0100813 secs] 126429K->126409K(126720K), [Metaspace: 2834K->2834K(1056768K)], 0.0101462 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   Heap
    def new generation   total 39296K, used 39281K [0x00000000f8000000, 0x00000000faaa0000, 0x00000000faaa0000)
     eden space 34944K, 100% used [0x00000000f8000000, 0x00000000fa220000, 0x00000000fa220000)
     from space 4352K,  99% used [0x00000000fa660000, 0x00000000faa9c578, 0x00000000faaa0000)
     to   space 4352K,   0% used [0x00000000fa220000, 0x00000000fa220000, 0x00000000fa660000)
    tenured generation   total 87424K, used 87365K [0x00000000faaa0000, 0x0000000100000000, 0x0000000100000000)
      the space 87424K,  99% used [0x00000000faaa0000, 0x00000000ffff1798, 0x00000000ffff1800, 0x0000000100000000)
    Metaspace       used 2865K, capacity 4486K, committed 4864K, reserved 1056768K
     class space    used 310K, capacity 386K, committed 512K, reserved 1048576K
   
   Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
           at com.mariston.weektwo.GCLogAnalysis.generateGarbage(GCLogAnalysis.java:47)
           at com.mariston.weektwo.GCLogAnalysis.main(GCLogAnalysis.java:30)
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
+ -XX:InitialHeapSize=134217728 初始堆大小:128M(134217728/(1024*1024))
+ -XX:MaxHeapSize=134217728 最大堆大小:128M(134217728/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseSerialGC 串行垃圾回收器，响应速度优先

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了9次年轻代GC(平均耗时50毫秒)、16次Full GC
+ 发生OOM异常
