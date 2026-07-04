package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class O73 extends T73 {
    public final String a;

    public O73(String str) {
        this.a = str;
    }

    @Override // com.daaw.T73
    public final void a(String str) {
        new StringBuilder(String.valueOf(this.a).length() + 1 + String.valueOf(str).length());
    }
}
