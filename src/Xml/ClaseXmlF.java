package Xml;

import java.io.InputStream;

import org.apache.commons.digester.Digester;


public class ClaseXmlF
{
  public ClaseXmlF () {}
      /*AÑADIDO POR JOSE FDM */
  public fdm_gen pdigester(InputStream archivo)
      throws Exception
  {
      Digester dg = new Digester();
      dg.setValidating(false);      
      dg.setUseContextClassLoader (true);
      dg.addObjectCreate("fdm", fdm_gen.class);
      dg.addBeanPropertySetter("fdm/ref", "ref");
      dg.addBeanPropertySetter("fdm/anticipado", "anticipado");
      dg.addBeanPropertySetter("fdm/tdi", "tdi");
      dg.addBeanPropertySetter("fdm/ndi", "ndi");
      dg.addBeanPropertySetter("fdm/nom", "nom");
      dg.addBeanPropertySetter("fdm/dir", "dir");
      dg.addBeanPropertySetter("fdm/cty", "cty");
      dg.addBeanPropertySetter("fdm/nrsp", "nrsp");
      dg.addBeanPropertySetter("fdm/dirp", "dirp");
      dg.addBeanPropertySetter("fdm/ctyp", "ctyp");
      dg.addBeanPropertySetter("fdm/cpp", "cpp");
      dg.addBeanPropertySetter("fdm/telp", "telp");
      dg.addBeanPropertySetter("fdm/faxp", "faxp");
      dg.addBeanPropertySetter("fdm/emlp", "emlp");
      dg.addBeanPropertySetter("fdm/cfp", "cfp");
      dg.addBeanPropertySetter("fdm/nfp", "nfp");
      dg.addBeanPropertySetter("fdm/citem", "citem");
      dg.addBeanPropertySetter("fdm/cversion", "cversion");
      dg.addObjectCreate("fdm/items", fdm_item.class);
      dg.addBeanPropertySetter("fdm/items/itm", "itm");
      dg.addBeanPropertySetter("fdm/items/nomc", "nomc");
      dg.addBeanPropertySetter("fdm/items/oesp", "oesp");
      dg.addBeanPropertySetter("fdm/items/ocat", "ocat");
      dg.addBeanPropertySetter("fdm/items/est", "est");
      dg.addBeanPropertySetter("fdm/items/esp1", "esp1");
      dg.addBeanPropertySetter("fdm/items/afab", "afab");
      dg.addBeanPropertySetter("fdm/items/cant", "cant");
      dg.addBeanPropertySetter("fdm/items/undc", "undc");
      dg.addBeanPropertySetter("fdm/items/esp2", "esp2");
      dg.addBeanPropertySetter("fdm/items/fobi", "fobi");
      dg.addBeanPropertySetter("fdm/items/pori", "pori");
      dg.addBeanPropertySetter("fdm/items/pemb", "pemb");
      dg.addBeanPropertySetter("fdm/items/padq", "padq");
      dg.addBeanPropertySetter("fdm/items/marca", "marca");
      dg.addBeanPropertySetter("fdm/items/esp21", "esp21");
      dg.addBeanPropertySetter("fdm/items/tipo", "tipo");
      dg.addBeanPropertySetter("fdm/items/esp31", "esp31");
      dg.addBeanPropertySetter("fdm/items/clase", "clase");
      dg.addBeanPropertySetter("fdm/items/esp41", "esp41");
      dg.addBeanPropertySetter("fdm/items/model", "model");
      dg.addBeanPropertySetter("fdm/items/esp51", "esp51");
      dg.addSetNext("fdm/items", "addFdm_item");
      return (fdm_gen)dg.parse(archivo);
  }
}
