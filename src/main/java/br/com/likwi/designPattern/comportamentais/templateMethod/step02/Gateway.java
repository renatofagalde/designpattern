package br.com.likwi.designPattern.comportamentais.templateMethod.step02;

import java.util.Random;


public class Gateway {
    //    public static Logger logger = Logger.getLogger(Gateway.class.toString());
    public boolean cobrar(double valor) {
//        logger.info(MessageFormat.format("Gateway => R$",valor));
        return new Random().nextBoolean();
    }
}
