<?php 

$cell 	="983110504"; #Adicionar número a ser enviado o SMS
$msg 	="teste de envio de sms via gateway"; #Adicionar Mensagem que vai ser enviada
$token	="fec07ee4e48cbc304972cf633c12aed8"; #Adicionar Token da Gama Pixel
$usuario="admin"; #Adicionar seu nome de usuario
$msgUni = str_replace(" ", "+", $msg);


$urlMaster=  "http://sms.gamapixel.net:81/index.php?app=ws&u=".$usuario."&h=".$token."&op=pv&to=" . $cell . "&msg=" . $msgUni ;


echo "<br>GETEWAY DE <b>SMS</b> 
<br>
<a href=".$urlMaster." >Clique aqui para enviar</a> ";

 ?>
