package com.coineye;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.okcoin.OkCoinExchange;
import org.knowm.xchange.service.marketdata.MarketDataService;

import java.io.IOException;

/**
 * Created by bisunday on 25/05/2017.
 */
public class Bootstrap {
    public static void main(String[] args) {
        Exchange bitstamp = ExchangeFactory.INSTANCE.createExchange(OkCoinExchange.class.getName());

        MarketDataService marketDataService = bitstamp.getMarketDataService();
        try {
            Ticker ticker = marketDataService.getTicker(CurrencyPair.BTC_CNY);
            System.out.println(ticker.toString());
        } catch (IOException err) {
            System.out.println(err);
        }

        System.out.println("Hello World!");
    }
}
