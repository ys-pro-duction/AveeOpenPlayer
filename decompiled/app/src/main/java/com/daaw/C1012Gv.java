package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.daaw.C3561bt0;
import com.daaw.LO0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: com.daaw.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1012Gv extends DefaultHandler implements C3561bt0.a {
    public static final Pattern c = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern d = Pattern.compile("CC([1-4])=.*");
    public static final Pattern e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public final String a;
    public final XmlPullParserFactory b;

    /* JADX INFO: renamed from: com.daaw.Gv$a */
    public static final class a {
        public final Format a;
        public final String b;
        public final LO0 c;
        public final String d;
        public final ArrayList e;
        public final ArrayList f;
        public final long g;

        public a(Format format, String str, LO0 lo0, String str2, ArrayList arrayList, ArrayList arrayList2, long j) {
            this.a = format;
            this.b = str;
            this.c = lo0;
            this.d = str2;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = j;
        }
    }

    public C1012Gv() {
        this(null);
    }

    public static int A(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C0499Bz c0499Bz = (C0499Bz) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c0499Bz.a) && (str = c0499Bz.b) != null) {
                Matcher matcher = e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
            }
        }
        return -1;
    }

    public static long D(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : AbstractC6280lb1.O(attributeValue);
    }

    public static C0499Bz E(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strZ = Z(xmlPullParser, "schemeIdUri", "");
        String strZ2 = Z(xmlPullParser, "value", null);
        String strZ3 = Z(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!AbstractC0541Cj1.c(xmlPullParser, str));
        return new C0499Bz(strZ, strZ2, strZ3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int F(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "value"
            java.lang.String r4 = r4.getAttributeValue(r2, r3)
            java.lang.String r4 = com.daaw.AbstractC6280lb1.a0(r4)
            r2 = -1
            if (r4 != 0) goto L11
            return r2
        L11:
            int r3 = r4.hashCode()
            switch(r3) {
                case 1596796: goto L3b;
                case 2937391: goto L30;
                case 3094035: goto L25;
                case 3133436: goto L1a;
                default: goto L18;
            }
        L18:
            r4 = -1
            goto L45
        L1a:
            java.lang.String r3 = "fa01"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L23
            goto L18
        L23:
            r4 = 3
            goto L45
        L25:
            java.lang.String r3 = "f801"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2e
            goto L18
        L2e:
            r4 = 2
            goto L45
        L30:
            java.lang.String r3 = "a000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L39
            goto L18
        L39:
            r4 = 1
            goto L45
        L3b:
            java.lang.String r3 = "4000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L44
            goto L18
        L44:
            r4 = 0
        L45:
            switch(r4) {
                case 0: goto L4f;
                case 1: goto L4e;
                case 2: goto L4c;
                case 3: goto L49;
                default: goto L48;
            }
        L48:
            return r2
        L49:
            r4 = 8
            return r4
        L4c:
            r4 = 6
            return r4
        L4e:
            return r0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1012Gv.F(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long G(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : AbstractC6280lb1.P(attributeValue);
    }

    public static String H(List list) {
        for (int i = 0; i < list.size(); i++) {
            C0499Bz c0499Bz = (C0499Bz) list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(c0499Bz.a) && "ec+3".equals(c0499Bz.b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float L(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = c.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f;
    }

    public static int N(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long O(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static String Z(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static int o(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        AbstractC7115ob.f(i == i2);
        return i;
    }

    public static String p(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC7115ob.f(str.equals(str2));
        return str;
    }

    public static void q(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(size);
            if (!schemeData.c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((DrmInitData.SchemeData) arrayList.get(i)).b(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public static String s(String str, String str2) {
        if (AbstractC8834uk0.k(str)) {
            return AbstractC8834uk0.a(str2);
        }
        if (AbstractC8834uk0.m(str)) {
            return AbstractC8834uk0.j(str2);
        }
        if (t(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if ("stpp".equals(str2)) {
                return "application/ttml+xml";
            }
            if ("wvtt".equals(str2)) {
                return "application/x-mp4-vtt";
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    public static boolean t(String str) {
        return AbstractC8834uk0.l(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    public static String y(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.next();
        return AbstractC0401Ba1.c(str, xmlPullParser.getText());
    }

    public static int z(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C0499Bz c0499Bz = (C0499Bz) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c0499Bz.a) && (str = c0499Bz.b) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair B(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1012Gv.B(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int C(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public EventMessage I(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        long jO = O(xmlPullParser, "id", 0L);
        long jO2 = O(xmlPullParser, "duration", -9223372036854775807L);
        long jO3 = O(xmlPullParser, "presentationTime", 0L);
        return c(str, str2, jO, AbstractC6280lb1.T(jO2, 1000L, j), J(xmlPullParser, byteArrayOutputStream), AbstractC6280lb1.T(jO3, 1000000L, j));
    }

    public byte[] J(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, null);
        xmlPullParser.nextToken();
        while (!AbstractC0541Cj1.c(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public C4228eI K(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String strZ = Z(xmlPullParser, "schemeIdUri", "");
        String strZ2 = Z(xmlPullParser, "value", "");
        long jO = O(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        while (true) {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "Event")) {
                j = jO;
                str = strZ2;
                str2 = strZ;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(I(xmlPullParser2, str2, str, j, byteArrayOutputStream));
            } else {
                j = jO;
                str = strZ2;
                str2 = strZ;
                xmlPullParser2 = xmlPullParser;
            }
            if (AbstractC0541Cj1.c(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            strZ = str2;
            strZ2 = str;
            jO = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            EventMessage eventMessage = (EventMessage) arrayList.get(i);
            jArr[i] = eventMessage.E;
            eventMessageArr[i] = eventMessage;
        }
        return d(str2, str, j, jArr, eventMessageArr);
    }

    public C7859rE0 M(XmlPullParser xmlPullParser) {
        return R(xmlPullParser, "sourceURL", "range");
    }

    public C0908Fv P(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        C1012Gv c1012Gv;
        long j;
        long jD = D(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jG = G(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jG2 = G(xmlPullParser, "minBufferTime", -9223372036854775807L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        boolean z = false;
        if (attributeValue != null && "dynamic".equals(attributeValue)) {
            z = true;
        }
        long jG3 = z ? G(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jG4 = z ? G(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jG5 = z ? G(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jD2 = D(xmlPullParser, "publishTime", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        C3193ab1 c3193ab1B0 = null;
        long j2 = z ? -9223372036854775807L : 0L;
        boolean z2 = false;
        boolean z3 = false;
        String strY = str;
        Uri uri = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    strY = y(xmlPullParser, strY);
                    z2 = true;
                    c1012Gv = this;
                    j = jD;
                }
                c1012Gv = this;
                j = jD;
                j2 = j2;
            } else {
                if (AbstractC0541Cj1.e(xmlPullParser, "UTCTiming")) {
                    c3193ab1B0 = b0(xmlPullParser);
                } else if (AbstractC0541Cj1.e(xmlPullParser, "Location")) {
                    uri = Uri.parse(xmlPullParser.nextText());
                } else if (!AbstractC0541Cj1.e(xmlPullParser, "Period") || z3) {
                    c1012Gv = this;
                    j = jD;
                    j2 = j2;
                } else {
                    c1012Gv = this;
                    j = jD;
                    Pair pairQ = c1012Gv.Q(xmlPullParser, strY, j2);
                    C1421Kt0 c1421Kt0 = (C1421Kt0) pairQ.first;
                    long j3 = j2;
                    if (c1421Kt0.b != -9223372036854775807L) {
                        long jLongValue = ((Long) pairQ.second).longValue();
                        j2 = jLongValue == -9223372036854775807L ? -9223372036854775807L : c1421Kt0.b + jLongValue;
                        arrayList.add(c1421Kt0);
                    } else {
                        if (!z) {
                            throw new C3000Zs0("Unable to determine start of period " + arrayList.size());
                        }
                        j2 = j3;
                        z3 = true;
                    }
                }
                c1012Gv = this;
                j = jD;
            }
            if (AbstractC0541Cj1.c(xmlPullParser, "MPD")) {
                if (jG == -9223372036854775807L) {
                    if (j2 != -9223372036854775807L) {
                        jG = j2;
                    } else if (!z) {
                        throw new C3000Zs0("Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new C3000Zs0("No periods found.");
                }
                return c1012Gv.f(j, jG, jG2, z, jG3, jG4, jG5, jD2, c3193ab1B0, uri, arrayList);
            }
            jD = j;
            c3193ab1B0 = c3193ab1B0;
            jG4 = jG4;
            jD2 = jD2;
            jG3 = jG3;
            jG5 = jG5;
        }
    }

    public Pair Q(XmlPullParser xmlPullParser, String str, long j) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long jG = G(xmlPullParser, "start", j);
        long jG2 = G(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        LO0 lo0W = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = y(xmlPullParser, str);
                    z = true;
                }
            } else if (AbstractC0541Cj1.e(xmlPullParser, "AdaptationSet")) {
                arrayList.add(v(xmlPullParser, str, lo0W));
            } else if (AbstractC0541Cj1.e(xmlPullParser, "EventStream")) {
                arrayList2.add(K(xmlPullParser));
            } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentBase")) {
                lo0W = U(xmlPullParser, null);
            } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentList")) {
                lo0W = V(xmlPullParser, null);
            } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentTemplate")) {
                lo0W = W(xmlPullParser, null);
            }
            LO0 lo0 = lo0W;
            if (AbstractC0541Cj1.c(xmlPullParser, "Period")) {
                return Pair.create(g(attributeValue, jG, arrayList, arrayList2), Long.valueOf(jG2));
            }
            lo0W = lo0;
        }
    }

    public C7859rE0 R(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return h(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return h(attributeValue, j, j2);
    }

    public a S(XmlPullParser xmlPullParser, String str, String str2, String str3, int i, int i2, float f, int i3, int i4, String str4, int i5, List list, LO0 lo0) throws XmlPullParserException, IOException {
        String str5;
        LO0 lo0W;
        String str6;
        boolean z;
        LO0 eVar;
        String str7;
        String str8;
        int i6;
        int i7;
        float f2;
        int iX;
        C1012Gv c1012Gv = this;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int iN = N(xmlPullParser, "bandwidth", -1);
        String strZ = Z(xmlPullParser, "mimeType", str2);
        String strZ2 = Z(xmlPullParser, "codecs", str3);
        int iN2 = N(xmlPullParser, "width", i);
        int iN3 = N(xmlPullParser, "height", i2);
        float fL = L(xmlPullParser, f);
        int iN4 = N(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i8 = i3;
        LO0 lo02 = lo0;
        String str9 = null;
        boolean z2 = false;
        String str10 = str;
        while (true) {
            xmlPullParser.next();
            str5 = attributeValue;
            if (AbstractC0541Cj1.e(xmlPullParser, "BaseURL")) {
                if (z2) {
                    str6 = str9;
                    z = z2;
                    str7 = str10;
                    str8 = strZ;
                    i6 = iN2;
                    i7 = iN3;
                    f2 = fL;
                    iX = i8;
                    eVar = lo02;
                } else {
                    String strY = y(xmlPullParser, str10);
                    str8 = strZ;
                    i6 = iN2;
                    i7 = iN3;
                    f2 = fL;
                    iX = i8;
                    eVar = lo02;
                    str6 = str9;
                    z = true;
                    str7 = strY;
                }
            } else if (AbstractC0541Cj1.e(xmlPullParser, "AudioChannelConfiguration")) {
                str6 = str9;
                z = z2;
                str7 = str10;
                str8 = strZ;
                i6 = iN2;
                i7 = iN3;
                f2 = fL;
                eVar = lo02;
                iX = x(xmlPullParser);
            } else {
                if (AbstractC0541Cj1.e(xmlPullParser, "SegmentBase")) {
                    lo0W = c1012Gv.U(xmlPullParser, (LO0.e) lo02);
                } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentList")) {
                    lo0W = c1012Gv.V(xmlPullParser, (LO0.b) lo02);
                } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentTemplate")) {
                    lo0W = c1012Gv.W(xmlPullParser, (LO0.c) lo02);
                } else {
                    if (AbstractC0541Cj1.e(xmlPullParser, "ContentProtection")) {
                        Pair pairB = B(xmlPullParser);
                        Object obj = pairB.first;
                        if (obj != null) {
                            str9 = (String) obj;
                        }
                        Object obj2 = pairB.second;
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    } else if (AbstractC0541Cj1.e(xmlPullParser, "InbandEventStream")) {
                        arrayList2.add(E(xmlPullParser, "InbandEventStream"));
                    } else if (AbstractC0541Cj1.e(xmlPullParser, "SupplementalProperty")) {
                        arrayList3.add(E(xmlPullParser, "SupplementalProperty"));
                    }
                    str6 = str9;
                    z = z2;
                    str7 = str10;
                    str8 = strZ;
                    i6 = iN2;
                    i7 = iN3;
                    f2 = fL;
                    iX = i8;
                    eVar = lo02;
                }
                str6 = str9;
                z = z2;
                eVar = lo0W;
                str7 = str10;
                str8 = strZ;
                i6 = iN2;
                i7 = iN3;
                f2 = fL;
                iX = i8;
            }
            if (AbstractC0541Cj1.c(xmlPullParser, "Representation")) {
                break;
            }
            String str11 = str8;
            str10 = str7;
            str9 = str6;
            i8 = iX;
            lo02 = eVar;
            attributeValue = str5;
            z2 = z;
            fL = f2;
            iN3 = i7;
            iN2 = i6;
            strZ = str11;
            c1012Gv = this;
        }
        Format formatE = e(str5, str8, i6, i7, f2, iX, iN4, iN, str4, i5, list, strZ2, arrayList3);
        if (eVar == null) {
            eVar = new LO0.e();
        }
        return new a(formatE, str7, eVar, str6, arrayList, arrayList2, -1L);
    }

    public int T(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strZ = Z(xmlPullParser, "schemeIdUri", null);
        String strZ2 = Z(xmlPullParser, "value", null);
        do {
            xmlPullParser.next();
        } while (!AbstractC0541Cj1.c(xmlPullParser, "Role"));
        return ("urn:mpeg:dash:role:2011".equals(strZ) && "main".equals(strZ2)) ? 1 : 0;
    }

    public LO0.e U(XmlPullParser xmlPullParser, LO0.e eVar) throws XmlPullParserException, IOException {
        long jO = O(xmlPullParser, "timescale", eVar != null ? eVar.b : 1L);
        long jO2 = O(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.c : 0L);
        long j = eVar != null ? eVar.d : 0L;
        long j2 = eVar != null ? eVar.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
        }
        long j3 = j2;
        C7859rE0 c7859rE0M = eVar != null ? eVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "Initialization")) {
                c7859rE0M = M(xmlPullParser);
            }
            C7859rE0 c7859rE0 = c7859rE0M;
            if (AbstractC0541Cj1.c(xmlPullParser, "SegmentBase")) {
                return m(c7859rE0, jO, jO2, j, j3);
            }
            c7859rE0M = c7859rE0;
        }
    }

    public LO0.b V(XmlPullParser xmlPullParser, LO0.b bVar) throws XmlPullParserException, IOException {
        long jO = O(xmlPullParser, "timescale", bVar != null ? bVar.b : 1L);
        long jO2 = O(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.c : 0L);
        long jO3 = O(xmlPullParser, "duration", bVar != null ? bVar.e : -9223372036854775807L);
        long jO4 = O(xmlPullParser, "startNumber", bVar != null ? bVar.d : 1L);
        List arrayList = null;
        C7859rE0 c7859rE0M = null;
        List listX = null;
        do {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "Initialization")) {
                c7859rE0M = M(xmlPullParser);
            } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentTimeline")) {
                listX = X(xmlPullParser);
            } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Y(xmlPullParser));
            }
        } while (!AbstractC0541Cj1.c(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (c7859rE0M == null) {
                c7859rE0M = bVar.a;
            }
            if (listX == null) {
                listX = bVar.f;
            }
            if (arrayList == null) {
                arrayList = bVar.g;
            }
        }
        return j(c7859rE0M, jO, jO2, jO4, jO3, listX, arrayList);
    }

    public LO0.c W(XmlPullParser xmlPullParser, LO0.c cVar) throws XmlPullParserException, IOException {
        C1012Gv c1012Gv = this;
        long jO = O(xmlPullParser, "timescale", cVar != null ? cVar.b : 1L);
        long jO2 = O(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.c : 0L);
        long jO3 = O(xmlPullParser, "duration", cVar != null ? cVar.e : -9223372036854775807L);
        long jO4 = O(xmlPullParser, "startNumber", cVar != null ? cVar.d : 1L);
        C7859rE0 c7859rE0M = null;
        C0609Da1 c0609Da1A0 = c1012Gv.a0(xmlPullParser, "media", cVar != null ? cVar.h : null);
        C0609Da1 c0609Da1A02 = c1012Gv.a0(xmlPullParser, "initialization", cVar != null ? cVar.g : null);
        List listX = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "Initialization")) {
                c7859rE0M = M(xmlPullParser);
            } else if (AbstractC0541Cj1.e(xmlPullParser, "SegmentTimeline")) {
                listX = X(xmlPullParser);
            }
            if (AbstractC0541Cj1.c(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            jO3 = jO3;
            c1012Gv = this;
            c0609Da1A0 = c0609Da1A0;
            c0609Da1A02 = c0609Da1A02;
            jO2 = jO2;
            jO = jO;
            jO4 = jO4;
        }
        if (cVar != null) {
            if (c7859rE0M == null) {
                c7859rE0M = cVar.a;
            }
            if (listX == null) {
                listX = cVar.f;
            }
        }
        return c1012Gv.k(c7859rE0M, jO, jO2, jO4, jO3, listX, c0609Da1A02, c0609Da1A0);
    }

    public List X(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jO = 0;
        do {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "S")) {
                jO = O(xmlPullParser, "t", jO);
                long jO2 = O(xmlPullParser, "d", -9223372036854775807L);
                int iN = N(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < iN; i++) {
                    arrayList.add(l(jO, jO2));
                    jO += jO2;
                }
            }
        } while (!AbstractC0541Cj1.c(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    public C7859rE0 Y(XmlPullParser xmlPullParser) {
        return R(xmlPullParser, "media", "mediaRange");
    }

    public C0609Da1 a0(XmlPullParser xmlPullParser, String str, C0609Da1 c0609Da1) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? C0609Da1.b(attributeValue) : c0609Da1;
    }

    public W2 b(int i, int i2, List list, List list2, List list3) {
        return new W2(i, i2, list, list2, list3);
    }

    public C3193ab1 b0(XmlPullParser xmlPullParser) {
        return n(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    public EventMessage c(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        return new EventMessage(str, str2, j2, j, bArr, j3);
    }

    public C4228eI d(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new C4228eI(str, str2, j, jArr, eventMessageArr);
    }

    public Format e(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, int i6, List list, String str4, List list2) {
        String str5;
        String str6;
        int i7;
        String str7;
        int i8;
        String str8;
        String str9;
        String str10;
        String str11;
        int i9;
        String str12;
        int i10;
        String str13;
        int i11;
        int iA;
        String strS = s(str2, str4);
        if (strS != null) {
            if ("audio/eac3".equals(strS)) {
                strS = H(list2);
            }
            str5 = strS;
            if (AbstractC8834uk0.m(str5)) {
                return Format.z(str, str2, str5, str4, i5, i, i2, f, null, i6);
            }
            if (AbstractC8834uk0.k(str5)) {
                return Format.h(str, str2, str5, str4, i5, i3, i4, null, i6, str3);
            }
            if (t(str5)) {
                if ("application/cea-608".equals(str5)) {
                    iA = z(list);
                } else {
                    if (!"application/cea-708".equals(str5)) {
                        str10 = str;
                        str11 = str2;
                        i9 = i5;
                        str12 = str3;
                        i10 = i6;
                        str13 = str4;
                        i11 = -1;
                        return Format.r(str10, str11, str5, str13, i9, i10, str12, i11);
                    }
                    iA = A(list);
                }
                str10 = str;
                str11 = str2;
                i11 = iA;
                i9 = i5;
                str12 = str3;
                i10 = i6;
                str13 = str4;
                return Format.r(str10, str11, str5, str13, i9, i10, str12, i11);
            }
            str9 = str;
            str6 = str2;
            i7 = i5;
            str7 = str3;
            i8 = i6;
            str8 = str4;
        } else {
            str5 = strS;
            str6 = str2;
            i7 = i5;
            str7 = str3;
            i8 = i6;
            str8 = str4;
            str9 = str;
        }
        return Format.l(str9, str6, str5, str8, i7, i8, str7);
    }

    public C0908Fv f(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C3193ab1 c3193ab1, Uri uri, List list) {
        return new C0908Fv(j, j2, j3, z, j4, j5, j6, j7, c3193ab1, uri, list);
    }

    public C1421Kt0 g(String str, long j, List list, List list2) {
        return new C1421Kt0(str, j, list, list2);
    }

    public C7859rE0 h(String str, long j, long j2) {
        return new C7859rE0(str, j, j2);
    }

    public AbstractC6202lI0 i(a aVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        Format formatB = aVar.a;
        String str3 = aVar.d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = aVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            q(arrayList3);
            formatB = formatB.b(new DrmInitData(str2, arrayList3));
        }
        ArrayList arrayList4 = aVar.f;
        arrayList4.addAll(arrayList2);
        return AbstractC6202lI0.l(str, aVar.g, formatB, aVar.b, aVar.c, arrayList4);
    }

    public LO0.b j(C7859rE0 c7859rE0, long j, long j2, long j3, long j4, List list, List list2) {
        return new LO0.b(c7859rE0, j, j2, j3, j4, list, list2);
    }

    public LO0.c k(C7859rE0 c7859rE0, long j, long j2, long j3, long j4, List list, C0609Da1 c0609Da1, C0609Da1 c0609Da12) {
        return new LO0.c(c7859rE0, j, j2, j3, j4, list, c0609Da1, c0609Da12);
    }

    public LO0.d l(long j, long j2) {
        return new LO0.d(j, j2);
    }

    public LO0.e m(C7859rE0 c7859rE0, long j, long j2, long j3, long j4) {
        return new LO0.e(c7859rE0, j, j2, j3, j4);
    }

    public C3193ab1 n(String str, String str2) {
        return new C3193ab1(str, str2);
    }

    public int r(Format format) {
        String str = format.G;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (AbstractC8834uk0.m(str)) {
            return 2;
        }
        if (AbstractC8834uk0.k(str)) {
            return 1;
        }
        return t(str) ? 3 : -1;
    }

    @Override // com.daaw.C3561bt0.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C0908Fv a(Uri uri, InputStream inputStream) throws C3000Zs0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.b.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return P(xmlPullParserNewPullParser, uri.toString());
            }
            throw new C3000Zs0("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            throw new C3000Zs0(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0236 A[LOOP:0: B:3:0x0064->B:62:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fd A[EDGE_INSN: B:63:0x01fd->B:56:0x01fd BREAK  A[LOOP:0: B:3:0x0064->B:62:0x0236], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.W2 v(org.xmlpull.v1.XmlPullParser r27, java.lang.String r28, com.daaw.LO0 r29) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1012Gv.v(org.xmlpull.v1.XmlPullParser, java.lang.String, com.daaw.LO0):com.daaw.W2");
    }

    public int x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strZ = Z(xmlPullParser, "schemeIdUri", null);
        int iF = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(strZ)) {
            iF = N(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(strZ)) {
            iF = F(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC0541Cj1.c(xmlPullParser, "AudioChannelConfiguration"));
        return iF;
    }

    public C1012Gv(String str) {
        this.a = str;
        try {
            this.b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public void w(XmlPullParser xmlPullParser) {
    }
}
