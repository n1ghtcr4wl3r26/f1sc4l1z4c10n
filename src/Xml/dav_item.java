package Xml;

import java.text.SimpleDateFormat;

import java.util.Date;


public class dav_item extends dav_gen
{
  private String c680 = "";
  private String c690 = "";
  private String c700 = "";
  private String c701 = "";
  private String c710 = "";
  private String c711 = "";
  private String c7101 = "";
  private String c7102 = "";
  private String c7103 = "";
  private String c7104 = "";
  private String c7105 = "";
  private String c7106 = "";
  private String c7107 = "";
  private String c7108 = "";
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
  private String c760 = "";
  private String c770 = "";
  private String c780 = "";
  private String c790 = "";
  private String c800 = "";
  private String c801 = "";
  private String c820 = "";
  private String c830 = "";
  private String c840 = "";
  private String c850 = "";
  private String c860 = "";
  private String c870 = "";
  private String c880 = "";
  private String c890 = "";
  private String c900 = "";
  private String c910 = "";
  private String c920 = "";
  private String c930 = "";
  private String c940 = "";
  private String c950 = "";
  private String c960 = "";
  private String c970 = "";
  private String c980 = "";
  private String c990 = "";
  private String c1000 = "";
  private String c1010 = "";
  private String c1020 = "";
  private String c1030 = "";
  private String c1040 = "";
  private String c1050 = "";
  private String c1060 = "";
  private String c1070 = "";
  private String c1080 = "";
  private String c1090 = "";
  private String c1100 = "";
  private String c1110 = "";
  private String c1120 = "";
  private String c1130 = "";
  private String c1140 = "";
  private String c1150 = "";
  private String c1160 = "";
  private String c1161 = "";
  private String c1170 = "";
  private String c1180 = "";
  private String c1190 = "";
  private String c1191 = "";
  private String c1200 = "";
  private String c1210 = "";
  private String c1220 = "";
  private String c1230 = "";
  private String c1240 = "";
  private String c1250 = "";
  private String c1221 = "";
  private String c1260 = "";

  public dav_item () {}

  public void setC680 (String sc680)
  {
    vLong(sc680, true, 1, 5000, "Casilla 68");
    this.c680 = sc680;
  }

  public String getC680 ()
  {
    return c680;
  }

  public void setC690 (String sc690)
  {
    vString(sc690, true, 10, "Casilla 69");
    this.c690 = sc690;
  }

  public String getC690 ()
  {
    return c690;
  }

  public void setC700 (String sc700)
  {
    vString(sc700, true, 25, "Casilla 70");
    this.c700 = sc700;
  }

  public String getC700 ()
  {
    return c700;
  }

  public void setC701 (String sc701)
  {
    vFecha(sc701, true, "Casilla 70 (Fecha)");
    this.c701 = sc701;
  }

  public String getC701 ()
  {
    return c701;
  }

  public void setC710 (String sc710)
  {
    vListaValores(sc710, true, "1;2;3;4;5;6;7;8;9;10;11;12;13;14;15;16;17;18;19;20;21;22;23;24;25;26;27;28;29;30;31;32;33;34;35;36;37;38;99999;", "Casilla 71");
    this.c710 = sc710;
  }

  public String getC710 ()
  {
    return c710;
  }

  public void setC711 (String sc711)
  {
    vString(sc711, false, 60, "Casilla 71.1");
    this.c711 = sc711;
  }

  public String getC711 ()
  {
    return c711;
  }

  public void setC760 (String sc760)
  {
    vListaValores(sc760, true, "01;02;03;04;05;06;07;08;09;10;11;", "Casilla 76");
    this.c760 = sc760;
  }

  public String getC760 ()
  {
    return c760;
  }

  public void setC770 (String sc770)
  {
    vString(sc770, false, 30, "Casilla 77");
    this.c770 = sc770;
  }

  public String getC770 ()
  {
    return c770;
  }

