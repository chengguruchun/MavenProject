package com.cheng.serial;


import org.slf4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:44 2018/8/24
 * @Reference:
 */
public class PerformanceRecord {

    /*private static Logger m_Logger = Logger.(PerformanceRecord.class);

    private String desp;
    private long iStart;
    private PerformanceRecord(String desp){
        this.desp = desp;
    }

    public static PerformanceRecord getInstance(String desp){
        return new PerformanceRecord(desp);
    }

    public long start(){
        iStart = System.nanoTime();
        return iStart;
    }

    public double endInSeconds(){
        long iEnd = System.nanoTime();

        double timeInSeconds = (iEnd - iStart) / (1000000000.0);

        m_Logger.info(desp + " 耗时为 [" + timeInSeconds + "] 秒");
        return timeInSeconds;
    }

    public double endInMs(){
        long iEnd = System.nanoTime();

        double timeInMs = (iEnd - iStart) / (1000000.0);

        m_Logger.info(desp + " 耗时为 [" + timeInMs + "] 毫秒");
        return timeInMs;
    }

    public long endInNs(){
        long iEnd = System.nanoTime();

        long timeInNs = (iEnd - iStart);

        m_Logger.info(desp + " 耗时为 [" + timeInNs + "] 纳秒");
        return timeInNs;
    }

    public static String  testMarshallList(int count) throws Exception{
        BookList books = TestHelper.buildBookList(count);
        JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        OutputStream outputStream = new ByteArrayOutputStream();
        PerformanceRecord performanceRecord = PerformanceRecord.getInstance("XmlMashall");
        performanceRecord.start();
        marshaller.marshal(books, outputStream);
        performanceRecord.endInMs();
        String string = outputStream.toString();
        outputStream.close();
        //m_Logger.debug("ObjToXml:");
        //m_Logger.debug(string);
        return string;
    }

    public static BookList testUnMarshallList(String string) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        InputStream inputStream = new ByteArrayInputStream(string.getBytes());
        PerformanceRecord performanceRecord = PerformanceRecord.getInstance("XmlUnmashall");
        performanceRecord.start();
        BookList books = (BookList)unmarshaller.unmarshal(inputStream);
        performanceRecord.endInMs();
        //m_Logger.debug("XmlToObj:");
        //m_Logger.debug(books.toString());
        return books;
    }*/

}