package org.example;

import jakarta.xml.ws.Service;
import org.example.DAO.Interfaces.ITranslate;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class TranslateClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://LAPTOP-SLOAJ3IB:8080/SingleSOAP1-1.0-SNAPSHOT/TranslateService?wsdl");
        QName qName = new QName("http://singlesoap1.com/", "TranslateService");
        QName port = new QName("http://singlesoap1.com/", "TranslatePort");
        Service service = Service.create(url, qName);
        ITranslate translate = service.getPort(port, ITranslate.class);

        System.out.println(translate.translate("age"));

    }
}
