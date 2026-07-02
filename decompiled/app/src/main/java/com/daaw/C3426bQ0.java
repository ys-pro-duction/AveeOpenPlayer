package com.daaw;

import com.google.firebase.Timestamp;

/* JADX INFO: renamed from: com.daaw.bQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3426bQ0 implements InterfaceC6146l51 {
    public static final C3426bQ0 a = new C3426bQ0();

    public static C3426bQ0 d() {
        return a;
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 a(C6564mc1 c6564mc1, Timestamp timestamp) {
        return AbstractC3704cQ0.d(timestamp, c6564mc1);
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 b(C6564mc1 c6564mc1) {
        return null;
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 c(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        return c6564mc12;
    }
}
