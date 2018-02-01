package Xml;

import java.util.Iterator;
import java.util.Vector;


public class dav_gen extends ValidaXml
{
  private String ref = "";
  private String anticipado = "";
  private String c30 = "";
  private String c31 = "";
  private String c32 = "";
  private String c33 = "";
  private String c40 = "";
  private String c41 = "";
  private String c42 = "";
  private String c43 = "";
  private String c50 = "";
  private String c51 = "";
  private String c52 = "";
  private String c53 = "";
  private String c60 = "";
  private String c61 = "";
  private String c62 = "";
  private String c63 = "";
  private String c70 = "";
  private String c81 = "";
  private String c82 = "";
  private String c83 = "";
  private String c90 = "";
  private String c100 = "";
  private String c110 = "";
  private String c120 = "";
  private String c130 = "";
  private String c140 = "";
  private String c150 = "";
  private String c160 = "";
  private String c170 = "";
  private String c180 = "";
  private String c190 = "";
  private String c200 = "";
  private String c210 = "";
  private String c220 = "";
  private String c230 = "";
  private String c240 = "";
  private String c250 = "";
  private String c260 = "";
  private String c270 = "";
  private String c271 = "";
  private String c280 = "";
  private String c290 = "";
  private String c300 = "";
  private String c310 = "";
  private String c320 = "";
  private String c330 = "";
  private String c340 = "";
  private String c350 = "";
  private String c360 = "";
  private String c361 = "";
  private String c370 = "";
  private String c380 = "";
  private String c390 = "";
  private String c400 = "";
  private String c410 = "";
  private String c420 = "";
  private String c430 = "";
  private String c440 = "";
  private String c450 = "";
  private String c460 = "";
  private String c470 = "";
  private String c480 = "";
  private String c490 = "";
  private String c500 = "";
  private String c510 = "";
  private String c520 = "";
  private String c530 = "";
  private String c540 = "";
  private String c550 = "";
  private String c560 = "";
  private String c570 = "";
  private String c580 = "";
  private String c590 = "";
  private String c600 = "";
  private String c610 = "";
  private String c611 = "";
  private String c620 = "";
  private String c621 = "";
  private String c622 = "";
  private String c631 = "";
  private String c632 = "";
  private String c633 = "";
  private String c634 = "";
  private String c630 = "";
  private String c640 = "";
  private String c650 = "";
  private String c660 = "";
  private String c670 = "";
  private String c1281 = "";
  private String c1282 = "";
  private String c1283 = "";
  private String c1270 = "";
  private String c1290 = "";
  private String c1300 = "";
  private String c1310 = "";
  private String c1320 = "";
  private String c1330 = "";
  private String c1340 = "";
  private String citem = "";
  private String cversion = "";
  private Vector dav_item;

  public dav_gen ()
  {
    this.dav_item = new Vector();
  }

  public void setRef (String sref)
  {
    vString(sref, false, 21, "N�mero de Referencia");
    this.ref = sref;
  }

  public String getRef ()
  {
    return ref;
  }

  public void setAnticipado (String santicipado)
  {
    vListaValores(santicipado, true, "0;1;", "Anticipado");
    this.anticipado = santicipado;
  }

  public String getAnticipado ()
  {
    return anticipado;
  }

  public void setC30 (String sc30)
  {
    vListaValores(sc30, false, "01;02;03;04;", "Casilla 3.1");
    this.c30 = sc30;
  }

  public String getC30 ()
  {
    return c30;
  }

  public void setC31 (String sc31)
  {
    vString(sc31, false, 25, "Casilla 3.2");
    this.c31 = sc31;
  }

  public String getC31 ()
  {
    return c31;
  }

  public void setC32 (String sc32)
  {
    vString(sc32, false, 25, "Casilla 3.3");
    this.c32 = sc32;
  }

  public String getC32 ()
  {
    return c32;
  }

  public void setC33 (String sc33)
  {
    vLong(sc33, false, 1935, 2025, "Casilla 3.4");
    this.c33 = sc33;
  }

  public String getC33 ()
  {
    return c33;
  }

  public void setC40 (String sc40)
  {
    vListaValores(sc40, false, "01;02;03;04;", "Casilla 4.1");
    this.c40 = sc40;
  }

  public String getC40 ()
  {
    return c40;
  }

  public void setC41 (String sc41)
  {
    vString(sc41, false, 25, "Casilla 4.2");
    this.c41 = sc41;
  }

  public String getC41 ()
  {
    return c41;
  }

  public void setC42 (String sc42)
  {
    vString(sc42, false, 25, "Casilla 4.3");
    this.c42 = sc42;
  }

  public String getC42 ()
  {
    return c42;
  }

  public void setC43 (String sc43)
  {
    vLong(sc43, false, 1935, 2025, "Casilla 4.4");
    this.c43 = sc43;
  }

