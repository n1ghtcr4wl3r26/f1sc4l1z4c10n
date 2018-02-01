package Xml;

import java.io.InputStream;

import org.apache.commons.digester.Digester;


public class ClaseXmlR
{
  public ClaseXmlR () {}

  public dav_genR pdigesterR (InputStream archivo) throws Exception
  {
    Digester dg = new Digester();
    dg.setValidating(false);
    dg.setUseContextClassLoader (true);
    dg.addObjectCreate("dav", Xml.dav_genR.class);
    dg.addBeanPropertySetter("dav/ref", "ref");
    dg.addBeanPropertySetter("dav/citem", "citem");
    dg.addBeanPropertySetter("dav/cversion", "cversion");
    dg.addObjectCreate("dav/items", Xml.dav_itemR.class);
    dg.addBeanPropertySetter("dav/items/c210", "c210");
    dg.addBeanPropertySetter("dav/items/c220", "c220");
    dg.addBeanPropertySetter("dav/items/c230", "c230");
    dg.addBeanPropertySetter("dav/items/c231", "c231");

    dg.addBeanPropertySetter("dav/items/c2401", "c2401");
    dg.addBeanPropertySetter("dav/items/c2402", "c2402");
    dg.addBeanPropertySetter("dav/items/c2403", "c2403");
    dg.addBeanPropertySetter("dav/items/c2404", "c2404");
    dg.addBeanPropertySetter("dav/items/c2405", "c2405");
    dg.addBeanPropertySetter("dav/items/c2406", "c2406");
    dg.addBeanPropertySetter("dav/items/c2407", "c2407");
    dg.addBeanPropertySetter("dav/items/c2408", "c2408");
    dg.addBeanPropertySetter("dav/items/c2409", "c2409");
    dg.addBeanPropertySetter("dav/items/c2410", "c2410");
    dg.addBeanPropertySetter("dav/items/c2411", "c2411");
    dg.addBeanPropertySetter("dav/items/c2412", "c2412");//asd
    dg.addBeanPropertySetter("dav/items/c2413", "c2413");
    dg.addBeanPropertySetter("dav/items/c2414", "c2414");
    dg.addBeanPropertySetter("dav/items/c2415", "c2415");
    dg.addBeanPropertySetter("dav/items/c2416", "c2416");
    dg.addBeanPropertySetter("dav/items/c2417", "c2417");
    dg.addBeanPropertySetter("dav/items/c2418", "c2418");
    dg.addBeanPropertySetter("dav/items/c2419", "c2419");
    dg.addBeanPropertySetter("dav/items/c2420", "c2420");
    dg.addBeanPropertySetter("dav/items/c2421", "c2421");
    dg.addBeanPropertySetter("dav/items/c2422", "c2422");
    dg.addBeanPropertySetter("dav/items/c2423", "c2423");
    dg.addBeanPropertySetter("dav/items/c2424", "c2424");
    dg.addBeanPropertySetter("dav/items/c2425", "c2425");
    dg.addBeanPropertySetter("dav/items/c2426", "c2426");
    dg.addBeanPropertySetter("dav/items/c2427", "c2427");
    dg.addBeanPropertySetter("dav/items/c2428", "c2428");

    dg.addBeanPropertySetter("dav/items/c250", "c250");
    dg.addBeanPropertySetter("dav/items/c260", "c260");
    dg.addBeanPropertySetter("dav/items/c270", "c270");
    dg.addBeanPropertySetter("dav/items/c280", "c280");
    dg.addBeanPropertySetter("dav/items/c290", "c290");    
    dg.addBeanPropertySetter("dav/items/c300", "c300");
    dg.addBeanPropertySetter("dav/items/c310", "c310"); 
    dg.addBeanPropertySetter("dav/items/c320", "c320"); 
    dg.addBeanPropertySetter("dav/items/c330", "c330"); 
            

    dg.addSetNext("dav/items", "addDav_item");
    return (Xml.dav_genR) dg.parse(archivo);
  }
}