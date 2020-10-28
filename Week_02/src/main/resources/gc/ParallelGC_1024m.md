# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -Xmx1024m -Xloggc:gc.1024m.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8599068k free), swap 19816848k(2793728k free)
   CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=1073741824 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
   2020-10-28T23:16:28.585+0800: 0.150: [GC (Allocation Failure) [PSYoungGen: 64508K->10727K(75776K)] 64508K->24716K(249344K), 0.0055019 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:28.606+0800: 0.171: [GC (Allocation Failure) [PSYoungGen: 75751K->10737K(140800K)] 89740K->42002K(314368K), 0.0071302 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:28.656+0800: 0.221: [GC (Allocation Failure) [PSYoungGen: 140785K->10735K(140800K)] 172050K->82826K(314368K), 0.0099567 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:28.685+0800: 0.250: [GC (Allocation Failure) [PSYoungGen: 140783K->10751K(270848K)] 212874K->121206K(444416K), 0.0100185 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:28.779+0800: 0.344: [GC (Allocation Failure) [PSYoungGen: 270847K->10749K(270848K)] 381302K->199056K(459264K), 0.0168183 secs] [Times: user=0.00 sys=0.13, real=0.02 secs] 
   2020-10-28T23:16:28.796+0800: 0.361: [Full GC (Ergonomics) [PSYoungGen: 10749K->0K(270848K)] [ParOldGen: 188307K->169581K(330752K)] 199056K->169581K(601600K), [Metaspace: 2834K->2834K(1056768K)], 0.0244563 secs] [Times: user=0.13 sys=0.00, real=0.03 secs] 
   2020-10-28T23:16:28.857+0800: 0.422: [GC (Allocation Failure) [PSYoungGen: 260096K->78309K(223744K)] 429677K->250569K(554496K), 0.0139679 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:28.891+0800: 0.456: [GC (Allocation Failure) [PSYoungGen: 223717K->101886K(247296K)] 395977K->290016K(578048K), 0.0131202 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:28.923+0800: 0.488: [GC (Allocation Failure) [PSYoungGen: 247294K->101882K(218624K)] 435424K->328018K(549376K), 0.0194266 secs] [Times: user=0.05 sys=0.06, real=0.02 secs] 
   2020-10-28T23:16:28.960+0800: 0.524: [GC (Allocation Failure) [PSYoungGen: 218618K->88545K(232960K)] 444754K->352568K(563712K), 0.0160534 secs] [Times: user=0.08 sys=0.02, real=0.02 secs] 
   2020-10-28T23:16:28.976+0800: 0.540: [Full GC (Ergonomics) [PSYoungGen: 88545K->0K(232960K)] [ParOldGen: 264023K->259679K(435712K)] 352568K->259679K(668672K), [Metaspace: 2834K->2834K(1056768K)], 0.0339733 secs] [Times: user=0.14 sys=0.00, real=0.03 secs] 
   2020-10-28T23:16:29.025+0800: 0.589: [GC (Allocation Failure) [PSYoungGen: 116736K->41289K(232960K)] 376415K->300968K(668672K), 0.0049095 secs] [Times: user=0.13 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:29.044+0800: 0.608: [GC (Allocation Failure) [PSYoungGen: 158025K->40424K(232960K)] 417704K->337156K(668672K), 0.0111301 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.068+0800: 0.633: [GC (Allocation Failure) [PSYoungGen: 157160K->41768K(232960K)] 453892K->373676K(668672K), 0.0126442 secs] [Times: user=0.05 sys=0.03, real=0.01 secs] 
   2020-10-28T23:16:29.097+0800: 0.661: [GC (Allocation Failure) [PSYoungGen: 158273K->39785K(232960K)] 490181K->407670K(668672K), 0.0120573 secs] [Times: user=0.05 sys=0.05, real=0.01 secs] 
   2020-10-28T23:16:29.123+0800: 0.688: [GC (Allocation Failure) [PSYoungGen: 156266K->35332K(232960K)] 524151K->439805K(668672K), 0.0118738 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.135+0800: 0.700: [Full GC (Ergonomics) [PSYoungGen: 35332K->0K(232960K)] [ParOldGen: 404472K->307475K(493056K)] 439805K->307475K(726016K), [Metaspace: 2834K->2834K(1056768K)], 0.0384270 secs] [Times: user=0.25 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:29.189+0800: 0.754: [GC (Allocation Failure) [PSYoungGen: 116736K->39604K(232960K)] 424211K->347080K(726016K), 0.0045096 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.208+0800: 0.773: [GC (Allocation Failure) [PSYoungGen: 156242K->35426K(232960K)] 463718K->377772K(726016K), 0.0076622 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.231+0800: 0.796: [GC (Allocation Failure) [PSYoungGen: 152162K->36858K(232960K)] 494508K->411298K(726016K), 0.0077655 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.254+0800: 0.818: [GC (Allocation Failure) [PSYoungGen: 153340K->38489K(232960K)] 527780K->446081K(726016K), 0.0081990 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.277+0800: 0.842: [GC (Allocation Failure) [PSYoungGen: 155225K->39745K(156672K)] 562817K->481330K(649728K), 0.0113990 secs] [Times: user=0.06 sys=0.03, real=0.01 secs] 
   2020-10-28T23:16:29.289+0800: 0.854: [Full GC (Ergonomics) [PSYoungGen: 39745K->0K(156672K)] [ParOldGen: 441584K->338912K(540672K)] 481330K->338912K(697344K), [Metaspace: 2834K->2834K(1056768K)], 0.0402232 secs] [Times: user=0.36 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:29.346+0800: 0.910: [GC (Allocation Failure) [PSYoungGen: 116024K->39268K(236544K)] 454936K->378181K(777216K), 0.0049962 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.366+0800: 0.931: [GC (Allocation Failure) [PSYoungGen: 160612K->42933K(164352K)] 499525K->417364K(705024K), 0.0093858 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.390+0800: 0.955: [GC (Allocation Failure) [PSYoungGen: 164277K->34215K(232960K)] 538708K->447040K(773632K), 0.0082545 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.413+0800: 0.977: [GC (Allocation Failure) [PSYoungGen: 161191K->43384K(229376K)] 574016K->485841K(770048K), 0.0085177 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.438+0800: 1.002: [GC (Allocation Failure) [PSYoungGen: 170360K->36302K(241664K)] 612817K->516418K(782336K), 0.0111459 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.467+0800: 1.031: [GC (Allocation Failure) [PSYoungGen: 180174K->48245K(238592K)] 660290K->561658K(779264K), 0.0118086 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:29.478+0800: 1.043: [Full GC (Ergonomics) [PSYoungGen: 48245K->0K(238592K)] [ParOldGen: 513412K->352567K(570880K)] 561658K->352567K(809472K), [Metaspace: 2834K->2834K(1056768K)], 0.0427742 secs] [Times: user=0.23 sys=0.00, real=0.04 secs] 
   Heap
    PSYoungGen      total 238592K, used 101138K [0x00000000eab00000, 0x00000000ff500000, 0x0000000100000000)
     eden space 143872K, 70% used [0x00000000eab00000,0x00000000f0dc4a10,0x00000000f3780000)
     from space 94720K, 0% used [0x00000000f3780000,0x00000000f3780000,0x00000000f9400000)
     to   space 90624K, 0% used [0x00000000f9c80000,0x00000000f9c80000,0x00000000ff500000)
    ParOldGen       total 570880K, used 352567K [0x00000000c0000000, 0x00000000e2d80000, 0x00000000eab00000)
     object space 570880K, 61% used [0x00000000c0000000,0x00000000d584ddc8,0x00000000e2d80000)
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
CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=1073741824 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
```
+ -XX:InitialHeapSize=266296832 初始堆大小:254M(266296832/(1024*1024))
+ -XX:MaxHeapSize=1073741824 最大堆大小:1024M(1073741824/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseParallelGC 并行垃圾回收器，吞吐量优先

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了25次年轻代GC(总共耗时250毫秒左右，平均耗时10毫秒左右)、5次Full GC(总共耗时180毫秒左右，平均耗时36毫秒左右)
+ 1秒钟内GC耗时占总时间的43%左右，也就是说40%左右的时间应用是属于STW状态
