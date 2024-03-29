# Java 面试题：百度前200页都在这里了
> 出处: http://www.importnew.com/27326.html


## 操作系统中 heap 和 stack 的区别
	heap -> 堆
	stack -> 栈
	堆栈是两种数据结构。堆栈都是一种数据项按序排列的数据结构，只能在一端(称为栈顶(top))对数据项进行插入和删除。在单片机应用中，堆栈是个特殊的存储区，主要功能是暂时存放数据和地址，通常用来保护断点和现场。
	要点：
	堆，队列优先,先进先出（FIFO—first in first out） 。
	栈，先进后出(FILO—First-In/Last-Out)

### 堆和栈的区别：
#### 一、堆栈空间分配区别：
1. 栈（操作系统）：由操作系统自动分配释放 ，存放函数的参数值，局部变量的值等。其操作方式类似于数据结构中的栈； 
2. 堆（操作系统）： 一般由程序员分配释放， 若程序员不释放，程序结束时可能由OS回收，分配方式倒是类似于链表。

#### 二、堆栈缓存方式区别：
1. 栈使用的是一级缓存， 他们通常都是被调用时处于存储空间中，调用完毕立即释放； 
2. 堆是存放在二级缓存中，生命周期由虚拟机的垃圾回收算法来决定（并不是一旦成为孤儿对象就能被回收）。所以调用这些对象的速度要相对来得低一些。

- 三、堆栈数据结构区别：
+ 堆（数据结构）：堆可以被看成是一棵树，如：堆排序； 
+ 栈（数据结构）：一种先进后出的数据结构。

#### Java中栈和堆的区别：
	
	栈(stack)与堆(heap)都是Java用来在Ram中存放数据的地方。
	与C++不同，Java自动管理栈和堆，程序员不能直接地设置栈或堆。 
	在函数中定义的一些基本类型的变量和对象的引用变量都在函数的栈内存中分配。
	当在一段代码块定义一个变量时，Java就在栈中为这个变量分配内存空间，当超过变量的作用域后，Java会自动释放掉为该变量所分配的内存空间，该内存空间可以立即被另作他用。 
	堆内存用来存放由new创建的对象和数组，在堆中分配的内存，由Java虚拟机的自动垃圾回收器来管理。
	在堆中产生了一个数组或对象后，还可以在栈中定义一个特殊的变量，让栈中这个变量的取值等于数组或对象在堆内存中的首地址，栈中的这个变量就成了数组或对象的引用变量。
	引用变量就相当于是为数组或对象起的一个名称，以后就可以在程序中使用栈中的引用变量来访问堆中的数组或对象。 

##### Java中变量在内存中的分配： 

1. 类变量（static修饰的变量）：在程序加载时系统就为它在堆中开辟了内存，堆中的内存地址存放于栈以便于高速访问。
静态变量的生命周期–一直持续到整个”系统”关闭。 
2. 实例变量：当你使用java关键字new的时候，系统在堆中开辟并不一定是连续的空间分配给变量（比如说类实例），然后根据零散的堆内存地址，通过哈希算法换算为一长串数字以表征这个变量在堆中的”物理位置”。 
实例变量的生命周期–当实例变量的引用丢失后，将被GC（垃圾回收器）列入可回收“名单”中，但并不是马上就释放堆中内存。 
3 .局部变量：局部变量，由声明在某方法，或某代码段里（比如for循环），执行到它的时候在栈中开辟内存，当局部变量一但脱离作用域，内存立即释放。 


## Java 内存机制:
Java 把内存划分成两种：一种是栈内存，另一种是堆内存。 

	在函数中定义的一些基本类型的变量和对象的引用变量都是在函数的栈内存中分配，
	当在一段代码块定义一个变量时，Java 就在栈中为这个变量分配内存空间，当超过变量的作用域后，
	Java 会自动释放掉为该变量分配的内存空间，该内存空间可以立即被另作它用。 
	堆内存用来存放由 new 创建的对象和数组，在堆中分配的内存，
	由 Java 虚拟机的自动垃圾回收器来管理。在堆中产生了一个数组或者对象之后，
	还可以在栈中定义一个特殊的变量，让栈中的这个变量的取值等于数组或对象在堆内存中的首地址，
	栈中的这个变量就成了数组或对象的引用变量，以后就可以在程序中使用栈中的引用变量来访问堆中的数组或者对象，
	引用变量就相当于是为数组或者对象起的一个名称。引用变量是普通的变量，定义时在栈中分配，
	引用变量在程序运行到其作用域之外后被释放。而数组和对象本身在堆中分配，
	即使程序运行到使用 new 产生数组或者对象的语句所在的代码块之外，数组和对象本身占据的内存不会被释放，
	数组和对象在没有引用变量指向它的时候，才变为垃圾，不能在被使用，但仍然占据内存空间不放，
	在随后的一个不确定的时间被垃圾回收器收走（释放掉）。

### java中常用的内存区域
在java中主要存在4块内存空间，这些内存的名称及作用如下： 

1. 栈内存空间：保存所有的对象名称（更准确地说是保存了引用的堆内存空间的地址） 
2. 堆内存空间：保存每个对象的具体属性内容。 
3. 全局数据区：保存static类型的属性。 
4. 全局代码区：保存所有的方法定义。

### testgitdev