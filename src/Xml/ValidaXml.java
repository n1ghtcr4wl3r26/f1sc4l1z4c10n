package Xml;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class ValidaXml
{
  public ArrayList lista;

  public ValidaXml ()
  {
    this.lista = new ArrayList();
  }

  public void vString (String texto, boolean bObligatorio, int iMaxLongitud, String Label)
  {
    if (bObligatorio)
    {
      if (texto.length() == 0)
      {
        this.lista.add(Label + " es obligatorio");

        return;
      }
    }
    else
    {
      if (texto.length() == 0)
        return;
    }

    if (texto.trim().length() > iMaxLongitud)
      this.lista.add(Label + " excede con la longitud definida");
  }

  public void vLong (String texto, boolean bObligatorio, long dMinValor, long dMaxValor, String Label)
  {
    if (bObligatorio)
    {
      if (texto.length() == 0)
      {
        this.lista.add(Label + " es obligatorio");

        return;
      }
    }
    else
    {
      if (texto.length() == 0)
        return;
    }

    if (texto.equals(""))
    {
      this.lista.add(Label + " tiene que consignar al menos Cero '0'");

      return;
    }

    long Numero = 0;

    try
    {
      Numero = Long.parseLong(texto);

      if (!bObligatorio)
      {
        if (Numero == 0)
          return;
      }

      if (Numero < dMinValor)
        this.lista.add(Label + " es inferior a " + dMinValor);

      if (Numero > dMaxValor)
        this.lista.add(Label + " es superior a " + dMaxValor);
    }
    catch (Exception e)
    {
      this.lista.add(Label + " es un valor num\u00e9rico invalido");
    }
  }

  public void vDouble (String texto, boolean bObligatorio, double dMinValor, double dMaxValor, String Label)
  {
    if (bObligatorio)
    {
      if (texto.length() == 0)
      {
        this.lista.add(Label + " es obligatorio");

        return;
      }
    }
    else
    {
      if (texto.length() == 0)
        return;
    }

    if (texto.equals(""))
    {
      this.lista.add(Label + " tiene que consignar al menos Cero '0'");

      return;
    }

    DecimalFormat df = new DecimalFormat("########.###");
    double Numero = 0.0D;

    try
    {
      Numero = Double.parseDouble(texto);

      if (!bObligatorio)
      {
        if (Numero == 0)
          return;
      }

      if (Numero < dMinValor)
        this.lista.add(Label + " es inferior a " + df.format(dMinValor));

      if (Numero > dMaxValor)
        this.lista.add(Label + " es superior a " + df.format(dMaxValor));
    }
    catch (Exception e)
    {
      this.lista.add(Label + " es un valor num\u00e9rico invalido");
    }
  }

  public void vFecha (String texto, boolean bObligatorio, String Label)
  {
    if (bObligatorio)
    {
      if ((texto.length() < 10) || (texto.length() > 10))
      {
        this.lista.add(Label + " es un fecha invalida");

        return;
      }
    }
    else if (texto.length() == 0)
      return;

    SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMdd");
    Date ahora = new Date();
    Calendar z = Calendar.getInstance();

    long dActual = Long.parseLong(df2.format(ahora));
    long dTexto;

    try
    {
      ahora = df1.parse(texto);
      z.clear();
      z.setTime(ahora);

      int dd;
      int mm;
      int yy;
      dd = Integer.parseInt(texto.substring(0, 2));
      mm = Integer.parseInt(texto.substring(3, 5));
      yy = Integer.parseInt(texto.substring(6, 10));

      if ((dd < 1) || (dd > 31))
      {
        this.lista.add(Label + " es un fecha invalida");

        return;
      }

      if ((mm < 1) || (mm > 12))
      {
        this.lista.add(Label + " es un fecha invalida");

        return;
      }

      if ((yy < 0) || (yy > 2020))
      {
        this.lista.add(Label + " es un fecha invalida");

        return;
      }

      if ((mm == 4) || (mm == 6) || (mm == 9) || (mm == 11))
      {
        if (dd > 30)
        {
          this.lista.add(Label + " es un fecha invalida");

          return;
        }
      }

      if (mm == 2)
      {
        int dias = ((yy % 4) == 0)
                   ? 28
                   : 29;

        if (dd > dias)
        {
          this.lista.add(Label + " es un fecha invalida");

          return;
        }
      }
      else if (dd > 31)
      {
        this.lista.add(Label + " es un fecha invalida");

        return;
      }

      dTexto = Long.parseLong(df2.format(z.getTime()));

      if (dActual < dTexto)
        this.lista.add(Label + " no puede ser superior a la fecha actual " + df1.format(new java.util.Date()));
    }
    catch (Exception e)
    {
      this.lista.add(Label + " es un fecha invalida");
    }
  }
    public void vAnio(String texto, boolean bObligatorio, String Label)
      {
          SimpleDateFormat df2;
          Calendar z;
          df2 = new SimpleDateFormat("yyyy");
          z = Calendar.getInstance();
          if(bObligatorio)
          {
              if(texto.length() < 4 || texto.length() > 4)
              {
                  this.lista.add(Label + " es a\u00f1o invalido");
                  return;
              }
          } else
          if(texto.length() == 0)
              return;
          int yy;
          long dTexto;    
          yy = Integer.parseInt(texto.substring(0));
          if(yy < 0 || yy > 2020)
          {
              this.lista.add(Label + " es un fecha invalida");
              return;
          }
          try
          {
             
              dTexto = Long.parseLong(df2.format(z.getTime()));
              if(yy > dTexto)
                  this.lista.add(Label + " no puede ser superior a la fecha actual ");
          }
          catch(Exception e)
          {
              this.lista.add(Label + " es un fecha invalida");
          }
          return;
      }
  //los valores posibles esta separados por ";" ejemlo "a;b;c;"
  public void vListaValores (String texto, boolean bObligatorio, String valores, String Label)
  {
    if (bObligatorio)
    {
      if (texto.length() == 0)
      {
        this.lista.add(Label + " es obligatorio");

        return;
      }
    }
    else
    {
      if (texto.length() == 0)
        return;
    }

    String valor = "";
    int i = 0;

    while (valores.length() > 0)
    {
      i = valores.indexOf(";");
      valor = valores.substring(0, i);
      valores = valores.substring(i + 1);

      if (texto.equals(valor))
        return;
    }

    this.lista.add(Label + " es un valor invalido");
  }
}