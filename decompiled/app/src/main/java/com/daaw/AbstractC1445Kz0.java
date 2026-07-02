package com.daaw;

import com.android.billingclient.api.f;
import java.util.Currency;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Kz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1445Kz0 {
    public static final String a(f.c cVar) {
        G10.g(cVar, "<this>");
        try {
            String symbol = Currency.getInstance(cVar.e()).getSymbol();
            G10.d(symbol);
            return symbol;
        } catch (IllegalArgumentException unused) {
            String strE = cVar.e();
            G10.d(strE);
            return strE;
        }
    }

    public static final double b(f.c cVar) {
        G10.g(cVar, "<this>");
        return cVar.d() / 1000000.0d;
    }

    public static final f.c c(com.android.billingclient.api.f fVar) {
        f.e eVar;
        f.d dVarE;
        List listA;
        G10.g(fVar, "<this>");
        List listE = fVar.e();
        if (listE == null || (eVar = (f.e) AbstractC2455Um.g0(listE)) == null || (dVarE = eVar.e()) == null || (listA = dVarE.a()) == null) {
            return null;
        }
        return (f.c) AbstractC2455Um.r0(listA);
    }
}
