package com.daaw;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzaej;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.zp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10262zp1 {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public C10262zp1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(zzaej zzaejVar) {
        this.a.reset();
        try {
            b(this.b, zzaejVar.B);
            String str = zzaejVar.C;
            if (str == null) {
                str = "";
            }
            b(this.b, str);
            this.b.writeLong(zzaejVar.D);
            this.b.writeLong(zzaejVar.E);
            this.b.write(zzaejVar.F);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
