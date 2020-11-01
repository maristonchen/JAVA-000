# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -XX:+UseConcMarkSweepGC -Xmx128m -Xms128m -Xloggc:gc.cms.128.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8490452k free), swap 18740704k(6418884k free)
   CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:MaxNewSize=44740608 -XX:MaxTenuringThreshold=6 -XX:NewSize=44740608 -XX:OldPLABSize=16 -XX:OldSize=89477120 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC 
   2020-10-29T15:20:13.285+0800: 0.130: [GC (Allocation Failure) 2020-10-29T15:20:13.285+0800: 0.130: [ParNew: 34911K->4352K(39296K), 0.0035931 secs] 34911K->12618K(126720K), 0.0038949 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.299+0800: 0.144: [GC (Allocation Failure) 2020-10-29T15:20:13.299+0800: 0.144: [ParNew: 39296K->4352K(39296K), 0.0061429 secs] 47562K->27070K(126720K), 0.0062002 secs] [Times: user=0.03 sys=0.02, real=0.01 secs] 
   2020-10-29T15:20:13.313+0800: 0.158: [GC (Allocation Failure) 2020-10-29T15:20:13.313+0800: 0.158: [ParNew: 39037K->4352K(39296K), 0.0069986 secs] 61755K->38440K(126720K), 0.0070547 secs] [Times: user=0.11 sys=0.01, real=0.01 secs] 
   2020-10-29T15:20:13.326+0800: 0.171: [GC (Allocation Failure) 2020-10-29T15:20:13.326+0800: 0.171: [ParNew: 39276K->4352K(39296K), 0.0081579 secs] 73364K->51703K(126720K), 0.0082471 secs] [Times: user=0.11 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.335+0800: 0.180: [GC (CMS Initial Mark) [1 CMS-initial-mark: 47351K(87424K)] 51847K(126720K), 0.0002359 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.335+0800: 0.180: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.336+0800: 0.181: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.336+0800: 0.181: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.337+0800: 0.182: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.337+0800: 0.182: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.341+0800: 0.186: [GC (Allocation Failure) 2020-10-29T15:20:13.341+0800: 0.186: [ParNew: 38886K->4332K(39296K), 0.0082178 secs] 86237K->65154K(126720K), 0.0083129 secs] [Times: user=0.11 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.355+0800: 0.199: [GC (Allocation Failure) 2020-10-29T15:20:13.355+0800: 0.200: [ParNew: 39276K->4348K(39296K), 0.0074681 secs] 100098K->77536K(126720K), 0.0075838 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.367+0800: 0.212: [GC (Allocation Failure) 2020-10-29T15:20:13.367+0800: 0.212: [ParNew: 39229K->4348K(39296K), 0.0066562 secs] 112417K->88477K(126720K), 0.0067324 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.374+0800: 0.219: [CMS-concurrent-abortable-preclean: 0.001/0.037 secs] [Times: user=0.13 sys=0.00, real=0.04 secs] 
   2020-10-29T15:20:13.374+0800: 0.219: [GC (CMS Final Remark) [YG occupancy: 5256 K (39296 K)]2020-10-29T15:20:13.374+0800: 0.219: [Rescan (parallel) , 0.0003554 secs]2020-10-29T15:20:13.374+0800: 0.219: [weak refs processing, 0.0000161 secs]2020-10-29T15:20:13.374+0800: 0.219: [class unloading, 0.0002822 secs]2020-10-29T15:20:13.375+0800: 0.220: [scrub symbol table, 0.0003002 secs]2020-10-29T15:20:13.375+0800: 0.220: [scrub string table, 0.0000865 secs][1 CMS-remark: 84129K(87424K)] 89385K(126720K), 0.0011071 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.375+0800: 0.220: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.376+0800: 0.221: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.376+0800: 0.221: [CMS-concurrent-reset-start]
   2020-10-29T15:20:13.376+0800: 0.221: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.380+0800: 0.225: [GC (Allocation Failure) 2020-10-29T15:20:13.380+0800: 0.225: [ParNew: 39252K->39252K(39296K), 0.0000658 secs]2020-10-29T15:20:13.380+0800: 0.225: [CMS: 81392K->86974K(87424K), 0.0141462 secs] 120644K->92152K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0143083 secs] [Times: user=0.00 sys=0.02, real=0.01 secs] 
   2020-10-29T15:20:13.395+0800: 0.240: [GC (CMS Initial Mark) [1 CMS-initial-mark: 86974K(87424K)] 92996K(126720K), 0.0002707 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.395+0800: 0.240: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.396+0800: 0.241: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.396+0800: 0.241: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.396+0800: 0.241: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.397+0800: 0.241: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.397+0800: 0.241: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.397+0800: 0.242: [GC (CMS Final Remark) [YG occupancy: 14390 K (39296 K)]2020-10-29T15:20:13.397+0800: 0.242: [Rescan (parallel) , 0.0002261 secs]2020-10-29T15:20:13.397+0800: 0.242: [weak refs processing, 0.0000130 secs]2020-10-29T15:20:13.397+0800: 0.242: [class unloading, 0.0002178 secs]2020-10-29T15:20:13.397+0800: 0.242: [scrub symbol table, 0.0002895 secs]2020-10-29T15:20:13.397+0800: 0.242: [scrub string table, 0.0001379 secs][1 CMS-remark: 86974K(87424K)] 101365K(126720K), 0.0009680 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.398+0800: 0.243: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.398+0800: 0.243: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.398+0800: 0.243: [CMS-concurrent-reset-start]
   2020-10-29T15:20:13.398+0800: 0.243: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.402+0800: 0.247: [GC (Allocation Failure) 2020-10-29T15:20:13.402+0800: 0.247: [ParNew: 39213K->39213K(39296K), 0.0000352 secs]2020-10-29T15:20:13.402+0800: 0.247: [CMS: 86974K->87237K(87424K), 0.0140072 secs] 126188K->102210K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0141368 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.416+0800: 0.261: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87237K(87424K)] 103479K(126720K), 0.0004563 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.416+0800: 0.261: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.417+0800: 0.262: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.417+0800: 0.262: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.418+0800: 0.263: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.418+0800: 0.263: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.418+0800: 0.263: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.419+0800: 0.264: [GC (CMS Final Remark) [YG occupancy: 29223 K (39296 K)]2020-10-29T15:20:13.419+0800: 0.264: [Rescan (parallel) , 0.0004641 secs]2020-10-29T15:20:13.419+0800: 0.264: [weak refs processing, 0.0000116 secs]2020-10-29T15:20:13.419+0800: 0.264: [class unloading, 0.0001935 secs]2020-10-29T15:20:13.419+0800: 0.264: [scrub symbol table, 0.0003782 secs]2020-10-29T15:20:13.420+0800: 0.265: [scrub string table, 0.0001353 secs][1 CMS-remark: 87237K(87424K)] 116460K(126720K), 0.0012589 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.420+0800: 0.265: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.420+0800: 0.265: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.420+0800: 0.265: [CMS-concurrent-reset-start]
   2020-10-29T15:20:13.420+0800: 0.265: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.421+0800: 0.266: [GC (Allocation Failure) 2020-10-29T15:20:13.421+0800: 0.266: [ParNew: 39159K->39159K(39296K), 0.0000439 secs]2020-10-29T15:20:13.422+0800: 0.266: [CMS: 86249K->86961K(87424K), 0.0139501 secs] 125408K->106507K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0141288 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
   2020-10-29T15:20:13.436+0800: 0.281: [GC (CMS Initial Mark) [1 CMS-initial-mark: 86961K(87424K)] 107433K(126720K), 0.0004225 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.436+0800: 0.281: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.437+0800: 0.282: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.437+0800: 0.282: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.438+0800: 0.283: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.438+0800: 0.283: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.438+0800: 0.283: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.438+0800: 0.283: [GC (CMS Final Remark) [YG occupancy: 28941 K (39296 K)]2020-10-29T15:20:13.438+0800: 0.283: [Rescan (parallel) , 0.0005145 secs]2020-10-29T15:20:13.439+0800: 0.284: [weak refs processing, 0.0000157 secs]2020-10-29T15:20:13.439+0800: 0.284: [class unloading, 0.0002176 secs]2020-10-29T15:20:13.439+0800: 0.284: [scrub symbol table, 0.0002862 secs]2020-10-29T15:20:13.439+0800: 0.284: [scrub string table, 0.0000861 secs][1 CMS-remark: 86961K(87424K)] 115903K(126720K), 0.0012227 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.439+0800: 0.284: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.440+0800: 0.285: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.440+0800: 0.285: [CMS-concurrent-reset-start]
   2020-10-29T15:20:13.440+0800: 0.285: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.441+0800: 0.286: [GC (Allocation Failure) 2020-10-29T15:20:13.441+0800: 0.286: [ParNew: 38946K->38946K(39296K), 0.0000138 secs]2020-10-29T15:20:13.441+0800: 0.286: [CMS: 86721K->87038K(87424K), 0.0158413 secs] 125668K->110079K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0159156 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
   2020-10-29T15:20:13.457+0800: 0.302: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87038K(87424K)] 110578K(126720K), 0.0004549 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.458+0800: 0.303: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.459+0800: 0.304: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.459+0800: 0.304: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.459+0800: 0.304: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.459+0800: 0.304: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.459+0800: 0.304: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.460+0800: 0.305: [GC (CMS Final Remark) [YG occupancy: 31815 K (39296 K)]2020-10-29T15:20:13.460+0800: 0.305: [Rescan (parallel) , 0.0002690 secs]2020-10-29T15:20:13.460+0800: 0.305: [weak refs processing, 0.0000435 secs]2020-10-29T15:20:13.460+0800: 0.305: [class unloading, 0.0001904 secs]2020-10-29T15:20:13.460+0800: 0.305: [scrub symbol table, 0.0002957 secs]2020-10-29T15:20:13.461+0800: 0.306: [scrub string table, 0.0000859 secs][1 CMS-remark: 87038K(87424K)] 118853K(126720K), 0.0009651 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.461+0800: 0.306: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.461+0800: 0.306: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.461+0800: 0.306: [CMS-concurrent-reset-start]
   2020-10-29T15:20:13.461+0800: 0.306: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.462+0800: 0.307: [GC (Allocation Failure) 2020-10-29T15:20:13.462+0800: 0.307: [ParNew: 39149K->39149K(39296K), 0.0000147 secs]2020-10-29T15:20:13.462+0800: 0.307: [CMS: 87038K->86957K(87424K), 0.0184599 secs] 126187K->111279K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0185323 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
   2020-10-29T15:20:13.481+0800: 0.326: [GC (CMS Initial Mark) [1 CMS-initial-mark: 86957K(87424K)] 112293K(126720K), 0.0004879 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.481+0800: 0.326: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.482+0800: 0.327: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.482+0800: 0.327: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.483+0800: 0.327: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.483+0800: 0.328: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.483+0800: 0.328: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.483+0800: 0.328: [GC (CMS Final Remark) [YG occupancy: 34445 K (39296 K)]2020-10-29T15:20:13.483+0800: 0.328: [Rescan (parallel) , 0.0004094 secs]2020-10-29T15:20:13.483+0800: 0.328: [weak refs processing, 0.0000099 secs]2020-10-29T15:20:13.483+0800: 0.328: [class unloading, 0.0001765 secs]2020-10-29T15:20:13.483+0800: 0.328: [scrub symbol table, 0.0003380 secs]2020-10-29T15:20:13.484+0800: 0.329: [scrub string table, 0.0000866 secs][1 CMS-remark: 86957K(87424K)] 121403K(126720K), 0.0010761 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.484+0800: 0.329: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.484+0800: 0.329: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.484+0800: 0.329: [CMS-concurrent-reset-start]
   2020-10-29T15:20:13.484+0800: 0.329: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.485+0800: 0.330: [GC (Allocation Failure) 2020-10-29T15:20:13.485+0800: 0.330: [ParNew: 39050K->39050K(39296K), 0.0000143 secs]2020-10-29T15:20:13.485+0800: 0.330: [CMS: 86957K->87414K(87424K), 0.0150988 secs] 126008K->114207K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0151677 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
   2020-10-29T15:20:13.500+0800: 0.345: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87414K(87424K)] 115512K(126720K), 0.0005225 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.501+0800: 0.346: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.501+0800: 0.346: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.501+0800: 0.346: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.502+0800: 0.347: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.502+0800: 0.347: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.502+0800: 0.347: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.502+0800: 0.347: [GC (CMS Final Remark) [YG occupancy: 39079 K (39296 K)]2020-10-29T15:20:13.502+0800: 0.347: [Rescan (parallel) , 0.0004392 secs]2020-10-29T15:20:13.503+0800: 0.348: [weak refs processing, 0.0000150 secs]2020-10-29T15:20:13.503+0800: 0.348: [class unloading, 0.0002449 secs]2020-10-29T15:20:13.503+0800: 0.348: [scrub symbol table, 0.0003758 secs]2020-10-29T15:20:13.503+0800: 0.348: [scrub string table, 0.0001177 secs][1 CMS-remark: 87414K(87424K)] 126493K(126720K), 0.0012838 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.504+0800: 0.349: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.504+0800: 0.349: [Full GC (Allocation Failure) 2020-10-29T15:20:13.504+0800: 0.349: [CMS2020-10-29T15:20:13.504+0800: 0.349: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    (concurrent mode failure): 87414K->87146K(87424K), 0.0146222 secs] 126597K->117022K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0146843 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.521+0800: 0.366: [Full GC (Allocation Failure) 2020-10-29T15:20:13.521+0800: 0.366: [CMS: 87146K->87263K(87424K), 0.0147127 secs] 126236K->119007K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0147734 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.536+0800: 0.381: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87263K(87424K)] 119314K(126720K), 0.0004644 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.536+0800: 0.381: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.537+0800: 0.382: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.537+0800: 0.382: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.538+0800: 0.383: [Full GC (Allocation Failure) 2020-10-29T15:20:13.538+0800: 0.383: [CMS2020-10-29T15:20:13.538+0800: 0.383: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    (concurrent mode failure): 87335K->87335K(87424K), 0.0022096 secs] 126598K->120257K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0022591 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.541+0800: 0.386: [Full GC (Allocation Failure) 2020-10-29T15:20:13.541+0800: 0.386: [CMS: 87335K->87384K(87424K), 0.0058313 secs] 126521K->119595K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0059013 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.547+0800: 0.392: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87384K(87424K)] 119961K(126720K), 0.0003461 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.547+0800: 0.392: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.548+0800: 0.393: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.548+0800: 0.393: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.548+0800: 0.393: [Full GC (Allocation Failure) 2020-10-29T15:20:13.548+0800: 0.393: [CMS2020-10-29T15:20:13.549+0800: 0.394: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    (concurrent mode failure): 87384K->87407K(87424K), 0.0084865 secs] 126635K->121732K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0085379 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.558+0800: 0.403: [Full GC (Allocation Failure) 2020-10-29T15:20:13.558+0800: 0.403: [CMS: 87407K->87407K(87424K), 0.0020472 secs] 126694K->123485K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0020885 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.560+0800: 0.405: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87407K(87424K)] 123708K(126720K), 0.0007011 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.561+0800: 0.406: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.561+0800: 0.406: [Full GC (Allocation Failure) 2020-10-29T15:20:13.561+0800: 0.406: [CMS2020-10-29T15:20:13.563+0800: 0.408: [CMS-concurrent-mark: 0.001/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    (concurrent mode failure): 87407K->87094K(87424K), 0.0162370 secs] 126664K->123161K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0162885 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
   2020-10-29T15:20:13.578+0800: 0.423: [Full GC (Allocation Failure) 2020-10-29T15:20:13.578+0800: 0.423: [CMS: 87340K->87092K(87424K), 0.0056029 secs] 126626K->124596K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0056504 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.584+0800: 0.429: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87092K(87424K)] 124844K(126720K), 0.0005031 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.585+0800: 0.430: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.586+0800: 0.431: [Full GC (Allocation Failure) 2020-10-29T15:20:13.586+0800: 0.431: [CMS2020-10-29T15:20:13.588+0800: 0.433: [CMS-concurrent-mark: 0.001/0.003 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    (concurrent mode failure): 87092K->87020K(87424K), 0.0045234 secs] 126199K->124599K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0045708 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.591+0800: 0.435: [Full GC (Allocation Failure) 2020-10-29T15:20:13.591+0800: 0.435: [CMS: 87166K->87360K(87424K), 0.0111033 secs] 126319K->125292K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0111661 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.602+0800: 0.447: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87360K(87424K)] 125544K(126720K), 0.0004445 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.602+0800: 0.447: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.603+0800: 0.448: [Full GC (Allocation Failure) 2020-10-29T15:20:13.603+0800: 0.448: [CMS2020-10-29T15:20:13.605+0800: 0.450: [CMS-concurrent-mark: 0.001/0.003 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    (concurrent mode failure): 87360K->87277K(87424K), 0.0132126 secs] 126212K->124961K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0132810 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.616+0800: 0.461: [Full GC (Allocation Failure) 2020-10-29T15:20:13.616+0800: 0.461: [CMS: 87277K->87274K(87424K), 0.0120684 secs] 125906K->124638K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0121189 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.629+0800: 0.474: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87274K(87424K)] 125539K(126720K), 0.0007563 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.629+0800: 0.474: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.630+0800: 0.475: [Full GC (Allocation Failure) 2020-10-29T15:20:13.630+0800: 0.475: [CMS2020-10-29T15:20:13.632+0800: 0.477: [CMS-concurrent-mark: 0.001/0.003 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    (concurrent mode failure): 87346K->87303K(87424K), 0.0058106 secs] 126627K->125469K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0058573 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.636+0800: 0.481: [Full GC (Allocation Failure) 2020-10-29T15:20:13.636+0800: 0.481: [CMS: 87303K->87117K(87424K), 0.0141026 secs] 126505K->125646K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0141537 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.651+0800: 0.496: [Full GC (Allocation Failure) 2020-10-29T15:20:13.651+0800: 0.496: [CMS: 87117K->87117K(87424K), 0.0023291 secs] 125782K->125646K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0023971 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.653+0800: 0.498: [Full GC (Allocation Failure) 2020-10-29T15:20:13.653+0800: 0.498: [CMS: 87117K->87097K(87424K), 0.0109384 secs] 125646K->125626K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0109792 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
   2020-10-29T15:20:13.664+0800: 0.509: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87097K(87424K)] 125626K(126720K), 0.0006375 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.665+0800: 0.510: [CMS-concurrent-mark-start]
   2020-10-29T15:20:13.666+0800: 0.511: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.666+0800: 0.511: [CMS-concurrent-preclean-start]
   2020-10-29T15:20:13.667+0800: 0.511: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.667+0800: 0.512: [CMS-concurrent-abortable-preclean-start]
   2020-10-29T15:20:13.667+0800: 0.512: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.667+0800: 0.512: [GC (CMS Final Remark) [YG occupancy: 38561 K (39296 K)]2020-10-29T15:20:13.667+0800: 0.512: [Rescan (parallel) , 0.0007422 secs]2020-10-29T15:20:13.668+0800: 0.513: [weak refs processing, 0.0000138 secs]2020-10-29T15:20:13.668+0800: 0.513: [class unloading, 0.0002826 secs]2020-10-29T15:20:13.668+0800: 0.513: [scrub symbol table, 0.0002950 secs]2020-10-29T15:20:13.668+0800: 0.513: [scrub string table, 0.0000860 secs][1 CMS-remark: 87097K(87424K)] 125659K(126720K), 0.0015322 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.668+0800: 0.513: [CMS-concurrent-sweep-start]
   2020-10-29T15:20:13.669+0800: 0.514: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-29T15:20:13.669+0800: 0.514: [CMS-concurrent-reset-start]
   2020-10-29T15:20:13.669+0800: 0.514: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   Heap
    par new generation   total 39296K, used 38624K [0x00000000f8000000, 0x00000000faaa0000, 0x00000000faaa0000)
     eden space 34944K, 100% used [0x00000000f8000000, 0x00000000fa220000, 0x00000000fa220000)
     from space 4352K,  84% used [0x00000000fa660000, 0x00000000fa9f83a0, 0x00000000faaa0000)
     to   space 4352K,   0% used [0x00000000fa220000, 0x00000000fa220000, 0x00000000fa660000)
    concurrent mark-sweep generation total 87424K, used 675K [0x00000000faaa0000, 0x0000000100000000, 0x0000000100000000)
    Metaspace       used 2866K, capacity 4486K, committed 4864K, reserved 1056768K
     class space    used 310K, capacity 386K, committed 512K, reserved 1048576K
   
   Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
           at com.mariston.weektwo.GCLogAnalysis.generateGarbage(GCLogAnalysis.java:53)
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
CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:MaxNewSize=44740608 -XX:MaxTenuringThreshold=6 -XX:NewSize=44740608 -XX:OldPLABSize=16 -XX:OldSize=89477120 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
```
+ -XX:InitialHeapSize=134217728 初始堆大小:128M(134217728/(1024*1024))
+ -XX:MaxHeapSize=134217728 最大堆大小:128M(134217728/(1024*1024))
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

**年轻代GC(Minor GC)**
```cmd
2020-10-29T15:20:13.285+0800: 0.130: [GC (Allocation Failure) 2020-10-29T15:20:13.285+0800: 0.130: [ParNew: 34911K->4352K(39296K), 0.0035931 secs] 34911K->12618K(126720K), 0.0038949 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
```
+ 2020-10-29T15:20:13.285+0800: 0.130 =>GC的日期、时间戳、时区
+ GC (Allocation Failure) => 触发GC的原因：给对象分配堆内存失败
+ ParNew => ParNew : 并行的新生代收集器，复制算法，响应速度优先，会触发STW事件
+ \[ParNew: 34911K->4352K(39296K), 0.0035931 secs] => 年轻代GC的内存变化：原大小39296K，已使用大小34911K，GC后大小4352K(年轻代在内存比例达到88.8%时触发了GC，年轻代内存变化大小：34911K-4352K=30559K)
+ 34911K->12618K(126720K) => 堆内存的变化：原大小126720K，已使用大小34911K，GC后大小12618K(回收大小：34911K-12618K=22293K，老年代增加大小：30559K-22293K=8266K)
+ 0.0038949 secs => 这次年轻代GC耗费时间3.89毫秒
+ \[Times: user=0.00 sys=0.00, real=0.00 secs] => user=0.00:CPU花费的总时间为0秒 ,sys=0.09:系统调用时间为0秒，real=0.00:应用暂停时间为0秒

**CMS GC**
```cmd
2020-10-29T15:20:13.335+0800: 0.180: [GC (CMS Initial Mark) [1 CMS-initial-mark: 47351K(87424K)] 51847K(126720K), 0.0002359 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-29T15:20:13.335+0800: 0.180: [CMS-concurrent-mark-start]
2020-10-29T15:20:13.336+0800: 0.181: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-29T15:20:13.336+0800: 0.181: [CMS-concurrent-preclean-start]
2020-10-29T15:20:13.337+0800: 0.182: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-29T15:20:13.337+0800: 0.182: [CMS-concurrent-abortable-preclean-start] 
2020-10-29T15:20:13.374+0800: 0.219: [CMS-concurrent-abortable-preclean: 0.001/0.037 secs] [Times: user=0.13 sys=0.00, real=0.04 secs] 
2020-10-29T15:20:13.374+0800: 0.219: [GC (CMS Final Remark) [YG occupancy: 5256 K (39296 K)]2020-10-29T15:20:13.374+0800: 0.219: [Rescan (parallel) , 0.0003554 secs]2020-10-29T15:20:13.374+0800: 0.219: [weak refs processing, 0.0000161 secs]2020-10-29T15:20:13.374+0800: 0.219: [class unloading, 0.0002822 secs]2020-10-29T15:20:13.375+0800: 0.220: [scrub symbol table, 0.0003002 secs]2020-10-29T15:20:13.375+0800: 0.220: [scrub string table, 0.0000865 secs][1 CMS-remark: 84129K(87424K)] 89385K(126720K), 0.0011071 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-29T15:20:13.375+0800: 0.220: [CMS-concurrent-sweep-start]
2020-10-29T15:20:13.376+0800: 0.221: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-29T15:20:13.376+0800: 0.221: [CMS-concurrent-reset-start]
2020-10-29T15:20:13.376+0800: 0.221: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
```
+ GC (CMS Initial Mark) => CMS 初始标记阶段
+ \[1 CMS-initial-mark: 47351K(87424K)] 51847K(126720K), 0.0002359 secs] =>
+ \[Times: user=0.00 sys=0.00, real=0.00 secs] => 初始标记耗时基本为0秒
+ CMS-concurrent-mark-start => 并发标记开始
+ \[CMS-concurrent-mark: 0.001/0.001 secs] \[Times: user=0.00 sys=0.00, real=0.00 secs] => 并发标记耗时1毫秒
+ CMS-concurrent-preclean-start => 并发预清理开始
+ \[CMS-concurrent-preclean: 0.000/0.000 secs] \[Times: user=0.00 sys=0.00, real=0.00 secs] => 并发预清理耗时0秒
+ CMS-concurrent-abortable-preclean-start => 并发可中止预清理开始
+ \[CMS-concurrent-abortable-preclean: 0.001/0.037 secs] \[Times: user=0.13 sys=0.00, real=0.04 secs] => 并发可中止预清理耗时37毫秒
+ \[GC (CMS Final Remark) 
+ \[YG occupancy: 5256 K (39296 K)]
+ 2020-10-29T15:20:13.374+0800: 0.219: \[Rescan (parallel) , 0.0003554 secs] => 重新并行扫描
+ 2020-10-29T15:20:13.374+0800: 0.219: \[weak refs processing, 0.0000161 secs] =>弱引用处理
+ 2020-10-29T15:20:13.374+0800: 0.219: \[class unloading, 0.0002822 secs] => 卸载类
+ 2020-10-29T15:20:13.375+0800: 0.220: \[scrub symbol table, 0.0003002 secs] =>擦除符号表
+ 2020-10-29T15:20:13.375+0800: 0.220: \[scrub string table, 0.0000865 secs] =>擦除字符表
+ \[1 CMS-remark: 84129K(87424K)] 89385K(126720K), 0.0011071 secs] 
+ \[Times: user=0.00 sys=0.00, real=0.00 secs]
+ \[CMS-concurrent-sweep-start] => 并发清除开始
+ \[CMS-concurrent-sweep: 0.000/0.000 secs] \[Times: user=0.00 sys=0.00, real=0.00 secs] => 并发清除
+ \[CMS-concurrent-reset-start] => 并发重置开始
+ \[CMS-concurrent-reset: 0.000/0.000 secs] \[Times: user=0.00 sys=0.00, real=0.00 secs] => 并发重置

**Full GC**
```cmd
[Full GC (Allocation Failure) 2020-10-29T15:20:13.504+0800: 0.349: [CMS2020-10-29T15:20:13.504+0800: 0.349: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Allocation Failure) 2020-10-29T15:20:13.653+0800: 0.498: [CMS: 87117K->87097K(87424K), 0.0109384 secs] 125646K->125626K(126720K), [Metaspace: 2835K->2835K(1056768K)], 0.0109792 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
```
+ CMS => ConcMarkSweep Old Gen: 并发的老年代收集器，标记清除算法(mark-sweep)，响应速度优先，没有明显的STW
+ 这次Full GC ,几乎没有回收多少垃圾

**总 结(ConcMarkSweepGC)**
+ 1秒钟内发生了13次年轻代GC、16次Full GC
