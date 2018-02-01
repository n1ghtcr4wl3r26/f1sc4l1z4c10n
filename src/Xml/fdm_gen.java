package Xml;

import java.util.Iterator;
import java.util.Vector;


public class fdm_gen extends ValidaXml
{
	private String ref = "";
    private String anticipado = "";
    private String tdi = "";
    private String ndi = "";
    private String nom = "";
    private String dir = "";
    private String cty = "";
    private String nrsp ="";
    private String dirp = "";
    private String ctyp = "";
    private String cpp = "";
    private String telp = "";
    private String faxp = "";
    private String emlp = "";
    private String cfp = "";
    private String nfp = "";
    private String citem = "";
    private String cversion = "";
    private Vector fdm_item;

    public fdm_gen()
    {
        
        this.fdm_item = new Vector();
    }

    public void setRef(String ref)
    {
        vString(ref, false, 50, "N�mero de Referencia");
        this.ref = ref;
    }

    public String getRef()
    {
        return ref;
    }

    public void setAnticipado(String anticipado)
    {
        vListaValores(anticipado, true, "0;1;", "Anticipado");
        this.anticipado = anticipado;
    }

    public String getAnticipado()
    {
        return anticipado;
    }

    public void setTdi(String tdi)
    {
        vListaValores(tdi, true, "CI;NIT;PAS;RIN;RUN;CE;OI;", "Tipo de Documento");
        this.tdi = tdi;
    }

    public String getTdi()
    {
        return tdi;
    }

    public void setNdi(String ndi)
    {
        vString(ndi, true, 15, "Numero de Documento");
        this.ndi = ndi;
    }

    public String getNdi()
    {
        return ndi;
    }

    public void setNrsp(String nrsp)
    {
        vString(nrsp, true, 50, "Nombre del Proveedor");
        this.nrsp = nrsp;
    }

    public String getNrsp()
    {
        return nrsp;
    }

    public void setDirp(String dirp)
    {
        vString(dirp, true, 50, "Direccion del Proveedor");
        this.dirp = dirp;
    }

    public String getDirp()
    {
        return dirp;
    }

    public void setCtyp(String ctyp)
    {
        vString(ctyp, true, 20, "Ciudad del Proveedor");
        this.ctyp = ctyp;
    }

    public String getCtyp()
    {
        return ctyp;
    }

    public void setCpp(String cpp)
    {
        vListaValores(cpp, true, "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", "Codigo Pais");
        this.cpp = cpp;
    }

    public String getCpp()
    {
        return cpp;
    }

    public void setTelp(String telp)
    {
        this.telp = telp;
    }

    public String getTelp()
    {
        return telp;
    }

    public void setFaxp(String faxp)
    {
        this.faxp = faxp;
    }

    public String getFaxp()
    {
        return faxp;
    }

    public void setEmlp(String emlp)
    {
        this.emlp = emlp;
    }

    public String getEmlp()
    {
        return emlp;
    }

    public void setCfp(String cfp)
    {
        vDouble(cfp, true, 0.0D, 99999999.999D, "Cantidad Facturas");
        this.cfp = cfp;
    }

    public String getCfp()
    {
        return cfp;
    }

    public void setNfp(String nfp)
    {
        //vLong(nfp, true, 1, 999999999, "Numero Facturas");
        vString(nfp, true, 100, "Numero Facturas");
        this.nfp = nfp;
    }

    public String getNfp()
    {
        return nfp;
    }

    public String getCitem()
    {
        return citem;
    }

    public void setCitem(String newcitem)
    {
        vLong(newcitem, true, 1, 9999, "Numero de Items");
        citem = newcitem;
    }

    public String getCversion()
    {
        return cversion;
    }

    public void setCversion(String newcversion)
    {
        vDouble(newcversion, true, 0.0, 9.9, "Version");
        cversion = newcversion;
    }

    public void addFdm_item(fdm_item a)
    {
        //ValidaItem(a);
        this.fdm_item.add(a);
        for( Iterator i = a.lista.iterator(); i.hasNext(); ) 
            lista.add( (String) i.next() + " �tem " + a.getItm()+ "." );
    }

    public int getFdm_item()
    {
        return fdm_item.size();
    }

    public fdm_item getFdm_item(int i)
    {
        return (fdm_item)fdm_item.get(i);
    }

    public void ValidaItem(fdm_item a)
    {
        if(lista.size() > 0)
            return;
        if(a.getItm().equals(""))
            this.lista.add("Item "+ a.getItm() + "-- ITEM es obligatorio");
        if(a.getNomc().equals("")){
            this.lista.add("Item " + a.getItm() + "-- NOMBRE es obligatorio");
        }else{
            if(a.getNomc().equals("99999")){
                if(a.getOesp().equals(""))
                    this.lista.add("Item " + a.getItm() + "-- OTRO ESPECIFIQUE es obligatorio");
            }
        }
        if(a.getOcat().equals(""))
            this.lista.add("Item " + a.getItm() + "-- OTRAS CARACTERISTICAS es obligatorio");
        if(a.getEst().equals("")){
            this.lista.add("Item " + a.getItm() + "-- ESTADO es obligatorio");
        }else{
            if(a.getOcat().equals("11")){
                if(a.getEsp1().equals(""))
                    this.lista.add("Item " + a.getItm() + "-- ESPECIFIQUE de Estado es obligatorio");
            }
        }
        
        if(a.getUndc().equals("")){
            this.lista.add("Item " + a.getItm() + "-- UNIDAD COMERCIAL es obligatorio");
        }else{
            if(a.getUndc().equals("99")){
                if(a.getEsp2().equals(""))
                    this.lista.add("Item " + a.getItm() + "-- ESPECIFIQUE es obligatorio");
            }
        }
        if(a.getPori().equals(""))
            this.lista.add("Item " + a.getItm() + "-- PAIS ORIGEN es obligatorio");
        if(a.getPemb().equals(""))
            this.lista.add("Item " + a.getItm() + "-- PAIS EMBARQUE es obligatorio");
        if(a.getPadq().equals(""))
            this.lista.add("Item " + a.getItm() + "-- PAIS ADQUISICION es obligatorio");
    }

    public void validaCabecera()
    {
        if(lista.size() > 0)
            return;
        if(this.anticipado.equals(""))
            this.lista.add("ANTICIPADO es obligatorio");
        if(this.ref.equals(""))
            this.lista.add("NUMERO DE REFERENCIA es obligatorio");
        if(this.tdi.equals(""))
            this.lista.add("TIPO DE DOCUMENTO es obligatorio");
        if(this.ndi.equals(""))
            this.lista.add("NUMERO DE DOCUMENTO es obligatorio");
        if(this.nrsp.equals(""))
            this.lista.add("NOMBRE O RAZON SOCIAL es obligatorio");
        if(this.dirp.equals(""))
            this.lista.add("DIRECCION PROVEEDOR es obligatorio");
        if(this.ctyp.equals(""))
            this.lista.add("CIUDAD PROVEEDOR es obligatorio");
        if(this.cpp.equals(""))
            this.lista.add("PAIS PROVEEDOR es obligatorio");
        if(this.cfp.equals(""))
            this.lista.add("CANTIDAD FACTURAS es obligatorio");
        if(this.nfp.equals(""))
            this.lista.add("NUMERO FACTURAS es obligatorio");
    }

    
}