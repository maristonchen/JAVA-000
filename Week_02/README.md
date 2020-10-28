# 调优分析
### GC日志解读与分析
* 执行命令
```cmd
java -Xloggc:gc.demo.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
```
1. JDK8环境下，默认执行结果
```cmd
$ java -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T17:03:13.398+0800: [GC (Allocation Failure) [PSYoungGen: 65024K->10750K(75776K)] 65024K->23536K(249344K), 0.0061098 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-27T17:03:13.418+0800: [GC (Allocation Failure) [PSYoungGen: 75512K->10748K(140800K)] 88298K->44603K(314368K), 0.0076770 secs] [Times: user=0.05 sys=0.03, real=0.01 secs]
2020-10-27T17:03:13.472+0800: [GC (Allocation Failure) [PSYoungGen: 140170K->10746K(140800K)] 174025K->81780K(314368K), 0.0120069 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-27T17:03:13.503+0800: [GC (Allocation Failure) [PSYoungGen: 140471K->10745K(270848K)] 211505K->129128K(444416K), 0.0128765 secs] [Times: user=0.06 sys=0.02, real=0.01 secs]
2020-10-27T17:03:13.516+0800: [Full GC (Ergonomics) [PSYoungGen: 10745K->0K(270848K)] [ParOldGen: 118383K->119331K(254464K)] 129128K->119331K(525312K), [Metaspace: 2811K->2811K(1056768K)], 0.0181576 secs] [Times: user=0.02 sys=0.01, real=0.02 secs]
2020-10-27T17:03:13.619+0800: [GC (Allocation Failure) [PSYoungGen: 260096K->10751K(270848K)] 379427K->195387K(525312K), 0.0196941 secs] [Times: user=0.00 sys=0.13, real=0.02 secs]
2020-10-27T17:03:13.639+0800: [Full GC (Ergonomics) [PSYoungGen: 10751K->0K(270848K)] [ParOldGen: 184636K->171966K(354304K)] 195387K->171966K(625152K), [Metaspace: 2811K->2811K(1056768K)], 0.0226991 secs] [Times: user=0.22 sys=0.02, real=0.02 secs]
2020-10-27T17:03:13.694+0800: [GC (Allocation Failure) [PSYoungGen: 260087K->86005K(519680K)] 432054K->261963K(873984K), 0.0231966 secs] [Times: user=0.03 sys=0.05, real=0.02 secs]
2020-10-27T17:03:13.844+0800: [GC (Allocation Failure) [PSYoungGen: 519669K->103921K(537600K)] 695627K->360835K(891904K), 0.0464103 secs] [Times: user=0.06 sys=0.23, real=0.05 secs]
2020-10-27T17:03:13.944+0800: [GC (Allocation Failure) [PSYoungGen: 537585K->162300K(846336K)] 794499K->447294K(1200640K), 0.0432945 secs] [Times: user=0.03 sys=0.19, real=0.04 secs]
2020-10-27T17:03:13.987+0800: [Full GC (Ergonomics) [PSYoungGen: 162300K->0K(846336K)] [ParOldGen: 284993K->300191K(516608K)] 447294K->300191K(1362944K), [Metaspace: 2811K->2811K(1056768K)], 0.0410137 secs] [Times: user=0.31 sys=0.00, real=0.04 secs]
2020-10-27T17:03:14.142+0800: [GC (Allocation Failure) [PSYoungGen: 684032K->180385K(887296K)] 984223K->480577K(1403904K), 0.0425173 secs] [Times: user=0.03 sys=0.30, real=0.04 secs]
2020-10-27T17:03:14.272+0800: [GC (Allocation Failure) [PSYoungGen: 864417K->228342K(1054208K)] 1164609K->573624K(1570816K), 0.0588921 secs] [Times: user=0.11 sys=0.22, real=0.06 secs]
执行结束!共生成对象次数:12261
Heap
 PSYoungGen      total 1054208K, used 379174K [0x000000076b580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 825856K, 18% used [0x000000076b580000,0x00000007748cc050,0x000000079dc00000)
  from space 228352K, 99% used [0x00000007b2100000,0x00000007bfffdb48,0x00000007c0000000)
  to   space 280576K, 0% used [0x000000079dc00000,0x000000079dc00000,0x00000007aee00000)
 ParOldGen       total 516608K, used 345281K [0x00000006c2000000, 0x00000006e1880000, 0x000000076b580000)
  object space 516608K, 66% used [0x00000006c2000000,0x00000006d71306f0,0x00000006e1880000)
 Metaspace       used 2818K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 305K, capacity 386K, committed 512K, reserved 1048576K
```
2. 
 
