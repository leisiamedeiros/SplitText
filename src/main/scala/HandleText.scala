
object HandleText extends App {
  def splitTextBySpace(text: String): Array[String] =
    text.split(" ")

  def getWordsByDelimiter(words: Array[String], delimiter: Int): List[String] =
    var line = ""
    var wordsInLine = List.empty[String]

    words.foreach(word => {
      var maxLen = word.length + line.length
      if maxLen > delimiter then
        wordsInLine = addWordInList(line, wordsInLine)
        line = s"${word} "
      else if maxLen <= delimiter && word == words.last then
        line += word.trim
        wordsInLine = addWordInList(line, wordsInLine)
      else
        line += s"${word} "
    })
    wordsInLine
  end getWordsByDelimiter

  def addWordInList(word: String, words: List[String]): List[String] =
    words :+ word.trim

  def printList(text: List[String]): Unit =
    for (elem <- text) println(elem)
  end printList
}