package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import com.daaw.HS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class SS implements NI0 {
    public static final b f = new b();
    public static final a g = new a();
    public final Context a;
    public final b b;
    public final InterfaceC1883Pf c;
    public final a d;
    public final C10153zS e;

    public static class a {
        public final Queue a = AbstractC6559mb1.d(0);

        public synchronized HS a(HS.a aVar) {
            HS hs;
            hs = (HS) this.a.poll();
            if (hs == null) {
                hs = new HS(aVar);
            }
            return hs;
        }

        public synchronized void b(HS hs) {
            hs.b();
            this.a.offer(hs);
        }
    }

    public static class b {
        public final Queue a = AbstractC6559mb1.d(0);

        public synchronized RS a(byte[] bArr) {
            RS rs;
            try {
                rs = (RS) this.a.poll();
                if (rs == null) {
                    rs = new RS();
                }
            } catch (Throwable th) {
                throw th;
            }
            return rs.o(bArr);
        }

        public synchronized void b(RS rs) {
            rs.a();
            this.a.offer(rs);
        }
    }

    public SS(Context context, InterfaceC1883Pf interfaceC1883Pf) {
        this(context, interfaceC1883Pf, f, g);
    }

    public static byte[] e(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            bArr = new byte[16384];
        } catch (IOException unused) {
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            return byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.daaw.NI0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KS c(InputStream inputStream, int i, int i2) {
        byte[] bArrE = e(inputStream);
        RS rsA = this.b.a(bArrE);
        HS hsA = this.d.a(this.e);
        try {
            return b(bArrE, i, i2, rsA, hsA);
        } finally {
            this.b.b(rsA);
            this.d.b(hsA);
        }
    }

    public final KS b(byte[] bArr, int i, int i2, RS rs, HS hs) {
        Bitmap bitmapD;
        QS qsC = rs.c();
        if (qsC.a() <= 0 || qsC.b() != 0 || (bitmapD = d(hs, qsC, bArr)) == null) {
            return null;
        }
        return new KS(new IS(this.a, this.e, this.c, I91.b(), i, i2, qsC, bArr, bitmapD));
    }

    public final Bitmap d(HS hs, QS qs, byte[] bArr) {
        hs.o(qs, bArr);
        hs.a();
        return hs.i();
    }

    @Override // com.daaw.NI0
    public String getId() {
        return "";
    }

    public SS(Context context, InterfaceC1883Pf interfaceC1883Pf, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.c = interfaceC1883Pf;
        this.d = aVar;
        this.e = new C10153zS(interfaceC1883Pf);
        this.b = bVar;
    }
}