  public void setC780 (String sc780)
  {
    //vLong(sc780, true, 0, 2015, "Casilla 78");
    Date year = new Date();
    SimpleDateFormat formater = new SimpleDateFormat("yyyy");
    String anio = formater.format(year);
    vLong(sc780, true, 0, Long.parseLong(anio)+1, "Casilla 78");
    this.c780 = sc780;
  }

  public String getC780 ()
  {
    return c780;
  }

  public void setC790 (String sc790)
  {
    vDouble(sc790, true, 0.01, 99999999.99, "Casilla 79");
    this.c790 = sc790;
  }

  public String getC790 ()
  {
    return c790;
  }

  public void setC800 (String sc800)
  {
    vListaValores(sc800, true, "01;02;03;04;05;06;07;08;09;10;11;12;13;14;15;16;17;18;19;20;21;22;23;24;25;26;99;",
                  "Casilla 80");
    this.c800 = sc800;
  }

  public String getC800 ()
  {
    return c800;
  }

  public void setC801 (String sc801)
  {
    vString(sc801, false, 30, "Casilla 80.1");
    this.c801 = sc801;
  }

  public String getC801 ()
  {
    return c801;
  }

  public void setC820 (String sc820)
  {
    vDouble(sc820, true, 0, 9999999.999, "Casilla 82");
    this.c820 = sc820;
  }

  public String getC820 ()
  {
    return c820;
  }

  public void setC830 (String sc830)
  {
    vDouble(sc830, true, 0, 9999999.999, "Casilla 83");
    this.c830 = sc830;
  }

  public String getC830 ()
  {
    return c830;
  }

  public void setC840 (String sc840)
  {
    vDouble(sc840, true, 0, 9999999.999, "Casilla 84");
    this.c840 = sc840;
  }

  public String getC840 ()
  {
    return c840;
  }

  public void setC850 (String sc850)
  {
    vDouble(sc850, true, 0, 9999999.999, "Casilla 85");
    this.c850 = sc850;
  }

  public String getC850 ()
  {
    return c850;
  }

  public void setC860 (String sc860)
  {
    vDouble(sc860, true, 0, 9999999.999, "Casilla 86");
    this.c860 = sc860;
  }

  public String getC860 ()
  {
    return c860;
  }

  public void setC870 (String sc870)
  {
    vDouble(sc870, true, 0, 9999999.999, "Casilla 87");
    this.c870 = sc870;
  }

  public String getC870 ()
  {
    return c870;
  }

  public void setC880 (String sc880)
  {
    vDouble(sc880, true, 0, 9999999.999, "Casilla 88");
    this.c880 = sc880;
  }

  public String getC880 ()
  {
    return c880;
  }

  public void setC890 (String sc890)
  {
    vDouble(sc890, true, 0, 9999999.999, "Casilla 89");
    this.c890 = sc890;
  }

  public String getC890 ()
  {
    return c890;
  }

  public void setC900 (String sc900)
  {
    vDouble(sc900, true, 0, 9999999.999, "Casilla 90");
    this.c900 = sc900;
  }

  public String getC900 ()
  {
    return c900;
  }

  public void setC910 (String sc910)
  {
    vDouble(sc910, true, 0, 9999999.999, "Casilla 91");
    this.c910 = sc910;
  }

  public String getC910 ()
  {
    return c910;
  }

  public void setC920 (String sc920)
  {
    vListaValores(sc920, false, "01;02;03;04;05;06;07;08;", "Casilla 92");
    this.c920 = sc920;
  }

  public String getC920 ()
  {
    return c920;
  }

  public void setC930 (String sc930)
  {
    vDouble(sc930, true, 0, 9999999.999, "Casilla 93");
    this.c930 = sc930;
  }

  public String getC930 ()
  {
    return c930;
  }

  public void setC940 (String sc940)
  {
    vListaValores(sc940, false, "01;02;03;04;05;06;07;08;", "Casilla 94");
    this.c940 = sc940;
  }

