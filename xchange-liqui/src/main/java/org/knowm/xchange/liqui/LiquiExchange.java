package org.knowm.xchange.liqui;

import org.knowm.xchange.BaseExchange;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeSpecification;
import si.mazi.rescu.SynchronizedValueFactory;

/**
 * Created by Meir TOLEDANO on 19-Aug-2017.
 * Project bacchus.
 */
public class LiquiExchange extends BaseExchange implements Exchange {

    @Override
    protected void initServices() {

    }

    @Override
    public SynchronizedValueFactory<Long> getNonceFactory() {
        return null;
    }

    @Override
    public ExchangeSpecification getDefaultExchangeSpecification() {
        return null;
    }
}
