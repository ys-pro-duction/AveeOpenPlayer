package com.daaw;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.daaw.AbstractC7898rO;
import com.daaw.D7;
import com.daaw.P11;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6976o4 {
    public static final void a(SpannableString spannableString, XU0 xu0, int i, int i2, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar) {
        AbstractC3167aV0.i(spannableString, xu0.f(), i, i2);
        AbstractC3167aV0.l(spannableString, xu0.i(), interfaceC4988gz, i, i2);
        if (xu0.l() != null || xu0.j() != null) {
            SO soL = xu0.l();
            if (soL == null) {
                soL = SO.C.d();
            }
            PO poJ = xu0.j();
            spannableString.setSpan(new StyleSpan(O5.c(soL, poJ != null ? poJ.i() : PO.b.b())), i, i2, 33);
        }
        if (xu0.g() != null) {
            if (xu0.g() instanceof C6520mS) {
                spannableString.setSpan(new TypefaceSpan(((C6520mS) xu0.g()).m()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                AbstractC7898rO abstractC7898rOG = xu0.g();
                QO qoK = xu0.k();
                spannableString.setSpan(C8.a.a((Typeface) AbstractC8177sO.a(bVar, abstractC7898rOG, null, 0, qoK != null ? qoK.j() : QO.b.a(), 6, null).getValue()), i, i2, 33);
            }
        }
        if (xu0.q() != null) {
            P11 p11Q = xu0.q();
            P11.a aVar = P11.b;
            if (p11Q.d(aVar.c())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (xu0.q().d(aVar.a())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (xu0.s() != null) {
            spannableString.setSpan(new ScaleXSpan(xu0.s().b()), i, i2, 33);
        }
        AbstractC3167aV0.p(spannableString, xu0.n(), i, i2);
        AbstractC3167aV0.f(spannableString, xu0.c(), i, i2);
    }

    public static final SpannableString b(D7 d7, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar) {
        G10.g(d7, "<this>");
        InterfaceC4988gz interfaceC4988gz2 = interfaceC4988gz;
        G10.g(interfaceC4988gz2, "density");
        AbstractC7898rO.b bVar2 = bVar;
        G10.g(bVar2, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(d7.g());
        List listE = d7.e();
        int size = listE.size();
        int i = 0;
        while (i < size) {
            D7.b bVar3 = (D7.b) listE.get(i);
            XU0 xu0 = (XU0) bVar3.a();
            a(spannableString, xu0.a((16351 & 1) != 0 ? xu0.f() : 0L, (16351 & 2) != 0 ? xu0.b : 0L, (16351 & 4) != 0 ? xu0.c : null, (16351 & 8) != 0 ? xu0.d : null, (16351 & 16) != 0 ? xu0.e : null, (16351 & 32) != 0 ? xu0.f : null, (16351 & 64) != 0 ? xu0.g : null, (16351 & 128) != 0 ? xu0.h : 0L, (16351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? xu0.i : null, (16351 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? xu0.j : null, (16351 & 1024) != 0 ? xu0.k : null, (16351 & 2048) != 0 ? xu0.l : 0L, (16351 & 4096) != 0 ? xu0.m : null, (16351 & 8192) != 0 ? xu0.n : null), bVar3.b(), bVar3.c(), interfaceC4988gz2, bVar2);
            i++;
            interfaceC4988gz2 = interfaceC4988gz;
            bVar2 = bVar;
        }
        List listH = d7.h(0, d7.length());
        int size2 = listH.size();
        for (int i2 = 0; i2 < size2; i2++) {
            D7.b bVar4 = (D7.b) listH.get(i2);
            AbstractC10063z61 abstractC10063z61 = (AbstractC10063z61) bVar4.a();
            spannableString.setSpan(A61.a(abstractC10063z61), bVar4.b(), bVar4.c(), 33);
        }
        return spannableString;
    }
}
