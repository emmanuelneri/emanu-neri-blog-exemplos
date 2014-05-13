package br.com.emmanuelneri.blog.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public final class LoggerProducer {

    @Produces
    public Logger createLogger(InjectionPoint ip) {
        return LoggerFactory.getLogger(ip.getMember().getDeclaringClass().getName());
    }

}
