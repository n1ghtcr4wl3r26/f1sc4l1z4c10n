package Xml;


public class fdm_item extends fdm_gen
{
    private String itm = "";
    private String nomc = "";
    private String oesp = "";
    private String ocat = "";
    private String est = "";
    private String esp1 = "";
    private String afab = "";
    private String cant = "";
    private String undc = "";
    private String esp2 = "";
    private String fobi = "";
    private String pori = "";
    private String pemb = "";
    private String padq = "";
    private String marca = "";
    private String esp21 = "";
    private String tipo = "";
    private String esp31 = "";
    private String clase = "";
    private String esp41 = "";
    private String model = "";
    private String esp51 = "";
    
    //SE AUMENTO EN FECHA 28/07/2015 A SOLICITUD DE NORMAS 
    private String c7109 = "";
    private String c7110 = "";
    private String c7111 = "";
    private String c7112 = "";
    private String c7113 = "";
    private String c7114 = "";
    private String c7115 = "";
    private String c7116 = "";
    private String c7117 = "";
    private String c7118 = "";
    private String c7119 = "";
    private String c7120 = "";
    private String c7121 = "";
    private String c7122 = "";
    private String c7123 = "";
    private String c7124 = "";
    private String c7125 = "";
    private String c7126 = "";
    private String c7127 = "";
    private String c7128 = "";
    //FIN

    public fdm_item()
    {

    }

    public void setItm(String itm)
    {
        vLong(itm, true, 1, 5000, "Item");
        this.itm = itm;
    }

    public String getItm()
    {
        return itm;
    }

    public void setNomc(String nomc)
    {
        vListaValores(nomc, true, "1;2;3;4;5;6;7;8;9;10;11;12;13;14;15;16;17;18;19;20;21;22;23;24;25;26;27;28;29;30;31;32;33;34;35;36;37;38;99999;", "Nombre Comercial");
        this.nomc = nomc;
    }

    public String getNomc()
    {
        return nomc;
    }

    public void setOesp(String oesp)
    {
        vString(oesp, false, 20, "Otro Especifico");
        this.oesp = oesp;
    }

    public String getOesp()
    {
        return oesp;
    }

    public void setOcat(String ocat)
    {
        vString(ocat, false,250, "Otras Caracteristicas");
        this.ocat = ocat;
    }

    public String getOcat()
    {
        return ocat;
    }

    public void setEst(String est)
    {
        vListaValores(est, true, "01;02;03;04;05;06;07;08;09;10;11;", "Estado");
        this.est = est;
    }

    public String getEst()
    {
        return est;
    }

    public void setEsp1(String esp1)
    {
        vString(esp1, false, 20, "Especifique");
        this.esp1 = esp1;
    }

    public String getEsp1()
    {
        return esp1;
    }

    public void setUndc(String undc)
    {
        vListaValores(undc, true, "01;02;03;04;05;06;07;08;09;10;11;12;13;14;15;16;17;18;19;20;21;22;23;24;25;26;99;", "Unidad Comercial");
        this.undc = undc;
    }

    public String getUndc()
    {
        return undc;
    }

    public void setEsp2(String esp2)
    {
        vString(esp2, false, 30, "Especifique");
        this.esp2 = esp2;
    }

    public String getEsp2()
    {
        return esp2;
    }

    public void setPori(String pori)
    {
        vListaValores(pori, true, "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", "Pais Origen");
        this.pori = pori;
    }

    public String getPori()
    {
        return pori;
    }

    public void setPemb(String pemb)
    {
        vListaValores(pemb, true, "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", "Pais Embarque");
        this.pemb = pemb;
    }

    public String getPemb()
    {
        return pemb;
    }

    public void setPadq(String padq)
    {
        vListaValores(padq, true, "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", "Pais Adquisicion");
        this.padq = padq;
    }

    public String getPadq()
    {
        return padq;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setEsp21(String esp21)
    {
        this.esp21 = esp21;
    }

    public String getEsp21()
    {
        return esp21;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setEsp31(String esp31)
    {
        this.esp31 = esp31;
    }

    public String getEsp31()
    {
        return esp31;
    }

    public void setClase(String clase)
    {
        this.clase = clase;
    }

    public String getClase()
    {
        return clase;
    }

    public void setEsp41(String esp41)
    {
        this.esp41 = esp41;
    }

    public String getEsp41()
    {
        return esp41;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    public void setEsp51(String esp51)
    {
        this.esp51 = esp51;
    }

    public String getEsp51()
    {
        return esp51;
    }

    public void setAfab(String afab)
    {
        vAnio(afab, false, "Año");
        this.afab = afab;
    }

    public String getAfab()
    {
        return afab;
    }

    public void setCant(String cant)
    {
        vDouble(cant, true, 0.0, 99999999.999, "Cantidad");
        this.cant = cant;
    }

    public String getCant()
    {
        return cant;
    }

    public void setFobi(String fobi)
    {
        vDouble(fobi, true, 0.0, 99999999.999, "FOB ITEM");
        this.fobi = fobi;
    }

    public String getFobi()
    {
        return fobi;
    }

    public void setC7109(String c7109) {
        this.c7109 = c7109;
    }

    public String getC7109() {
        return c7109;
    }

    public void setC7110(String c7110) {
        this.c7110 = c7110;
    }

    public String getC7110() {
        return c7110;
    }

    public void setC7111(String c7111) {
        this.c7111 = c7111;
    }

    public String getC7111() {
        return c7111;
    }

    public void setC7112(String c7112) {
        this.c7112 = c7112;
    }

    public String getC7112() {
        return c7112;
    }

    public void setC7113(String c7113) {
        this.c7113 = c7113;
    }

    public String getC7113() {
        return c7113;
    }

    public void setC7114(String c7114) {
        this.c7114 = c7114;
    }

    public String getC7114() {
        return c7114;
    }

    public void setC7115(String c7115) {
        this.c7115 = c7115;
    }

    public String getC7115() {
        return c7115;
    }

    public void setC7116(String c7116) {
        this.c7116 = c7116;
    }

    public String getC7116() {
        return c7116;
    }

    public void setC7117(String c7117) {
        this.c7117 = c7117;
    }

    public String getC7117() {
        return c7117;
    }

    public void setC7118(String c7118) {
        this.c7118 = c7118;
    }

    public String getC7118() {
        return c7118;
    }

    public void setC7119(String c7119) {
        this.c7119 = c7119;
    }

    public String getC7119() {
        return c7119;
    }

    public void setC7120(String c7120) {
        this.c7120 = c7120;
    }

    public String getC7120() {
        return c7120;
    }

    public void setC7121(String c7121) {
        this.c7121 = c7121;
    }

    public String getC7121() {
        return c7121;
    }

    public void setC7122(String c7122) {
        this.c7122 = c7122;
    }

    public String getC7122() {
        return c7122;
    }

    public void setC7123(String c7123) {
        this.c7123 = c7123;
    }

    public String getC7123() {
        return c7123;
    }

    public void setC7124(String c7124) {
        this.c7124 = c7124;
    }

    public String getC7124() {
        return c7124;
    }

    public void setC7125(String c7125) {
        this.c7125 = c7125;
    }

    public String getC7125() {
        return c7125;
    }

    public void setC7126(String c7126) {
        this.c7126 = c7126;
    }

    public String getC7126() {
        return c7126;
    }

    public void setC7127(String c7127) {
        this.c7127 = c7127;
    }

    public String getC7127() {
        return c7127;
    }

    public void setC7128(String c7128) {
        this.c7128 = c7128;
    }

    public String getC7128() {
        return c7128;
    }
}