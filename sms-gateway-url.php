<?php 

$cell 	="021983110504"; #Adicionar número a ser enviado o SMS
$msg 	="teste de envio de sms via gateway"; #Adicionar Mensagem que vai ser enviada
$token	="885620ff5a9eae9acb793251072981d6"; #Adicionar Token da Gama Pixel
$usuario="demo"; #Adicionar seu nome de usuario
$msgUni = str_replace(" ", "+", $msg);


$urlMaster=  "http://sms.gp.inf.br:81/index.php?app=ws&u=".$usuario."&h=".$token."&op=pv&to=" . $cell . "&msg=" . $msgUni ;


echo "<br>GETEWAY DE <b>SMS</b> 
<br>
<a href=".$urlMaster." >Clique aqui para enviar</a> ";

 ?>
