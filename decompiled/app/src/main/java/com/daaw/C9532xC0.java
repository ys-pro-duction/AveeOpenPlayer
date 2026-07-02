package com.daaw;

import com.daaw.C9253wC0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.xC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9532xC0 implements NK {
    public static final Charset d = Charset.forName("UTF-8");
    public final File a;
    public final int b;
    public C9253wC0 c;

    /* JADX INFO: renamed from: com.daaw.xC0$a */
    public class a implements C9253wC0.d {
        public final /* synthetic */ byte[] a;
        public final /* synthetic */ int[] b;

        public a(byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        @Override // com.daaw.C9253wC0.d
        public void a(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.a, this.b[0], i);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.xC0$b */
    public static class b {
        public final byte[] a;
        public final int b;

        public b(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public C9532xC0(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // com.daaw.NK
    public void a() {
        AbstractC0555Cn.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // com.daaw.NK
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, d);
        }
        return null;
    }

    @Override // com.daaw.NK
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i = bVarG.b;
        byte[] bArr = new byte[i];
        System.arraycopy(bVarG.a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.daaw.NK
    public void d() {
        a();
        this.a.delete();
    }

    @Override // com.daaw.NK
    public void e(long j, String str) {
        h();
        f(j, str);
    }

    public final void f(long j, String str) {
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.b / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.c.l(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.c.R() && this.c.B0() > this.b) {
                this.c.s0();
            }
        } catch (IOException e) {
            C2106Rd0.f().e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        C9253wC0 c9253wC0 = this.c;
        if (c9253wC0 == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[c9253wC0.B0()];
        try {
            this.c.I(new a(bArr, iArr));
        } catch (IOException e) {
            C2106Rd0.f().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new b(bArr, iArr[0]);
    }

    public final void h() {
        if (this.c == null) {
            try {
                this.c = new C9253wC0(this.a);
            } catch (IOException e) {
                C2106Rd0.f().e("Could not open log file: " + this.a, e);
            }
        }
    }
}
