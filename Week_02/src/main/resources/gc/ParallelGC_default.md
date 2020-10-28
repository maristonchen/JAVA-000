# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -Xloggc:default.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8418396k free), swap 18811060k(3799852k free)
   CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=4260749312 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
   2020-10-27T17:18:16.798+0800: 0.144: [GC (Allocation Failure) [PSYoungGen: 65024K->10750K(75776K)] 65024K->22522K(249344K), 0.0050200 secs] [Times: user=0.00 sys=0.09, real=0.00 secs] 
   2020-10-27T17:18:16.820+0800: 0.166: [GC (Allocation Failure) [PSYoungGen: 75424K->10751K(140800K)] 87195K->45595K(314368K), 0.0069582 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-27T17:18:16.866+0800: 0.212: [GC (Allocation Failure) [PSYoungGen: 140799K->10751K(140800K)] 175643K->84741K(314368K), 0.0099929 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-27T17:18:16.896+0800: 0.242: [GC (Allocation Failure) [PSYoungGen: 140799K->10751K(270848K)] 214789K->121466K(444416K), 0.0088139 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-27T17:18:16.985+0800: 0.332: [GC (Allocation Failure) --[PSYoungGen: 270797K->270797K(270848K)] 381511K->451334K(451584K), 0.0152442 secs] [Times: user=0.03 sys=0.09, real=0.02 secs] 
   2020-10-27T17:18:17.001+0800: 0.347: [Full GC (Ergonomics) [PSYoungGen: 270797K->0K(270848K)] [ParOldGen: 180536K->167653K(301056K)] 451334K->167653K(571904K), [Metaspace: 2834K->2834K(1056768K)], 0.0265678 secs] [Times: user=0.23 sys=0.02, real=0.03 secs] 
   2020-10-27T17:18:17.062+0800: 0.408: [GC (Allocation Failure) [PSYoungGen: 260096K->10744K(270848K)] 427749K->249980K(571904K), 0.0135930 secs] [Times: user=0.05 sys=0.08, real=0.01 secs] 
   2020-10-27T17:18:17.075+0800: 0.422: [Full GC (Ergonomics) [PSYoungGen: 10744K->0K(270848K)] [ParOldGen: 239235K->216976K(420352K)] 249980K->216976K(691200K), [Metaspace: 2834K->2834K(1056768K)], 0.0258384 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
   2020-10-27T17:18:17.133+0800: 0.479: [GC (Allocation Failure) [PSYoungGen: 260096K->86007K(470016K)] 477072K->303482K(890368K), 0.0144436 secs] [Times: user=0.02 sys=0.11, real=0.01 secs] 
   2020-10-27T17:18:17.240+0800: 0.586: [GC (Allocation Failure) [PSYoungGen: 470007K->101885K(517632K)] 687482K->388836K(937984K), 0.0272076 secs] [Times: user=0.05 sys=0.08, real=0.03 secs] 
   2020-10-27T17:18:17.334+0800: 0.681: [GC (Allocation Failure) [PSYoungGen: 517629K->154110K(678912K)] 804580K->485699K(1099264K), 0.0373638 secs] [Times: user=0.05 sys=0.20, real=0.04 secs] 
   2020-10-27T17:18:17.439+0800: 0.786: [GC (Allocation Failure) [PSYoungGen: 678910K->200172K(724992K)] 1010499K->573814K(1145344K), 0.0440417 secs] [Times: user=0.09 sys=0.23, real=0.04 secs] 
   2020-10-27T17:18:17.484+0800: 0.830: [Full GC (Ergonomics) [PSYoungGen: 200172K->0K(724992K)] [ParOldGen: 373642K->350056K(592384K)] 573814K->350056K(1317376K), [Metaspace: 2834K->2834K(1056768K)], 0.0453973 secs] [Times: user=0.26 sys=0.00, real=0.05 secs] 
   2020-10-27T17:18:17.590+0800: 0.937: [GC (Allocation Failure) [PSYoungGen: 524800K->143370K(954368K)] 874856K->493427K(1546752K), 0.0311471 secs] [Times: user=0.08 sys=0.14, real=0.03 secs] 
   2020-10-27T17:18:17.706+0800: 1.053: [GC (Allocation Failure) [PSYoungGen: 846858K->251375K(954880K)] 1196915K->603409K(1547264K), 0.0344446 secs] [Times: user=0.11 sys=0.14, real=0.03 secs] 
   Heap
    PSYoungGen      total 954880K, used 397145K [0x000000076b580000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 703488K, 20% used [0x000000076b580000,0x00000007743da800,0x0000000796480000)
     from space 251392K, 99% used [0x0000000796480000,0x00000007a59fbd38,0x00000007a5a00000)
     to   space 291328K, 0% used [0x00000007ae380000,0x00000007ae380000,0x00000007c0000000)
    ParOldGen       total 592384K, used 352034K [0x00000006c2000000, 0x00000006e6280000, 0x000000076b580000)
     object space 592384K, 59% used [0x00000006c2000000,0x00000006d77c8ac0,0x00000006e6280000)
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
CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=4260749312 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
```
+ -XX:InitialHeapSize=266296832 初始堆大小:254M(266296832/(1024*1024))
+ -XX:MaxHeapSize=4260749312 最大堆大小:4063M(4260749312/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseParallelGC 并行垃圾回收器，吞吐量优先

**年轻代GC(Minor GC)**
```cmd
2020-10-27T17:18:16.798+0800: 0.144: [GC (Allocation Failure) [PSYoungGen: 65024K->10750K(75776K)] 65024K->22522K(249344K), 0.0050200 secs] [Times: user=0.00 sys=0.09, real=0.00 secs]
```
+ 2020-10-27T17:18:16.798+0800: 0.144 =>GC的日期、时间戳、时区
+ GC (Allocation Failure) => 触发GC的原因：给对象分配堆内存失败
+ PSYoungGen => Parallel Scavenge Young Gen : 并行的新生代收集器，复制算法，吞吐量优先，会触发STW事件
+ \[PSYoungGen: 65024K->10750K(75776K)] => 年轻代GC的内存变化：原大小75776K，已使用大小65024K，GC后大小10750K(年轻代在内存比例达到85.8%时触发了GC，腾出了65024K-10750K=54274K)
+ 65024K->22522K(249344K) => 堆内存的变化：原大小249344K，已使用大小65024K，GC后大小22522K(整个堆内存变化大小为65024K-22522K=42502K)
+ 0.0050200 secs => 这次年轻代GC耗费时间5.02毫秒
+ \[Times: user=0.00 sys=0.09, real=0.00 secs] => user=0.00:CPU花费的总时间为0秒 ,sys=0.09:系统调用时间为90毫秒，real=0.00:应用暂停时间为0秒

**Full GC**
```cmd
2020-10-27T17:18:17.001+0800: 0.347: [Full GC (Ergonomics) [PSYoungGen: 270797K->0K(270848K)] [ParOldGen: 180536K->167653K(301056K)] 451334K->167653K(571904K), [Metaspace: 2834K->2834K(1056768K)], 0.0265678 secs] [Times: user=0.23 sys=0.02, real=0.03 secs]
```
+ ParOldGen => Parallel Old Gen: 并行的老年代收集器，标记清除整理算法(mark-sweep-compact)，吞吐量优先，会触发STW事件
+ Full GC (Ergonomics) => Full GC的原因：自动选择和调优
+ \[ParOldGen: 180536K->167653K(301056K)] => 老年代GC的内存变化：原大小301056K，已使用大小180536K，GC后大小167653K(GC后老年代的大小应该包括年轻代留下的部分和老年代剩下的部分两个部分)
+ \[Metaspace: 2834K->2834K(1056768K)] => 元数据区没有变化
+ 其他参数的解读与年轻代一样

**总 结(Parallel Scavenge+Parallel Old)**
+ 在未指定堆内存大小的情况，系统会默认进行分配，最大堆内存为系统内存的1/4，初始化对内存为最大堆内存的1/4
+ 1秒钟内发生了12次年轻代GC、3次Full GC
+ 并行收集器的GC时间几乎就等于应用暂停时间
+ 初始时老年代内存大小为0，随后老年代内存和年轻代内存逐渐增大