  public String getC43 ()
  {
    return c43;
  }

  public void setC50 (String sc50)
  {
    vListaValores(sc50, false, "01;02;03;04;", "Casilla 5.1");
    this.c50 = sc50;
  }

  public String getC50 ()
  {
    return c50;
  }

  public void setC51 (String sc51)
  {
    vString(sc51, false, 25, "Casilla 5.2");
    this.c51 = sc51;
  }

  public String getC51 ()
  {
    return c51;
  }

  public void setC52 (String sc52)
  {
    vString(sc52, false, 25, "Casilla 5.3");
    this.c52 = sc52;
  }

  public String getC52 ()
  {
    return c52;
  }

  public void setC53 (String sc53)
  {
    vLong(sc53, false, 1935, 2025, "Casilla 5.4");
    this.c53 = sc53;
  }

  public String getC53 ()
  {
    return c53;
  }

  public void setC60 (String sc60)
  {
    vListaValores(sc60, false, "01;02;03;04;", "Casilla 6.1");
    this.c60 = sc60;
  }

  public String getC60 ()
  {
    return c60;
  }

  public void setC61 (String sc61)
  {
    vString(sc61, false, 25, "Casilla 6.2");
    this.c61 = sc61;
  }

  public String getC61 ()
  {
    return c61;
  }

  public void setC62 (String sc62)
  {
    vString(sc62, false, 25, "Casilla 6.3");
    this.c62 = sc62;
  }

  public String getC62 ()
  {
    return c62;
  }

  public void setC63 (String sc63)
  {
    vLong(sc63, false, 1935, 2025, "Casilla 6.4");
    this.c63 = sc63;
  }

  public String getC63 ()
  {
    return c63;
  }

  public void setC70 (String sc70)
  {
    vString(sc70, true, 70, "Casilla 7");
    this.c70 = sc70;
  }

  public String getC70 ()
  {
    return c70;
  }

  public void setC81 (String sc81)
  {
    vListaValores(sc81, true, "CI;NIT;PAS;RIN;RUN;", "Casilla 8.1");
    this.c81 = sc81;
  }

  public String getC81 ()
  {
    return c81;
  }

  public void setC82 (String sc82)
  {
    vString(sc82, true, 15, "Casilla 8.2");
    this.c82 = sc82;
  }

  public String getC82 ()
  {
    return c82;
  }

  public void setC83 (String sc83)
  {
    if( sc83.equals("CU") )
      sc83 = "CHU";
    if( sc83.equals("CB") )
      sc83 = "CBB";
    if( sc83.equals("SC") )
      sc83 = "STC";
    if( sc83.equals("TJ") )
      sc83 = "TRJ";
    if( sc83.equals("OT") )
      sc83 = "OTR";
      
    vListaValores(sc83, true, "CHU;CBB;BE;LP;OR;PA;PO;STC;TRJ;OTR;", "Casilla 8.3");
    this.c83 = sc83;
  }

  public String getC83 ()
  {
    return c83;
  }

  public void setC90 (String sc90)
  {
    vListaValores(sc90, true, "01;02;03;04;05;", "Casilla 9");
    this.c90 = sc90;
  }

  public String getC90 ()
  {
    return c90;
  }

  public void setC100 (String sc100)
  {
    vString(sc100, false, 30, "Casilla 10");
    this.c100 = sc100;
  }

  public String getC100 ()
  {
    return c100;
  }

  public void setC110 (String sc110)
  {
    vString(sc110, true, 70, "Casilla 11");
    this.c110 = sc110;
  }

  public String getC110 ()
  {
    return c110;
  }

  public void setC120 (String sc120)
  {
    vString(sc120, true, 30, "Casilla 12");
    this.c120 = sc120;
  }

  public String getC120 ()
  {
    return c120;
  }

  public void setC130 (String sc130)
  {
    vListaValores(sc130, true, 
                  "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", 
                  "Casilla 13");
    this.c130 = sc130;
  }

  public String getC130 ()
  {
    return c130;
  }

  public void setC140 (String sc140)
  {
    vString(sc140, false, 20, "Casilla 14");
    this.c140 = sc140;
  }

  public String getC140 ()
  {
    return c140;
  }

  public void setC150 (String sc150)
  {
    vString(sc150, false, 20, "Casilla 15");
    this.c150 = sc150;
  }

  public String getC150 ()
  {
    return c150;
  }

  public void setC160 (String sc160)
  {
    vString(sc160, false, 60, "Casilla 16");
    this.c160 = sc160;
  }

  public String getC160 ()
  {
    return c160;
  }

  public void setC170 (String sc170)
  {
    vString(sc170, true, 70, "Casilla 17");
    this.c170 = sc170;
  }

  public String getC170 ()
  {
    return c170;
  }

  public void setC180 (String sc180)
  {
    vListaValores(sc180, true, "01;02;03;04;", "Casilla 18");
    this.c180 = sc180;
  }

