package controladores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import util.UtilMensagens;

@ManagedBean(name = "envioBean")
@ViewScoped
public class EnvioBean implements Serializable {

	private static final long serialVersionUID = 4526640303124065370L;
	private String celular;
	private String texto;
	private String token = "885620ff5a9eae9acb793251072981d6"; //--> Adicionar seu Token
	private String usuario = "demo"; // --> Adicionar seu nome de usuario
	private String resposta;

	public EnvioBean() {

	}

	public void enviar() throws IOException {
		// CELULAR SOMENTE NUMEROS
		celular = celular.replaceAll("\\D", "");
		// TRANTANDO ESPACOS DIGITADOS NA MSG
		texto = texto.replaceAll(" ", "+");
		String urlMaster = "http://sms.gp.inf.br:81/index.php?app=ws&u="
				+ usuario + "&h=" + token + "&op=pv&to=" + celular + "&msg="
				+ texto;
		URL obj = new URL(urlMaster);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		int responseCode = con.getResponseCode();
		System.out.println("Chamando Servidor : " + urlMaster);
		System.out.println("Resposta : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		System.out.println(response.toString());

		resposta = response.toString();
		if (resposta.contains("OK")) {
			UtilMensagens
					.mensagemInformacao("Mensagem Envianda com Sucesso !!");
		} else {
			UtilMensagens.mensagemErro("Erro ao enviar a mensagem");
		}

	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}

//Hudson Alves