  public String getC940 ()
  {
    return c940;
  }

  public void setC950 (String sc950)
  {
    vDouble(sc950, true, 0, 9999999.999, "Casilla 95");
    this.c950 = sc950;
  }

  public String getC950 ()
  {
    return c950;
  }

  public void setC960 (String sc960)
  {
    vListaValores(sc960, false, "01;02;03;04;05;06;07;08;", "Casilla 96");
    this.c960 = sc960;
  }

  public String getC960 ()
  {
    return c960;
  }

  public void setC970 (String sc970)
  {
    vDouble(sc970, true, 0, 9999999.999, "Casilla 97");
    this.c970 = sc970;
  }

  public String getC970 ()
  {
    return c970;
  }

  public void setC980 (String sc980)
  {
    vListaValores(sc980, false, "01;02;03;04;05;06;07;08;", "Casilla 98");
    this.c980 = sc980;
  }

  public String getC980 ()
  {
    return c980;
  }

  public void setC990 (String sc990)
  {
    vDouble(sc990, true, 0, 9999999.999, "Casilla 99");
    this.c990 = sc990;
  }

  public String getC990 ()
  {
    return c990;
  }

  public void setC1000 (String sc1000)
  {
    vListaValores(sc1000, false, "01;02;03;04;05;06;07;08;", "Casilla 100");
    this.c1000 = sc1000;
  }

  public String getC1000 ()
  {
    return c1000;
  }

  public void setC1010 (String sc1010)
  {
    vDouble(sc1010, true, 0, 9999999.999, "Casilla 101");
    this.c1010 = sc1010;
  }

  public String getC1010 ()
  {
    return c1010;
  }

  public void setC1020 (String sc1020)
  {
    vListaValores(sc1020, false, "01;02;03;04;05;06;07;08;", "Casilla 102");
    this.c1020 = sc1020;
  }

  public String getC1020 ()
  {
    return c1020;
  }

  public void setC1030 (String sc1030)
  {
    vDouble(sc1030, true, 0, 9999999.999, "Casilla 103");
    this.c1030 = sc1030;
  }

  public String getC1030 ()
  {
    return c1030;
  }

  public void setC1040 (String sc1040)
  {
    vListaValores(sc1040, false, "09;10;11;12;13;14;", "Casilla 104");
    this.c1040 = sc1040;
  }

  public String getC1040 ()
  {
    return c1040;
  }

  public void setC1050 (String sc1050)
  {
    vDouble(sc1050, true, 0, 9999999.999, "Casilla 105");
    this.c1050 = sc1050;
  }

  public String getC1050 ()
  {
    return c1050;
  }

  public void setC1060 (String sc1060)
  {
    vListaValores(sc1060, false, "09;10;11;12;13;14;", "Casilla 106");
    this.c1060 = sc1060;
  }

  public String getC1060 ()
  {
    return c1060;
  }

  public void setC1070 (String sc1070)
  {
    vDouble(sc1070, true, 0, 9999999.999, "Casilla 107");
    this.c1070 = sc1070;
  }

  public String getC1070 ()
  {
    return c1070;
  }

  public void setC1080 (String sc1080)
  {
    vListaValores(sc1080, false, "09;10;11;12;13;14;", "Casilla 108");
    this.c1080 = sc1080;
  }

  public String getC1080 ()
  {
    return c1080;
  }

  public void setC1090 (String sc1090)
  {
    vDouble(sc1090, true, 0, 9999999.999, "Casilla 109");
    this.c1090 = sc1090;
  }

  public String getC1090 ()
  {
    return c1090;
  }

  public void setC1100 (String sc1100)
  {
    vListaValores(sc1100, false, "09;10;11;12;13;14;", "Casilla 110");
    this.c1100 = sc1100;
  }

  public String getC1100 ()
  {
    return c1100;
  }

  public void setC1110 (String sc1110)
  {
    vDouble(sc1110, true, 0, 9999999.999, "Casilla 111");
    this.c1110 = sc1110;
  }