  public String getC180 ()
  {
    return c180;
  }

  public void setC190 (String sc190)
  {
    vString(sc190, false, 30, "Casilla 19");
    this.c190 = sc190;
  }

  public String getC190 ()
  {
    return c190;
  }

  public void setC200 (String sc200)
  {
    vString(sc200, true, 70, "Casilla 20");
    this.c200 = sc200;
  }

  public String getC200 ()
  {
    return c200;
  }

  public void setC210 (String sc210)
  {
    vString(sc210, true, 30, "Casilla 21");
    this.c210 = sc210;
  }

  public String getC210 ()
  {
    return c210;
  }

  public void setC220 (String sc220)
  {
    vListaValores(sc220, true, 
                  "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", 
                  "Casilla 22");
    this.c220 = sc220;
  }

  public String getC220 ()
  {
    return c220;
  }

  public void setC230 (String sc230)
  {
    vString(sc230, false, 20, "Casilla 23");
    this.c230 = sc230;
  }

  public String getC230 ()
  {
    return c230;
  }

  public void setC240 (String sc240)
  {
    vString(sc240, false, 20, "Casilla 24");
    this.c240 = sc240;
  }

  public String getC240 ()
  {
    return c240;
  }

  public void setC250 (String sc250)
  {
    vString(sc250, false, 60, "Casilla 25");
    this.c250 = sc250;
  }

  public String getC250 ()
  {
    return c250;
  }

  public void setC260 (String sc260)
  {
    vLong(sc260, true, 1, 999, "Casilla 26");
    this.c260 = sc260;
  }

  public String getC260 ()
  {
    return c260;
  }

  public void setC270 (String sc270)
  {
    vString(sc270, false, 60, "Casilla 27");
    this.c270 = sc270;
  }

  public String getC270 ()
  {
    return c270;
  }

  public void setC271 (String sc271)
  {
    vFecha(sc271, false, "Casilla 27 Fecha");
    this.c271 = sc271;
  }

  public String getC271 ()
  {
    return c271;
  }

  public void setC280 (String sc280)
  {
    vString(sc280, false, 30, "Casilla 28");
    this.c280 = sc280;
  }

  public String getC280 ()
  {
    return c280;
  }

  public void setC290 (String sc290)
  {
    vListaValores(sc290, true, "01;02;03;04;05;06;", "Casilla 29");
    this.c290 = sc290;
  }

  public String getC290 ()
  {
    return c290;
  }

  public void setC300 (String sc300)
  {
    vString(sc300, false, 30, "Casilla 30");
    this.c300 = sc300;
  }

  public String getC300 ()
  {
    return c300;
  }

  public void setC310 (String sc310)
  {
    vListaValores(sc310, true, "01;02;03;04;05;06;07;", "Casilla 31");
    this.c310 = sc310;
  }

  public String getC310 ()
  {
    return c310;
  }

  public void setC320 (String sc320)
  {
    vString(sc320, false, 30, "Casilla 32");
    this.c320 = sc320;
  }

  public String getC320 ()
  {
    return c320;
  }

  public void setC330 (String sc330)
  {
    vListaValores(sc330, true, "01;02;", "Casilla 33");
    this.c330 = sc330;
  }

  public String getC330 ()
  {
    return c330;
  }

  public void setC340 (String sc340)
  {
    vListaValores(sc340, true, "01;02;03;04;05;06;07;08;09;10;11;12;13;14;15;16;17;18;19;20;21;22;23;", "Casilla 34");
    this.c340 = sc340;
  }

  public String getC340 ()
  {
    return c340;
  }

  public void setC350 (String sc350)
  {
    vString(sc350, false, 30, "Casilla 35");
    this.c350 = sc350;
  }

  public String getC350 ()
  {
    return c350;
  }

  public void setC360 (String sc360)
  {
    vListaValores(sc360, true, "EXW;FCA;FAS;FOB;CFR;CIF;CPT;CIP;DAF;DES;DEQ;DDU;DDP;OTR;", "Casilla 36");
    this.c360 = sc360;
  }

  public String getC360 ()
  {
    return c360;
  }

  public void setC361 (String sc361)
  {
    vString(sc361, true, 25, "Casilla 35 (Lugar)");
    this.c361 = sc361;
  }

  public String getC361 ()
  {
    return c361;
  }

  public void setC370 (String sc370)
  {
    vString(sc370, false, 30, "Casilla 37");
    this.c370 = sc370;
  }

  public String getC370 ()
  {
    return c370;
  }

  public void setC380 (String sc380)
  {
    vDouble(sc380, true, 0.0D, 99999999.999D, "Casilla 38");
    this.c380 = sc380;
  }

  public String getC380 ()
  {
    return c380;
  }

