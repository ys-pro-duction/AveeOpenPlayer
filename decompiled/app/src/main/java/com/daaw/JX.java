package com.daaw;

import com.daaw.C0437Bj1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class JX {
    public String a;
    public final String b;
    public C0437Bj1 c;
    public KQ d;

    public class a implements GQ {
        public a() {
        }

        @Override // com.daaw.GQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B61 a(File file, Boolean[] boolArr) {
            FileInputStream fileInputStream;
            List listA = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException unused) {
                fileInputStream = null;
            }
            C7378pX0 c7378pX0 = new C7378pX0();
            if (fileInputStream == null) {
                c7378pX0.a("Network error");
                return new B61(null, c7378pX0);
            }
            try {
                listA = JX.this.c.a(fileInputStream, c7378pX0);
            } catch (IOException e) {
                c7378pX0.b("io", e);
            } catch (XmlPullParserException e2) {
                c7378pX0.b("xml parser", e2);
            }
            boolArr[0] = Boolean.valueOf(listA != null && listA.size() > 0);
            return new B61(listA, c7378pX0);
        }
    }

    public JX(String str, String str2, C0437Bj1.a aVar, KQ kq) {
        this.c = new C0437Bj1(aVar, kq);
        this.d = kq;
        this.a = str;
        this.b = str2;
    }

    public AsyncTaskC2517Vb1 a() {
        return AbstractC3712cS0.g(this.a, this.b, new a(), 720);
    }
}
