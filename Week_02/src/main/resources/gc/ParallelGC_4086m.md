# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -Xmx4086m -Xloggc:gc.4086m.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8616700k free), swap 20878276k(3870256k free)
   CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=4284481536 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
   2020-10-28T23:17:47.512+0800: 0.428: [GC (Allocation Failure) [PSYoungGen: 64799K->10747K(75776K)] 64799K->23534K(249344K), 0.0054251 secs] [Times: user=0.00 sys=0.13, real=0.00 secs] 
   2020-10-28T23:17:47.530+0800: 0.446: [GC (Allocation Failure) [PSYoungGen: 75771K->10736K(140800K)] 88558K->46193K(314368K), 0.0067082 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:17:47.579+0800: 0.495: [GC (Allocation Failure) [PSYoungGen: 140784K->10751K(140800K)] 176241K->89174K(314368K), 0.0106313 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:17:47.608+0800: 0.524: [GC (Allocation Failure) [PSYoungGen: 140799K->10749K(270848K)] 219222K->134324K(444416K), 0.0104404 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:17:47.619+0800: 0.535: [Full GC (Ergonomics) [PSYoungGen: 10749K->0K(270848K)] [ParOldGen: 123574K->120006K(258048K)] 134324K->120006K(528896K), [Metaspace: 2834K->2834K(1056768K)], 0.0173789 secs] [Times: user=0.05 sys=0.00, real=0.02 secs] 
   2020-10-28T23:17:47.717+0800: 0.633: [GC (Allocation Failure) [PSYoungGen: 259864K->10742K(270848K)] 379870K->202041K(528896K), 0.0153916 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
   2020-10-28T23:17:47.733+0800: 0.649: [Full GC (Ergonomics) [PSYoungGen: 10742K->0K(270848K)] [ParOldGen: 191298K->174705K(366080K)] 202041K->174705K(636928K), [Metaspace: 2834K->2834K(1056768K)], 0.0228058 secs] [Times: user=0.11 sys=0.00, real=0.02 secs] 
   2020-10-28T23:17:47.791+0800: 0.707: [GC (Allocation Failure) [PSYoungGen: 260096K->81343K(500736K)] 434801K->256049K(866816K), 0.0149728 secs] [Times: user=0.00 sys=0.13, real=0.02 secs] 
   2020-10-28T23:17:47.923+0800: 0.839: [GC (Allocation Failure) [PSYoungGen: 500671K->102391K(526848K)] 675377K->347688K(892928K), 0.0297402 secs] [Times: user=0.13 sys=0.09, real=0.03 secs] 
   2020-10-28T23:17:48.009+0800: 0.925: [GC (Allocation Failure) [PSYoungGen: 526839K->155132K(787968K)] 772136K->438729K(1154048K), 0.0337311 secs] [Times: user=0.01 sys=0.23, real=0.03 secs] 
   2020-10-28T23:17:48.139+0800: 1.055: [GC (Allocation Failure) [PSYoungGen: 787964K->198143K(830976K)] 1071561K->536904K(1197056K), 0.0774560 secs] [Times: user=0.06 sys=0.44, real=0.08 secs] 
   2020-10-28T23:17:48.217+0800: 1.133: [Full GC (Ergonomics) [PSYoungGen: 198143K->0K(830976K)] [ParOldGen: 338760K->330719K(544256K)] 536904K->330719K(1375232K), [Metaspace: 2834K->2834K(1056768K)], 0.0444023 secs] [Times: user=0.14 sys=0.00, real=0.04 secs] 
   2020-10-28T23:17:48.339+0800: 1.255: [GC (Allocation Failure) [PSYoungGen: 632721K->173373K(1119744K)] 963440K->504092K(1664000K), 0.0423436 secs] [Times: user=0.03 sys=0.22, real=0.04 secs] 
   Heap
    PSYoungGen      total 1119744K, used 851957K [0x000000076ae00000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 866304K, 78% used [0x000000076ae00000,0x00000007944ae0b0,0x000000079fc00000)
     from space 253440K, 68% used [0x00000007b0880000,0x00000007bb1cf660,0x00000007c0000000)
     to   space 264192K, 0% used [0x000000079fc00000,0x000000079fc00000,0x00000007afe00000)
    ParOldGen       total 544256K, used 330719K [0x00000006c0a00000, 0x00000006e1d80000, 0x000000076ae00000)
     object space 544256K, 60% used [0x00000006c0a00000,0x00000006d4cf7c40,0x00000006e1d80000)
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
CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=4284481536 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
```
+ -XX:InitialHeapSize=266296832 初始堆大小:**254M**(266296832/(1024*1024))
+ -XX:MaxHeapSize=4284481536 最大堆大小:**4086M**(4284481536/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseParallelGC 并行垃圾回收器，吞吐量优先

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了10次年轻代GC(总共耗时247毫秒，平均耗时24.7毫秒)、3次Full GC(总共耗时84.5毫秒，平均耗时28.2毫秒)
+ 1秒钟内GC耗时占总时间的33.2%，也就是说30%左右的时间应用是属于STW状态
