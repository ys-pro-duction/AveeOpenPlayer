package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: com.daaw.t61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8382t61 extends US0 {
    public static final Pattern p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b u = new b(30.0f, 1, 1);
    public static final a v = new a(32, 15);
    public final XmlPullParserFactory o;

    /* JADX INFO: renamed from: com.daaw.t61$a */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.t61$b */
    public static final class b {
        public final float a;
        public final int b;
        public final int c;

        public b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    public C8382t61() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static boolean E(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    public static void G(String str, C9505x61 c9505x61) throws C7107oZ0 {
        Matcher matcher;
        String strGroup;
        String[] strArrW = AbstractC6280lb1.W(str, "\\s+");
        if (strArrW.length == 1) {
            matcher = r.matcher(str);
        } else {
            if (strArrW.length != 2) {
                throw new C7107oZ0("Invalid number of entries for fontSize: " + strArrW.length + ".");
            }
            matcher = r.matcher(strArrW[1]);
        }
        if (!matcher.matches()) {
            throw new C7107oZ0("Invalid expression for fontSize: '" + str + "'.");
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c9505x61.t(3);
                break;
            case "em":
                c9505x61.t(2);
                break;
            case "px":
                c9505x61.t(1);
                break;
            default:
                throw new C7107oZ0("Invalid unit for fontSize: '" + strGroup + "'.");
        }
        c9505x61.s(Float.valueOf(matcher.group(1)).floatValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long N(java.lang.String r13, com.daaw.C8382t61.b r14) throws com.daaw.C7107oZ0 {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8382t61.N(java.lang.String, com.daaw.t61$b):long");
    }

    public final C9505x61 C(C9505x61 c9505x61) {
        return c9505x61 == null ? new C9505x61() : c9505x61;
    }

    @Override // com.daaw.US0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C9784y61 z(byte[] bArr, int i, boolean z) throws C7107oZ0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            C9784y61 c9784y61 = null;
            map2.put("", new C8947v61(null));
            int i2 = 0;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarH = u;
            a aVarF = v;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C8661u61 c8661u61 = (C8661u61) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarH = H(xmlPullParserNewPullParser);
                            aVarF = F(xmlPullParserNewPullParser, v);
                        }
                        if (!E(name)) {
                            xmlPullParserNewPullParser.getName();
                        } else if ("head".equals(name)) {
                            I(xmlPullParserNewPullParser, map, map2, aVarF);
                        } else {
                            try {
                                C8661u61 c8661u61J = J(xmlPullParserNewPullParser, c8661u61, map2, bVarH);
                                arrayDeque.push(c8661u61J);
                                if (c8661u61 != null) {
                                    c8661u61.a(c8661u61J);
                                }
                            } catch (C7107oZ0 unused) {
                                i2++;
                            }
                        }
                        i2++;
                    } else if (eventType == 4) {
                        c8661u61.a(C8661u61.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c9784y61 = new C9784y61((C8661u61) arrayDeque.peek(), map, map2);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            return c9784y61;
        } catch (IOException e) {
            throw new IllegalStateException("Unexpected error when reading input.", e);
        } catch (XmlPullParserException e2) {
            throw new C7107oZ0("Unable to decode source", e2);
        }
    }

    public final a F(XmlPullParser xmlPullParser, a aVar) throws C7107oZ0 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            return aVar;
        }
        try {
            int i = Integer.parseInt(matcher.group(1));
            int i2 = Integer.parseInt(matcher.group(2));
            if (i != 0 && i2 != 0) {
                return new a(i, i2);
            }
            throw new C7107oZ0("Invalid cell resolution " + i + " " + i2);
        } catch (NumberFormatException unused) {
            return aVar;
        }
    }

    public final b H(XmlPullParser xmlPullParser) throws C7107oZ0 {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (AbstractC6280lb1.W(attributeValue2, " ").length != 2) {
                throw new C7107oZ0("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        b bVar = u;
        int i2 = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(i * f, i2, i3);
    }

    public final Map I(XmlPullParser xmlPullParser, Map map, Map map2, a aVar) throws XmlPullParserException, IOException, C7107oZ0 {
        C8947v61 c8947v61K;
        do {
            xmlPullParser.next();
            if (AbstractC0541Cj1.e(xmlPullParser, "style")) {
                String strA = AbstractC0541Cj1.a(xmlPullParser, "style");
                C9505x61 c9505x61L = L(xmlPullParser, new C9505x61());
                if (strA != null) {
                    for (String str : M(strA)) {
                        c9505x61L.a((C9505x61) map.get(str));
                    }
                }
                if (c9505x61L.g() != null) {
                    map.put(c9505x61L.g(), c9505x61L);
                }
            } else if (AbstractC0541Cj1.e(xmlPullParser, "region") && (c8947v61K = K(xmlPullParser, aVar)) != null) {
                map2.put(c8947v61K.a, c8947v61K);
            }
        } while (!AbstractC0541Cj1.c(xmlPullParser, "head"));
        return map;
    }

    public final C8661u61 J(XmlPullParser xmlPullParser, C8661u61 c8661u61, Map map, b bVar) throws C7107oZ0 {
        long j;
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        C9505x61 c9505x61L = L(xmlPullParser, null);
        String[] strArr = null;
        long jN = -9223372036854775807L;
        long jN2 = -9223372036854775807L;
        long jN3 = -9223372036854775807L;
        String str = "";
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jN3 = N(attributeValue, bVar);
                    break;
                case "end":
                    jN2 = N(attributeValue, bVar);
                    break;
                case "begin":
                    jN = N(attributeValue, bVar);
                    break;
                case "style":
                    String[] strArrM = M(attributeValue);
                    if (strArrM.length > 0) {
                        strArr = strArrM;
                        break;
                    }
                    break;
            }
        }
        if (c8661u61 != null) {
            long j2 = c8661u61.d;
            if (j2 != -9223372036854775807L) {
                if (jN != -9223372036854775807L) {
                    jN += j2;
                }
                if (jN2 != -9223372036854775807L) {
                    jN2 += j2;
                }
            }
        }
        if (jN2 != -9223372036854775807L) {
            j = jN2;
        } else {
            if (jN3 != -9223372036854775807L) {
                jN2 = jN + jN3;
            } else if (c8661u61 != null) {
                long j3 = c8661u61.e;
                if (j3 != -9223372036854775807L) {
                    j = j3;
                }
            }
            j = jN2;
        }
        return C8661u61.c(xmlPullParser.getName(), jN, j, c9505x61L, strArr, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C8947v61 K(org.xmlpull.v1.XmlPullParser r11, com.daaw.C8382t61.a r12) {
        /*
            r10 = this;
            java.lang.String r0 = "id"
            java.lang.String r2 = com.daaw.AbstractC0541Cj1.a(r11, r0)
            r0 = 0
            if (r2 != 0) goto La
            return r0
        La:
            java.lang.String r1 = "origin"
            java.lang.String r1 = com.daaw.AbstractC0541Cj1.a(r11, r1)
            if (r1 == 0) goto L97
            java.util.regex.Pattern r3 = com.daaw.C8382t61.s
            java.util.regex.Matcher r1 = r3.matcher(r1)
            boolean r4 = r1.matches()
            if (r4 == 0) goto L97
            r4 = 1
            java.lang.String r5 = r1.group(r4)     // Catch: java.lang.NumberFormatException -> L97
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L97
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            r7 = 2
            java.lang.String r1 = r1.group(r7)     // Catch: java.lang.NumberFormatException -> L97
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L97
            float r1 = r1 / r6
            java.lang.String r8 = "extent"
            java.lang.String r8 = com.daaw.AbstractC0541Cj1.a(r11, r8)
            if (r8 == 0) goto L97
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r8 = r3.matches()
            if (r8 == 0) goto L97
            java.lang.String r8 = r3.group(r4)     // Catch: java.lang.NumberFormatException -> L97
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L97
            float r8 = r8 / r6
            java.lang.String r3 = r3.group(r7)     // Catch: java.lang.NumberFormatException -> L97
            float r0 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L97
            float r0 = r0 / r6
            java.lang.String r3 = "displayAlign"
            java.lang.String r11 = com.daaw.AbstractC0541Cj1.a(r11, r3)
            if (r11 == 0) goto L83
            java.lang.String r11 = com.daaw.AbstractC6280lb1.a0(r11)
            r11.getClass()
            java.lang.String r3 = "center"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L7c
            java.lang.String r3 = "after"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L78
            goto L83
        L78:
            float r1 = r1 + r0
            r4 = r1
            r6 = 2
            goto L86
        L7c:
            r11 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r11
            float r1 = r1 + r0
            r4 = r1
            r6 = 1
            goto L86
        L83:
            r4 = 0
            r4 = r1
            r6 = 0
        L86:
            int r11 = r12.b
            float r11 = (float) r11
            r12 = 1065353216(0x3f800000, float:1.0)
            float r9 = r12 / r11
            com.daaw.v61 r1 = new com.daaw.v61
            r3 = r5
            r5 = 0
            r7 = r8
            r8 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8382t61.K(org.xmlpull.v1.XmlPullParser, com.daaw.t61$a):com.daaw.v61");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C9505x61 L(org.xmlpull.v1.XmlPullParser r12, com.daaw.C9505x61 r13) throws com.daaw.C7107oZ0 {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8382t61.L(org.xmlpull.v1.XmlPullParser, com.daaw.x61):com.daaw.x61");
    }

    public final String[] M(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : AbstractC6280lb1.W(strTrim, "\\s+");
    }
}
