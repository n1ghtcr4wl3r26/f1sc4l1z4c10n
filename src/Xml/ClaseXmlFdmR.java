package Xml;

import java.io.InputStream;

import org.apache.commons.digester.Digester;


public class ClaseXmlFdmR
{
  public ClaseXmlFdmR () {}

  public fdm_genR pdigesterR (InputStream archivo) throws Exception
  {
    Digester dg = new Digester();
    dg.setValidating(false);
    dg.setUseContextClassLoader (true);
    dg.addObjectCreate("fdm", Xml.fdm_genR.class);
    dg.addBeanPropertySetter("fdm/ref", "ref");
    dg.addBeanPropertySetter("fdm/citem", "citem");
    dg.addBeanPropertySetter("fdm/cversion", "cversion");
    dg.addObjectCreate("fdm/items", Xml.fdm_itemR.class);
    dg.addBeanPropertySetter("fdm/items/c210", "c210");
    dg.addBeanPropertySetter("fdm/items/c220", "c220");
    dg.addBeanPropertySetter("fdm/items/c230", "c230");
    dg.addBeanPropertySetter("fdm/items/c231", "c231");

    dg.addBeanPropertySetter("fdm/items/c2401", "c2401");
    dg.addBeanPropertySetter("fdm/items/c2402", "c2402");
    dg.addBeanPropertySetter("fdm/items/c2403", "c2403");
    dg.addBeanPropertySetter("fdm/items/c2404", "c2404");
    dg.addBeanPropertySetter("fdm/items/c2405", "c2405");
    dg.addBeanPropertySetter("fdm/items/c2406", "c2406");
    dg.addBeanPropertySetter("fdm/items/c2407", "c2407");
    dg.addBeanPropertySetter("fdm/items/c2408", "c2408");
    dg.addBeanPropertySetter("fdm/items/c2409", "c2409");
    dg.addBeanPropertySetter("fdm/items/c2410", "c2410");
    dg.addBeanPropertySetter("fdm/items/c2411", "c2411");
    dg.addBeanPropertySetter("fdm/items/c2412", "c2412");
    dg.addBeanPropertySetter("fdm/items/c2413", "c2413");
    dg.addBeanPropertySetter("fdm/items/c2414", "c2414");
    dg.addBeanPropertySetter("fdm/items/c2415", "c2415");
    dg.addBeanPropertySetter("fdm/items/c2416", "c2416");
    dg.addBeanPropertySetter("fdm/items/c2417", "c2417");
    dg.addBeanPropertySetter("fdm/items/c2418", "c2418");
    dg.addBeanPropertySetter("fdm/items/c2419", "c2419");
    dg.addBeanPropertySetter("fdm/items/c2420", "c2420");
    dg.addBeanPropertySetter("fdm/items/c2421", "c2421");
    dg.addBeanPropertySetter("fdm/items/c2422", "c2422");
    dg.addBeanPropertySetter("fdm/items/c2423", "c2423");
    dg.addBeanPropertySetter("fdm/items/c2424", "c2424");
    dg.addBeanPropertySetter("fdm/items/c2425", "c2425");
    dg.addBeanPropertySetter("fdm/items/c2426", "c2426");
    dg.addBeanPropertySetter("fdm/items/c2427", "c2427");
    dg.addBeanPropertySetter("fdm/items/c2428", "c2428");

    dg.addBeanPropertySetter("fdm/items/c250", "c250");
    dg.addBeanPropertySetter("fdm/items/c260", "c260");
    dg.addBeanPropertySetter("fdm/items/c270", "c270");
    dg.addBeanPropertySetter("fdm/items/c280", "c280");
    dg.addBeanPropertySetter("fdm/items/c290", "c290");    
    dg.addBeanPropertySetter("fdm/items/c300", "c300");       
      dg.addBeanPropertySetter("fdm/items/c310", "c310");
      dg.addBeanPropertySetter("fdm/items/c320", "c320");
      dg.addBeanPropertySetter("fdm/items/c330", "c330");

    dg.addSetNext("fdm/items", "addDav_item");
    System.out.println("Fin PDIG");
    return (Xml.fdm_genR) dg.parse(archivo);
  }
}