package Xml;

import java.util.Iterator;
import java.util.Vector;

public class fdm_genR extends ValidaXml
{
  private String ref = "";
  private String cversion = "";
  private String citem = "";
  private Vector fdm_itemR;

  public fdm_genR ()
  {
    this.fdm_itemR = new Vector();
  }

  public void setRef (String sref)
  {
    vString(sref, false, 30, "Numero de Referencia");
    this.ref = sref;
  }

  public String getRef ()
  {
    return ref;
  }

  public String getCitem ()
  {
    return citem;
  }

  public void setCitem (String newcitem)
  {
    vLong(newcitem, true, 1, 9999, "Numero de items");
    citem = newcitem;
  }

  public String getCversion ()
  {
    return cversion;
  }

  public void setCversion (String newcversion)
  {
    vDouble(newcversion, true, 0.0, 9.9, "Version");
    cversion = newcversion;
  }

  public void addDav_item (fdm_itemR a)
  {
    //ValidaItemR(a);
    this.fdm_itemR.add(a);

    for( Iterator i = a.lista.iterator(); i.hasNext(); )
      lista.add( (String) i.next() + " item " + a.getC210() + "." );
  }

  public int getFdm_item ()
  {
    return fdm_itemR.size();
  }

  public fdm_itemR getFdm_item (int i)
  {
    return (fdm_itemR) fdm_itemR.get(i);
  }

  public void ValidaItemR (fdm_itemR a)
  {
    if (lista.size() > 0)
      return;

    if (a.getC210().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 21 es obligatorio");

    /*if (a.getC220().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 22 es obligatorio");
    else if ((a.getC220().length() < 9) || (a.getC220().length() > 10))
      this.lista.add("Item " + a.getC210() + "-- Casilla 22 longitud invalida");*/

    /*if (a.getC230().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 23 es obligatorio");
    else
    {
      if (a.getC230().equals("99999"))
      {
        if (a.getC231().equals(""))
          this.lista.add("Item " + a.getC210() + "-- Casilla 23.1 es obligatorio");
      }
      else
        a.setC231("");
    }*/

    if (a.getC2401().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 24 es obligatorio");
    else
    {
      if (a.getC2401().indexOf(".99999:") > 0)
      {
        if (a.getC2402().equals(""))
          this.lista.add("Item " + a.getC210() + "-- Casilla 24.1 es obligatorio");
      }
      else
      {
        if (!a.getC2402().equals("0"))
          a.setC2402("");
      }
    }

    if (a.getC2403().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 25 es obligatorio item " + a.getC210());
    else
    {
      if (a.getC2403().indexOf(".99999:") > 0)
      {
        if (a.getC2404().equals(""))
          this.lista.add("Item " + a.getC210() + "-- Casilla 25.1 es obligatorio");
      }
      else
      {
        if (!a.getC2404().equals("0"))
          a.setC2404("");
      }
    }

    if (a.getC2405().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 26 es obligatorio");
    else
    {
      if (a.getC2405().indexOf(".99999:") > 0)
      {
        if (a.getC2406().equals(""))
          this.lista.add("Item " + a.getC210() + "-- Casilla 26.1 es obligatorio");
      }
      else
      {
        if (!a.getC2406().equals("0"))
          a.setC2406("");
      }
    }

    if (a.getC2407().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 27 es obligatorio");
    else
    {
      if (a.getC2407().indexOf(".99999:") > 0)
      {
        if (a.getC2408().equals(""))
          this.lista.add("Item " + a.getC210() + "-- Casilla 27.1 es obligatorio");
      }
      else
      {
        if (!a.getC2408().equals("0"))
          a.setC2408("");
      }
    }

    /*if (a.getC2409().equals(""))
      this.lista.add("Item " + a.getC210() + "-- Casilla 28.1 es obligatorio");
    else
    {
      if (a.getC2409().indexOf(".99999:") > 0)
      {
        if (a.getC2410().equals(""))
          this.lista.add("Item " + a.getC210() + "-- Casilla 28.1.1 es obligatorio");
      }
      else
      {
        if (!a.getC2410().equals("0"))
          a.setC2410("");
      }
    }*/
  }

  public void validaCabeceraR ()
  {
    if (lista.size() > 0)
      return;
    System.out.println("lista_size");
    if (this.ref.equals(""))
      this.lista.add("Numero de Referencia es obligatorio");
    System.out.println("REF");
    if (this.cversion.equals(""))
      this.lista.add("No es un formato valido");
    System.out.println("VERSION");
    if (this.citem.equals(""))
      this.lista.add("No existe la descripcion de los items");
    System.out.println("CITEM");
  }
}