  public String getC1110 ()
  {
    return c1110;
  }

  public void setC1120 (String sc1120)
  {
    vDouble(sc1120, true, 0, 99999999.999, "Casilla 112");
    this.c1120 = sc1120;
  }

  public String getC1120 ()
  {
    return c1120;
  }

  public void setC1130 (String sc1130)
  {
    vDouble(sc1130, true, 0, 9999999.999, "Casilla 113");
    this.c1130 = sc1130;
  }

  public String getC1130 ()
  {
    return c1130;
  }

  public void setC1140 (String sc1140)
  {
    vString(sc1140, false, 20, "Casilla 114");
    this.c1140 = sc1140;
  }

  public String getC1140 ()
  {
    return c1140;
  }

  public void setC1150 (String sc1150)
  {
    vListaValores(sc1150, false, 
                  "AED;AFN;ALL;AMD;ANG;AOA;ARS;AUD;AWG;AZM;BAM;BBD;BDT;BGN;BHD;BIF;BMD;BND;BOB;BOV;BRL;BSD;BTN;BWP;BYR;BZD;CAD;CDF;CHF;CLF;CLP;CNY;COP;COU;CRC;CSD;CUP;CVE;CYP;CZK;DJF;DKK;DOP;DZD;EEK;EGP;ERN;ETB;EUR;FJD;FKP;GBP;GEL;GHC;GIP;GMD;GNF;GTQ;GYD;HKD;HNL;HRK;HTG;HUF;IDR;ILS;INR;IQD;IRR;ISK;JMD;JOD;JPY;KES;KGS;KHR;KMF;KPW;KRW;KWD;KYD;KZT;LAK;LBP;LKR;LRD;LSL;LTL;LVL;LYD;MAD;MDL;MGA;MKD;MMK;MNT;MOP;MRO;MTL;MUR;MVR;MWK;MXN;MXV;MYR;MZM;NAD;NGN;NIO;NOK;NPR;NZD;OMR;PAB;PEN;PGK;PHP;PKR;PLN;PYG;QAR;RON;RUB;RWF;SAR;SBD;SCR;SDD;SEK;SGD;SHP;SKK;SLL;SOS;SRD;STD;SYP;SZL;THB;TJS;TMM;TND;TOP;TRY;TTD;TWD;TZS;UAH;UGX;USD;USN;USS;UYU;UZS;VEB;VEF;VND;VUV;WST;XAF;XAG;XAU;XBA;XBB;XBC;XBD;XCD;XDR;XFO;XFU;XOF;XPD;XPF;XPT;XTS;XXX;YER;ZAR;ZMK;ZWD;", 
                  "Casilla 115");
    this.c1150 = sc1150;
  }

  public String getC1150 ()
  {
    return c1150;
  }

  public void setC1160 (String sc1160)
  {
    vDouble(sc1160, true, 0, 9999999.999, "Casilla 116");
    this.c1160 = sc1160;
  }

  public String getC1160 ()
  {
    return c1160;
  }

  public void setC1161 (String sc1161)
  {
    vFecha(sc1161, false, "Casilla 116 (Fecha)");
    this.c1161 = sc1161;
  }

  public String getC1161 ()
  {
    return c1161;
  }

  public void setC1170 (String sc1170)
  {
    vString(sc1170, false, 20, "Casilla 117");
    this.c1170 = sc1170;
  }

  public String getC1170 ()
  {
    return c1170;
  }

