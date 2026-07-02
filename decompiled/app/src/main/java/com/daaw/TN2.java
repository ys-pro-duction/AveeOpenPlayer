package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TN2 implements InterfaceC5661jO2 {
    public static TN2 b(char c) {
        return new QN2(c);
    }

    public abstract boolean a(char c);

    @Override // com.daaw.InterfaceC5661jO2
    public final /* synthetic */ boolean zza(Object obj) {
        return a(((Character) obj).charValue());
    }
}
