package br.com.likwi.designPattern.comportamentais.observer;

import br.com.likwi.designPattern.Setup;
import br.com.likwi.designPattern.comportamentais.observer.step01.Cliente;
import br.com.likwi.designPattern.comportamentais.observer.step01.Funcionario;
import br.com.likwi.designPattern.comportamentais.observer.step01.NewsLetter;
import br.com.likwi.designPattern.comportamentais.observer.step01.Parceiro;
import org.junit.jupiter.api.Test;

public class ObserverStep01_Test extends Setup {

    @Test
    public void observar_news_letter(){
        final NewsLetter newsLetter = new NewsLetter();
        final Funcionario funcionarioDoMes1 = Funcionario.builder()
                .nome("Funcionario do mês 1º")
                .email("funcionario1@mcdonalds.com")
                .subject(newsLetter)
                .build();

        final Funcionario funcionarioDoMes2 = Funcionario.builder()
                .nome("Funcionario do mês 2º")
                .email("funcionario2@mcdonalds.com")
                .subject(newsLetter)
                .build();

        final Cliente cliente = Cliente.builder()
                .nome("cliente")
                .email("cliente@xpto.com")
                .subject(newsLetter)
                .build();

        final Parceiro parceiro = Parceiro.builder()
                .nome("parceiro")
                .email("pareiro@xpto.com")
                .subject(newsLetter)
                .build();

        newsLetter.addMensagem("1º mensagem com o padrão Observer");
        logger.info("-------------------------");

        newsLetter.unsubscribeObserver(funcionarioDoMes2);
        newsLetter.addMensagem("2º mensagem com o padrão Observer");

    }
}
