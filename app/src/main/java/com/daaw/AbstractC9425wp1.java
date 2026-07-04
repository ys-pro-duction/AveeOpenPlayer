package com.daaw;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.wp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9425wp1 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C8302sp1 a(java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9425wp1.a(java.lang.String):com.daaw.sp1");
    }

    public static OP2 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        LP2 lp2 = new LP2();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (YJ2.c(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strA = YJ2.a(xmlPullParser, strConcat2);
                String strA2 = YJ2.a(xmlPullParser, strConcat3);
                String strA3 = YJ2.a(xmlPullParser, strConcat4);
                String strA4 = YJ2.a(xmlPullParser, strConcat5);
                if (strA == null || strA2 == null) {
                    return OP2.J();
                }
                lp2.g(new C8023rp1(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!YJ2.b(xmlPullParser, str.concat(":Directory")));
        return lp2.j();
    }
}
