package com.daaw;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class UH {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public UH() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static void c(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    public byte[] a(EventMessage eventMessage, long j) {
        AbstractC7115ob.a(j >= 0);
        this.a.reset();
        try {
            b(this.b, eventMessage.B);
            String str = eventMessage.C;
            if (str == null) {
                str = "";
            }
            b(this.b, str);
            c(this.b, j);
            c(this.b, AbstractC6280lb1.T(eventMessage.E, j, 1000000L));
            c(this.b, AbstractC6280lb1.T(eventMessage.D, j, 1000L));
            c(this.b, eventMessage.F);
            this.b.write(eventMessage.G);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
