package Xml;

import java.io.InputStream;

import org.apache.commons.digester.Digester;


public class ClaseXml
{
  public ClaseXml () {}

  public dav_gen pdigester (InputStream archivo) throws Exception
  {
    Digester dg = new Digester();
    dg.setValidating(false);
    dg.setUseContextClassLoader (true);
    dg.addObjectCreate("dav", dav_gen.class);
    dg.addBeanPropertySetter("dav/ref", "ref");
    dg.addBeanPropertySetter("dav/anticipado", "anticipado");
    dg.addBeanPropertySetter("dav/c30", "c30");
    dg.addBeanPropertySetter("dav/c31", "c31");
    dg.addBeanPropertySetter("dav/c32", "c32");
    dg.addBeanPropertySetter("dav/c33", "c33");
    dg.addBeanPropertySetter("dav/c40", "c40");
    dg.addBeanPropertySetter("dav/c41", "c41");
    dg.addBeanPropertySetter("dav/c42", "c42");
    dg.addBeanPropertySetter("dav/c43", "c43");
    dg.addBeanPropertySetter("dav/c50", "c50");
    dg.addBeanPropertySetter("dav/c51", "c51");
    dg.addBeanPropertySetter("dav/c52", "c52");
    dg.addBeanPropertySetter("dav/c53", "c53");
    dg.addBeanPropertySetter("dav/c60", "c60");
    dg.addBeanPropertySetter("dav/c61", "c61");
    dg.addBeanPropertySetter("dav/c62", "c62");
    dg.addBeanPropertySetter("dav/c63", "c63");
    dg.addBeanPropertySetter("dav/c70", "c70");
    dg.addBeanPropertySetter("dav/c81", "c81");
    dg.addBeanPropertySetter("dav/c82", "c82");
    dg.addBeanPropertySetter("dav/c83", "c83");
    dg.addBeanPropertySetter("dav/c90", "c90");
    dg.addBeanPropertySetter("dav/c100", "c100");
    dg.addBeanPropertySetter("dav/c110", "c110");
    dg.addBeanPropertySetter("dav/c120", "c120");
    dg.addBeanPropertySetter("dav/c130", "c130");
    dg.addBeanPropertySetter("dav/c140", "c140");
    dg.addBeanPropertySetter("dav/c150", "c150");
    dg.addBeanPropertySetter("dav/c160", "c160");
    dg.addBeanPropertySetter("dav/c170", "c170");
    dg.addBeanPropertySetter("dav/c180", "c180");
    dg.addBeanPropertySetter("dav/c190", "c190");
    dg.addBeanPropertySetter("dav/c200", "c200");
    dg.addBeanPropertySetter("dav/c210", "c210");
    dg.addBeanPropertySetter("dav/c220", "c220");
    dg.addBeanPropertySetter("dav/c230", "c230");
    dg.addBeanPropertySetter("dav/c240", "c240");
    dg.addBeanPropertySetter("dav/c250", "c250");
    dg.addBeanPropertySetter("dav/c260", "c260");
    dg.addBeanPropertySetter("dav/c270", "c270");
    dg.addBeanPropertySetter("dav/c271", "c271");
    dg.addBeanPropertySetter("dav/c280", "c280");
    dg.addBeanPropertySetter("dav/c290", "c290");
    dg.addBeanPropertySetter("dav/c300", "c300");
    dg.addBeanPropertySetter("dav/c310", "c310");
    dg.addBeanPropertySetter("dav/c320", "c320");
    dg.addBeanPropertySetter("dav/c330", "c330");
    dg.addBeanPropertySetter("dav/c340", "c340");
    dg.addBeanPropertySetter("dav/c350", "c350");
    dg.addBeanPropertySetter("dav/c360", "c360");
    dg.addBeanPropertySetter("dav/c361", "c361");
    dg.addBeanPropertySetter("dav/c370", "c370");
    dg.addBeanPropertySetter("dav/c380", "c380");
    dg.addBeanPropertySetter("dav/c390", "c390");
    dg.addBeanPropertySetter("dav/c400", "c400");
    dg.addBeanPropertySetter("dav/c410", "c410");
    dg.addBeanPropertySetter("dav/c420", "c420");
    dg.addBeanPropertySetter("dav/c430", "c430");
    dg.addBeanPropertySetter("dav/c440", "c440");
    dg.addBeanPropertySetter("dav/c450", "c450");
    dg.addBeanPropertySetter("dav/c460", "c460");
    dg.addBeanPropertySetter("dav/c470", "c470");
    dg.addBeanPropertySetter("dav/c480", "c480");
    dg.addBeanPropertySetter("dav/c490", "c490");
    dg.addBeanPropertySetter("dav/c500", "c500");
    dg.addBeanPropertySetter("dav/c510", "c510");
    dg.addBeanPropertySetter("dav/c520", "c520");
    dg.addBeanPropertySetter("dav/c530", "c530");
    dg.addBeanPropertySetter("dav/c540", "c540");
    dg.addBeanPropertySetter("dav/c550", "c550");
    dg.addBeanPropertySetter("dav/c560", "c560");
    dg.addBeanPropertySetter("dav/c570", "c570");
    dg.addBeanPropertySetter("dav/c580", "c580");
    dg.addBeanPropertySetter("dav/c590", "c590");
    dg.addBeanPropertySetter("dav/c600", "c600");
    dg.addBeanPropertySetter("dav/c610", "c610");
    dg.addBeanPropertySetter("dav/c611", "c611");
    dg.addBeanPropertySetter("dav/c620", "c620");
    dg.addBeanPropertySetter("dav/c621", "c621");
    dg.addBeanPropertySetter("dav/c622", "c622");
    dg.addBeanPropertySetter("dav/c631", "c631");
    dg.addBeanPropertySetter("dav/c632", "c632");
    dg.addBeanPropertySetter("dav/c633", "c633");
    dg.addBeanPropertySetter("dav/c634", "c634");
    dg.addBeanPropertySetter("dav/c630", "c630");
    dg.addBeanPropertySetter("dav/c640", "c640");
    dg.addBeanPropertySetter("dav/c650", "c650");
    dg.addBeanPropertySetter("dav/c660", "c660");
    dg.addBeanPropertySetter("dav/c670", "c670");
    dg.addBeanPropertySetter("dav/c1281", "c1281");
    dg.addBeanPropertySetter("dav/c1282", "c1282");
    dg.addBeanPropertySetter("dav/c1283", "c1283");
    dg.addBeanPropertySetter("dav/c1270", "c1270");
    dg.addBeanPropertySetter("dav/c1290", "c1290");
    dg.addBeanPropertySetter("dav/c1300", "c1300");
    dg.addBeanPropertySetter("dav/c1310", "c1310");
    dg.addBeanPropertySetter("dav/c1320", "c1320");
    dg.addBeanPropertySetter("dav/c1330", "c1330");
    dg.addBeanPropertySetter("dav/c1340", "c1340");
    dg.addBeanPropertySetter("dav/citem", "citem");
    dg.addBeanPropertySetter("dav/cversion", "cversion");
    dg.addObjectCreate("dav/items", dav_item.class);
    dg.addBeanPropertySetter("dav/items/c680", "c680");
    dg.addBeanPropertySetter("dav/items/c690", "c690");
    dg.addBeanPropertySetter("dav/items/c700", "c700");
    dg.addBeanPropertySetter("dav/items/c701", "c701");
    dg.addBeanPropertySetter("dav/items/c710", "c710");
    dg.addBeanPropertySetter("dav/items/c711", "c711");

    dg.addBeanPropertySetter("dav/items/c7101", "c7101");
    dg.addBeanPropertySetter("dav/items/c7102", "c7102");
    dg.addBeanPropertySetter("dav/items/c7103", "c7103");
    dg.addBeanPropertySetter("dav/items/c7104", "c7104");
    dg.addBeanPropertySetter("dav/items/c7105", "c7105");
    dg.addBeanPropertySetter("dav/items/c7106", "c7106");
    dg.addBeanPropertySetter("dav/items/c7107", "c7107");
    dg.addBeanPropertySetter("dav/items/c7108", "c7108");
    dg.addBeanPropertySetter("dav/items/c7109", "c7109");
    dg.addBeanPropertySetter("dav/items/c7110", "c7110");
    dg.addBeanPropertySetter("dav/items/c7111", "c7111");
    dg.addBeanPropertySetter("dav/items/c7112", "c7112");
    dg.addBeanPropertySetter("dav/items/c7113", "c7113");
    dg.addBeanPropertySetter("dav/items/c7114", "c7114");
    dg.addBeanPropertySetter("dav/items/c7115", "c7115");
    dg.addBeanPropertySetter("dav/items/c7116", "c7116");
    dg.addBeanPropertySetter("dav/items/c7117", "c7117");
    dg.addBeanPropertySetter("dav/items/c7118", "c7118");
    dg.addBeanPropertySetter("dav/items/c7119", "c7119");
    dg.addBeanPropertySetter("dav/items/c7120", "c7120");
    dg.addBeanPropertySetter("dav/items/c7121", "c7121");
    dg.addBeanPropertySetter("dav/items/c7122", "c7122");
    dg.addBeanPropertySetter("dav/items/c7123", "c7123");
    dg.addBeanPropertySetter("dav/items/c7124", "c7124");
    dg.addBeanPropertySetter("dav/items/c7125", "c7125");
    dg.addBeanPropertySetter("dav/items/c7126", "c7126");
    dg.addBeanPropertySetter("dav/items/c7127", "c7127");
    dg.addBeanPropertySetter("dav/items/c7128", "c7128");

    dg.addBeanPropertySetter("dav/items/c760", "c760");
    dg.addBeanPropertySetter("dav/items/c770", "c770");
    dg.addBeanPropertySetter("dav/items/c780", "c780");
    dg.addBeanPropertySetter("dav/items/c790", "c790");
    dg.addBeanPropertySetter("dav/items/c800", "c800");
    dg.addBeanPropertySetter("dav/items/c801", "c801");
    dg.addBeanPropertySetter("dav/items/c820", "c820");
    dg.addBeanPropertySetter("dav/items/c830", "c830");
    dg.addBeanPropertySetter("dav/items/c840", "c840");
    dg.addBeanPropertySetter("dav/items/c850", "c850");
    dg.addBeanPropertySetter("dav/items/c860", "c860");
    dg.addBeanPropertySetter("dav/items/c870", "c870");
    dg.addBeanPropertySetter("dav/items/c880", "c880");
    dg.addBeanPropertySetter("dav/items/c890", "c890");
    dg.addBeanPropertySetter("dav/items/c900", "c900");
    dg.addBeanPropertySetter("dav/items/c910", "c910");
    dg.addBeanPropertySetter("dav/items/c920", "c920");
    dg.addBeanPropertySetter("dav/items/c930", "c930");
    dg.addBeanPropertySetter("dav/items/c940", "c940");
    dg.addBeanPropertySetter("dav/items/c950", "c950");
    dg.addBeanPropertySetter("dav/items/c960", "c960");
    dg.addBeanPropertySetter("dav/items/c970", "c970");
    dg.addBeanPropertySetter("dav/items/c980", "c980");
    dg.addBeanPropertySetter("dav/items/c990", "c990");
    dg.addBeanPropertySetter("dav/items/c1000", "c1000");
    dg.addBeanPropertySetter("dav/items/c1010", "c1010");
    dg.addBeanPropertySetter("dav/items/c1020", "c1020");
    dg.addBeanPropertySetter("dav/items/c1030", "c1030");
    dg.addBeanPropertySetter("dav/items/c1040", "c1040");
    dg.addBeanPropertySetter("dav/items/c1050", "c1050");
    dg.addBeanPropertySetter("dav/items/c1060", "c1060");
    dg.addBeanPropertySetter("dav/items/c1070", "c1070");
    dg.addBeanPropertySetter("dav/items/c1080", "c1080");
    dg.addBeanPropertySetter("dav/items/c1090", "c1090");
    dg.addBeanPropertySetter("dav/items/c1100", "c1100");
    dg.addBeanPropertySetter("dav/items/c1110", "c1110");
    dg.addBeanPropertySetter("dav/items/c1120", "c1120");
    dg.addBeanPropertySetter("dav/items/c1130", "c1130");
    dg.addBeanPropertySetter("dav/items/c1140", "c1140");
    dg.addBeanPropertySetter("dav/items/c1150", "c1150");
    dg.addBeanPropertySetter("dav/items/c1160", "c1160");
    dg.addBeanPropertySetter("dav/items/c1161", "c1161");
    dg.addBeanPropertySetter("dav/items/c1170", "c1170");
    dg.addBeanPropertySetter("dav/items/c1180", "c1180");
    dg.addBeanPropertySetter("dav/items/c1190", "c1190");
    dg.addBeanPropertySetter("dav/items/c1191", "c1191");
    dg.addBeanPropertySetter("dav/items/c1200", "c1200");
    dg.addBeanPropertySetter("dav/items/c1210", "c1210");
    dg.addBeanPropertySetter("dav/items/c1220", "c1220");
    dg.addBeanPropertySetter("dav/items/c1221", "c1221");
    dg.addBeanPropertySetter("dav/items/c1230", "c1230");
    dg.addBeanPropertySetter("dav/items/c1240", "c1240");
    dg.addBeanPropertySetter("dav/items/c1250", "c1250");
    dg.addBeanPropertySetter("dav/items/c1260", "c1260");
    dg.addSetNext("dav/items", "addDav_item");

    return (dav_gen) dg.parse(archivo);
  }

}