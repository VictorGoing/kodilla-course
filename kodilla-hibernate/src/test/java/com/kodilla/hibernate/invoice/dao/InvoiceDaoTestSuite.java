package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private static final BigDecimal PRICE1 = new BigDecimal(260);
    private static final BigDecimal PRICE2 = new BigDecimal(130);

    @Test
    void testInvoiceDaoSave(){


        Invoice invoice = new Invoice("1234");
        Product product = new Product("2Items");

        Item item1 = new Item(PRICE1,1,PRICE1);
        Item item2 = new Item(PRICE2,1,PRICE2);

        product.getItems().add(item1);
        product.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);


        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);


        invoiceDao.save(invoice);
        int id = invoice.getId();

        Assertions.assertNotEquals(0, id);

        invoiceDao.deleteById(id);
    }

}
