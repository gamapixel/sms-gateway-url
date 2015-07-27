# sms-gateway-url

#CONFIGURAÇÕES DAS STRINGS

$cell 	= "DDD+NUMERO"; ---> Adicionar número a ser enviado o SMS
$msg  	= "sms via gateway"; ---> Adicionar Mensagem que vai ser enviada
$token	= "TOKEN"; ---> Adicionar Token da Gama Pixel
$usuario= "user"; ---> Adicionar seu nome de usuario

Para gerar seu Token entre em nosso painel:
http://sms.gamapixel.com.br
Após entrar com seu login e senha vá no menu "Minha conta > Configurações do Usuário"
*Não se esqueça de colocar o IP do servidor onde vai ser enviado o SMS, essa e uma forma de proteção para ninguém usar seus créditos indevidamente, só será permitido o envio dos SMS pelos IP cadastrado. 


#RESUMO DOS PARÂMETROS DA URL:
u 		= (Usuário)
h 		= (Token)
op=pv 	= (tipo de ação com assinatura do SMS)
to 		= (Número do destinatario)
msg 	= (Mensagem)



