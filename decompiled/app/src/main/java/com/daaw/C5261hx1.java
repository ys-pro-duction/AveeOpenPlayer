package com.daaw;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.hx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5261hx1 implements PL2 {
    public final /* synthetic */ NK2 a;

    public C5261hx1(C5820jx1 c5820jx1, NK2 nk2) {
        this.a = nk2;
    }

    @Override // com.daaw.PL2
    public final boolean a(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
