package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Og2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1786Og2 extends PG1 {
    public final Context B;
    public final C7969re2 C;
    public C2530Ve2 D;
    public C6575me2 E;

    public BinderC1786Og2(Context context, C7969re2 c7969re2, C2530Ve2 c2530Ve2, C6575me2 c6575me2) {
        this.B = context;
        this.C = c7969re2;
        this.D = c2530Ve2;
        this.E = c6575me2;
    }

    @Override // com.daaw.QG1
    public final void a0(InterfaceC7934rX interfaceC7934rX) {
        C6575me2 c6575me2;
        Object objI = BinderC7744qp0.I(interfaceC7934rX);
        if (!(objI instanceof View) || this.C.h0() == null || (c6575me2 = this.E) == null) {
            return;
        }
        c6575me2.o((View) objI);
    }

    public final InterfaceC4790gG1 b3(String str) {
        return new C1682Ng2(this, "_videoMediaView");
    }

    @Override // com.daaw.QG1
    public final boolean s(InterfaceC7934rX interfaceC7934rX) {
        C2530Ve2 c2530Ve2;
        Object objI = BinderC7744qp0.I(interfaceC7934rX);
        if (!(objI instanceof ViewGroup) || (c2530Ve2 = this.D) == null || !c2530Ve2.f((ViewGroup) objI)) {
            return false;
        }
        this.C.d0().z(b3("_videoMediaView"));
        return true;
    }

    @Override // com.daaw.QG1
    public final InterfaceC8147sG1 t(String str) {
        return (InterfaceC8147sG1) this.C.U().get(str);
    }

    @Override // com.daaw.QG1
    public final String u2(String str) {
        return (String) this.C.V().get(str);
    }

    @Override // com.daaw.QG1
    public final boolean z(InterfaceC7934rX interfaceC7934rX) {
        C2530Ve2 c2530Ve2;
        Object objI = BinderC7744qp0.I(interfaceC7934rX);
        if (!(objI instanceof ViewGroup) || (c2530Ve2 = this.D) == null || !c2530Ve2.g((ViewGroup) objI)) {
            return false;
        }
        this.C.f0().z(b3("_videoMediaView"));
        return true;
    }

    @Override // com.daaw.QG1
    public final zzdq zze() {
        return this.C.W();
    }

    @Override // com.daaw.QG1
    public final InterfaceC7311pG1 zzf() {
        try {
            return this.E.M().a();
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.daaw.QG1
    public final InterfaceC7934rX zzh() {
        return BinderC7744qp0.Z2(this.B);
    }

    @Override // com.daaw.QG1
    public final String zzi() {
        return this.C.a();
    }

    @Override // com.daaw.QG1
    public final List zzk() {
        try {
            BS0 bs0U = this.C.U();
            BS0 bs0V = this.C.V();
            String[] strArr = new String[bs0U.size() + bs0V.size()];
            int i = 0;
            for (int i2 = 0; i2 < bs0U.size(); i2++) {
                strArr[i] = (String) bs0U.j(i2);
                i++;
            }
            for (int i3 = 0; i3 < bs0V.size(); i3++) {
                strArr[i] = (String) bs0V.j(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.daaw.QG1
    public final void zzl() {
        C6575me2 c6575me2 = this.E;
        if (c6575me2 != null) {
            c6575me2.a();
        }
        this.E = null;
        this.D = null;
    }

    @Override // com.daaw.QG1
    public final void zzm() {
        try {
            String strC = this.C.c();
            if (strC != "Google" && (strC == null || !strC.equals("Google"))) {
                if (TextUtils.isEmpty(strC)) {
                    AbstractC4274eT1.zzj("Not starting OMID session. OM partner name has not been configured.");
                    return;
                }
                C6575me2 c6575me2 = this.E;
                if (c6575me2 != null) {
                    c6575me2.P(strC, false);
                    return;
                }
                return;
            }
            AbstractC4274eT1.zzj("Illegal argument specified for omid partner name.");
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.daaw.QG1
    public final void zzn(String str) {
        C6575me2 c6575me2 = this.E;
        if (c6575me2 != null) {
            c6575me2.k(str);
        }
    }

    @Override // com.daaw.QG1
    public final void zzo() {
        C6575me2 c6575me2 = this.E;
        if (c6575me2 != null) {
            c6575me2.n();
        }
    }

    @Override // com.daaw.QG1
    public final boolean zzq() {
        C6575me2 c6575me2 = this.E;
        return (c6575me2 == null || c6575me2.B()) && this.C.e0() != null && this.C.f0() == null;
    }

    @Override // com.daaw.QG1
    public final boolean zzt() {
        AbstractC9841yJ2 abstractC9841yJ2H0 = this.C.h0();
        if (abstractC9841yJ2H0 == null) {
            AbstractC4274eT1.zzj("Trying to start OMID session before creation.");
            return false;
        }
        zzt.zzA().d(abstractC9841yJ2H0);
        if (this.C.e0() == null) {
            return true;
        }
        this.C.e0().U("onSdkLoaded", new C2407Ua());
        return true;
    }
}
