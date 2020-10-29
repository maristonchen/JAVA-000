# 系统默认GC打印日志
1. 执行命令 ：
    ```cmd
    java -XX:+UseConcMarkSweepGC -Xmx512m -Xms512m -Xloggc:gc.cms.512.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps com.mariston.weektwo.GCLogAnalysis
    ```
2. 执行结果：
    ```cmd
   Java HotSpot(TM) 64-Bit Server VM (25.152-b16) for windows-amd64 JRE (1.8.0_152-b16), built on Sep 14 2017 02:29:36 by "java_re" with MS VC++ 10.0 (VS2010)
   Memory: 4k page, physical 16643552k(8518260k free), swap 18740704k(4275332k free)
   CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:MaxNewSize=178958336 -XX:MaxTenuringThreshold=6 -XX:NewSize=178958336 -XX:OldPLABSize=16 -XX:OldSize=357912576 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC 
   2020-10-30T00:38:51.887+0800: 0.306: [GC (Allocation Failure) 2020-10-30T00:38:51.887+0800: 0.306: [ParNew: 139776K->17469K(157248K), 0.0108358 secs] 139776K->46786K(506816K), 0.0110062 secs] [Times: user=0.00 sys=0.09, real=0.01 secs] 
   2020-10-30T00:38:51.918+0800: 0.337: [GC (Allocation Failure) 2020-10-30T00:38:51.918+0800: 0.337: [ParNew: 157245K->17472K(157248K), 0.0165687 secs] 186562K->91997K(506816K), 0.0166659 secs] [Times: user=0.00 sys=0.11, real=0.02 secs] 
   2020-10-30T00:38:51.955+0800: 0.374: [GC (Allocation Failure) 2020-10-30T00:38:51.955+0800: 0.374: [ParNew: 157248K->17472K(157248K), 0.0318676 secs] 231773K->139679K(506816K), 0.0319686 secs] [Times: user=0.23 sys=0.00, real=0.03 secs] 
   2020-10-30T00:38:52.007+0800: 0.426: [GC (Allocation Failure) 2020-10-30T00:38:52.007+0800: 0.426: [ParNew: 157248K->17472K(157248K), 0.0304850 secs] 279455K->183371K(506816K), 0.0305472 secs] [Times: user=0.17 sys=0.06, real=0.03 secs] 
   2020-10-30T00:38:52.055+0800: 0.474: [GC (Allocation Failure) 2020-10-30T00:38:52.055+0800: 0.474: [ParNew: 157248K->17471K(157248K), 0.0317897 secs] 323147K->233691K(506816K), 0.0318536 secs] [Times: user=0.13 sys=0.06, real=0.03 secs] 
   2020-10-30T00:38:52.087+0800: 0.506: [GC (CMS Initial Mark) [1 CMS-initial-mark: 216220K(349568K)] 234262K(506816K), 0.0002210 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.087+0800: 0.506: [CMS-concurrent-mark-start]
   2020-10-30T00:38:52.089+0800: 0.508: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.089+0800: 0.508: [CMS-concurrent-preclean-start]
   2020-10-30T00:38:52.089+0800: 0.508: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.089+0800: 0.508: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:38:52.104+0800: 0.523: [GC (Allocation Failure) 2020-10-30T00:38:52.104+0800: 0.523: [ParNew: 157247K->17470K(157248K), 0.0270519 secs] 373467K->274251K(506816K), 0.0271153 secs] [Times: user=0.22 sys=0.00, real=0.03 secs] 
   2020-10-30T00:38:52.148+0800: 0.567: [GC (Allocation Failure) 2020-10-30T00:38:52.148+0800: 0.567: [ParNew: 157203K->17471K(157248K), 0.0304148 secs] 413984K->320831K(506816K), 0.0304736 secs] [Times: user=0.17 sys=0.08, real=0.03 secs] 
   2020-10-30T00:38:52.196+0800: 0.615: [GC (Allocation Failure) 2020-10-30T00:38:52.196+0800: 0.615: [ParNew: 157247K->157247K(157248K), 0.0000171 secs]2020-10-30T00:38:52.196+0800: 0.615: [CMS2020-10-30T00:38:52.196+0800: 0.615: [CMS-concurrent-abortable-preclean: 0.004/0.107 secs] [Times: user=0.44 sys=0.08, real=0.11 secs] 
    (concurrent mode failure): 303359K->247264K(349568K), 0.0344957 secs] 460607K->247264K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0345906 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
   2020-10-30T00:38:52.249+0800: 0.668: [GC (Allocation Failure) 2020-10-30T00:38:52.249+0800: 0.668: [ParNew: 139776K->17470K(157248K), 0.0073602 secs] 387040K->296453K(506816K), 0.0074483 secs] [Times: user=0.11 sys=0.01, real=0.01 secs] 
   2020-10-30T00:38:52.256+0800: 0.675: [GC (CMS Initial Mark) [1 CMS-initial-mark: 278983K(349568K)] 296610K(506816K), 0.0003330 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.257+0800: 0.676: [CMS-concurrent-mark-start]
   2020-10-30T00:38:52.258+0800: 0.677: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.258+0800: 0.677: [CMS-concurrent-preclean-start]
   2020-10-30T00:38:52.258+0800: 0.677: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.259+0800: 0.678: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:38:52.274+0800: 0.693: [GC (Allocation Failure) 2020-10-30T00:38:52.274+0800: 0.693: [ParNew: 157246K->17471K(157248K), 0.0212942 secs] 436229K->346451K(506816K), 0.0213953 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
   2020-10-30T00:38:52.297+0800: 0.716: [CMS-concurrent-abortable-preclean: 0.002/0.038 secs] [Times: user=0.14 sys=0.00, real=0.04 secs] 
   2020-10-30T00:38:52.297+0800: 0.716: [GC (CMS Final Remark) [YG occupancy: 28602 K (157248 K)]2020-10-30T00:38:52.297+0800: 0.716: [Rescan (parallel) , 0.0007053 secs]2020-10-30T00:38:52.298+0800: 0.717: [weak refs processing, 0.0000253 secs]2020-10-30T00:38:52.298+0800: 0.717: [class unloading, 0.0002091 secs]2020-10-30T00:38:52.298+0800: 0.717: [scrub symbol table, 0.0003042 secs]2020-10-30T00:38:52.298+0800: 0.717: [scrub string table, 0.0000965 secs][1 CMS-remark: 328980K(349568K)] 357583K(506816K), 0.0014207 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.299+0800: 0.718: [CMS-concurrent-sweep-start]
   2020-10-30T00:38:52.299+0800: 0.718: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.299+0800: 0.718: [CMS-concurrent-reset-start]
   2020-10-30T00:38:52.299+0800: 0.718: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.314+0800: 0.733: [GC (Allocation Failure) 2020-10-30T00:38:52.314+0800: 0.733: [ParNew: 157247K->157247K(157248K), 0.0000171 secs]2020-10-30T00:38:52.314+0800: 0.733: [CMS: 294910K->302967K(349568K), 0.0452533 secs] 452157K->302967K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0453440 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-30T00:38:52.360+0800: 0.779: [GC (CMS Initial Mark) [1 CMS-initial-mark: 302967K(349568K)] 306371K(506816K), 0.0008257 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.360+0800: 0.779: [CMS-concurrent-mark-start]
   2020-10-30T00:38:52.363+0800: 0.782: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.363+0800: 0.782: [CMS-concurrent-preclean-start]
   2020-10-30T00:38:52.363+0800: 0.782: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.363+0800: 0.782: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:38:52.377+0800: 0.796: [GC (Allocation Failure) 2020-10-30T00:38:52.377+0800: 0.796: [ParNew: 139735K->17471K(157248K), 0.0078377 secs] 442702K->349458K(506816K), 0.0079133 secs] [Times: user=0.09 sys=0.02, real=0.01 secs] 
   2020-10-30T00:38:52.386+0800: 0.805: [CMS-concurrent-abortable-preclean: 0.001/0.023 secs] [Times: user=0.13 sys=0.02, real=0.02 secs] 
   2020-10-30T00:38:52.386+0800: 0.805: [GC (CMS Final Remark) [YG occupancy: 24053 K (157248 K)]2020-10-30T00:38:52.386+0800: 0.805: [Rescan (parallel) , 0.0006866 secs]2020-10-30T00:38:52.387+0800: 0.806: [weak refs processing, 0.0000110 secs]2020-10-30T00:38:52.387+0800: 0.806: [class unloading, 0.0002409 secs]2020-10-30T00:38:52.387+0800: 0.806: [scrub symbol table, 0.0003906 secs]2020-10-30T00:38:52.388+0800: 0.807: [scrub string table, 0.0000956 secs][1 CMS-remark: 331986K(349568K)] 356040K(506816K), 0.0015003 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.388+0800: 0.807: [CMS-concurrent-sweep-start]
   2020-10-30T00:38:52.389+0800: 0.808: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.389+0800: 0.808: [CMS-concurrent-reset-start]
   2020-10-30T00:38:52.389+0800: 0.808: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.405+0800: 0.824: [GC (Allocation Failure) 2020-10-30T00:38:52.405+0800: 0.824: [ParNew: 157247K->157247K(157248K), 0.0000173 secs]2020-10-30T00:38:52.405+0800: 0.824: [CMS: 331601K->324737K(349568K), 0.0472320 secs] 488849K->324737K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0473261 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-30T00:38:52.453+0800: 0.872: [GC (CMS Initial Mark) [1 CMS-initial-mark: 324737K(349568K)] 328279K(506816K), 0.0006763 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.453+0800: 0.872: [CMS-concurrent-mark-start]
   2020-10-30T00:38:52.455+0800: 0.874: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.455+0800: 0.874: [CMS-concurrent-preclean-start]
   2020-10-30T00:38:52.455+0800: 0.874: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.455+0800: 0.874: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:38:52.471+0800: 0.890: [GC (Allocation Failure) 2020-10-30T00:38:52.471+0800: 0.890: [ParNew: 139776K->139776K(157248K), 0.0000179 secs]2020-10-30T00:38:52.471+0800: 0.890: [CMS2020-10-30T00:38:52.471+0800: 0.890: [CMS-concurrent-abortable-preclean: 0.001/0.016 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
    (concurrent mode failure): 324737K->331585K(349568K), 0.0481145 secs] 464513K->331585K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0482048 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-30T00:38:52.537+0800: 0.956: [GC (Allocation Failure) 2020-10-30T00:38:52.537+0800: 0.956: [ParNew: 139639K->139639K(157248K), 0.0000173 secs]2020-10-30T00:38:52.537+0800: 0.956: [CMS: 331585K->342366K(349568K), 0.0532959 secs] 471224K->342366K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0533994 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-30T00:38:52.590+0800: 1.009: [GC (CMS Initial Mark) [1 CMS-initial-mark: 342366K(349568K)] 345287K(506816K), 0.0007102 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.591+0800: 1.010: [CMS-concurrent-mark-start]
   2020-10-30T00:38:52.593+0800: 1.012: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.593+0800: 1.012: [CMS-concurrent-preclean-start]
   2020-10-30T00:38:52.593+0800: 1.012: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.593+0800: 1.012: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:38:52.593+0800: 1.012: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.594+0800: 1.013: [GC (CMS Final Remark) [YG occupancy: 19352 K (157248 K)]2020-10-30T00:38:52.594+0800: 1.013: [Rescan (parallel) , 0.0006727 secs]2020-10-30T00:38:52.594+0800: 1.013: [weak refs processing, 0.0000124 secs]2020-10-30T00:38:52.594+0800: 1.013: [class unloading, 0.0002177 secs]2020-10-30T00:38:52.594+0800: 1.014: [scrub symbol table, 0.0005134 secs]2020-10-30T00:38:52.595+0800: 1.014: [scrub string table, 0.0000939 secs][1 CMS-remark: 342366K(349568K)] 361718K(506816K), 0.0015804 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.595+0800: 1.014: [CMS-concurrent-sweep-start]
   2020-10-30T00:38:52.596+0800: 1.015: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.596+0800: 1.015: [CMS-concurrent-reset-start]
   2020-10-30T00:38:52.597+0800: 1.016: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.610+0800: 1.029: [GC (Allocation Failure) 2020-10-30T00:38:52.610+0800: 1.029: [ParNew: 139776K->139776K(157248K), 0.0000175 secs]2020-10-30T00:38:52.610+0800: 1.029: [CMS: 342093K->344703K(349568K), 0.0498387 secs] 481869K->344703K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0499297 secs] [Times: user=0.06 sys=0.00, real=0.05 secs] 
   2020-10-30T00:38:52.660+0800: 1.079: [GC (CMS Initial Mark) [1 CMS-initial-mark: 344703K(349568K)] 348362K(506816K), 0.0008132 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.661+0800: 1.080: [CMS-concurrent-mark-start]
   2020-10-30T00:38:52.663+0800: 1.082: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.663+0800: 1.082: [CMS-concurrent-preclean-start]
   2020-10-30T00:38:52.664+0800: 1.083: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.664+0800: 1.083: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:38:52.664+0800: 1.083: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.664+0800: 1.083: [GC (CMS Final Remark) [YG occupancy: 19499 K (157248 K)]2020-10-30T00:38:52.664+0800: 1.083: [Rescan (parallel) , 0.0008253 secs]2020-10-30T00:38:52.665+0800: 1.084: [weak refs processing, 0.0000119 secs]2020-10-30T00:38:52.665+0800: 1.084: [class unloading, 0.0003067 secs]2020-10-30T00:38:52.665+0800: 1.084: [scrub symbol table, 0.0003085 secs]2020-10-30T00:38:52.665+0800: 1.084: [scrub string table, 0.0000971 secs][1 CMS-remark: 344703K(349568K)] 364202K(506816K), 0.0016125 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.666+0800: 1.085: [CMS-concurrent-sweep-start]
   2020-10-30T00:38:52.666+0800: 1.085: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.666+0800: 1.085: [CMS-concurrent-reset-start]
   2020-10-30T00:38:52.667+0800: 1.086: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.681+0800: 1.100: [GC (Allocation Failure) 2020-10-30T00:38:52.681+0800: 1.100: [ParNew: 139776K->139776K(157248K), 0.0000495 secs]2020-10-30T00:38:52.681+0800: 1.100: [CMS: 342951K->349424K(349568K), 0.0523182 secs] 482727K->354710K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0524573 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-30T00:38:52.733+0800: 1.152: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349424K(349568K)] 359060K(506816K), 0.0005538 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.734+0800: 1.153: [CMS-concurrent-mark-start]
   2020-10-30T00:38:52.735+0800: 1.154: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.735+0800: 1.154: [CMS-concurrent-preclean-start]
   2020-10-30T00:38:52.737+0800: 1.156: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.737+0800: 1.156: [CMS-concurrent-abortable-preclean-start]
   2020-10-30T00:38:52.737+0800: 1.156: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.737+0800: 1.156: [GC (CMS Final Remark) [YG occupancy: 31415 K (157248 K)]2020-10-30T00:38:52.737+0800: 1.156: [Rescan (parallel) , 0.0007089 secs]2020-10-30T00:38:52.738+0800: 1.157: [weak refs processing, 0.0000116 secs]2020-10-30T00:38:52.738+0800: 1.157: [class unloading, 0.0002124 secs]2020-10-30T00:38:52.738+0800: 1.157: [scrub symbol table, 0.0003136 secs]2020-10-30T00:38:52.738+0800: 1.157: [scrub string table, 0.0001117 secs][1 CMS-remark: 349424K(349568K)] 380840K(506816K), 0.0014220 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.739+0800: 1.158: [CMS-concurrent-sweep-start]
   2020-10-30T00:38:52.739+0800: 1.158: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.739+0800: 1.158: [CMS-concurrent-reset-start]
   2020-10-30T00:38:52.740+0800: 1.159: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.757+0800: 1.176: [GC (Allocation Failure) 2020-10-30T00:38:52.757+0800: 1.176: [ParNew: 156967K->156967K(157248K), 0.0000168 secs]2020-10-30T00:38:52.757+0800: 1.176: [CMS: 349330K->349525K(349568K), 0.0500234 secs] 506298K->354202K(506816K), [Metaspace: 2835K->2835K(1056768K)], 0.0501097 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
   2020-10-30T00:38:52.808+0800: 1.227: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349525K(349568K)] 357550K(506816K), 0.0007727 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
   2020-10-30T00:38:52.809+0800: 1.228: [CMS-concurrent-mark-start]
   Heap
    par new generation   total 157248K, used 10820K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
     eden space 139776K,   7% used [0x00000000e0000000, 0x00000000e0a91330, 0x00000000e8880000)
     from space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
     to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
    concurrent mark-sweep generation total 349568K, used 349525K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
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
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:MaxNewSize=178958336 -XX:MaxTenuringThreshold=6 -XX:NewSize=178958336 -XX:OldPLABSize=16 -XX:OldSize=357912576 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
```
+ -XX:InitialHeapSize=536870912 初始堆大小:512M(536870912/(1024*1024))
+ -XX:MaxHeapSize=536870912 最大堆大小:512M(536870912/(1024*1024))
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


**总 结(ConcMarkSweepGC)**
+ 1秒钟内发生了13次年轻代GC、16次Full GC
