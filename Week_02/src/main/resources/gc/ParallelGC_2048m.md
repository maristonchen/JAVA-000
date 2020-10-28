# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -Xmx2048m -Xloggc:gc.2048m.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8609616k free), swap 20878276k(3864012k free)
   CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=2147483648 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
   2020-10-28T23:17:05.941+0800: 0.152: [GC (Allocation Failure) [PSYoungGen: 65024K->10750K(75776K)] 65024K->24788K(249344K), 0.0056223 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:17:05.962+0800: 0.172: [GC (Allocation Failure) [PSYoungGen: 75774K->10740K(140800K)] 89812K->42003K(314368K), 0.0065195 secs] [Times: user=0.05 sys=0.06, real=0.01 secs] 
   2020-10-28T23:17:06.009+0800: 0.219: [GC (Allocation Failure) [PSYoungGen: 140788K->10741K(140800K)] 172051K->82103K(314368K), 0.0102662 secs] [Times: user=0.05 sys=0.08, real=0.01 secs] 
   2020-10-28T23:17:06.039+0800: 0.249: [GC (Allocation Failure) [PSYoungGen: 140789K->10740K(270848K)] 212151K->126892K(444416K), 0.0102186 secs] [Times: user=0.00 sys=0.13, real=0.01 secs] 
   2020-10-28T23:17:06.128+0800: 0.338: [GC (Allocation Failure) [PSYoungGen: 270836K->10750K(270848K)] 386988K->206754K(466944K), 0.0174244 secs] [Times: user=0.00 sys=0.13, real=0.02 secs] 
   2020-10-28T23:17:06.145+0800: 0.356: [Full GC (Ergonomics) [PSYoungGen: 10750K->0K(270848K)] [ParOldGen: 196004K->168695K(333312K)] 206754K->168695K(604160K), [Metaspace: 2834K->2834K(1056768K)], 0.0233845 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
   2020-10-28T23:17:06.203+0800: 0.414: [GC (Allocation Failure) [PSYoungGen: 260096K->85784K(544768K)] 428791K->254480K(878080K), 0.0145545 secs] [Times: user=0.03 sys=0.08, real=0.01 secs] 
   2020-10-28T23:17:06.357+0800: 0.567: [GC (Allocation Failure) [PSYoungGen: 544536K->108016K(582144K)] 713232K->349210K(915456K), 0.0305236 secs] [Times: user=0.06 sys=0.19, real=0.03 secs] 
   2020-10-28T23:17:06.460+0800: 0.670: [GC (Allocation Failure) [PSYoungGen: 582128K->116733K(392704K)] 823322K->450119K(726528K), 0.0968604 secs] [Times: user=0.14 sys=0.58, real=0.10 secs] 
   2020-10-28T23:17:06.557+0800: 0.767: [Full GC (Ergonomics) [PSYoungGen: 116733K->0K(392704K)] [ParOldGen: 333385K->305325K(511488K)] 450119K->305325K(904192K), [Metaspace: 2834K->2834K(1056768K)], 0.0410988 secs] [Times: user=0.24 sys=0.00, real=0.04 secs] 
   2020-10-28T23:17:06.632+0800: 0.842: [GC (Allocation Failure) [PSYoungGen: 275968K->82937K(487424K)] 581293K->388262K(998912K), 0.0093149 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T23:17:06.675+0800: 0.886: [GC (Allocation Failure) [PSYoungGen: 358905K->152760K(474624K)] 664230K->458085K(986112K), 0.0162801 secs] [Times: user=0.11 sys=0.00, real=0.02 secs] 
   2020-10-28T23:17:06.726+0800: 0.936: [GC (Allocation Failure) [PSYoungGen: 427704K->82391K(486912K)] 733029K->504955K(998400K), 0.0745811 secs] [Times: user=0.06 sys=0.51, real=0.07 secs] 
   2020-10-28T23:17:06.800+0800: 1.011: [Full GC (Ergonomics) [PSYoungGen: 82391K->0K(486912K)] [ParOldGen: 422564K->338471K(573440K)] 504955K->338471K(1060352K), [Metaspace: 2834K->2834K(1056768K)], 0.0436626 secs] [Times: user=0.33 sys=0.02, real=0.04 secs] 
   2020-10-28T23:17:06.878+0800: 1.089: [GC (Allocation Failure) [PSYoungGen: 274944K->89448K(463360K)] 613415K->427919K(1036800K), 0.0116484 secs] [Times: user=0.00 sys=0.02, real=0.01 secs] 
   Heap
    PSYoungGen      total 463360K, used 135442K [0x00000000d5580000, 0x00000000fe300000, 0x0000000100000000)
     eden space 284160K, 16% used [0x00000000d5580000,0x00000000d826ab70,0x00000000e6b00000)
     from space 179200K, 49% used [0x00000000f3400000,0x00000000f8b5a028,0x00000000fe300000)
     to   space 192512K, 0% used [0x00000000e6b00000,0x00000000e6b00000,0x00000000f2700000)
    ParOldGen       total 573440K, used 338471K [0x0000000080000000, 0x00000000a3000000, 0x00000000d5580000)
     object space 573440K, 59% used [0x0000000080000000,0x0000000094a89eb0,0x00000000a3000000)
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
CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=2147483648 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
```
+ -XX:InitialHeapSize=266296832 初始堆大小:254M(266296832/(1024*1024))
+ -XX:MaxHeapSize=2147483648 最大堆大小:2048M(2147483648/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseParallelGC 并行垃圾回收器，吞吐量优先

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了12次年轻代GC(总共耗时304毫秒，平均每次耗时25毫秒)、3次Full GC
+ 1秒内12