  public void setC1180 (String sc1180)
  {
    vListaValores(sc1180, false, 
                  "AED;AFN;ALL;AMD;ANG;AOA;ARS;AUD;AWG;AZM;BAM;BBD;BDT;BGN;BHD;BIF;BMD;BND;BOB;BOV;BRL;BSD;BTN;BWP;BYR;BZD;CAD;CDF;CHF;CLF;CLP;CNY;COP;COU;CRC;CSD;CUP;CVE;CYP;CZK;DJF;DKK;DOP;DZD;EEK;EGP;ERN;ETB;EUR;FJD;FKP;GBP;GEL;GHC;GIP;GMD;GNF;GTQ;GYD;HKD;HNL;HRK;HTG;HUF;IDR;ILS;INR;IQD;IRR;ISK;JMD;JOD;JPY;KES;KGS;KHR;KMF;KPW;KRW;KWD;KYD;KZT;LAK;LBP;LKR;LRD;LSL;LTL;LVL;LYD;MAD;MDL;MGA;MKD;MMK;MNT;MOP;MRO;MTL;MUR;MVR;MWK;MXN;MXV;MYR;MZM;NAD;NGN;NIO;NOK;NPR;NZD;OMR;PAB;PEN;PGK;PHP;PKR;PLN;PYG;QAR;RON;RUB;RWF;SAR;SBD;SCR;SDD;SEK;SGD;SHP;SKK;SLL;SOS;SRD;STD;SYP;SZL;THB;TJS;TMM;TND;TOP;TRY;TTD;TWD;TZS;UAH;UGX;USD;USN;USS;UYU;UZS;VEB;VEF;VND;VUV;WST;XAF;XAG;XAU;XBA;XBB;XBC;XBD;XCD;XDR;XFO;XFU;XOF;XPD;XPF;XPT;XTS;XXX;YER;ZAR;ZMK;ZWD;", 
                  "Casilla 118");
    this.c1180 = sc1180;
  }

  public String getC1180 ()
  {
    return c1180;
  }

  public void setC1190 (String sc1190)
  {
    vDouble(sc1190, true, 0, 9999999.999, "Casilla 119");
    this.c1190 = sc1190;
  }

  public String getC1190 ()
  {
    return c1190;
  }

  public void setC1191 (String sc1191)
  {
    vFecha(sc1191, false, "Casilla 119 (Fecha)");
    this.c1191 = sc1191;
  }

  public String getC1191 ()
  {
    return c1191;
  }

  public void setC1200 (String sc1200)
  {
    vString(sc1200, false, 20, "Casilla 120");
    this.c1200 = sc1200;
  }

  public String getC1200 ()
  {
    return c1200;
  }

  public void setC1210 (String sc1210)
  {
    vListaValores(sc1210, false, 
                  "AED;AFN;ALL;AMD;ANG;AOA;ARS;AUD;AWG;AZM;BAM;BBD;BDT;BGN;BHD;BIF;BMD;BND;BOB;BOV;BRL;BSD;BTN;BWP;BYR;BZD;CAD;CDF;CHF;CLF;CLP;CNY;COP;COU;CRC;CSD;CUP;CVE;CYP;CZK;DJF;DKK;DOP;DZD;EEK;EGP;ERN;ETB;EUR;FJD;FKP;GBP;GEL;GHC;GIP;GMD;GNF;GTQ;GYD;HKD;HNL;HRK;HTG;HUF;IDR;ILS;INR;IQD;IRR;ISK;JMD;JOD;JPY;KES;KGS;KHR;KMF;KPW;KRW;KWD;KYD;KZT;LAK;LBP;LKR;LRD;LSL;LTL;LVL;LYD;MAD;MDL;MGA;MKD;MMK;MNT;MOP;MRO;MTL;MUR;MVR;MWK;MXN;MXV;MYR;MZM;NAD;NGN;NIO;NOK;NPR;NZD;OMR;PAB;PEN;PGK;PHP;PKR;PLN;PYG;QAR;RON;RUB;RWF;SAR;SBD;SCR;SDD;SEK;SGD;SHP;SKK;SLL;SOS;SRD;STD;SYP;SZL;THB;TJS;TMM;TND;TOP;TRY;TTD;TWD;TZS;UAH;UGX;USD;USN;USS;UYU;UZS;VEB;VEF;VND;VUV;WST;XAF;XAG;XAU;XBA;XBB;XBC;XBD;XCD;XDR;XFO;XFU;XOF;XPD;XPF;XPT;XTS;XXX;YER;ZAR;ZMK;ZWD;", 
                  "Casilla 121");
    this.c1210 = sc1210;
  }