  public void setC390 (String sc390)
  {
    vListaValores(sc390, true, "SI;NO;", "Casilla 39");
    this.c390 = sc390;
  }

  public String getC390 ()
  {
    return c390;
  }

  public void setC400 (String sc400)
  {
    vListaValores(sc400, false, "01;02;03;04;", "Casilla 40");
    this.c400 = sc400;
  }

  public String getC400 ()
  {
    return c400;
  }

  public void setC410 (String sc410)
  {
    vString(sc410, false, 30, "Casilla 41");
    this.c410 = sc410;
  }

  public String getC410 ()
  {
    return c410;
  }

  public void setC420 (String sc420)
  {
    vString(sc420, false, 70, "Casilla 42");
    this.c420 = sc420;
  }

  public String getC420 ()
  {
    return c420;
  }

  public void setC430 (String sc430)
  {
    vString(sc430, false, 70, "Casilla 43");
    this.c430 = sc430;
  }

  public String getC430 ()
  {
    return c430;
  }

  public void setC440 (String sc440)
  {
    vString(sc440, false, 30, "Casilla 44");
    this.c440 = sc440;
  }

  public String getC440 ()
  {
    return c440;
  }

  public void setC450 (String sc450)
  {
    vListaValores(sc450, false, 
                  "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", 
                  "Casilla 45");
    this.c450 = sc450;
  }

  public String getC450 ()
  {
    return c450;
  }

  public void setC460 (String sc460)
  {
    vString(sc460, false, 20, "Casilla 46");
    this.c460 = sc460;
  }

  public String getC460 ()
  {
    return c460;
  }

  public void setC470 (String sc470)
  {
    vString(sc470, false, 20, "Casilla 47");
    this.c470 = sc470;
  }

  public String getC470 ()
  {
    return c470;
  }

  public void setC480 (String sc480)
  {
    vString(sc480, false, 60, "Casilla 48");
    this.c480 = sc480;
  }

  public String getC480 ()
  {
    return c480;
  }

  public void setC490 (String sc490)
  {
    vListaValores(sc490, true, "SI;NO;", "Casilla 49");
    this.c490 = sc490;
  }

  public String getC490 ()
  {
    return c490;
  }

  public void setC500 (String sc500)
  {
    vListaValores(sc500, false, "01;02;03;04;", "Casilla 50");
    this.c500 = sc500;
  }

  public String getC500 ()
  {
    return c500;
  }

  public void setC510 (String sc510)
  {
    vListaValores(sc510, true, "SI;NO;", "Casilla 51");
    this.c510 = sc510;
  }

  public String getC510 ()
  {
    return c510;
  }

  public void setC520 (String sc520)
  {
    vListaValores(sc520, false, "01;02;03;04;05;06;07;08;09;", "Casilla 52");
    this.c520 = sc520;
  }

  public String getC520 ()
  {
    return c520;
  }

  public void setC530 (String sc530)
  {
    vString(sc530, false, 30, "Casilla 53");
    this.c530 = sc530;
  }

  public String getC530 ()
  {
    return c530;
  }

  public void setC540 (String sc540)
  {
    vListaValores(sc540, false, "SI;NO;", "Casilla 54");
    this.c540 = sc540;
  }

  public String getC540 ()
  {
    return c540;
  }

  public void setC550 (String sc550)
  {
    vListaValores(sc550, true, "SI;NO;", "Casilla 55");
    this.c550 = sc550;
  }

  public String getC550 ()
  {
    return c550;
  }

  public void setC560 (String sc560)
  {
    vListaValores(sc560, true, "SI;NO;", "Casilla 56");
    this.c560 = sc560;
  }

  public String getC560 ()
  {
    return c560;
  }

  public void setC570 (String sc570)
  {
    vListaValores(sc570, true, "SI;NO;", "Casilla 57");
    this.c570 = sc570;
  }

  public String getC570 ()
  {
    return c570;
  }

  public void setC580 (String sc580)
  {
    vListaValores(sc580, false, "01;02;03;04;05;06;07;08;", "Casilla 58");
    this.c580 = sc580;
  }

  public String getC580 ()
  {
    return c580;
  }

  public void setC590 (String sc590)
  {
    vListaValores(sc590, false, "SI;NO;", "Casilla 59");
    this.c590 = sc590;
  }

  public String getC590 ()
  {
    return c590;
  }

  public void setC600 (String sc600)
  {
    vListaValores(sc600, false, "SI;NO;", "Casilla 60");
    this.c600 = sc600;
  }

  public String getC600 ()
  {
    return c600;
  }

  public void setC610 (String sc610)
  {
    vString(sc610, false, 30, "Casilla 61");
    this.c610 = sc610;
  }

  public String getC610 ()
  {
    return c610;
  }

  public void setC611 (String sc611)
  {
    vFecha(sc611, false, "Casilla 61 (Fecha)");
    this.c611 = sc611;
  }

