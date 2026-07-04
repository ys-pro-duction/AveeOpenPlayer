package com.daaw;

import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.dS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3991dS0 {
    public static boolean e = false;
    public static final String f = null;
    public c a;
    public FQ b;
    public d c;
    public KQ d;

    /* JADX INFO: renamed from: com.daaw.dS0$a */
    public class a implements e {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // com.daaw.C3991dS0.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            C3991dS0.this.g(xmlPullParser, this.a, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.dS0$b */
    public class b implements e {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // com.daaw.C3991dS0.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            C3991dS0.this.j(xmlPullParser, this.a);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.dS0$c */
    public interface c {
        Object a(String str, String str2);
    }

    /* JADX INFO: renamed from: com.daaw.dS0$d */
    public interface d {
        Object a(String str, String str2, int i, String str3, String str4, String[] strArr);
    }

    /* JADX INFO: renamed from: com.daaw.dS0$e */
    public interface e {
        Object a(Object obj, Object obj2);
    }

    public C3991dS0(c cVar, FQ fq, d dVar, KQ kq) {
        this.a = cVar;
        this.b = fq;
        this.c = dVar;
        this.d = kq;
    }

    public List c(InputStream inputStream, C7378pX0 c7378pX0) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (e) {
                xmlPullParserNewPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist>\n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\">\n    <genrelist>\n     <genre name=\"Adult Alternative\" id=\"2\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Britpop\" id=\"3\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Classic Alternative\" id=\"4\" parentid=\"1\" haschildren=\"false\"/> \n    </genrelist>\n   </genre>\n  </genrelist>\n </data>\n</response>"));
            } else {
                xmlPullParserNewPullParser.setInput(inputStream, null);
            }
            xmlPullParserNewPullParser.nextTag();
            List list = (List) this.b.a(null);
            h(xmlPullParserNewPullParser, c7378pX0, new a(list));
            inputStream.close();
            return list;
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public List d(InputStream inputStream, C7378pX0 c7378pX0) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (e) {
                xmlPullParserNewPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <stationlist>\n   <tunein base=\"/sbin/tunein-station.pls\"/>\n   <station name=\".977 The Hitz Channel\" mt=\"audio/mpeg\" id=\"9907\" \n    br=\"128\" genre=\"Pop Rock Top 40\"\n    ct=\"Chingy - Balla Baby\" lc=\"11576\"/>\n   <station name=\"TechnoBase.FM - 24h Techno, Dance, Trance, House and More - 128k MP3-[SHOUTcast.com]\"\n    mt=\"audio/mpeg\"id=\"7429\" br=\"128\"genre=\"Techno Trance  Dance House\"\n    ct=\"We aRe oNe\" lc=\"8308\" ml=\"8500\" nsc=\"No\" cst=\"\"/>\n   <station name=\"Absolutely Smooth Jazz - S K Y . F M - the world's smoothest\n    jazz 24 hours a day-[SHOUTcast.com]\" mt=\"audio/mpeg\" id=\"948\"br=\"96\" genre=\"Soft Smooth Jazz\"\n    ct=\"Jonathan Butler/Kirk Whalum - Dancing on the Shore\" lc=\"6801\" ml=\"10023\" nsc=\"No\" cst=\"\"/>\n  </stationlist> \n </data>\n</response>"));
            } else {
                xmlPullParserNewPullParser.setInput(inputStream, null);
            }
            xmlPullParserNewPullParser.nextTag();
            List list = (List) this.d.a();
            h(xmlPullParserNewPullParser, c7378pX0, new b(list));
            inputStream.close();
            return list;
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public final void e(XmlPullParser xmlPullParser, e eVar) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, f, "data");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2 && !((Boolean) eVar.a(xmlPullParser.getName(), xmlPullParser)).booleanValue()) {
                n(xmlPullParser);
            }
        }
    }

    public final Object f(XmlPullParser xmlPullParser, List list) throws XmlPullParserException, IOException {
        String str = f;
        xmlPullParser.require(2, str, "genre");
        Object objA = this.a.a(xmlPullParser.getAttributeValue(str, "name"), xmlPullParser.getAttributeValue(str, "id"));
        List list2 = (List) this.b.a(objA);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals("genrelist") || list2 == null) {
                    n(xmlPullParser);
                } else {
                    g(xmlPullParser, list2, null);
                }
            }
        }
        return objA;
    }

    public final void g(XmlPullParser xmlPullParser, List list, List list2) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, f, "genrelist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("genre")) {
                    Object objF = f(xmlPullParser, null);
                    if (list != null) {
                        list.add(objF);
                    }
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void h(XmlPullParser xmlPullParser, C7378pX0 c7378pX0, e eVar) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, f, "response");
        String strL = null;
        String strL2 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("statusCode")) {
                    strL = l(xmlPullParser, name);
                } else if (name.equals("statusText")) {
                    strL2 = l(xmlPullParser, name);
                } else if (name.equals("data")) {
                    e(xmlPullParser, eVar);
                } else {
                    n(xmlPullParser);
                }
            }
        }
        if (strL == null || strL.equals("200")) {
            return;
        }
        c7378pX0.a(strL2);
    }

    public final Object i(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        String str = f;
        xmlPullParser.require(2, str, "station");
        String attributeValue = xmlPullParser.getAttributeValue(str, "name");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "id");
        int iX = AbstractC0405Bb1.x(xmlPullParser.getAttributeValue(str, "br"), 0);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "genre");
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "ct");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, str, "station");
        return this.c.a(attributeValue, attributeValue2, iX, attributeValue3, attributeValue4, strArr);
    }

    public final void j(XmlPullParser xmlPullParser, List list) throws XmlPullParserException, IOException {
        String[] strArr = {""};
        xmlPullParser.require(2, f, "stationlist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("tunein")) {
                    strArr[0] = m(xmlPullParser);
                } else if (name.equals("station")) {
                    Object objI = i(xmlPullParser, strArr);
                    if (list != null) {
                        list.add(objI);
                    }
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final String k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return "";
        }
        String text = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return text;
    }

    public final String l(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = f;
        xmlPullParser.require(2, str2, str);
        String strK = k(xmlPullParser);
        xmlPullParser.require(3, str2, str);
        return strK;
    }

    public final String m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str = f;
        xmlPullParser.require(2, str, "tunein");
        String attributeValue = xmlPullParser.getAttributeValue(str, "base");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, str, "tunein");
        return attributeValue;
    }

    public final void n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
