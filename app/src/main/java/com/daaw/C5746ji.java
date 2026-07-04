package com.daaw;

import com.daaw.AbstractC1316Jt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.daaw.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5746ji implements InterfaceC5213hn0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public C5746ji(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    public final byte[] a() {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final boolean b() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.daaw.InterfaceC5213hn0
    public InputStream f() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }

    @Override // com.daaw.InterfaceC5213hn0
    public String g() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC5213hn0
    public AbstractC1316Jt.d.b h() {
        byte[] bArrA = a();
        if (bArrA == null) {
            return null;
        }
        return AbstractC1316Jt.d.b.a().b(bArrA).c(this.b).a();
    }
}
