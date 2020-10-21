$ javap -c -verbose com.mariston.weekone.Hello
Classfile /E:/study/Java/exercise/Week_01/target/classes/com/mariston/weekone/Hello.class
  Last modified 2020-10-20; size 865 bytes
  MD5 checksum 724dde9d2aef291671a7a2a1cb40c0da
  Compiled from "Hello.java"
public class com.mariston.weekone.Hello
  minor version: 0
  major version: 52   //版本号52.0，java8
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool: //常量池
   #1 = Methodref          #11.#39        // java/lang/Object."<init>":()V
   #2 = Long               10l
   #4 = Float              10.5f
   #5 = Double             4.01d
   #7 = Fieldref           #40.#41        // java/lang/System.out:Ljava/io/PrintStream;
   #8 = Methodref          #42.#43        // java/io/PrintStream.println:(D)V
   #9 = Methodref          #42.#44        // java/io/PrintStream.println:(I)V
  #10 = Class              #45            // com/mariston/weekone/Hello
  #11 = Class              #46            // java/lang/Object
  #12 = Utf8               <init>
  #13 = Utf8               ()V
  #14 = Utf8               Code
  #15 = Utf8               LineNumberTable
  #16 = Utf8               LocalVariableTable
  #17 = Utf8               this
  #18 = Utf8               Lcom/mariston/weekone/Hello;
  #19 = Utf8               main
  #20 = Utf8               ([Ljava/lang/String;)V
  #21 = Utf8               num
  #22 = Utf8               I
  #23 = Utf8               args
  #24 = Utf8               [Ljava/lang/String;
  #25 = Utf8               a
  #26 = Utf8               b
  #27 = Utf8               J
  #28 = Utf8               c
  #29 = Utf8               F
  #30 = Utf8               d
  #31 = Utf8               D
  #32 = Utf8               array
  #33 = Utf8               [I
  #34 = Utf8               StackMapTable
  #35 = Class              #24            // "[Ljava/lang/String;"
  #36 = Class              #33            // "[I"
  #37 = Utf8               SourceFile
  #38 = Utf8               Hello.java
  #39 = NameAndType        #12:#13        // "<init>":()V
  #40 = Class              #47            // java/lang/System
  #41 = NameAndType        #48:#49        // out:Ljava/io/PrintStream;
  #42 = Class              #50            // java/io/PrintStream
  #43 = NameAndType        #51:#52        // println:(D)V
  #44 = NameAndType        #51:#53        // println:(I)V
  #45 = Utf8               com/mariston/weekone/Hello
  #46 = Utf8               java/lang/Object
  #47 = Utf8               java/lang/System
  #48 = Utf8               out
  #49 = Utf8               Ljava/io/PrintStream;
  #50 = Utf8               java/io/PrintStream
  #51 = Utf8               println
  #52 = Utf8               (D)V
  #53 = Utf8               (I)V
{ //方法区
  public com.mariston.weekone.Hello();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V  //调用父类Object无参构造方法
         4: return
      LineNumberTable:  //方法所在行号
        line 10: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0        5          0      this       Lcom/mariston/weekone/Hello;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=12, args_size=1
         0: iconst_1
         1: istore_1
         2: ldc2_w        #2                  // long 10l
         5: lstore_2
         6: ldc           #4                  // float 10.5f
         8: fstore        4
        10: ldc2_w        #5                  // double 4.01d
        13: dstore        5
        15: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
        18: iload_1
        19: i2l                                      // int cast to long
        20: lload_2
        21: ladd                                    // 将int 类型的1转换成long 类型后，与 10L 相加 
        22: l2f                                     //long cast to float
        23: fload         4
        25: fsub                                    //相减
        26: f2d                                       //float cast to double
        27: dload         5
        29: dmul                                    //  相乘
        30: invokevirtual #8                  // Method java/io/PrintStream.println:(D)V
        33: iconst_5
        34: newarray       int                  //new int array
        36: dup                                     //复制栈顶操作数，并入栈
        37: iconst_0
        38: iconst_2
        39: iastore
        40: dup
        41: iconst_1
        42: iconst_4
        43: iastore
        44: dup
        45: iconst_2
        46: iconst_5
        47: iastore
        48: dup
        49: iconst_3
        50: iconst_4
        51: iastore
        52: dup
        53: iconst_4
        54: iconst_1
        55: iastore
        56: astore        7
        58: aload         7
        60: astore        8
        62: aload         8
        64: arraylength
        65: istore        9
        67: iconst_0
        68: istore        10
        70: iload         10
        72: iload         9
        74: if_icmpge     104
        77: aload         8
        79: iload         10
        81: iaload
        82: istore        11
        84: iload         11
        86: iconst_4
        87: if_icmpne     98
        90: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
        93: iload         11
        95: invokevirtual #9                  // Method java/io/PrintStream.println:(I)V
        98: iinc          10, 1
       101: goto          70
       104: return
      LineNumberTable:
        line 14: 0
        line 16: 2
        line 18: 6
        line 20: 10
        line 22: 15
        line 24: 33
        line 25: 58
        line 26: 84
        line 27: 90
        line 25: 98
        line 30: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      14    11   num   I
            0     105     0  args   [Ljava/lang/String;
            2     103     1     a   I
            6      99     2     b   J
           10      95     4     c   F
           15      90     5     d   D
           58      47     7 array   [I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class "[Ljava/lang/String;", int, long, float, double, class "[I", class "[I", int, int ]
          stack = []
        frame_type = 27 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
}
SourceFile: "Hello.java"
