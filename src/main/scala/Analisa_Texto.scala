object Analisa_Texto extends App {

  val texto = scala.io.StdIn.readLine("Entre com o texto a ser analisado: ")

  val palavras = texto.split(' ')
  val numpalavras:Double = palavras.length

  val numpontuacao:Double = texto.toCharArray.filter(x => (x.equals('!') || x.equals('?') || x.equals('.'))).length

  val numsentencas:Double = numpontuacao
  val numletras:Double = (texto.toCharArray.filter(_.isLetter)).length

  println(s"letras:  $numletras" )
  println(s"palavras  $numpalavras")
  println(s"sentencas  $numsentencas")

  val L:Double = (numletras / numpalavras) * 100
  val S:Double = (numsentencas / numpalavras) * 100

  val indice = 0.0588 * L - 0.296 * S - 15.8

  val score = indice

  if (score >= 16) println("Grade 16+")
  else if (score <= 1) println("Before Grade 1")
  else println(s"Grade $score")

}
