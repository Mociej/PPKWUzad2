# PPKWUzad2
Api do analizy przekazanych stringów

Aplikacja uruchamiana jest za pomocą metody main w klasie Ppkwuzad2Application

Dostępna jest ona pod adresem **http://localhost:8080/**

============================

Aplikacja składa się z kontrolera StringApiController, który zawiera metodę GET stringAnalyse zwracającą informacje na 
temat występowania dużych i małych liter, liczb, białych znaków, znaków specjalnych i liczby wyrazów.

Po uruchomieniu aplikacji i wpisaniu w przeglądarkę np. `http://localhost:8080/analysestring/ala MA 123!@` uzyskamy 
odpowiedź w zawierającą statystykę stringa.



Input string : ala MA 123!@ </br>

String length : 12

upperCase : 2

lowerCase : 3 

digits : 3 

whitespaces : 2 

special characters : 2

words in string : 3


