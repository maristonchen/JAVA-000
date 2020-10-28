# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -Xmx128m -Xloggc:gc.128m.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8667936k free), swap 19816848k(2661548k free)
   CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
   2020-10-28T22:49:36.489+0800: 0.131: [GC (Allocation Failure) [PSYoungGen: 33199K->5096K(38400K)] 33199K->10463K(125952K), 0.0032093 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.503+0800: 0.145: [GC (Allocation Failure) [PSYoungGen: 38032K->5103K(38400K)] 43399K->25546K(125952K), 0.0056809 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.517+0800: 0.159: [GC (Allocation Failure) [PSYoungGen: 37808K->5112K(38400K)] 58251K->33605K(125952K), 0.0030705 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.527+0800: 0.169: [GC (Allocation Failure) [PSYoungGen: 38257K->5115K(38400K)] 66750K->44670K(125952K), 0.0038415 secs] [Times: user=0.03 sys=0.08, real=0.00 secs] 
   2020-10-28T22:49:36.536+0800: 0.178: [GC (Allocation Failure) [PSYoungGen: 38150K->5105K(38400K)] 77705K->55188K(125952K), 0.0040306 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.546+0800: 0.188: [GC (Allocation Failure) [PSYoungGen: 37991K->5103K(19968K)] 88074K->66573K(107520K), 0.0048341 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.553+0800: 0.195: [GC (Allocation Failure) [PSYoungGen: 19817K->10447K(29184K)] 81287K->73699K(116736K), 0.0022501 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.558+0800: 0.200: [GC (Allocation Failure) [PSYoungGen: 25192K->14006K(29184K)] 88444K->78949K(116736K), 0.0023057 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.563+0800: 0.205: [GC (Allocation Failure) [PSYoungGen: 28558K->14256K(29184K)] 93500K->83271K(116736K), 0.0030171 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.568+0800: 0.210: [GC (Allocation Failure) [PSYoungGen: 28675K->12598K(29184K)] 97690K->91745K(116736K), 0.0037229 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.572+0800: 0.214: [Full GC (Ergonomics) [PSYoungGen: 12598K->0K(29184K)] [ParOldGen: 79146K->82248K(87552K)] 91745K->82248K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0129313 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.588+0800: 0.230: [Full GC (Ergonomics) [PSYoungGen: 14748K->0K(29184K)] [ParOldGen: 82248K->84405K(87552K)] 96997K->84405K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0121919 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.602+0800: 0.244: [Full GC (Ergonomics) [PSYoungGen: 14649K->2410K(29184K)] [ParOldGen: 84405K->87301K(87552K)] 99055K->89712K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0100870 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.615+0800: 0.257: [Full GC (Ergonomics) [PSYoungGen: 14802K->6468K(29184K)] [ParOldGen: 87301K->86822K(87552K)] 102104K->93290K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0131021 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.629+0800: 0.271: [Full GC (Ergonomics) [PSYoungGen: 14848K->9240K(29184K)] [ParOldGen: 86822K->87018K(87552K)] 101670K->96258K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0123743 secs] [Times: user=0.11 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.642+0800: 0.284: [Full GC (Ergonomics) [PSYoungGen: 14696K->10275K(29184K)] [ParOldGen: 87018K->87373K(87552K)] 101715K->97648K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0059624 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.649+0800: 0.291: [Full GC (Ergonomics) [PSYoungGen: 14844K->9642K(29184K)] [ParOldGen: 87373K->87371K(87552K)] 102217K->97013K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0119113 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.662+0800: 0.304: [Full GC (Ergonomics) [PSYoungGen: 14722K->11451K(29184K)] [ParOldGen: 87371K->87220K(87552K)] 102093K->98672K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0116016 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.674+0800: 0.316: [Full GC (Ergonomics) [PSYoungGen: 14720K->11622K(29184K)] [ParOldGen: 87220K->87220K(87552K)] 101940K->98842K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0018399 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.677+0800: 0.319: [Full GC (Ergonomics) [PSYoungGen: 14837K->12454K(29184K)] [ParOldGen: 87220K->86876K(87552K)] 102058K->99331K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0099481 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.687+0800: 0.329: [Full GC (Ergonomics) [PSYoungGen: 14803K->12300K(29184K)] [ParOldGen: 86876K->87245K(87552K)] 101679K->99546K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0051974 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.693+0800: 0.335: [Full GC (Ergonomics) [PSYoungGen: 14206K->12683K(29184K)] [ParOldGen: 87245K->87245K(87552K)] 101452K->99928K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0018873 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.695+0800: 0.337: [Full GC (Ergonomics) [PSYoungGen: 14715K->12858K(29184K)] [ParOldGen: 87245K->87076K(87552K)] 101960K->99934K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0081605 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.703+0800: 0.345: [Full GC (Ergonomics) [PSYoungGen: 14709K->12978K(29184K)] [ParOldGen: 87076K->87465K(87552K)] 101786K->100443K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0135717 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.718+0800: 0.360: [Full GC (Ergonomics) [PSYoungGen: 14800K->13417K(29184K)] [ParOldGen: 87465K->87290K(87552K)] 102265K->100707K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0143559 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.732+0800: 0.374: [Full GC (Ergonomics) [PSYoungGen: 14608K->13381K(29184K)] [ParOldGen: 87290K->87290K(87552K)] 101898K->100671K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0018373 secs] [Times: user=0.11 sys=0.02, real=0.00 secs] 
   2020-10-28T22:49:36.734+0800: 0.376: [Full GC (Ergonomics) [PSYoungGen: 14817K->13429K(29184K)] [ParOldGen: 87290K->87290K(87552K)] 102107K->100719K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0016685 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.736+0800: 0.378: [Full GC (Ergonomics) [PSYoungGen: 14483K->13891K(29184K)] [ParOldGen: 87290K->87290K(87552K)] 101774K->101181K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0016964 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.738+0800: 0.380: [Full GC (Ergonomics) [PSYoungGen: 14508K->14269K(29184K)] [ParOldGen: 87290K->87096K(87552K)] 101798K->101366K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0081891 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T22:49:36.747+0800: 0.389: [Full GC (Ergonomics) [PSYoungGen: 14848K->14353K(29184K)] [ParOldGen: 87096K->86749K(87552K)] 101944K->101103K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0084467 secs] [Times: user=0.11 sys=0.02, real=0.01 secs] 
   2020-10-28T22:49:36.755+0800: 0.397: [Full GC (Ergonomics) [PSYoungGen: 14743K->14353K(29184K)] [ParOldGen: 86749K->86749K(87552K)] 101492K->101103K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0020126 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.758+0800: 0.400: [Full GC (Ergonomics) [PSYoungGen: 14505K->14353K(29184K)] [ParOldGen: 86749K->86749K(87552K)] 101254K->101103K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0017650 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.760+0800: 0.402: [Full GC (Ergonomics) [PSYoungGen: 14353K->14353K(29184K)] [ParOldGen: 87270K->86749K(87552K)] 101624K->101103K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0016080 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.761+0800: 0.403: [Full GC (Ergonomics) [PSYoungGen: 14812K->14713K(29184K)] [ParOldGen: 87550K->87550K(87552K)] 102363K->102264K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0016835 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T22:49:36.763+0800: 0.405: [Full GC (Allocation Failure) [PSYoungGen: 14713K->14713K(29184K)] [ParOldGen: 87550K->87531K(87552K)] 102264K->102245K(116736K), [Metaspace: 2834K->2834K(1056768K)], 0.0153671 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
   Heap
    PSYoungGen      total 29184K, used 14848K [0x00000000fd580000, 0x0000000100000000, 0x0000000100000000)
     eden space 14848K, 100% used [0x00000000fd580000,0x00000000fe400000,0x00000000fe400000)
     from space 14336K, 0% used [0x00000000ff200000,0x00000000ff200000,0x0000000100000000)
     to   space 14336K, 0% used [0x00000000fe400000,0x00000000fe400000,0x00000000ff200000)
    ParOldGen       total 87552K, used 87531K [0x00000000f8000000, 0x00000000fd580000, 0x00000000fd580000)
     object space 87552K, 99% used [0x00000000f8000000,0x00000000fd57ada8,0x00000000fd580000)
    Metaspace       used 2865K, capacity 4486K, committed 4864K, reserved 1056768K
     class space    used 310K, capacity 386K, committed 512K, reserved 1048576K

   Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
           at java.util.Arrays.copyOf(Arrays.java:3332)
           at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
           at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
           at java.lang.StringBuilder.append(StringBuilder.java:208)
           at com.mariston.weektwo.GCLogAnalysis.generateGarbage(GCLogAnalysis.java:61)
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
CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
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
+ -XX:+UseParallelGC 并行垃圾回收器，吞吐量优先

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了连续10次年轻代GC、25次Full GC；最后Full GC也无法回收Eden区内存，直接报OOM异常 
+ 并行收集器的GC时间几乎就等于应用暂停时间
+ 初始时老年代内存大小为0，随后老年代内存和年轻代内存逐渐增大