  public String getC1210 ()
  {
    return c1210;
  }

  public void setC1220 (String sc1220)
  {
    vDouble(sc1220, true, 0, 9999999.999, "Casilla 122");
    this.c1220 = sc1220;
  }

  public String getC1220 ()
  {
    return c1220;
  }

  public void setC1230 (String sc1230)
  {
    vString(sc1230, false, 20, "Casilla 123");
    this.c1230 = sc1230;
  }

  public String getC1230 ()
  {
    return c1230;
  }

  public void setC1240 (String sc1240)
  {
    vListaValores(sc1240, true, 
                  "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", 
                  "Casilla 124");
    this.c1240 = sc1240;
  }

  public String getC1240 ()
  {
    return c1240;
  }

  public void setC1250 (String sc1250)
  {
    vListaValores(sc1250, true, 
                  "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", 
                  "Casilla 125");
    this.c1250 = sc1250;
  }

  public String getC1250 ()
  {
    return c1250;
  }

  public String getC1221 ()
  {
    return c1221;
  }

  public void setC1221 (String newC1221)
  {
    vFecha(newC1221, false, "Casilla 122 (Fecha)");
    c1221 = newC1221;
  }

  public String getC1260 ()
  {
    return c1260;
  }

  public void setC1260 (String newC1260)
  {
    vListaValores(newC1260, true, 
                  "AD;AE;AF;AG;AI;AL;AM;AN;AO;AQ;AR;AS;AT;AU;AW;AX;AZ;BA;BB;BD;BE;BF;BG;BH;BI;BJ;BM;BN;BO;BR;BS;BT;BV;BW;BY;BZ;CA;CC;CD;CF;CG;CH;CI;CK;CL;CM;CN;CO;CR;CU;CV;CX;CY;CZ;DE;DJ;DK;DM;DO;DZ;EC;EE;EG;EH;ER;ES;ET;FI;FJ;FK;FM;FO;FR;FX;GA;GB;GD;GE;GF;GG;GH;GI;GL;GM;GN;GP;GQ;GR;GS;GT;GU;GW;GY;HK;HM;HN;HR;HT;HU;ID;IE;IL;IM;IN;IO;IQ;IR;IS;IT;JE;JM;JO;JP;KE;KG;KH;KI;KM;KN;KP;KR;KW;KY;KZ;LA;LB;LC;LI;LK;LR;LS;LT;LU;LV;LY;MA;MC;MD;ME;MG;MH;MK;ML;MM;MN;MO;MP;MQ;MR;MS;MT;MU;MV;MW;MX;MY;MZ;NA;NC;NE;NF;NG;NI;NL;NO;NP;NR;NU;NZ;OM;PA;PE;PF;PG;PH;PK;PL;PM;PN;PR;PS;PT;PW;PY;QA;RE;RO;RS;RU;RW;SA;SB;SC;SD;SE;SG;SH;SI;SJ;SK;SL;SM;SN;SO;SR;ST;SV;SY;SZ;TC;TD;TF;TG;TH;TJ;TK;TL;TM;TN;TO;TR;TT;TV;TW;TZ;UA;UG;UM;US;UY;UZ;VA;VC;VE;VG;VI;VN;VU;WF;WS;YE;YT;ZA;ZF;ZM;ZW;", 
                  "Casilla 126");
    c1260 = newC1260;
  }

  public void setC7101 (String sc7101)
  {
    this.c7101 = sc7101;
  }

  public String getC7101 ()
  {
    return c7101;
  }

  public void setC7102 (String sc7102)
  {
    this.c7102 = sc7102;
  }

  public String getC7102 ()
  {
    return c7102;
  }

