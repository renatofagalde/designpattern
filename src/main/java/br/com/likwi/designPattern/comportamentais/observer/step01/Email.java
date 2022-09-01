package br.com.likwi.designPattern.comportamentais.observer.step01;

import java.text.MessageFormat;
import java.util.logging.Logger;

public class Email {

    public static Logger logger = Logger.getLogger(Email.class.toString());

    public static void enviarEmail(Observer observer, String mensagem) {
        final String mensagemConsole = MessageFormat.format("Email enviado para {0}({1}) com a mensagem:\n\t{2}\n\n",
                observer.getNome(), observer.getEmail(), mensagem);
        logger.info(mensagemConsole);
    }
}