  public String getC611 ()
  {
    return c611;
  }

  public void setC620 (String sc620)
  {
    vDouble(sc620, true, 0.0D, 99999999.999D, "Casilla 62");
    this.c620 = sc620;
  }

  public String getC620 ()
  {
    return c620;
  }

  public void setC621 (String sc621)
  {
    vDouble(sc621, true, 0.0D, 99999999.999D, "Casilla 62.1");
    this.c621 = sc621;
  }

  public String getC621 ()
  {
    return c621;
  }

  public String getC622 ()
  {
    return c622;
  }

  public void setC622 (String newC622)
  {
    vListaValores(newC622, false, 
                  "211;221;241;261;311;361;421;422;521;531;542;543;621;622;641;643;711;721;722;741;743;761;841;862;921;", 
                  "Casilla 62.2");
    c622 = newC622;
  }

  public void setC631 (String sc631)
  {
    vDouble(sc631, true, 0.0D, 99999999.999D, "Casilla 63.1");
    this.c631 = sc631;
  }

  public String getC631 ()
  {
    return c631;
  }

  public void setC632 (String sc632)
  {
    vDouble(sc632, true, 0.0D, 99999999.999D, "Casilla 63.2");
    this.c632 = sc632;
  }

  public String getC632 ()
  {
    return c632;
  }

  public void setC633 (String sc633)
  {
    vDouble(sc633, true, 0.0D, 99999999.999D, "Casilla 63.3");
    this.c633 = sc633;
  }

  public String getC633 ()
  {
    return c633;
  }

  public void setC634 (String sc634)
  {
    vDouble(sc634, true, 0.0D, 99999999.999D, "Casilla 63.4");
    this.c634 = sc634;
  }

  public String getC634 ()
  {
    return c634;
  }

  public void setC630 (String sc630)
  {
    vDouble(sc630, true, 0.0D, 99999999.999D, "Casilla 63");
    this.c630 = sc630;
  }

  public String getC630 ()
  {
    return c630;
  }

  public void setC640 (String sc640)
  {
    vDouble(sc640, true, 0.0D, 99999999.999D, "Casilla 64");
    this.c640 = sc640;
  }

  public String getC640 ()
  {
    return c640;
  }

  public void setC650 (String sc650)
  {
    vDouble(sc650, true, 0.0D, 99999999.999D, "Casilla 65");
    this.c650 = sc650;
  }

  public String getC650 ()
  {
    return c650;
  }

  public void setC660 (String sc660)
  {
    vDouble(sc660, true, 0.0D, 99999999.999D, "Casilla 66");
    this.c660 = sc660;
  }

  public String getC660 ()
  {
    return c660;
  }

  public void setC670 (String sc670)
  {
    vDouble(sc670, true, 0.0D, 99999999.999D, "Casilla 67");
    this.c670 = sc670;
  }

  public String getC670 ()
  {
    return c670;
  }

  public void setC1281 (String sc1281)
  {
    vListaValores(sc1281, true, "CI;NIT;PAS;RIN;RUN;", "Casilla 128.1");
    this.c1281 = sc1281;
  }

  public String getC1281 ()
  {
    return c1281;
  }

  public void setC1282 (String sc1282)
  {
    vString(sc1282, true, 15, "Casilla 128.2");
    this.c1282 = sc1282;
  }

  public String getC1282 ()
  {
    return c1282;
  }

  public void setC1283 (String sc1283)
  {
    if( sc1283.equals("CU") )
      sc1283 = "CHU";
    if( sc1283.equals("CB") )
      sc1283 = "CBB";
    if( sc1283.equals("SC") )
      sc1283 = "STC";
    if( sc1283.equals("TJ") )
      sc1283 = "TRJ";
    if( sc1283.equals("OT") )
      sc1283 = "OTR";
      
    vListaValores(sc1283, true, "CHU;CBB;BE;LP;OR;PA;PO;STC;TRJ;OTR;", "Casilla 128.3");
    this.c1283 = sc1283;
  }

  public String getC1283 ()
  {
    return c1283;
  }

  public void setC1270 (String sc1270)
  {
    vString(sc1270, true, 70, "Casilla 127");
    this.c1270 = sc1270;
  }

  public String getC1270 ()
  {
    return c1270;
  }

  public void setC1290 (String sc1290)
  {
    vString(sc1290, false, 70, "Casilla 129");
    this.c1290 = sc1290;
  }

  public String getC1290 ()
  {
    return c1290;
  }

  public void setC1300 (String sc1300)
  {
    vString(sc1300, false, 30, "Casilla 130");
    this.c1300 = sc1300;
  }

  public String getC1300 ()
  {
    return c1300;
  }

  public void setC1310 (String sc1310)
  {
    vString(sc1310, false, 20, "Casilla 131");
    this.c1310 = sc1310;
  }

