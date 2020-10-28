# 调优分析
### GC日志解读与分析
垃圾收集器 | 最大堆大小(-Xmx) | 初始堆大小(-Xms)|年轻代大小(-Xmn) | Young GC 次/sec | Full GC 次/sec | 异常
---- | ---- | ---- | ---- | ---- | ---- | ---- |
Parallel Scavenge+Parallel Old | 4063M | 254M | 932.5M | 10 | 3 | 无
Parallel Scavenge+Parallel Old | 128M | 128M | 28.5M | 10 | 25 | OOM
Parallel Scavenge+Parallel Old | 512M | 254M | 113M | 26 | 13 | 无
Parallel Scavenge+Parallel Old | 1024M | 254M | 233M | 25 | 5 | 无
Parallel Scavenge+Parallel Old | 2048M | 254M | 452.5M | 12 | 3 | 无
Parallel Scavenge+Parallel Old | 4086M | 254M | 1093.5M | 10 | 3 | 无