  public void setC7103 (String sc7103)
  {
    this.c7103 = sc7103;
  }

  public String getC7103 ()
  {
    return c7103;
  }

  public void setC7104 (String sc7104)
  {
    this.c7104 = sc7104;
  }

  public String getC7104 ()
  {
    return c7104;
  }

  public void setC7105 (String sc7105)
  {
    this.c7105 = sc7105;
  }

  public String getC7105 ()
  {
    return c7105;
  }

  public void setC7106 (String sc7106)
  {
    this.c7106 = sc7106;
  }

  public String getC7106 ()
  {
    return c7106;
  }

  public void setC7107 (String sc7107)
  {
    this.c7107 = sc7107;
  }

  public String getC7107 ()
  {
    return c7107;
  }

  public void setC7108 (String sc7108)
  {
    this.c7108 = sc7108;
  }

  public String getC7108 ()
  {
    return c7108;
  }

  public void setC7109 (String sc7109)
  {
    this.c7109 = sc7109;
  }

  public String getC7109 ()
  {
    return c7109;
  }

  public void setC7110 (String sc7110)
  {
    this.c7110 = sc7110;
  }

  public String getC7110 ()
  {
    return c7110;
  }

  public void setC7111 (String sc7111)
  {
    this.c7111 = sc7111;
  }

  public String getC7111 ()
  {
    return c7111;
  }

  public void setC7112 (String sc7112)
  {
    this.c7112 = sc7112;
  }

  public String getC7112 ()
  {
    return c7112;
  }

  public void setC7113 (String sc7113)
  {
    this.c7113 = sc7113;
  }

  public String getC7113 ()
  {
    return c7113;
  }

  public void setC7114 (String sc7114)
  {
    this.c7114 = sc7114;
  }

  public String getC7114 ()
  {
    return c7114;
  }

  public void setC7115 (String sc7115)
  {
    this.c7115 = sc7115;
  }

  public String getC7115 ()
  {
    return c7115;
  }

  public void setC7116 (String sc7116)
  {
    this.c7116 = sc7116;
  }

  public String getC7116 ()
  {
    return c7116;
  }

  public void setC7117 (String sc7117)
  {
    this.c7117 = sc7117;
  }

  public String getC7117 ()
  {
    return c7117;
  }

  public void setC7118 (String sc7118)
  {
    this.c7118 = sc7118;
  }

  public String getC7118 ()
  {
    return c7118;
  }

  public void setC7119 (String sc7119)
  {
    this.c7119 = sc7119;
  }

  public String getC7119 ()
  {
    return c7119;
  }

  public void setC7120 (String sc7120)
  {
    this.c7120 = sc7120;
  }

  public String getC7120 ()
  {
    return c7120;
  }

  public void setC7121 (String sc7121)
  {
    this.c7121 = sc7121;
  }

  public String getC7121 ()
  {
    return c7121;
  }

  public void setC7122 (String sc7122)
  {
    this.c7122 = sc7122;
  }

  public String getC7122 ()
  {
    return c7122;
  }

  public void setC7123 (String sc7123)
  {
    this.c7123 = sc7123;
  }

  public String getC7123 ()
  {
    return c7123;
  }

  public void setC7124 (String sc7124)
  {
    this.c7124 = sc7124;
  }

  public String getC7124 ()
  {
    return c7124;
  }

  public void setC7125 (String sc7125)
  {
    this.c7125 = sc7125;
  }

  public String getC7125 ()
  {
    return c7125;
  }

  public void setC7126 (String sc7126)
  {
    this.c7126 = sc7126;
  }

  public String getC7126 ()
  {
    return c7126;
  }

  public void setC7127 (String sc7127)
  {
    this.c7127 = sc7127;
  }

  public String getC7127 ()
  {
    return c7127;
  }

  public void setC7128 (String sc7128)
  {
    this.c7128 = sc7128;
  }

  public String getC7128 ()
  {
    return c7128;
  }
}