  public String getC1310 ()
  {
    return c1310;
  }

  public void setC1320 (String sc1320)
  {
    vString(sc1320, false, 70, "Casilla 132");
    this.c1320 = sc1320;
  }

  public String getC1320 ()
  {
    return c1320;
  }

  public void setC1330 (String sc1330)
  {
    vString(sc1330, false, 30, "Casilla 133");
    this.c1330 = sc1330;
  }

  public String getC1330 ()
  {
    return c1330;
  }

  public void setC1340 (String sc1340)
  {
    vString(sc1340, false, 250, "Casilla 135");
    this.c1340 = sc1340;
  }

  public String getC1340 ()
  {
    return c1340;
  }

  public String getCitem ()
  {
    return citem;
  }

  public void setCitem (String newcitem)
  {
    vLong(newcitem, true, 1, 9999, "N�mero de �tems");
    citem = newcitem;
  }

  public String getCversion ()
  {
    return cversion;
  }

  public void setCversion (String newcversion)
  {
    vDouble(newcversion, true, 0.0, 9.9, "Versi�n");
    cversion = newcversion;
  }

  public void addDav_item (dav_item a)
  {
    ValidaItem(a);
    this.dav_item.add(a);

    for( Iterator i = a.lista.iterator(); i.hasNext(); )
      lista.add( (String) i.next() + " �tem " + a.getC680() + "." );
  }

  public int getDav_item ()
  {
    return dav_item.size();
  }

  public dav_item getDav_item (int i)
  {
    return (dav_item) dav_item.get(i);
  }

