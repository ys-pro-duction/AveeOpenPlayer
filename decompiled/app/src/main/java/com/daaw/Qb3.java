package com.daaw;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class Qb3 extends AbstractBinderC10284zt3 {
    public final int B;

    public Qb3(byte[] bArr) {
        AbstractC7506py0.a(bArr.length == 25);
        this.B = Arrays.hashCode(bArr);
    }

    public static byte[] I(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] Z2();

    public final boolean equals(Object obj) {
        InterfaceC7934rX interfaceC7934rXZzd;
        if (obj != null && (obj instanceof InterfaceC1186Im1)) {
            try {
                InterfaceC1186Im1 interfaceC1186Im1 = (InterfaceC1186Im1) obj;
                if (interfaceC1186Im1.zzc() == this.B && (interfaceC7934rXZzd = interfaceC1186Im1.zzd()) != null) {
                    return Arrays.equals(Z2(), (byte[]) BinderC7744qp0.I(interfaceC7934rXZzd));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC1186Im1
    public final int zzc() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC1186Im1
    public final InterfaceC7934rX zzd() {
        return BinderC7744qp0.Z2(Z2());
    }
}
