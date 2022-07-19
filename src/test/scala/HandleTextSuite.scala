import HandleText.{getWordsByDelimiter, printList, splitTextBySpace}

class HandleTextSuite extends munit.FunSuite {
  val words = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler."
  val maxChar = 40

  test("validate each length") {
    val res = getWordsByDelimiter(splitTextBySpace(words), maxChar)
    res.foreach(r => assert(r.length <= maxChar, s"Result with len: ${r.length}"))
    printList(res)
  }
}