  public void ValidaItem (dav_item a)
  {
    if (lista.size() > 0)
      return;

    if (a.getC680().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 68 es obligatorio");

    if (a.getC690().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 69 es obligatorio");
    else if ((a.getC690().length() < 9) || (a.getC690().length() > 10))
      this.lista.add("Item " + a.getC680() + "-- Casilla 69 longitud invalida");

    if (a.getC700().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 70 es obligatorio");

    if (a.getC701().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 70 (Fecha) es obligatorio");

    if (a.getC710().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 71 es obligatorio");
    else
    {
      if (a.getC710().equals("99999"))
      {
        if (a.getC711().equals(""))
          this.lista.add("Item " + a.getC680() + "-- Casilla 71.1 es obligatorio");
      }
      else
        a.setC711("");
    }

    if (a.getC7101().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 72 es obligatorio");
    else
    {
      if (a.getC7101().indexOf(".99999:") > 0)
      {
        if (a.getC7102().equals(""))
          this.lista.add("Item " + a.getC680() + "-- Casilla 72.1 es obligatorio");
      }
      else
      {
        if (!a.getC7102().equals("0"))
          a.setC7102("");
      }
    }

    if (a.getC7103().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 73 es obligatorio item " + a.getC680());
    else
    {
      if (a.getC7103().indexOf(".99999:") > 0)
      {
        if (a.getC7104().equals(""))
          this.lista.add("Item " + a.getC680() + "-- Casilla 73.1 es obligatorio");
      }
      else
      {
        if (!a.getC7104().equals("0"))
          a.setC7104("");
      }
    }

    if (a.getC7105().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 74 es obligatorio");
    else
    {
      if (a.getC7105().indexOf(".99999:") > 0)
      {
        if (a.getC7106().equals(""))
          this.lista.add("Item " + a.getC680() + "-- Casilla 74.1 es obligatorio");
      }
      else
      {
        if (!a.getC7106().equals("0"))
          a.setC7106("");
      }
    }

    if (a.getC7107().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 75 es obligatorio");
    else
    {
      if (a.getC7107().indexOf(".99999:") > 0)
      {
        if (a.getC7108().equals(""))
          this.lista.add("Item " + a.getC680() + "-- Casilla 75.1 es obligatorio");
      }
      else
      {
        if (!a.getC7108().equals("0"))
          a.setC7108("");
      }
    }

    if (a.getC7109().equals(""))
      this.lista.add("Item " + a.getC680() + "-- Casilla 81.1 es obligatorio");
    else
    {
      if (a.getC7109().indexOf(".99999:") > 0)
      {
        if (a.getC7110().equals(""))
          this.lista.add("Item " + a.getC680() + "-- Casilla 81.1.1 es obligatorio");
      }
      else
      {
        if (!a.getC7110().equals("0"))
          a.setC7110("");
      }
    }
  }

  public void validaCabecera ()
  {
    if (lista.size() > 0)
      return;

    if (this.anticipado.equals(""))
      this.lista.add("Anticiapdo es obligatorio");

    if (this.ref.equals(""))
      this.lista.add("N�mero de Referencia es obligatorio");

    if (!this.c30.equals(""))
    {
      if (this.c31.equals(""))
        this.lista.add("Casilla 3.2 es obligatorio");

      if (this.c32.equals(""))
        this.lista.add("Casilla 3.3 es obligatorio");

      if (this.c30.equals("03") || this.c30.equals("04"))
      {
        if (this.c33.equals(""))
          this.lista.add("Casilla 3.4 es obligatorio");
      }
      else
        this.c33 = "";
    }
    else
    {
      this.c31 = "";
      this.c32 = "";
      this.c33 = "";
    }

    if (!this.c40.equals(""))
    {
      if (this.c41.equals(""))
        this.lista.add("Casilla 4.2 es obligatorio");

      if (this.c42.equals(""))
        this.lista.add("Casilla 4.3 es obligatorio");

      if (this.c40.equals("03") || this.c40.equals("04"))
      {
        if (this.c43.equals(""))
          this.lista.add("Casilla 4.4 es obligatorio");
      }
      else
        this.c43 = "";
    }
    else
    {
      this.c41 = "";
      this.c42 = "";
      this.c43 = "";
    }

    if (!this.c50.equals(""))
    {
      if (this.c51.equals(""))
        this.lista.add("Casilla 5.2 es obligatorio");

      if (this.c52.equals(""))
        this.lista.add("Casilla 5.3 es obligatorio");

      if (this.c50.equals("03") || this.c50.equals("04"))
      {
        if (this.c53.equals(""))
          this.lista.add("Casilla 5.4 es obligatorio");
      }
      else
        this.c53 = "";
    }
    else
    {
      this.c51 = "";
      this.c52 = "";
      this.c53 = "";
    }

    if (!this.c60.equals(""))
    {
      if (this.c61.equals(""))
        this.lista.add("Casilla 6.2 es obligatorio");

      if (this.c62.equals(""))
        this.lista.add("Casilla 6.3 es obligatorio");

      if (this.c60.equals("03") || this.c60.equals("04"))
      {
        if (this.c63.equals(""))
          this.lista.add("Casilla 6.4 es obligatorio");
      }
      else
        this.c63 = "";
    }
    else
    {
      this.c61 = "";
      this.c62 = "";
      this.c63 = "";
    }

    if (this.c70.equals(""))
      this.lista.add("Casilla 7 es obligatorio");

    if (this.c81.equals(""))
      this.lista.add("Casilla 8.1 es obligatorio");

    if (this.c82.equals(""))
      this.lista.add("Casilla 8.2 es obligatorio");

    if (this.c83.equals(""))
      this.lista.add("Casilla 8.3 es obligatorio");

    if (this.c90.equals(""))
      this.lista.add("Casilla 9 es obligatorio");
    else
    {
      if (this.c90.equals("05"))
      {
        if (this.c100.equals(""))
          this.lista.add("Casilla 10 es obligatorio");
      }
      else
        this.c100 = "";
    }

    if (this.c110.equals(""))
      this.lista.add("Casilla 11 es obligatorio");

    if (this.c120.equals(""))
      this.lista.add("Casilla 12 es obligatorio");

    if (this.c130.equals(""))
      this.lista.add("Casilla 13 es obligatorio");

    if (this.c170.equals(""))
      this.lista.add("Casilla 17 es obligatorio");

    if (this.c180.equals(""))
      this.lista.add("Casilla 18 es obligatorio");
    else
    {
      if (this.c180.equals("04"))
      {
        if (this.c190.equals(""))
          this.lista.add("Casilla 19 es obligatorio");
      }
      else
        this.c190 = "";
    }

    if (this.c200.equals(""))
      this.lista.add("Casilla 20 es obligatorio");

    if (this.c210.equals(""))
      this.lista.add("Casilla 21 es obligatorio");

    if (this.c220.equals(""))
      this.lista.add("Casilla 22 es obligatorio");

    if (this.c260.equals(""))
      this.lista.add("Casilla 26 es obligatorio");

    if (this.c290.equals(""))
      this.lista.add("Casilla 29 es obligatorio");
    else
    {
      if (this.c290.equals("04") || this.c290.equals("06"))
      {
        if (this.c300.equals(""))
          this.lista.add("Casilla 30 es obligatorio");
      }

      if (this.c290.equals("05"))
      {
        this.c300 = "";
        this.c310 = "";
        this.c320 = "";
      }
    }

    if (this.c310.equals("07"))
    {
      if (this.c320.equals(""))
        this.lista.add("Casilla 32 es obligatorio");
    }

    if (this.c330.equals(""))
      this.lista.add("Casilla 33 es obligatorio");

    if (this.c340.equals(""))
      this.lista.add("Casilla 34 es obligatorio");
    else
    {
      if (this.c340.equals("20") || this.c340.equals("22") || this.c340.equals("23"))
      {
        if (this.c350.equals(""))
          this.lista.add("Casilla 35 es obligatorio");
      }
    }

    if (this.c360.equals(""))
      this.lista.add("Casilla 36 es obligatorio");
    else
    {
      if (this.c360.equals("OTR"))
      {
        if (this.c370.equals(""))
          this.lista.add("Casilla 37 es obligatorio");
      }
    }

    if (this.c361.equals(""))
      this.lista.add("Casilla 36 (Lugar) es obligatorio");

    if (this.c380.equals(""))
      this.lista.add("Casilla 38 es obligatorio");

    if (this.c390.equals(""))
      this.lista.add("Casilla 39 es obligatorio");
    else
    {
      if (this.c390.equals("SI"))
      {
        if (this.c400.equals(""))
          this.lista.add("Casilla 40 es obligatorio");
        else
        {
          if (this.c400.equals("04"))
          {
            if (this.c410.equals(""))
              this.lista.add("Casilla 41 es obligatorio");
          }
        }

        if (this.c420.equals(""))
          this.lista.add("Casilla 42 es obligatorio");

        if (this.c430.equals(""))
          this.lista.add("Casilla 43 es obligatorio");

        if (this.c440.equals(""))
          this.lista.add("Casilla 44 es obligatorio");

        if (this.c450.equals(""))
          this.lista.add("Casilla 45 es obligatorio");
      }
      else
      {
        this.c400 = "";
        this.c410 = "";
        this.c420 = "";
        this.c430 = "";
        this.c440 = "";
        this.c450 = "";
        this.c460 = "";
        this.c470 = "";
        this.c480 = "";
      }
    }

    if (this.c490.equals(""))
      this.lista.add("Casilla 49 es obligatorio");
    else
    {
      if (this.c490.equals("SI"))
      {
        if (this.c500.equals(""))
          this.lista.add("Casilla 50 es obligatorio");
      }
    }

    if (this.c510.equals(""))
      this.lista.add("Casilla 51 es obligatorio");
    else
    {
      if (this.c510.equals("SI"))
      {
        if (this.c520.equals(""))
          this.lista.add("Casilla 52 es obligatorio");
        else
        {
          if (this.c520.equals("09"))
            if (this.c530.equals(""))
              this.lista.add("Casilla 53 es obligatorio");
        }

        if (this.c540.equals(""))
          this.lista.add("Casilla 54 es obligatorio");
      }
      else
      {
        this.c520 = "";
        this.c530 = "";
        this.c540 = "";
      }
    }

    if (this.c550.equals(""))
      this.lista.add("Casilla 55 es obligatorio");

    if (this.c560.equals(""))
      this.lista.add("Casilla 56 es obligatorio");

    if (this.c570.equals(""))
      this.lista.add("Casilla 57 es obligatorio");
    else
    {
      if (this.c570.equals("SI"))
      {
        if (this.c580.equals(""))
          this.lista.add("Casilla 58 es obligatorio");

        if (this.c590.equals(""))
          this.lista.add("Casilla 59 es obligatorio");
        else
        {
          if (this.c590.equals("NO"))
          {
            if (this.c600.equals(""))
              this.lista.add("Casilla 60 es obligatorio");
            else
            {
              if (this.c600.equals("SI"))
              {
                if (this.c610.equals(""))
                  this.lista.add("Casilla 61 es obligatorio");

                if (this.c611.equals(""))
                  this.lista.add("Casilla 61 (Fecha) es obligatorio");
              }
              else
              {
                this.c610 = "";
                this.c611 = "";
              }
            }
          }
          else
          {
            this.c600 = "";
            this.c610 = "";
            this.c611 = "";
          }
        }
      }
      else
      {
        this.c580 = "";
        this.c590 = "";
        this.c600 = "";
        this.c610 = "";
        this.c611 = "";
      }
    }

    if (this.c620.equals(""))
      this.lista.add("Casilla 62 es obligatorio");

    if (this.c621.equals(""))
      this.lista.add("Casilla 62.1 es obligatorio");

    if (this.c631.equals(""))
      this.lista.add("Casilla 63.1 es obligatorio");

    if (this.c632.equals(""))
      this.lista.add("Casilla 63.2 es obligatorio");

    if (this.c633.equals(""))
      this.lista.add("Casilla 63.3 es obligatorio");

    if (this.c634.equals(""))
      this.lista.add("Casilla 63.4 es obligatorio");

    if (this.c630.equals(""))
      this.lista.add("Casilla 63. es obligatorio");

    if (this.c640.equals(""))
      this.lista.add("Casilla 64 es obligatorio");

    if (this.c650.equals(""))
      this.lista.add("Casilla 65 es obligatorio");

    if (this.c660.equals(""))
      this.lista.add("Casilla 66 es obligatorio");

    if (this.c670.equals(""))
      this.lista.add("Casilla 67 es obligatorio");

    if (this.cversion.equals(""))
      this.lista.add("No es un formato valido");

    if (this.citem.equals(""))
      this.lista.add("No existe la descripci�n de los �tems");
  }
}