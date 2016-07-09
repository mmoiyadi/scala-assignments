import patmat._
import Huffman._

object patmat_ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(96); 
  println("Welcome to the Scala worksheet");$skip(1496); 
   val frenchCode: CodeTree = Fork(Fork(Fork(Leaf('s',121895),Fork(Leaf('d',56269),Fork(Fork(Fork(Leaf('x',5928),Leaf('j',8351),List('x','j'),14279),Leaf('f',16351),List('x','j','f'),30630),Fork(Fork(Fork(Fork(Leaf('z',2093),Fork(Leaf('k',745),Leaf('w',1747),List('k','w'),2492),List('z','k','w'),4585),Leaf('y',4725),List('z','k','w','y'),9310),Leaf('h',11298),List('z','k','w','y','h'),20608),Leaf('q',20889),List('z','k','w','y','h','q'),41497),List('x','j','f','z','k','w','y','h','q'),72127),List('d','x','j','f','z','k','w','y','h','q'),128396),List('s','d','x','j','f','z','k','w','y','h','q'),250291),Fork(Fork(Leaf('o',82762),Leaf('l',83668),List('o','l'),166430),Fork(Fork(Leaf('m',45521),Leaf('p',46335),List('m','p'),91856),Leaf('u',96785),List('m','p','u'),188641),List('o','l','m','p','u'),355071),List('s','d','x','j','f','z','k','w','y','h','q','o','l','m','p','u'),605362),Fork(Fork(Fork(Leaf('r',100500),Fork(Leaf('c',50003),Fork(Leaf('v',24975),Fork(Leaf('g',13288),Leaf('b',13822),List('g','b'),27110),List('v','g','b'),52085),List('c','v','g','b'),102088),List('r','c','v','g','b'),202588),Fork(Leaf('n',108812),Leaf('t',111103),List('n','t'),219915),List('r','c','v','g','b','n','t'),422503),Fork(Leaf('e',225947),Fork(Leaf('i',115465),Leaf('a',117110),List('i','a'),232575),List('e','i','a'),458522),List('r','c','v','g','b','n','t','e','i','a'),881025),List('s','d','x','j','f','z','k','w','y','h','q','o','l','m','p','u','r','c','v','g','b','n','t','e','i','a'),1486387);System.out.println("""frenchCode  : patmat.Huffman.CodeTree = """ + $show(frenchCode ));$skip(332); 
  val myCode: CodeTree = Fork(Leaf('A',8),Fork(Fork(Leaf('B',3),Fork(Leaf('C',1),Leaf('D',1),List('C','D'),2),List('B','C','D'),5),Fork(Fork(Leaf('E',1),Leaf('F',1),List('E','F'),2),Fork(Leaf('G',1),Leaf('H',1),List('G','H'),2),List('E','F','G','H'),4),List('B','C','D','E','F','G','H'),9),List('A','B','C','D','E','F','G','H'),17);System.out.println("""myCode  : patmat.Huffman.CodeTree = """ + $show(myCode ));$skip(301); 
 
  /**
   * What does the secret message say? Can you decode it?
   * For the decoding use the `frenchCode' Huffman tree defined above.
   */
  val secret: List[Bit] = List(0,0,1,1,1,0,1,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,1,0,1,1,0,0,1,1,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,1,1,0,0,1,0,0,1,0,0,0,1,0,0,0,1,0,1);System.out.println("""secret  : List[patmat.Huffman.Bit] = """ + $show(secret ));$skip(148); 
                                                    
   //val secret:List[Bit] = List(1,0,1,1,1,0,1,0,0,1,0,0)
	 def mylist : List[Bit] = List(1,2);System.out.println("""mylist: => List[patmat.Huffman.Bit]""");$skip(128); 
  /**
   * Write a function that returns the decoded secret
   */
    def decodedSecret: List[Char] = decode(frenchCode,secret);System.out.println("""decodedSecret: => List[Char]""");$skip(26); val res$0 = 
		decodedSecret.take(200);System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(54); 
  
  	val charList:List[Char] = List('d','a','c','b');System.out.println("""charList  : List[Char] = """ + $show(charList ));$skip(61); 
  	def encodedList: List[Bit] = encode(frenchCode)(charList);System.out.println("""encodedList: => List[patmat.Huffman.Bit]""");$skip(76); val res$1 = 
                                                   
		encodedList.take(200);System.out.println("""res1: List[patmat.Huffman.Bit] = """ + $show(res$1))}
  
}
