# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -Xmx512m -Xloggc:gc.512m.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8598120k free), swap 19816848k(2787568k free)
   CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
   2020-10-28T23:16:00.359+0800: 0.257: [GC (Allocation Failure) [PSYoungGen: 64976K->10751K(75776K)] 64976K->22645K(249344K), 0.0055600 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.378+0800: 0.276: [GC (Allocation Failure) [PSYoungGen: 75775K->10749K(140800K)] 87669K->43344K(314368K), 0.0071026 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.427+0800: 0.324: [GC (Allocation Failure) [PSYoungGen: 140797K->10742K(140800K)] 173392K->86164K(314368K), 0.0100689 secs] [Times: user=0.05 sys=0.06, real=0.01 secs] 
   2020-10-28T23:16:00.457+0800: 0.355: [GC (Allocation Failure) [PSYoungGen: 140790K->10748K(163840K)] 216212K->128225K(337408K), 0.0100104 secs] [Times: user=0.05 sys=0.05, real=0.01 secs] 
   2020-10-28T23:16:00.489+0800: 0.387: [GC (Allocation Failure) [PSYoungGen: 163836K->10751K(163840K)] 281313K->181306K(337408K), 0.0126475 secs] [Times: user=0.00 sys=0.13, real=0.01 secs] 
   2020-10-28T23:16:00.502+0800: 0.400: [Full GC (Ergonomics) [PSYoungGen: 10751K->0K(163840K)] [ParOldGen: 170555K->154013K(299008K)] 181306K->154013K(462848K), [Metaspace: 2834K->2834K(1056768K)], 0.0229169 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
   2020-10-28T23:16:00.549+0800: 0.446: [GC (Allocation Failure) [PSYoungGen: 153088K->10741K(69632K)] 307101K->206071K(368640K), 0.0090343 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.567+0800: 0.465: [GC (Allocation Failure) [PSYoungGen: 69621K->28667K(116736K)] 264951K->223997K(415744K), 0.0039131 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.580+0800: 0.478: [GC (Allocation Failure) [PSYoungGen: 87500K->44595K(116736K)] 282830K->239925K(415744K), 0.0053076 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.594+0800: 0.491: [GC (Allocation Failure) [PSYoungGen: 102973K->51358K(116736K)] 298303K->255313K(415744K), 0.0073277 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.610+0800: 0.508: [GC (Allocation Failure) [PSYoungGen: 110209K->41858K(116736K)] 314163K->277492K(415744K), 0.0108420 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.630+0800: 0.528: [GC (Allocation Failure) [PSYoungGen: 100720K->23284K(116736K)] 336354K->297755K(415744K), 0.0106376 secs] [Times: user=0.02 sys=0.09, real=0.01 secs] 
   2020-10-28T23:16:00.641+0800: 0.538: [Full GC (Ergonomics) [PSYoungGen: 23284K->0K(116736K)] [ParOldGen: 274470K->230821K(349696K)] 297755K->230821K(466432K), [Metaspace: 2834K->2834K(1056768K)], 0.0293173 secs] [Times: user=0.14 sys=0.00, real=0.03 secs] 
   2020-10-28T23:16:00.678+0800: 0.576: [GC (Allocation Failure) [PSYoungGen: 58880K->19476K(116736K)] 289701K->250298K(466432K), 0.0025172 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.689+0800: 0.586: [GC (Allocation Failure) [PSYoungGen: 78356K->19577K(116736K)] 309178K->267992K(466432K), 0.0043742 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.700+0800: 0.598: [GC (Allocation Failure) [PSYoungGen: 78281K->20437K(116736K)] 326696K->286341K(466432K), 0.0044260 secs] [Times: user=0.08 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.712+0800: 0.609: [GC (Allocation Failure) [PSYoungGen: 79152K->22401K(116736K)] 345055K->307927K(466432K), 0.0054636 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.725+0800: 0.623: [GC (Allocation Failure) [PSYoungGen: 81281K->18482K(116736K)] 366807K->324997K(466432K), 0.0066314 secs] [Times: user=0.06 sys=0.05, real=0.01 secs] 
   2020-10-28T23:16:00.732+0800: 0.630: [Full GC (Ergonomics) [PSYoungGen: 18482K->0K(116736K)] [ParOldGen: 306515K->263157K(349696K)] 324997K->263157K(466432K), [Metaspace: 2834K->2834K(1056768K)], 0.0312333 secs] [Times: user=0.13 sys=0.00, real=0.03 secs] 
   2020-10-28T23:16:00.771+0800: 0.669: [GC (Allocation Failure) [PSYoungGen: 58880K->21695K(116736K)] 322037K->284852K(466432K), 0.0028763 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.782+0800: 0.679: [GC (Allocation Failure) [PSYoungGen: 80575K->19822K(116736K)] 343732K->304356K(466432K), 0.0047641 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.794+0800: 0.692: [GC (Allocation Failure) [PSYoungGen: 78311K->18459K(116736K)] 362845K->321120K(466432K), 0.0046659 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.806+0800: 0.703: [GC (Allocation Failure) [PSYoungGen: 77299K->21788K(116736K)] 379959K->341999K(466432K), 0.0058778 secs] [Times: user=0.08 sys=0.05, real=0.01 secs] 
   2020-10-28T23:16:00.812+0800: 0.709: [Full GC (Ergonomics) [PSYoungGen: 21788K->0K(116736K)] [ParOldGen: 320211K->285273K(349696K)] 341999K->285273K(466432K), [Metaspace: 2834K->2834K(1056768K)], 0.0339080 secs] [Times: user=0.20 sys=0.00, real=0.03 secs] 
   2020-10-28T23:16:00.854+0800: 0.752: [GC (Allocation Failure) [PSYoungGen: 58634K->20794K(116736K)] 343907K->306067K(466432K), 0.0029799 secs] [Times: user=0.06 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.865+0800: 0.763: [GC (Allocation Failure) [PSYoungGen: 79617K->24263K(116736K)] 364890K->329223K(466432K), 0.0051367 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.878+0800: 0.775: [GC (Allocation Failure) [PSYoungGen: 83112K->21167K(80384K)] 388073K->349761K(430080K), 0.0059409 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.884+0800: 0.781: [Full GC (Ergonomics) [PSYoungGen: 21167K->0K(80384K)] [ParOldGen: 328594K->306796K(349696K)] 349761K->306796K(430080K), [Metaspace: 2834K->2834K(1056768K)], 0.0353192 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
   2020-10-28T23:16:00.928+0800: 0.825: [GC (Allocation Failure) [PSYoungGen: 58867K->18403K(116736K)] 365663K->325199K(466432K), 0.0024454 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-28T23:16:00.939+0800: 0.836: [GC (Allocation Failure) [PSYoungGen: 78819K->38681K(115200K)] 385615K->345478K(464896K), 0.0049068 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.951+0800: 0.849: [GC (Allocation Failure) [PSYoungGen: 99097K->39187K(115712K)] 405894K->363347K(465408K), 0.0064158 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-28T23:16:00.957+0800: 0.855: [Full GC (Ergonomics) [PSYoungGen: 39187K->0K(115712K)] [ParOldGen: 324159K->320367K(349696K)] 363347K->320367K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0369629 secs] [Times: user=0.23 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:01.003+0800: 0.901: [Full GC (Ergonomics) [PSYoungGen: 58579K->0K(115712K)] [ParOldGen: 320367K->324527K(349696K)] 378947K->324527K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0388529 secs] [Times: user=0.22 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:01.051+0800: 0.949: [Full GC (Ergonomics) [PSYoungGen: 58754K->0K(115712K)] [ParOldGen: 324527K->322549K(349696K)] 383281K->322549K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0381042 secs] [Times: user=0.24 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:01.098+0800: 0.996: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(115712K)] [ParOldGen: 322549K->321935K(349696K)] 381429K->321935K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0405074 secs] [Times: user=0.24 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:01.148+0800: 1.046: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(115712K)] [ParOldGen: 321935K->323558K(349696K)] 380815K->323558K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0361105 secs] [Times: user=0.23 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:01.194+0800: 1.091: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(115712K)] [ParOldGen: 323558K->328592K(349696K)] 382438K->328592K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0384325 secs] [Times: user=0.25 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:01.241+0800: 1.139: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(115712K)] [ParOldGen: 328592K->334579K(349696K)] 387472K->334579K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0408895 secs] [Times: user=0.36 sys=0.00, real=0.04 secs] 
   2020-10-28T23:16:01.291+0800: 1.188: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(115712K)] [ParOldGen: 334579K->343062K(349696K)] 393459K->343062K(465408K), [Metaspace: 2834K->2834K(1056768K)], 0.0401518 secs] [Times: user=0.31 sys=0.05, real=0.04 secs] 
   Heap
    PSYoungGen      total 115712K, used 2563K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
     eden space 58880K, 4% used [0x00000000f5580000,0x00000000f5800c28,0x00000000f8f00000)
     from space 56832K, 0% used [0x00000000fc880000,0x00000000fc880000,0x0000000100000000)
     to   space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
    ParOldGen       total 349696K, used 343062K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
     object space 349696K, 98% used [0x00000000e0000000,0x00000000f4f05818,0x00000000f5580000)
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
CommandLine flags: -XX:InitialHeapSize=266296832 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
```
+ -XX:InitialHeapSize=266296832 初始堆大小:254M(266296832/(1024*1024))
+ -XX:MaxHeapSize=536870912 最大堆大小:512M(536870912/(1024*1024))
+ -XX:+PrintGC 打印GC信息
+ -XX:+PrintGCDateStamps 打印GC发生时的日期信息
+ -XX:+PrintGCDetails 打印详细的GC信息
+ -XX:+PrintGCTimeStamps 打印GC发生时的时间戳
+ -XX:+UseCompressedClassPointers 压缩类指针
+ -XX:+UseCompressedOops 压缩普通对象指针，从32位的虚拟机上迁移到64位的虚拟机上，会对指针进行相应的压缩处理
+ -XX:-UseLargePagesIndividualAllocation 使用大页面个体分配
+ -XX:+UseParallelGC 并行垃圾回收器，吞吐量优先

**总 结(Parallel Scavenge+Parallel Old)**
+ 1秒钟内发生了连续26次年轻代GC、13次Full GC；后面old区持续占用90%以上，持续触发Full GC，应用几乎暂停
